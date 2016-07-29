/**
 * 
 */
package com.cloderia.helion.client.local.organization;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Organization;

/**
 * @author adrian
 *
 */
@Page(path = "/vieworganization")
@Templated(value = "view-organization-page.html#app-container")
public class ViewOrganizationPage extends BaseOrganizationPage {

	@PageState
	private Long id;

	@Inject
	@AutoBound
	private DataBinder<Organization> binder;

	@Inject
	@DataField
	private OrganizationDisplay entityDisplayComponent;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		this.setViewTitle(BaseOrganizationPage.VIEW_ORGANIZATION, "");
		organizationService.call(new RemoteCallback<Organization>() {
			@Override
			public void callback(Organization organization) {
				binder.setModel(organization);
				entityDisplayComponent.setValue(organization);
			}
		}).findById(new Long(id));
	}
}
