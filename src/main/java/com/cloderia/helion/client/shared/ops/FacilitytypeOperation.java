/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Facilitytype;

/**
 * @author adrian
 *
 */
@Portable
public class FacilitytypeOperation  extends BaseOperation<Facilitytype> {

	private Facilitytype facilitytype;
	private Long universeId;

	/**
	 * 
	 */
	public FacilitytypeOperation() {
	}
	
	/**
	 * @param facilitytype
	 */
	public FacilitytypeOperation(Facilitytype facilitytype) {
		super();
		this.facilitytype = facilitytype;
		this.setEntity(facilitytype);
		if(facilitytype.getUniverse() != null)this.setUniverseId(facilitytype.getUniverse().getId());
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
	 * @return the facilitytype
	 */
	public Facilitytype getFacilitytype() {
		return facilitytype;
	}

	/**
	 * @param facilitytype
	 *            the facilitytype to set
	 */
	public void setFacilitytype(Facilitytype facilitytype) {
		this.facilitytype = facilitytype;
	}

}
