/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Inventoryitemtype;

/**
 * @author adrian
 *
 */
@Portable
public class InventoryitemtypeOperation  extends BaseOperation<Inventoryitemtype> {

	private Inventoryitemtype inventoryitemtype;
	private Long universeId;

	/**
	 * 
	 */
	public InventoryitemtypeOperation() {
	}
	
	/**
	 * @param inventoryitemtype
	 */
	public InventoryitemtypeOperation(Inventoryitemtype inventoryitemtype) {
		super();
		this.inventoryitemtype = inventoryitemtype;
		this.setEntity(inventoryitemtype);
		if(inventoryitemtype.getUniverse() != null)this.setUniverseId(inventoryitemtype.getUniverse().getId());
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
	 * @return the inventoryitemtype
	 */
	public Inventoryitemtype getInventoryitemtype() {
		return inventoryitemtype;
	}

	/**
	 * @param inventoryitemtype
	 *            the inventoryitemtype to set
	 */
	public void setInventoryitemtype(Inventoryitemtype inventoryitemtype) {
		this.inventoryitemtype = inventoryitemtype;
	}

}
