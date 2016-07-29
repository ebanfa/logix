/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Geoboundry;

/**
 * @author adrian
 *
 */
@Portable
public class GeoboundryOperation  extends BaseOperation<Geoboundry> {

	private Geoboundry geoboundry;
	private Long universeId;
	private Long geoBoundryTyId;
	private Long parentGeoBoundryId;

	/**
	 * 
	 */
	public GeoboundryOperation() {
	}
	
	/**
	 * @param geoboundry
	 */
	public GeoboundryOperation(Geoboundry geoboundry) {
		super();
		this.geoboundry = geoboundry;
		this.setEntity(geoboundry);
		if(geoboundry.getUniverse() != null)this.setUniverseId(geoboundry.getUniverse().getId());
		if(geoboundry.getGeoBoundryTy() != null)this.setGeoBoundryTyId(geoboundry.getGeoBoundryTy().getId());
		if(geoboundry.getParentGeoBoundry() != null)this.setParentGeoBoundryId(geoboundry.getParentGeoBoundry().getId());
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
	 * @return the GeoBoundryTyId
	 */
	public Long getGeoBoundryTyId() {
		return geoBoundryTyId;
	}

	/**
	 * @param geoBoundryTyId
	 *            the geoBoundryTyId to set
	 */
	public void setGeoBoundryTyId(Long geoBoundryTyId) {
		this.geoBoundryTyId = geoBoundryTyId;
	}
	            
	/**
	 * @return the ParentGeoBoundryId
	 */
	public Long getParentGeoBoundryId() {
		return parentGeoBoundryId;
	}

	/**
	 * @param parentGeoBoundryId
	 *            the parentGeoBoundryId to set
	 */
	public void setParentGeoBoundryId(Long parentGeoBoundryId) {
		this.parentGeoBoundryId = parentGeoBoundryId;
	}
	            

	/**
	 * @return the geoboundry
	 */
	public Geoboundry getGeoboundry() {
		return geoboundry;
	}

	/**
	 * @param geoboundry
	 *            the geoboundry to set
	 */
	public void setGeoboundry(Geoboundry geoboundry) {
		this.geoboundry = geoboundry;
	}

}
