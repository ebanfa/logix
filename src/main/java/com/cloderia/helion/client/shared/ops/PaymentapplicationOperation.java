/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Paymentapplication;

/**
 * @author adrian
 *
 */
@Portable
public class PaymentapplicationOperation  extends BaseOperation<Paymentapplication> {

	private Paymentapplication paymentapplication;
	private Long universeId;
	private Long paymentId;
	private Long billingAcctId;
	private Long invoiceId;
	private Long invoiceItemId;

	/**
	 * 
	 */
	public PaymentapplicationOperation() {
	}
	
	/**
	 * @param paymentapplication
	 */
	public PaymentapplicationOperation(Paymentapplication paymentapplication) {
		super();
		this.paymentapplication = paymentapplication;
		this.setEntity(paymentapplication);
		if(paymentapplication.getUniverse() != null)this.setUniverseId(paymentapplication.getUniverse().getId());
		if(paymentapplication.getPayment() != null)this.setPaymentId(paymentapplication.getPayment().getId());
		if(paymentapplication.getBillingAcct() != null)this.setBillingAcctId(paymentapplication.getBillingAcct().getId());
		if(paymentapplication.getInvoice() != null)this.setInvoiceId(paymentapplication.getInvoice().getId());
		if(paymentapplication.getInvoiceItem() != null)this.setInvoiceItemId(paymentapplication.getInvoiceItem().getId());
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
	 * @return the PaymentId
	 */
	public Long getPaymentId() {
		return paymentId;
	}

	/**
	 * @param paymentId
	 *            the paymentId to set
	 */
	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}
	            
	/**
	 * @return the BillingAcctId
	 */
	public Long getBillingAcctId() {
		return billingAcctId;
	}

	/**
	 * @param billingAcctId
	 *            the billingAcctId to set
	 */
	public void setBillingAcctId(Long billingAcctId) {
		this.billingAcctId = billingAcctId;
	}
	            
	/**
	 * @return the InvoiceId
	 */
	public Long getInvoiceId() {
		return invoiceId;
	}

	/**
	 * @param invoiceId
	 *            the invoiceId to set
	 */
	public void setInvoiceId(Long invoiceId) {
		this.invoiceId = invoiceId;
	}
	            
	/**
	 * @return the InvoiceItemId
	 */
	public Long getInvoiceItemId() {
		return invoiceItemId;
	}

	/**
	 * @param invoiceItemId
	 *            the invoiceItemId to set
	 */
	public void setInvoiceItemId(Long invoiceItemId) {
		this.invoiceItemId = invoiceItemId;
	}
	            

	/**
	 * @return the paymentapplication
	 */
	public Paymentapplication getPaymentapplication() {
		return paymentapplication;
	}

	/**
	 * @param paymentapplication
	 *            the paymentapplication to set
	 */
	public void setPaymentapplication(Paymentapplication paymentapplication) {
		this.paymentapplication = paymentapplication;
	}

}
