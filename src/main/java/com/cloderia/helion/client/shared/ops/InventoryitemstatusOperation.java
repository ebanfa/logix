/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Inventoryitemstatus;

/**
 * @author adrian
 *
 */
@Portable
public class InventoryitemstatusOperation  extends BaseOperation<Inventoryitemstatus> {

	private Inventoryitemstatus inventoryitemstatus;
	private Long universeId;

	/**
	 * 
	 */
	public InventoryitemstatusOperation() {
	}
	
	/**
	 * @param inventoryitemstatus
	 */
	public InventoryitemstatusOperation(Inventoryitemstatus inventoryitemstatus) {
		super();
		this.inventoryitemstatus = inventoryitemstatus;
		this.setEntity(inventoryitemstatus);
		if(inventoryitemstatus.getUniverse() != null)this.setUniverseId(inventoryitemstatus.getUniverse().getId());
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
	 * @return the inventoryitemstatus
	 */
	public Inventoryitemstatus getInventoryitemstatus() {
		return inventoryitemstatus;
	}

	/**
	 * @param inventoryitemstatus
	 *            the inventoryitemstatus to set
	 */
	public void setInventoryitemstatus(Inventoryitemstatus inventoryitemstatus) {
		this.inventoryitemstatus = inventoryitemstatus;
	}

}
