/**
 * 
 */
package com.cloderia.helion.client.local.invoiceterm;

import java.util.List;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Invoiceterm;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.DOM;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/listinvoiceterm")
@Templated(value = "list-invoiceterm-page.html#app-container")
public class ListInvoicetermPage extends BaseInvoicetermPage {

	@Inject
	@DataField
	private InvoicetermListWidget listWidget;

	
	@DataField
	protected AnchorElement createNewInvoicetermLink = DOM.createAnchor().cast();
	

    /**
	 * @param e
	 */
	@EventHandler("createNewInvoicetermLink")
	public void submit(ClickEvent e) { createInvoicetermPage.go();	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		invoicetermService.call(new RemoteCallback<List<Invoiceterm>>() {
			@Override
			public void callback(List<Invoiceterm> invoiceterms) {
				if (!invoiceterms.isEmpty()) listWidget.setItems(invoiceterms);
			}
		}).findAll();
	}
}
