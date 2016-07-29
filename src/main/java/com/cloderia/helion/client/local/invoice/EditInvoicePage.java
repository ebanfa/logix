/**
 * 
 */
package com.cloderia.helion.client.local.invoice;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Invoice;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/editinvoice")
@Templated(value = "edit-invoice-page.html#app-container")
public class EditInvoicePage extends BaseInvoicePage {
	
	@Inject
	@DataField
	protected InvoiceEditor invoiceEditor;
	
	@PageState
	private int id;

	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		loadFromContMechs(invoiceEditor);
		loadToPartys(invoiceEditor);
		loadUniverses(invoiceEditor);
		loadBillingAccts(invoiceEditor);
		invoiceEditor.setEditMode(true);
		setViewTitle(BaseInvoicePage.UPDATE_INVOICE, "");
		
		invoiceService.call(new RemoteCallback<Invoice>() {
			@Override
			public void callback(Invoice invoice) {
				invoiceEditor.setValue(invoice);
			}
		}).findById(new Long(id));
		super.doSetup();
	}
	
}
