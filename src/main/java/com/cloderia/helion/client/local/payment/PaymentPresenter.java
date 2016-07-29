/**
 * 
 */
package com.cloderia.helion.client.local.payment;

import javax.inject.Inject;

import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;

import com.cloderia.helion.client.shared.model.Payment;
import com.google.gwt.user.client.TakesValue;

import com.cloderia.helion.client.shared.ops.PaymentOperation;

/**
 * @author adrian
 *
 */
public class PaymentPresenter implements TakesValue<Payment> {

	@Inject
	@AutoBound
	protected DataBinder<Payment> binder;

	private PaymentOperation paymentOps;

	@Override
	public Payment getValue() {
		return binder.getModel();
	}

	@Override
	public void setValue(final Payment model) {
		binder.setModel(model);
	}

	/**
	 * @return the paymentOps
	 */
	public PaymentOperation getPaymentOps() {
		return paymentOps;
	}

	/**
	 * @param paymentOps
	 *            the paymentOps to set
	 */
	public void setPaymentOps(PaymentOperation paymentOps) {
		this.paymentOps = paymentOps;
	}
	
	/**
	 * 
	 */
	protected PaymentOperation initOps() {
		PaymentOperation paymentOperation = new PaymentOperation(this.getValue());
		this.setPaymentOps(paymentOperation);
		return paymentOperation;
	}

}
