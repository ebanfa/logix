/**
 * 
 */
package com.cloderia.helion.client.local.billingaccount;
import javax.inject.Inject;

import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

/**
 * @author adrian
 *
 */
@Page(path = "/createbillingaccount")
@Templated(value = "edit-billingaccount-page.html#app-container")
public class CreateBillingaccountPage extends BaseBillingaccountPage {

	@Inject
	@DataField
	protected BillingaccountEditor billingaccountEditor;
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.party.BasePartyPage#doSetup()
	 */
	@Override
	protected void doSetup() {

		loadToContMechs(billingaccountEditor);
		loadToContMechs(billingaccountEditor);
		loadUniverses(billingaccountEditor);
		loadUniverses(billingaccountEditor);
		setViewTitle(BaseBillingaccountPage.CREATE_BILLINGACCOUNT, "");
		super.doSetup();
	}
}
