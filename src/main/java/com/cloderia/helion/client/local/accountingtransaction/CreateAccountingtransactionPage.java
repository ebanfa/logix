/**
 * 
 */
package com.cloderia.helion.client.local.accountingtransaction;
import javax.inject.Inject;

import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

/**
 * @author adrian
 *
 */
@Page(path = "/createaccountingtransaction")
@Templated(value = "edit-accountingtransaction-page.html#app-container")
public class CreateAccountingtransactionPage extends BaseAccountingtransactionPage {

	@Inject
	@DataField
	protected AccountingtransactionEditor accountingtransactionEditor;
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.party.BasePartyPage#doSetup()
	 */
	@Override
	protected void doSetup() {

		loadPayments(accountingtransactionEditor);
		loadPayments(accountingtransactionEditor);
		loadFromPartys(accountingtransactionEditor);
		loadFromPartys(accountingtransactionEditor);
		loadInvoices(accountingtransactionEditor);
		loadInvoices(accountingtransactionEditor);
		loadFixedAssets(accountingtransactionEditor);
		loadFixedAssets(accountingtransactionEditor);
		loadPartyRoles(accountingtransactionEditor);
		loadPartyRoles(accountingtransactionEditor);
		loadUniverses(accountingtransactionEditor);
		loadUniverses(accountingtransactionEditor);
		loadTransactionTys(accountingtransactionEditor);
		loadTransactionTys(accountingtransactionEditor);
		setViewTitle(BaseAccountingtransactionPage.CREATE_ACCOUNTINGTRANSACTION, "");
		super.doSetup();
	}
}
