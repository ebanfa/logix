/**
 * 
 */
package com.cloderia.helion.client.local.partyroletype;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Partyroletype;

/**
 * @author adrian
 *
 */
@Page(path = "/viewpartyroletype")
@Templated(value = "view-partyroletype-page.html#app-container")
public class ViewPartyroletypePage extends BasePartyroletypePage {

	@PageState
	private Long id;

	@Inject
	@AutoBound
	private DataBinder<Partyroletype> binder;

	@Inject
	@DataField
	private PartyroletypeDisplay entityDisplayComponent;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		this.setViewTitle(BasePartyroletypePage.VIEW_PARTYROLETYPE, "");
		partyroletypeService.call(new RemoteCallback<Partyroletype>() {
			@Override
			public void callback(Partyroletype partyroletype) {
				binder.setModel(partyroletype);
				entityDisplayComponent.setValue(partyroletype);
			}
		}).findById(new Long(id));
	}
}
