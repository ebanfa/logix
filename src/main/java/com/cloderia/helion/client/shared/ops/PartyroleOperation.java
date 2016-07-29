/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Partyrole;

/**
 * @author adrian
 *
 */
@Portable
public class PartyroleOperation  extends BaseOperation<Partyrole> {

	private Partyrole partyrole;
	private Long universeId;
	private Long partyId;
	private Long partyRoleTyId;

	/**
	 * 
	 */
	public PartyroleOperation() {
	}
	
	/**
	 * @param partyrole
	 */
	public PartyroleOperation(Partyrole partyrole) {
		super();
		this.partyrole = partyrole;
		this.setEntity(partyrole);
		if(partyrole.getUniverse() != null)this.setUniverseId(partyrole.getUniverse().getId());
		if(partyrole.getParty() != null)this.setPartyId(partyrole.getParty().getId());
		if(partyrole.getPartyRoleTy() != null)this.setPartyRoleTyId(partyrole.getPartyRoleTy().getId());
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
	 * @return the PartyId
	 */
	public Long getPartyId() {
		return partyId;
	}

	/**
	 * @param partyId
	 *            the partyId to set
	 */
	public void setPartyId(Long partyId) {
		this.partyId = partyId;
	}
	            
	/**
	 * @return the PartyRoleTyId
	 */
	public Long getPartyRoleTyId() {
		return partyRoleTyId;
	}

	/**
	 * @param partyRoleTyId
	 *            the partyRoleTyId to set
	 */
	public void setPartyRoleTyId(Long partyRoleTyId) {
		this.partyRoleTyId = partyRoleTyId;
	}
	            

	/**
	 * @return the partyrole
	 */
	public Partyrole getPartyrole() {
		return partyrole;
	}

	/**
	 * @param partyrole
	 *            the partyrole to set
	 */
	public void setPartyrole(Partyrole partyrole) {
		this.partyrole = partyrole;
	}

}
