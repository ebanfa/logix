/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Containertype;

/**
 * @author adrian
 *
 */
@Portable
public class ContainertypeOperation  extends BaseOperation<Containertype> {

	private Containertype containertype;
	private Long universeId;

	/**
	 * 
	 */
	public ContainertypeOperation() {
	}
	
	/**
	 * @param containertype
	 */
	public ContainertypeOperation(Containertype containertype) {
		super();
		this.containertype = containertype;
		this.setEntity(containertype);
		if(containertype.getUniverse() != null)this.setUniverseId(containertype.getUniverse().getId());
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
	 * @return the containertype
	 */
	public Containertype getContainertype() {
		return containertype;
	}

	/**
	 * @param containertype
	 *            the containertype to set
	 */
	public void setContainertype(Containertype containertype) {
		this.containertype = containertype;
	}

}
