/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Depreciationmethod;

/**
 * @author adrian
 *
 */
@Portable
public class DepreciationmethodOperation  extends BaseOperation<Depreciationmethod> {

	private Depreciationmethod depreciationmethod;
	private Long universeId;

	/**
	 * 
	 */
	public DepreciationmethodOperation() {
	}
	
	/**
	 * @param depreciationmethod
	 */
	public DepreciationmethodOperation(Depreciationmethod depreciationmethod) {
		super();
		this.depreciationmethod = depreciationmethod;
		this.setEntity(depreciationmethod);
		if(depreciationmethod.getUniverse() != null)this.setUniverseId(depreciationmethod.getUniverse().getId());
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
	 * @return the depreciationmethod
	 */
	public Depreciationmethod getDepreciationmethod() {
		return depreciationmethod;
	}

	/**
	 * @param depreciationmethod
	 *            the depreciationmethod to set
	 */
	public void setDepreciationmethod(Depreciationmethod depreciationmethod) {
		this.depreciationmethod = depreciationmethod;
	}

}
