/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Preferencetype;

/**
 * @author adrian
 *
 */
@Portable
public class PreferencetypeOperation  extends BaseOperation<Preferencetype> {

	private Preferencetype preferencetype;
	private Long universeId;

	/**
	 * 
	 */
	public PreferencetypeOperation() {
	}
	
	/**
	 * @param preferencetype
	 */
	public PreferencetypeOperation(Preferencetype preferencetype) {
		super();
		this.preferencetype = preferencetype;
		this.setEntity(preferencetype);
		if(preferencetype.getUniverse() != null)this.setUniverseId(preferencetype.getUniverse().getId());
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
	 * @return the preferencetype
	 */
	public Preferencetype getPreferencetype() {
		return preferencetype;
	}

	/**
	 * @param preferencetype
	 *            the preferencetype to set
	 */
	public void setPreferencetype(Preferencetype preferencetype) {
		this.preferencetype = preferencetype;
	}

}
