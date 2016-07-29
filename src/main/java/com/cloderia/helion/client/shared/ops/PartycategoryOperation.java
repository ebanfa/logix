/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Partycategory;

/**
 * @author adrian
 *
 */
@Portable
public class PartycategoryOperation  extends BaseOperation<Partycategory> {

	private Partycategory partycategory;
	private Long universeId;

	/**
	 * 
	 */
	public PartycategoryOperation() {
	}
	
	/**
	 * @param partycategory
	 */
	public PartycategoryOperation(Partycategory partycategory) {
		super();
		this.partycategory = partycategory;
		this.setEntity(partycategory);
		if(partycategory.getUniverse() != null)this.setUniverseId(partycategory.getUniverse().getId());
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
	 * @return the partycategory
	 */
	public Partycategory getPartycategory() {
		return partycategory;
	}

	/**
	 * @param partycategory
	 *            the partycategory to set
	 */
	public void setPartycategory(Partycategory partycategory) {
		this.partycategory = partycategory;
	}

}
