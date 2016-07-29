/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Invoicestatustype;

/**
 * @author adrian
 *
 */
@Portable
public class InvoicestatustypeOperation  extends BaseOperation<Invoicestatustype> {

	private Invoicestatustype invoicestatustype;
	private Long universeId;

	/**
	 * 
	 */
	public InvoicestatustypeOperation() {
	}
	
	/**
	 * @param invoicestatustype
	 */
	public InvoicestatustypeOperation(Invoicestatustype invoicestatustype) {
		super();
		this.invoicestatustype = invoicestatustype;
		this.setEntity(invoicestatustype);
		if(invoicestatustype.getUniverse() != null)this.setUniverseId(invoicestatustype.getUniverse().getId());
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
	 * @return the invoicestatustype
	 */
	public Invoicestatustype getInvoicestatustype() {
		return invoicestatustype;
	}

	/**
	 * @param invoicestatustype
	 *            the invoicestatustype to set
	 */
	public void setInvoicestatustype(Invoicestatustype invoicestatustype) {
		this.invoicestatustype = invoicestatustype;
	}

}
