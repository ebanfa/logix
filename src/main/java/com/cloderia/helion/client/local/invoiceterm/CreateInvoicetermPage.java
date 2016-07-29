/**
 * 
 */
package com.cloderia.helion.client.local.invoiceterm;
import javax.inject.Inject;

import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

/**
 * @author adrian
 *
 */
@Page(path = "/createinvoiceterm")
@Templated(value = "edit-invoiceterm-page.html#app-container")
public class CreateInvoicetermPage extends BaseInvoicetermPage {

	@Inject
	@DataField
	protected InvoicetermEditor invoicetermEditor;
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.party.BasePartyPage#doSetup()
	 */
	@Override
	protected void doSetup() {

		loadTermTys(invoicetermEditor);
		loadTermTys(invoicetermEditor);
		loadInvoiceItems(invoicetermEditor);
		loadInvoiceItems(invoicetermEditor);
		loadInvoices(invoicetermEditor);
		loadInvoices(invoicetermEditor);
		loadUniverses(invoicetermEditor);
		loadUniverses(invoicetermEditor);
		setViewTitle(BaseInvoicetermPage.CREATE_INVOICETERM, "");
		super.doSetup();
	}
}
