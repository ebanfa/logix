/**
 * 
 */
package com.cloderia.helion.client.local.payment;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Payment;

/**
 * @author adrian
 *
 */
@Page(path = "/viewpayment")
@Templated(value = "view-payment-page.html#app-container")
public class ViewPaymentPage extends BasePaymentPage {

	@PageState
	private Long id;

	@Inject
	@AutoBound
	private DataBinder<Payment> binder;

	@Inject
	@DataField
	private PaymentDisplay entityDisplayComponent;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		this.setViewTitle(BasePaymentPage.VIEW_PAYMENT, "");
		paymentService.call(new RemoteCallback<Payment>() {
			@Override
			public void callback(Payment payment) {
				binder.setModel(payment);
				entityDisplayComponent.setValue(payment);
			}
		}).findById(new Long(id));
	}
}
