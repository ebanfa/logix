/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Invoicestatus;

/**
 * @author adrian
 *
 */
@Portable
public class InvoicestatusOperation  extends BaseOperation<Invoicestatus> {

	private Invoicestatus invoicestatus;
	private Long universeId;
	private Long invoiceId;
	private Long invoiceStatTyId;

	/**
	 * 
	 */
	public InvoicestatusOperation() {
	}
	
	/**
	 * @param invoicestatus
	 */
	public InvoicestatusOperation(Invoicestatus invoicestatus) {
		super();
		this.invoicestatus = invoicestatus;
		this.setEntity(invoicestatus);
		if(invoicestatus.getUniverse() != null)this.setUniverseId(invoicestatus.getUniverse().getId());
		if(invoicestatus.getInvoice() != null)this.setInvoiceId(invoicestatus.getInvoice().getId());
		if(invoicestatus.getInvoiceStatTy() != null)this.setInvoiceStatTyId(invoicestatus.getInvoiceStatTy().getId());
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
	 * @return the InvoiceStatTyId
	 */
	public Long getInvoiceStatTyId() {
		return invoiceStatTyId;
	}

	/**
	 * @param invoiceStatTyId
	 *            the invoiceStatTyId to set
	 */
	public void setInvoiceStatTyId(Long invoiceStatTyId) {
		this.invoiceStatTyId = invoiceStatTyId;
	}
	            

	/**
	 * @return the invoicestatus
	 */
	public Invoicestatus getInvoicestatus() {
		return invoicestatus;
	}

	/**
	 * @param invoicestatus
	 *            the invoicestatus to set
	 */
	public void setInvoicestatus(Invoicestatus invoicestatus) {
		this.invoicestatus = invoicestatus;
	}

}
