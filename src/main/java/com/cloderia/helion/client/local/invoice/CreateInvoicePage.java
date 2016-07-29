/**
 * 
 */
package com.cloderia.helion.client.local.invoice;
import javax.inject.Inject;

import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

/**
 * @author adrian
 *
 */
@Page(path = "/createinvoice")
@Templated(value = "edit-invoice-page.html#app-container")
public class CreateInvoicePage extends BaseInvoicePage {

	@Inject
	@DataField
	protected InvoiceEditor invoiceEditor;
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.party.BasePartyPage#doSetup()
	 */
	@Override
	protected void doSetup() {

		loadFromContMechs(invoiceEditor);
		loadFromContMechs(invoiceEditor);
		loadToPartys(invoiceEditor);
		loadToPartys(invoiceEditor);
		loadUniverses(invoiceEditor);
		loadUniverses(invoiceEditor);
		loadBillingAccts(invoiceEditor);
		loadBillingAccts(invoiceEditor);
		setViewTitle(BaseInvoicePage.CREATE_INVOICE, "");
		super.doSetup();
	}
}
