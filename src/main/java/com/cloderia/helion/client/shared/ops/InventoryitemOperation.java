/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Inventoryitem;

/**
 * @author adrian
 *
 */
@Portable
public class InventoryitemOperation  extends BaseOperation<Inventoryitem> {

	private Inventoryitem inventoryitem;
	private Long universeId;
	private Long lotId;
	private Long prodId;
	private Long statusId;
	private Long containerId;
	private Long facilityId;
	private Long itemTyId;

	/**
	 * 
	 */
	public InventoryitemOperation() {
	}
	
	/**
	 * @param inventoryitem
	 */
	public InventoryitemOperation(Inventoryitem inventoryitem) {
		super();
		this.inventoryitem = inventoryitem;
		this.setEntity(inventoryitem);
		if(inventoryitem.getUniverse() != null)this.setUniverseId(inventoryitem.getUniverse().getId());
		if(inventoryitem.getLot() != null)this.setLotId(inventoryitem.getLot().getId());
		if(inventoryitem.getProd() != null)this.setProdId(inventoryitem.getProd().getId());
		if(inventoryitem.getStatus() != null)this.setStatusId(inventoryitem.getStatus().getId());
		if(inventoryitem.getContainer() != null)this.setContainerId(inventoryitem.getContainer().getId());
		if(inventoryitem.getFacility() != null)this.setFacilityId(inventoryitem.getFacility().getId());
		if(inventoryitem.getItemTy() != null)this.setItemTyId(inventoryitem.getItemTy().getId());
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
	 * @return the LotId
	 */
	public Long getLotId() {
		return lotId;
	}

	/**
	 * @param lotId
	 *            the lotId to set
	 */
	public void setLotId(Long lotId) {
		this.lotId = lotId;
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
	 * @return the StatusId
	 */
	public Long getStatusId() {
		return statusId;
	}

	/**
	 * @param statusId
	 *            the statusId to set
	 */
	public void setStatusId(Long statusId) {
		this.statusId = statusId;
	}
	            
	/**
	 * @return the ContainerId
	 */
	public Long getContainerId() {
		return containerId;
	}

	/**
	 * @param containerId
	 *            the containerId to set
	 */
	public void setContainerId(Long containerId) {
		this.containerId = containerId;
	}
	            
	/**
	 * @return the FacilityId
	 */
	public Long getFacilityId() {
		return facilityId;
	}

	/**
	 * @param facilityId
	 *            the facilityId to set
	 */
	public void setFacilityId(Long facilityId) {
		this.facilityId = facilityId;
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
	 * @return the inventoryitem
	 */
	public Inventoryitem getInventoryitem() {
		return inventoryitem;
	}

	/**
	 * @param inventoryitem
	 *            the inventoryitem to set
	 */
	public void setInventoryitem(Inventoryitem inventoryitem) {
		this.inventoryitem = inventoryitem;
	}

}
