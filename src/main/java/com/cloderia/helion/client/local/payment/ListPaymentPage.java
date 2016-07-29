/**
 * 
 */
package com.cloderia.helion.client.local.payment;

import java.util.List;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Payment;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.DOM;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/listpayment")
@Templated(value = "list-payment-page.html#app-container")
public class ListPaymentPage extends BasePaymentPage {

	@Inject
	@DataField
	private PaymentListWidget listWidget;

	
	@DataField
	protected AnchorElement createNewPaymentLink = DOM.createAnchor().cast();
	

    /**
	 * @param e
	 */
	@EventHandler("createNewPaymentLink")
	public void submit(ClickEvent e) { createPaymentPage.go();	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		paymentService.call(new RemoteCallback<List<Payment>>() {
			@Override
			public void callback(List<Payment> payments) {
				if (!payments.isEmpty()) listWidget.setItems(payments);
			}
		}).findAll();
	}
}
