/**
 * 
 */
package com.cloderia.helion.client.local.invoice;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Invoice;

/**
 * @author adrian
 *
 */
@Page(path = "/viewinvoice")
@Templated(value = "view-invoice-page.html#app-container")
public class ViewInvoicePage extends BaseInvoicePage {

	@PageState
	private Long id;

	@Inject
	@AutoBound
	private DataBinder<Invoice> binder;

	@Inject
	@DataField
	private InvoiceDisplay entityDisplayComponent;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		this.setViewTitle(BaseInvoicePage.VIEW_INVOICE, "");
		invoiceService.call(new RemoteCallback<Invoice>() {
			@Override
			public void callback(Invoice invoice) {
				binder.setModel(invoice);
				entityDisplayComponent.setValue(invoice);
			}
		}).findById(new Long(id));
	}
}
