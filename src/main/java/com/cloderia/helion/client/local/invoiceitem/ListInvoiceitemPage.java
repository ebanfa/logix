/**
 * 
 */
package com.cloderia.helion.client.local.invoiceitem;

import java.util.List;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Invoiceitem;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.DOM;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/listinvoiceitem")
@Templated(value = "list-invoiceitem-page.html#app-container")
public class ListInvoiceitemPage extends BaseInvoiceitemPage {

	@Inject
	@DataField
	private InvoiceitemListWidget listWidget;

	
	@DataField
	protected AnchorElement createNewInvoiceitemLink = DOM.createAnchor().cast();
	

    /**
	 * @param e
	 */
	@EventHandler("createNewInvoiceitemLink")
	public void submit(ClickEvent e) { createInvoiceitemPage.go();	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		invoiceitemService.call(new RemoteCallback<List<Invoiceitem>>() {
			@Override
			public void callback(List<Invoiceitem> invoiceitems) {
				if (!invoiceitems.isEmpty()) listWidget.setItems(invoiceitems);
			}
		}).findAll();
	}
}
