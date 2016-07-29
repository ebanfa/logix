/**
 * 
 */
package com.cloderia.helion.client.local.organizationglaccountbalance;
import javax.inject.Inject;

import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

/**
 * @author adrian
 *
 */
@Page(path = "/createorganizationglaccountbalance")
@Templated(value = "edit-organizationglaccountbalance-page.html#app-container")
public class CreateOrganizationglaccountbalancePage extends BaseOrganizationglaccountbalancePage {

	@Inject
	@DataField
	protected OrganizationglaccountbalanceEditor organizationglaccountbalanceEditor;
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.party.BasePartyPage#doSetup()
	 */
	@Override
	protected void doSetup() {

		loadGlAccounts(organizationglaccountbalanceEditor);
		loadGlAccounts(organizationglaccountbalanceEditor);
		loadUniverses(organizationglaccountbalanceEditor);
		loadUniverses(organizationglaccountbalanceEditor);
		loadAccountingPeriods(organizationglaccountbalanceEditor);
		loadAccountingPeriods(organizationglaccountbalanceEditor);
		setViewTitle(BaseOrganizationglaccountbalancePage.CREATE_ORGANIZATIONGLACCOUNTBALANCE, "");
		super.doSetup();
	}
}
