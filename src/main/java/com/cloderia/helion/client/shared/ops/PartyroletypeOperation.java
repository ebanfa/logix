/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Partyroletype;

/**
 * @author adrian
 *
 */
@Portable
public class PartyroletypeOperation  extends BaseOperation<Partyroletype> {

	private Partyroletype partyroletype;
	private Long universeId;
	private Long parentRoleTyId;

	/**
	 * 
	 */
	public PartyroletypeOperation() {
	}
	
	/**
	 * @param partyroletype
	 */
	public PartyroletypeOperation(Partyroletype partyroletype) {
		super();
		this.partyroletype = partyroletype;
		this.setEntity(partyroletype);
		if(partyroletype.getUniverse() != null)this.setUniverseId(partyroletype.getUniverse().getId());
		if(partyroletype.getParentRoleTy() != null)this.setParentRoleTyId(partyroletype.getParentRoleTy().getId());
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
	 * @return the ParentRoleTyId
	 */
	public Long getParentRoleTyId() {
		return parentRoleTyId;
	}

	/**
	 * @param parentRoleTyId
	 *            the parentRoleTyId to set
	 */
	public void setParentRoleTyId(Long parentRoleTyId) {
		this.parentRoleTyId = parentRoleTyId;
	}
	            

	/**
	 * @return the partyroletype
	 */
	public Partyroletype getPartyroletype() {
		return partyroletype;
	}

	/**
	 * @param partyroletype
	 *            the partyroletype to set
	 */
	public void setPartyroletype(Partyroletype partyroletype) {
		this.partyroletype = partyroletype;
	}

}
