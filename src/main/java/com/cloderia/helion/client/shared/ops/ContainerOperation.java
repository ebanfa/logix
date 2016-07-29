/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Container;

/**
 * @author adrian
 *
 */
@Portable
public class ContainerOperation  extends BaseOperation<Container> {

	private Container container;
	private Long universeId;
	private Long facilityId;
	private Long containerTyId;

	/**
	 * 
	 */
	public ContainerOperation() {
	}
	
	/**
	 * @param container
	 */
	public ContainerOperation(Container container) {
		super();
		this.container = container;
		this.setEntity(container);
		if(container.getUniverse() != null)this.setUniverseId(container.getUniverse().getId());
		if(container.getFacility() != null)this.setFacilityId(container.getFacility().getId());
		if(container.getContainerTy() != null)this.setContainerTyId(container.getContainerTy().getId());
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
	 * @return the ContainerTyId
	 */
	public Long getContainerTyId() {
		return containerTyId;
	}

	/**
	 * @param containerTyId
	 *            the containerTyId to set
	 */
	public void setContainerTyId(Long containerTyId) {
		this.containerTyId = containerTyId;
	}
	            

	/**
	 * @return the container
	 */
	public Container getContainer() {
		return container;
	}

	/**
	 * @param container
	 *            the container to set
	 */
	public void setContainer(Container container) {
		this.container = container;
	}

}
