/**
 * 
 */
package com.cloderia.helion.client.local.partytype;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Partytype;

/**
 * @author adrian
 *
 */
@Page(path = "/viewpartytype")
@Templated(value = "view-partytype-page.html#app-container")
public class ViewPartytypePage extends BasePartytypePage {

	@PageState
	private Long id;

	@Inject
	@AutoBound
	private DataBinder<Partytype> binder;

	@Inject
	@DataField
	private PartytypeDisplay entityDisplayComponent;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		this.setViewTitle(BasePartytypePage.VIEW_PARTYTYPE, "");
		partytypeService.call(new RemoteCallback<Partytype>() {
			@Override
			public void callback(Partytype partytype) {
				binder.setModel(partytype);
				entityDisplayComponent.setValue(partytype);
			}
		}).findById(new Long(id));
	}
}
