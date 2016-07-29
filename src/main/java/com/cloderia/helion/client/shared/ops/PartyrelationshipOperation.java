/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Partyrelationship;

/**
 * @author adrian
 *
 */
@Portable
public class PartyrelationshipOperation  extends BaseOperation<Partyrelationship> {

	private Partyrelationship partyrelationship;
	private Long universeId;
	private Long termTyId;
	private Long termReasonId;
	private Long fromPartyRoleId;
	private Long toPartyRoleId;
	private Long partyRelId;
	private Long partyRelStatId;

	/**
	 * 
	 */
	public PartyrelationshipOperation() {
	}
	
	/**
	 * @param partyrelationship
	 */
	public PartyrelationshipOperation(Partyrelationship partyrelationship) {
		super();
		this.partyrelationship = partyrelationship;
		this.setEntity(partyrelationship);
		if(partyrelationship.getUniverse() != null)this.setUniverseId(partyrelationship.getUniverse().getId());
		if(partyrelationship.getTermTy() != null)this.setTermTyId(partyrelationship.getTermTy().getId());
		if(partyrelationship.getTermReason() != null)this.setTermReasonId(partyrelationship.getTermReason().getId());
		if(partyrelationship.getFromPartyRole() != null)this.setFromPartyRoleId(partyrelationship.getFromPartyRole().getId());
		if(partyrelationship.getToPartyRole() != null)this.setToPartyRoleId(partyrelationship.getToPartyRole().getId());
		if(partyrelationship.getPartyRel() != null)this.setPartyRelId(partyrelationship.getPartyRel().getId());
		if(partyrelationship.getPartyRelStat() != null)this.setPartyRelStatId(partyrelationship.getPartyRelStat().getId());
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
	 * @return the TermTyId
	 */
	public Long getTermTyId() {
		return termTyId;
	}

	/**
	 * @param termTyId
	 *            the termTyId to set
	 */
	public void setTermTyId(Long termTyId) {
		this.termTyId = termTyId;
	}
	            
	/**
	 * @return the TermReasonId
	 */
	public Long getTermReasonId() {
		return termReasonId;
	}

	/**
	 * @param termReasonId
	 *            the termReasonId to set
	 */
	public void setTermReasonId(Long termReasonId) {
		this.termReasonId = termReasonId;
	}
	            
	/**
	 * @return the FromPartyRoleId
	 */
	public Long getFromPartyRoleId() {
		return fromPartyRoleId;
	}

	/**
	 * @param fromPartyRoleId
	 *            the fromPartyRoleId to set
	 */
	public void setFromPartyRoleId(Long fromPartyRoleId) {
		this.fromPartyRoleId = fromPartyRoleId;
	}
	            
	/**
	 * @return the ToPartyRoleId
	 */
	public Long getToPartyRoleId() {
		return toPartyRoleId;
	}

	/**
	 * @param toPartyRoleId
	 *            the toPartyRoleId to set
	 */
	public void setToPartyRoleId(Long toPartyRoleId) {
		this.toPartyRoleId = toPartyRoleId;
	}
	            
	/**
	 * @return the PartyRelId
	 */
	public Long getPartyRelId() {
		return partyRelId;
	}

	/**
	 * @param partyRelId
	 *            the partyRelId to set
	 */
	public void setPartyRelId(Long partyRelId) {
		this.partyRelId = partyRelId;
	}
	            
	/**
	 * @return the PartyRelStatId
	 */
	public Long getPartyRelStatId() {
		return partyRelStatId;
	}

	/**
	 * @param partyRelStatId
	 *            the partyRelStatId to set
	 */
	public void setPartyRelStatId(Long partyRelStatId) {
		this.partyRelStatId = partyRelStatId;
	}
	            

	/**
	 * @return the partyrelationship
	 */
	public Partyrelationship getPartyrelationship() {
		return partyrelationship;
	}

	/**
	 * @param partyrelationship
	 *            the partyrelationship to set
	 */
	public void setPartyrelationship(Partyrelationship partyrelationship) {
		this.partyrelationship = partyrelationship;
	}

}
