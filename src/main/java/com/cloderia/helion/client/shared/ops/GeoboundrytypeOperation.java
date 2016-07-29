/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Geoboundrytype;

/**
 * @author adrian
 *
 */
@Portable
public class GeoboundrytypeOperation  extends BaseOperation<Geoboundrytype> {

	private Geoboundrytype geoboundrytype;
	private Long universeId;

	/**
	 * 
	 */
	public GeoboundrytypeOperation() {
	}
	
	/**
	 * @param geoboundrytype
	 */
	public GeoboundrytypeOperation(Geoboundrytype geoboundrytype) {
		super();
		this.geoboundrytype = geoboundrytype;
		this.setEntity(geoboundrytype);
		if(geoboundrytype.getUniverse() != null)this.setUniverseId(geoboundrytype.getUniverse().getId());
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
	 * @return the geoboundrytype
	 */
	public Geoboundrytype getGeoboundrytype() {
		return geoboundrytype;
	}

	/**
	 * @param geoboundrytype
	 *            the geoboundrytype to set
	 */
	public void setGeoboundrytype(Geoboundrytype geoboundrytype) {
		this.geoboundrytype = geoboundrytype;
	}

}
