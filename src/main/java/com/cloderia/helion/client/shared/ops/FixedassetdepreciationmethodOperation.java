/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Fixedassetdepreciationmethod;

/**
 * @author adrian
 *
 */
@Portable
public class FixedassetdepreciationmethodOperation  extends BaseOperation<Fixedassetdepreciationmethod> {

	private Fixedassetdepreciationmethod fixedassetdepreciationmethod;
	private Long universeId;
	private Long fixedAssetId;
	private Long depMethodId;

	/**
	 * 
	 */
	public FixedassetdepreciationmethodOperation() {
	}
	
	/**
	 * @param fixedassetdepreciationmethod
	 */
	public FixedassetdepreciationmethodOperation(Fixedassetdepreciationmethod fixedassetdepreciationmethod) {
		super();
		this.fixedassetdepreciationmethod = fixedassetdepreciationmethod;
		this.setEntity(fixedassetdepreciationmethod);
		if(fixedassetdepreciationmethod.getUniverse() != null)this.setUniverseId(fixedassetdepreciationmethod.getUniverse().getId());
		if(fixedassetdepreciationmethod.getFixedAsset() != null)this.setFixedAssetId(fixedassetdepreciationmethod.getFixedAsset().getId());
		if(fixedassetdepreciationmethod.getDepMethod() != null)this.setDepMethodId(fixedassetdepreciationmethod.getDepMethod().getId());
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
	 * @return the FixedAssetId
	 */
	public Long getFixedAssetId() {
		return fixedAssetId;
	}

	/**
	 * @param fixedAssetId
	 *            the fixedAssetId to set
	 */
	public void setFixedAssetId(Long fixedAssetId) {
		this.fixedAssetId = fixedAssetId;
	}
	            
	/**
	 * @return the DepMethodId
	 */
	public Long getDepMethodId() {
		return depMethodId;
	}

	/**
	 * @param depMethodId
	 *            the depMethodId to set
	 */
	public void setDepMethodId(Long depMethodId) {
		this.depMethodId = depMethodId;
	}
	            

	/**
	 * @return the fixedassetdepreciationmethod
	 */
	public Fixedassetdepreciationmethod getFixedassetdepreciationmethod() {
		return fixedassetdepreciationmethod;
	}

	/**
	 * @param fixedassetdepreciationmethod
	 *            the fixedassetdepreciationmethod to set
	 */
	public void setFixedassetdepreciationmethod(Fixedassetdepreciationmethod fixedassetdepreciationmethod) {
		this.fixedassetdepreciationmethod = fixedassetdepreciationmethod;
	}

}
