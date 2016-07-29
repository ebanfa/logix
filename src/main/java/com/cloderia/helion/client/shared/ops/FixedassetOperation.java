/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Fixedasset;

/**
 * @author adrian
 *
 */
@Portable
public class FixedassetOperation  extends BaseOperation<Fixedasset> {

	private Fixedasset fixedasset;
	private Long universeId;
	private Long uomId;
	private Long fixedAssetTyId;

	/**
	 * 
	 */
	public FixedassetOperation() {
	}
	
	/**
	 * @param fixedasset
	 */
	public FixedassetOperation(Fixedasset fixedasset) {
		super();
		this.fixedasset = fixedasset;
		this.setEntity(fixedasset);
		if(fixedasset.getUniverse() != null)this.setUniverseId(fixedasset.getUniverse().getId());
		if(fixedasset.getUom() != null)this.setUomId(fixedasset.getUom().getId());
		if(fixedasset.getFixedAssetTy() != null)this.setFixedAssetTyId(fixedasset.getFixedAssetTy().getId());
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
	 * @return the UomId
	 */
	public Long getUomId() {
		return uomId;
	}

	/**
	 * @param uomId
	 *            the uomId to set
	 */
	public void setUomId(Long uomId) {
		this.uomId = uomId;
	}
	            
	/**
	 * @return the FixedAssetTyId
	 */
	public Long getFixedAssetTyId() {
		return fixedAssetTyId;
	}

	/**
	 * @param fixedAssetTyId
	 *            the fixedAssetTyId to set
	 */
	public void setFixedAssetTyId(Long fixedAssetTyId) {
		this.fixedAssetTyId = fixedAssetTyId;
	}
	            

	/**
	 * @return the fixedasset
	 */
	public Fixedasset getFixedasset() {
		return fixedasset;
	}

	/**
	 * @param fixedasset
	 *            the fixedasset to set
	 */
	public void setFixedasset(Fixedasset fixedasset) {
		this.fixedasset = fixedasset;
	}

}
