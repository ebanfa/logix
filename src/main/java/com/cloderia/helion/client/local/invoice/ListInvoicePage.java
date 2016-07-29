/**
 * 
 */
package com.cloderia.helion.client.local.invoice;

import java.util.List;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Invoice;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.DOM;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/listinvoice")
@Templated(value = "list-invoice-page.html#app-container")
public class ListInvoicePage extends BaseInvoicePage {

	@Inject
	@DataField
	private InvoiceListWidget listWidget;

	
	@DataField
	protected AnchorElement createNewInvoiceLink = DOM.createAnchor().cast();
	

    /**
	 * @param e
	 */
	@EventHandler("createNewInvoiceLink")
	public void submit(ClickEvent e) { createInvoicePage.go();	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		invoiceService.call(new RemoteCallback<List<Invoice>>() {
			@Override
			public void callback(List<Invoice> invoices) {
				if (!invoices.isEmpty()) listWidget.setItems(invoices);
			}
		}).findAll();
	}
}
