/**
 * 
 */
package com.cloderia.helion.client.local.organization;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Organization;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/editorganization")
@Templated(value = "edit-organization-page.html#app-container")
public class EditOrganizationPage extends BaseOrganizationPage {
	
	@Inject
	@DataField
	protected OrganizationEditor organizationEditor;
	
	@PageState
	private int id;

	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		loadPartys(organizationEditor);
		loadUniverses(organizationEditor);
		organizationEditor.setEditMode(true);
		setViewTitle(BaseOrganizationPage.UPDATE_ORGANIZATION, "");
		
		organizationService.call(new RemoteCallback<Organization>() {
			@Override
			public void callback(Organization organization) {
				organizationEditor.setValue(organization);
			}
		}).findById(new Long(id));
		super.doSetup();
	}
	
}
