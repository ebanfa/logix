/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Invoiceroletype;

/**
 * @author adrian
 *
 */
@Portable
public class InvoiceroletypeOperation  extends BaseOperation<Invoiceroletype> {

	private Invoiceroletype invoiceroletype;
	private Long universeId;

	/**
	 * 
	 */
	public InvoiceroletypeOperation() {
	}
	
	/**
	 * @param invoiceroletype
	 */
	public InvoiceroletypeOperation(Invoiceroletype invoiceroletype) {
		super();
		this.invoiceroletype = invoiceroletype;
		this.setEntity(invoiceroletype);
		if(invoiceroletype.getUniverse() != null)this.setUniverseId(invoiceroletype.getUniverse().getId());
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
	 * @return the invoiceroletype
	 */
	public Invoiceroletype getInvoiceroletype() {
		return invoiceroletype;
	}

	/**
	 * @param invoiceroletype
	 *            the invoiceroletype to set
	 */
	public void setInvoiceroletype(Invoiceroletype invoiceroletype) {
		this.invoiceroletype = invoiceroletype;
	}

}
