/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Payment;

/**
 * @author adrian
 *
 */
@Portable
public class PaymentOperation  extends BaseOperation<Payment> {

	private Payment payment;
	private Long universeId;
	private Long methodTyId;
	private Long paymentTyId;
	private Long finAcctId;

	/**
	 * 
	 */
	public PaymentOperation() {
	}
	
	/**
	 * @param payment
	 */
	public PaymentOperation(Payment payment) {
		super();
		this.payment = payment;
		this.setEntity(payment);
		if(payment.getUniverse() != null)this.setUniverseId(payment.getUniverse().getId());
		if(payment.getMethodTy() != null)this.setMethodTyId(payment.getMethodTy().getId());
		if(payment.getPaymentTy() != null)this.setPaymentTyId(payment.getPaymentTy().getId());
		if(payment.getFinAcct() != null)this.setFinAcctId(payment.getFinAcct().getId());
	}
	
	/**
	 * @return the UniverseId
	 */
	public Long getUniverseId() {
		return universeId;
	}

	/**
	 * @param universeId
	 *            the universeId to set
	 */
	public void setUniverseId(Long universeId) {
		this.universeId = universeId;
	}
	            
	/**
	 * @return the MethodTyId
	 */
	public Long getMethodTyId() {
		return methodTyId;
	}

	/**
	 * @param methodTyId
	 *            the methodTyId to set
	 */
	public void setMethodTyId(Long methodTyId) {
		this.methodTyId = methodTyId;
	}
	            
	/**
	 * @return the PaymentTyId
	 */
	public Long getPaymentTyId() {
		return paymentTyId;
	}

	/**
	 * @param paymentTyId
	 *            the paymentTyId to set
	 */
	public void setPaymentTyId(Long paymentTyId) {
		this.paymentTyId = paymentTyId;
	}
	            
	/**
	 * @return the FinAcctId
	 */
	public Long getFinAcctId() {
		return finAcctId;
	}

	/**
	 * @param finAcctId
	 *            the finAcctId to set
	 */
	public void setFinAcctId(Long finAcctId) {
		this.finAcctId = finAcctId;
	}
	            

	/**
	 * @return the payment
	 */
	public Payment getPayment() {
		return payment;
	}

	/**
	 * @param payment
	 *            the payment to set
	 */
	public void setPayment(Payment payment) {
		this.payment = payment;
	}

}
