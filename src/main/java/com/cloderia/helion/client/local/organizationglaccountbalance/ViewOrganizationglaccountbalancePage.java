/**
 * 
 */
package com.cloderia.helion.client.local.organizationglaccountbalance;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Organizationglaccountbalance;

/**
 * @author adrian
 *
 */
@Page(path = "/vieworganizationglaccountbalance")
@Templated(value = "view-organizationglaccountbalance-page.html#app-container")
public class ViewOrganizationglaccountbalancePage extends BaseOrganizationglaccountbalancePage {

	@PageState
	private Long id;

	@Inject
	@AutoBound
	private DataBinder<Organizationglaccountbalance> binder;

	@Inject
	@DataField
	private OrganizationglaccountbalanceDisplay entityDisplayComponent;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		this.setViewTitle(BaseOrganizationglaccountbalancePage.VIEW_ORGANIZATIONGLACCOUNTBALANCE, "");
		organizationglaccountbalanceService.call(new RemoteCallback<Organizationglaccountbalance>() {
			@Override
			public void callback(Organizationglaccountbalance organizationglaccountbalance) {
				binder.setModel(organizationglaccountbalance);
				entityDisplayComponent.setValue(organizationglaccountbalance);
			}
		}).findById(new Long(id));
	}
}
