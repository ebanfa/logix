/**
 * 
 */
package com.cloderia.helion.client.local.party;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Party;

/**
 * @author adrian
 *
 */
@Page(path = "/viewparty")
@Templated(value = "view-party-page.html#app-container")
public class ViewPartyPage extends BasePartyPage {

	@PageState
	private Long id;

	@Inject
	@AutoBound
	private DataBinder<Party> binder;

	@Inject
	@DataField
	private PartyDisplay entityDisplayComponent;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		this.setViewTitle(BasePartyPage.VIEW_PARTY, "");
		partyService.call(new RemoteCallback<Party>() {
			@Override
			public void callback(Party party) {
				binder.setModel(party);
				entityDisplayComponent.setValue(party);
			}
		}).findById(new Long(id));
	}
}
