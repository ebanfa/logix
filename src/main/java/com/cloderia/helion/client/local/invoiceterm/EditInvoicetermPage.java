/**
 * 
 */
package com.cloderia.helion.client.local.invoiceterm;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Invoiceterm;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/editinvoiceterm")
@Templated(value = "edit-invoiceterm-page.html#app-container")
public class EditInvoicetermPage extends BaseInvoicetermPage {
	
	@Inject
	@DataField
	protected InvoicetermEditor invoicetermEditor;
	
	@PageState
	private int id;

	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		loadTermTys(invoicetermEditor);
		loadInvoiceItems(invoicetermEditor);
		loadInvoices(invoicetermEditor);
		loadUniverses(invoicetermEditor);
		invoicetermEditor.setEditMode(true);
		setViewTitle(BaseInvoicetermPage.UPDATE_INVOICETERM, "");
		
		invoicetermService.call(new RemoteCallback<Invoiceterm>() {
			@Override
			public void callback(Invoiceterm invoiceterm) {
				invoicetermEditor.setValue(invoiceterm);
			}
		}).findById(new Long(id));
		super.doSetup();
	}
	
}
