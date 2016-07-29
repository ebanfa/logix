/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Invoiceitemtype;

/**
 * @author adrian
 *
 */
@Portable
public class InvoiceitemtypeOperation  extends BaseOperation<Invoiceitemtype> {

	private Invoiceitemtype invoiceitemtype;
	private Long universeId;
	private Long parentItemTyId;

	/**
	 * 
	 */
	public InvoiceitemtypeOperation() {
	}
	
	/**
	 * @param invoiceitemtype
	 */
	public InvoiceitemtypeOperation(Invoiceitemtype invoiceitemtype) {
		super();
		this.invoiceitemtype = invoiceitemtype;
		this.setEntity(invoiceitemtype);
		if(invoiceitemtype.getUniverse() != null)this.setUniverseId(invoiceitemtype.getUniverse().getId());
		if(invoiceitemtype.getParentItemTy() != null)this.setParentItemTyId(invoiceitemtype.getParentItemTy().getId());
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
	 * @return the ParentItemTyId
	 */
	public Long getParentItemTyId() {
		return parentItemTyId;
	}

	/**
	 * @param parentItemTyId
	 *            the parentItemTyId to set
	 */
	public void setParentItemTyId(Long parentItemTyId) {
		this.parentItemTyId = parentItemTyId;
	}
	            

	/**
	 * @return the invoiceitemtype
	 */
	public Invoiceitemtype getInvoiceitemtype() {
		return invoiceitemtype;
	}

	/**
	 * @param invoiceitemtype
	 *            the invoiceitemtype to set
	 */
	public void setInvoiceitemtype(Invoiceitemtype invoiceitemtype) {
		this.invoiceitemtype = invoiceitemtype;
	}

}
