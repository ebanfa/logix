/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Invoiceitem;

/**
 * @author adrian
 *
 */
@Portable
public class InvoiceitemOperation  extends BaseOperation<Invoiceitem> {

	private Invoiceitem invoiceitem;
	private Long universeId;
	private Long itemTyId;
	private Long invoiceId;
	private Long inventoryItemId;
	private Long soldWithItemId;
	private Long adjByItemId;
	private Long prodId;
	private Long prodFeatId;

	/**
	 * 
	 */
	public InvoiceitemOperation() {
	}
	
	/**
	 * @param invoiceitem
	 */
	public InvoiceitemOperation(Invoiceitem invoiceitem) {
		super();
		this.invoiceitem = invoiceitem;
		this.setEntity(invoiceitem);
		if(invoiceitem.getUniverse() != null)this.setUniverseId(invoiceitem.getUniverse().getId());
		if(invoiceitem.getItemTy() != null)this.setItemTyId(invoiceitem.getItemTy().getId());
		if(invoiceitem.getInvoice() != null)this.setInvoiceId(invoiceitem.getInvoice().getId());
		if(invoiceitem.getInventoryItem() != null)this.setInventoryItemId(invoiceitem.getInventoryItem().getId());
		if(invoiceitem.getSoldWithItem() != null)this.setSoldWithItemId(invoiceitem.getSoldWithItem().getId());
		if(invoiceitem.getAdjByItem() != null)this.setAdjByItemId(invoiceitem.getAdjByItem().getId());
		if(invoiceitem.getProd() != null)this.setProdId(invoiceitem.getProd().getId());
		if(invoiceitem.getProdFeat() != null)this.setProdFeatId(invoiceitem.getProdFeat().getId());
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
	 * @return the ItemTyId
	 */
	public Long getItemTyId() {
		return itemTyId;
	}

	/**
	 * @param itemTyId
	 *            the itemTyId to set
	 */
	public void setItemTyId(Long itemTyId) {
		this.itemTyId = itemTyId;
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
	 * @return the InventoryItemId
	 */
	public Long getInventoryItemId() {
		return inventoryItemId;
	}

	/**
	 * @param inventoryItemId
	 *            the inventoryItemId to set
	 */
	public void setInventoryItemId(Long inventoryItemId) {
		this.inventoryItemId = inventoryItemId;
	}
	            
	/**
	 * @return the SoldWithItemId
	 */
	public Long getSoldWithItemId() {
		return soldWithItemId;
	}

	/**
	 * @param soldWithItemId
	 *            the soldWithItemId to set
	 */
	public void setSoldWithItemId(Long soldWithItemId) {
		this.soldWithItemId = soldWithItemId;
	}
	            
	/**
	 * @return the AdjByItemId
	 */
	public Long getAdjByItemId() {
		return adjByItemId;
	}

	/**
	 * @param adjByItemId
	 *            the adjByItemId to set
	 */
	public void setAdjByItemId(Long adjByItemId) {
		this.adjByItemId = adjByItemId;
	}
	            
	/**
	 * @return the ProdId
	 */
	public Long getProdId() {
		return prodId;
	}

	/**
	 * @param prodId
	 *            the prodId to set
	 */
	public void setProdId(Long prodId) {
		this.prodId = prodId;
	}
	            
	/**
	 * @return the ProdFeatId
	 */
	public Long getProdFeatId() {
		return prodFeatId;
	}

	/**
	 * @param prodFeatId
	 *            the prodFeatId to set
	 */
	public void setProdFeatId(Long prodFeatId) {
		this.prodFeatId = prodFeatId;
	}
	            

	/**
	 * @return the invoiceitem
	 */
	public Invoiceitem getInvoiceitem() {
		return invoiceitem;
	}

	/**
	 * @param invoiceitem
	 *            the invoiceitem to set
	 */
	public void setInvoiceitem(Invoiceitem invoiceitem) {
		this.invoiceitem = invoiceitem;
	}

}
