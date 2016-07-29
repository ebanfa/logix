/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Uomconversion;

/**
 * @author adrian
 *
 */
@Portable
public class UomconversionOperation  extends BaseOperation<Uomconversion> {

	private Uomconversion uomconversion;
	private Long universeId;
	private Long fromUomId;
	private Long toUomId;

	/**
	 * 
	 */
	public UomconversionOperation() {
	}
	
	/**
	 * @param uomconversion
	 */
	public UomconversionOperation(Uomconversion uomconversion) {
		super();
		this.uomconversion = uomconversion;
		this.setEntity(uomconversion);
		if(uomconversion.getUniverse() != null)this.setUniverseId(uomconversion.getUniverse().getId());
		if(uomconversion.getFromUom() != null)this.setFromUomId(uomconversion.getFromUom().getId());
		if(uomconversion.getToUom() != null)this.setToUomId(uomconversion.getToUom().getId());
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
	 * @return the FromUomId
	 */
	public Long getFromUomId() {
		return fromUomId;
	}

	/**
	 * @param fromUomId
	 *            the fromUomId to set
	 */
	public void setFromUomId(Long fromUomId) {
		this.fromUomId = fromUomId;
	}
	            
	/**
	 * @return the ToUomId
	 */
	public Long getToUomId() {
		return toUomId;
	}

	/**
	 * @param toUomId
	 *            the toUomId to set
	 */
	public void setToUomId(Long toUomId) {
		this.toUomId = toUomId;
	}
	            

	/**
	 * @return the uomconversion
	 */
	public Uomconversion getUomconversion() {
		return uomconversion;
	}

	/**
	 * @param uomconversion
	 *            the uomconversion to set
	 */
	public void setUomconversion(Uomconversion uomconversion) {
		this.uomconversion = uomconversion;
	}

}
