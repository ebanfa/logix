/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Universe;

/**
 * @author adrian
 *
 */
@Portable
public class UniverseOperation  extends BaseOperation<Universe> {

	private Universe universe;
	private Long parentUniverseId;

	/**
	 * 
	 */
	public UniverseOperation() {
	}
	
	/**
	 * @param universe
	 */
	public UniverseOperation(Universe universe) {
		super();
		this.universe = universe;
		this.setEntity(universe);
		if(universe.getParentUniverse() != null)this.setParentUniverseId(universe.getParentUniverse().getId());
	}
	
	/**
	 * @return the ParentUniverseId
	 */
	public Long getParentUniverseId() {
		return parentUniverseId;
	}

	/**
	 * @param parentUniverseId
	 *            the parentUniverseId to set
	 */
	public void setParentUniverseId(Long parentUniverseId) {
		this.parentUniverseId = parentUniverseId;
	}
	            

	/**
	 * @return the universe
	 */
	public Universe getUniverse() {
		return universe;
	}

	/**
	 * @param universe
	 *            the universe to set
	 */
	public void setUniverse(Universe universe) {
		this.universe = universe;
	}

}
