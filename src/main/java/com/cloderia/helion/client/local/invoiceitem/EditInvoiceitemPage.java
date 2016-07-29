/**
 * 
 */
package com.cloderia.helion.client.local.invoiceitem;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Invoiceitem;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/editinvoiceitem")
@Templated(value = "edit-invoiceitem-page.html#app-container")
public class EditInvoiceitemPage extends BaseInvoiceitemPage {
	
	@Inject
	@DataField
	protected InvoiceitemEditor invoiceitemEditor;
	
	@PageState
	private int id;

	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		loadItemTys(invoiceitemEditor);
		loadProdFeats(invoiceitemEditor);
		loadSoldWithItems(invoiceitemEditor);
		loadInvoices(invoiceitemEditor);
		loadInventoryItems(invoiceitemEditor);
		loadUniverses(invoiceitemEditor);
		loadProds(invoiceitemEditor);
		invoiceitemEditor.setEditMode(true);
		setViewTitle(BaseInvoiceitemPage.UPDATE_INVOICEITEM, "");
		
		invoiceitemService.call(new RemoteCallback<Invoiceitem>() {
			@Override
			public void callback(Invoiceitem invoiceitem) {
				invoiceitemEditor.setValue(invoiceitem);
			}
		}).findById(new Long(id));
		super.doSetup();
	}
	
}
