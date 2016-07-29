/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Facility;

/**
 * @author adrian
 *
 */
@Portable
public class FacilityOperation  extends BaseOperation<Facility> {

	private Facility facility;
	private Long universeId;
	private Long facilityTyId;

	/**
	 * 
	 */
	public FacilityOperation() {
	}
	
	/**
	 * @param facility
	 */
	public FacilityOperation(Facility facility) {
		super();
		this.facility = facility;
		this.setEntity(facility);
		if(facility.getUniverse() != null)this.setUniverseId(facility.getUniverse().getId());
		if(facility.getFacilityTy() != null)this.setFacilityTyId(facility.getFacilityTy().getId());
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
	 * @return the FacilityTyId
	 */
	public Long getFacilityTyId() {
		return facilityTyId;
	}

	/**
	 * @param facilityTyId
	 *            the facilityTyId to set
	 */
	public void setFacilityTyId(Long facilityTyId) {
		this.facilityTyId = facilityTyId;
	}
	            

	/**
	 * @return the facility
	 */
	public Facility getFacility() {
		return facility;
	}

	/**
	 * @param facility
	 *            the facility to set
	 */
	public void setFacility(Facility facility) {
		this.facility = facility;
	}

}
