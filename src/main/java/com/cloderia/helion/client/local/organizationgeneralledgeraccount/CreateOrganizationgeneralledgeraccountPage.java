/**
 * 
 */
package com.cloderia.helion.client.local.organizationgeneralledgeraccount;
import javax.inject.Inject;

import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

/**
 * @author adrian
 *
 */
@Page(path = "/createorganizationgeneralledgeraccount")
@Templated(value = "edit-organizationgeneralledgeraccount-page.html#app-container")
public class CreateOrganizationgeneralledgeraccountPage extends BaseOrganizationgeneralledgeraccountPage {

	@Inject
	@DataField
	protected OrganizationgeneralledgeraccountEditor organizationgeneralledgeraccountEditor;
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.party.BasePartyPage#doSetup()
	 */
	@Override
	protected void doSetup() {

		loadOrganizations(organizationgeneralledgeraccountEditor);
		loadOrganizations(organizationgeneralledgeraccountEditor);
		loadProductCats(organizationgeneralledgeraccountEditor);
		loadProductCats(organizationgeneralledgeraccountEditor);
		loadUniverses(organizationgeneralledgeraccountEditor);
		loadUniverses(organizationgeneralledgeraccountEditor);
		loadProducts(organizationgeneralledgeraccountEditor);
		loadProducts(organizationgeneralledgeraccountEditor);
		loadGlAccounts(organizationgeneralledgeraccountEditor);
		loadGlAccounts(organizationgeneralledgeraccountEditor);
		setViewTitle(BaseOrganizationgeneralledgeraccountPage.CREATE_ORGANIZATIONGENERALLEDGERACCOUNT, "");
		super.doSetup();
	}
}
