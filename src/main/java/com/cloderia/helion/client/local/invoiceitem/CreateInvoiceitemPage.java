/**
 * 
 */
package com.cloderia.helion.client.local.invoiceitem;
import javax.inject.Inject;

import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

/**
 * @author adrian
 *
 */
@Page(path = "/createinvoiceitem")
@Templated(value = "edit-invoiceitem-page.html#app-container")
public class CreateInvoiceitemPage extends BaseInvoiceitemPage {

	@Inject
	@DataField
	protected InvoiceitemEditor invoiceitemEditor;
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.party.BasePartyPage#doSetup()
	 */
	@Override
	protected void doSetup() {

		loadItemTys(invoiceitemEditor);
		loadItemTys(invoiceitemEditor);
		loadProdFeats(invoiceitemEditor);
		loadProdFeats(invoiceitemEditor);
		loadSoldWithItems(invoiceitemEditor);
		loadSoldWithItems(invoiceitemEditor);
		loadInvoices(invoiceitemEditor);
		loadInvoices(invoiceitemEditor);
		loadInventoryItems(invoiceitemEditor);
		loadInventoryItems(invoiceitemEditor);
		loadUniverses(invoiceitemEditor);
		loadUniverses(invoiceitemEditor);
		loadProds(invoiceitemEditor);
		loadProds(invoiceitemEditor);
		setViewTitle(BaseInvoiceitemPage.CREATE_INVOICEITEM, "");
		super.doSetup();
	}
}
