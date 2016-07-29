/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Lot;

/**
 * @author adrian
 *
 */
@Portable
public class LotOperation  extends BaseOperation<Lot> {

	private Lot lot;
	private Long universeId;

	/**
	 * 
	 */
	public LotOperation() {
	}
	
	/**
	 * @param lot
	 */
	public LotOperation(Lot lot) {
		super();
		this.lot = lot;
		this.setEntity(lot);
		if(lot.getUniverse() != null)this.setUniverseId(lot.getUniverse().getId());
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
	 * @return the lot
	 */
	public Lot getLot() {
		return lot;
	}

	/**
	 * @param lot
	 *            the lot to set
	 */
	public void setLot(Lot lot) {
		this.lot = lot;
	}

}
