/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Uom;

/**
 * @author adrian
 *
 */
@Portable
public class UomOperation  extends BaseOperation<Uom> {

	private Uom uom;
	private Long universeId;

	/**
	 * 
	 */
	public UomOperation() {
	}
	
	/**
	 * @param uom
	 */
	public UomOperation(Uom uom) {
		super();
		this.uom = uom;
		this.setEntity(uom);
		if(uom.getUniverse() != null)this.setUniverseId(uom.getUniverse().getId());
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
	 * @return the uom
	 */
	public Uom getUom() {
		return uom;
	}

	/**
	 * @param uom
	 *            the uom to set
	 */
	public void setUom(Uom uom) {
		this.uom = uom;
	}

}
