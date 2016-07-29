/**
 * 
 */
package com.cloderia.helion.client.local.organizationgeneralledgeraccount;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Organizationgeneralledgeraccount;

/**
 * @author adrian
 *
 */
@Page(path = "/vieworganizationgeneralledgeraccount")
@Templated(value = "view-organizationgeneralledgeraccount-page.html#app-container")
public class ViewOrganizationgeneralledgeraccountPage extends BaseOrganizationgeneralledgeraccountPage {

	@PageState
	private Long id;

	@Inject
	@AutoBound
	private DataBinder<Organizationgeneralledgeraccount> binder;

	@Inject
	@DataField
	private OrganizationgeneralledgeraccountDisplay entityDisplayComponent;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		this.setViewTitle(BaseOrganizationgeneralledgeraccountPage.VIEW_ORGANIZATIONGENERALLEDGERACCOUNT, "");
		organizationgeneralledgeraccountService.call(new RemoteCallback<Organizationgeneralledgeraccount>() {
			@Override
			public void callback(Organizationgeneralledgeraccount organizationgeneralledgeraccount) {
				binder.setModel(organizationgeneralledgeraccount);
				entityDisplayComponent.setValue(organizationgeneralledgeraccount);
			}
		}).findById(new Long(id));
	}
}
