/**
 * 
 */
package com.cloderia.helion.client.local.invoiceterm;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Invoiceterm;

/**
 * @author adrian
 *
 */
@Page(path = "/viewinvoiceterm")
@Templated(value = "view-invoiceterm-page.html#app-container")
public class ViewInvoicetermPage extends BaseInvoicetermPage {

	@PageState
	private Long id;

	@Inject
	@AutoBound
	private DataBinder<Invoiceterm> binder;

	@Inject
	@DataField
	private InvoicetermDisplay entityDisplayComponent;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		this.setViewTitle(BaseInvoicetermPage.VIEW_INVOICETERM, "");
		invoicetermService.call(new RemoteCallback<Invoiceterm>() {
			@Override
			public void callback(Invoiceterm invoiceterm) {
				binder.setModel(invoiceterm);
				entityDisplayComponent.setValue(invoiceterm);
			}
		}).findById(new Long(id));
	}
}
