/**
 * 
 */
package com.cloderia.helion.client.local.organization;
import javax.inject.Inject;

import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

/**
 * @author adrian
 *
 */
@Page(path = "/createorganization")
@Templated(value = "edit-organization-page.html#app-container")
public class CreateOrganizationPage extends BaseOrganizationPage {

	@Inject
	@DataField
	protected OrganizationEditor organizationEditor;
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.party.BasePartyPage#doSetup()
	 */
	@Override
	protected void doSetup() {

		loadPartys(organizationEditor);
		loadPartys(organizationEditor);
		loadUniverses(organizationEditor);
		loadUniverses(organizationEditor);
		setViewTitle(BaseOrganizationPage.CREATE_ORGANIZATION, "");
		super.doSetup();
	}
}
