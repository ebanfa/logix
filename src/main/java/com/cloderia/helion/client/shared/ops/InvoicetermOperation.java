/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Invoiceterm;

/**
 * @author adrian
 *
 */
@Portable
public class InvoicetermOperation  extends BaseOperation<Invoiceterm> {

	private Invoiceterm invoiceterm;
	private Long universeId;
	private Long termTyId;
	private Long invoiceId;
	private Long invoiceItemId;

	/**
	 * 
	 */
	public InvoicetermOperation() {
	}
	
	/**
	 * @param invoiceterm
	 */
	public InvoicetermOperation(Invoiceterm invoiceterm) {
		super();
		this.invoiceterm = invoiceterm;
		this.setEntity(invoiceterm);
		if(invoiceterm.getUniverse() != null)this.setUniverseId(invoiceterm.getUniverse().getId());
		if(invoiceterm.getTermTy() != null)this.setTermTyId(invoiceterm.getTermTy().getId());
		if(invoiceterm.getInvoice() != null)this.setInvoiceId(invoiceterm.getInvoice().getId());
		if(invoiceterm.getInvoiceItem() != null)this.setInvoiceItemId(invoiceterm.getInvoiceItem().getId());
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
	 * @return the TermTyId
	 */
	public Long getTermTyId() {
		return termTyId;
	}

	/**
	 * @param termTyId
	 *            the termTyId to set
	 */
	public void setTermTyId(Long termTyId) {
		this.termTyId = termTyId;
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
	 * @return the invoiceterm
	 */
	public Invoiceterm getInvoiceterm() {
		return invoiceterm;
	}

	/**
	 * @param invoiceterm
	 *            the invoiceterm to set
	 */
	public void setInvoiceterm(Invoiceterm invoiceterm) {
		this.invoiceterm = invoiceterm;
	}

}
