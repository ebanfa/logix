/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Party;

/**
 * @author adrian
 *
 */
@Portable
public class PartyOperation  extends BaseOperation<Party> {

	private Party party;
	private Long universeId;
	private Long partyTyId;

	/**
	 * 
	 */
	public PartyOperation() {
	}
	
	/**
	 * @param party
	 */
	public PartyOperation(Party party) {
		super();
		this.party = party;
		this.setEntity(party);
		if(party.getUniverse() != null)this.setUniverseId(party.getUniverse().getId());
		if(party.getPartyTy() != null)this.setPartyTyId(party.getPartyTy().getId());
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
	 * @return the PartyTyId
	 */
	public Long getPartyTyId() {
		return partyTyId;
	}

	/**
	 * @param partyTyId
	 *            the partyTyId to set
	 */
	public void setPartyTyId(Long partyTyId) {
		this.partyTyId = partyTyId;
	}
	            

	/**
	 * @return the party
	 */
	public Party getParty() {
		return party;
	}

	/**
	 * @param party
	 *            the party to set
	 */
	public void setParty(Party party) {
		this.party = party;
	}

}
