/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Invoice;

/**
 * @author adrian
 *
 */
@Portable
public class InvoiceOperation  extends BaseOperation<Invoice> {

	private Invoice invoice;
	private Long universeId;
	private Long billingAcctId;
	private Long toPartyId;
	private Long fromPartyId;
	private Long fromContMechId;
	private Long toContMechId;

	/**
	 * 
	 */
	public InvoiceOperation() {
	}
	
	/**
	 * @param invoice
	 */
	public InvoiceOperation(Invoice invoice) {
		super();
		this.invoice = invoice;
		this.setEntity(invoice);
		if(invoice.getUniverse() != null)this.setUniverseId(invoice.getUniverse().getId());
		if(invoice.getBillingAcct() != null)this.setBillingAcctId(invoice.getBillingAcct().getId());
		if(invoice.getToParty() != null)this.setToPartyId(invoice.getToParty().getId());
		if(invoice.getFromParty() != null)this.setFromPartyId(invoice.getFromParty().getId());
		if(invoice.getFromContMech() != null)this.setFromContMechId(invoice.getFromContMech().getId());
		if(invoice.getToContMech() != null)this.setToContMechId(invoice.getToContMech().getId());
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
	 * @return the ToPartyId
	 */
	public Long getToPartyId() {
		return toPartyId;
	}

	/**
	 * @param toPartyId
	 *            the toPartyId to set
	 */
	public void setToPartyId(Long toPartyId) {
		this.toPartyId = toPartyId;
	}
	            
	/**
	 * @return the FromPartyId
	 */
	public Long getFromPartyId() {
		return fromPartyId;
	}

	/**
	 * @param fromPartyId
	 *            the fromPartyId to set
	 */
	public void setFromPartyId(Long fromPartyId) {
		this.fromPartyId = fromPartyId;
	}
	            
	/**
	 * @return the FromContMechId
	 */
	public Long getFromContMechId() {
		return fromContMechId;
	}

	/**
	 * @param fromContMechId
	 *            the fromContMechId to set
	 */
	public void setFromContMechId(Long fromContMechId) {
		this.fromContMechId = fromContMechId;
	}
	            
	/**
	 * @return the ToContMechId
	 */
	public Long getToContMechId() {
		return toContMechId;
	}

	/**
	 * @param toContMechId
	 *            the toContMechId to set
	 */
	public void setToContMechId(Long toContMechId) {
		this.toContMechId = toContMechId;
	}
	            

	/**
	 * @return the invoice
	 */
	public Invoice getInvoice() {
		return invoice;
	}

	/**
	 * @param invoice
	 *            the invoice to set
	 */
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

}
