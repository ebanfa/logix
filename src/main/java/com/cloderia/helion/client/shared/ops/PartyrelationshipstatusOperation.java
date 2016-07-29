/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Partyrelationshipstatus;

/**
 * @author adrian
 *
 */
@Portable
public class PartyrelationshipstatusOperation  extends BaseOperation<Partyrelationshipstatus> {

	private Partyrelationshipstatus partyrelationshipstatus;
	private Long universeId;

	/**
	 * 
	 */
	public PartyrelationshipstatusOperation() {
	}
	
	/**
	 * @param partyrelationshipstatus
	 */
	public PartyrelationshipstatusOperation(Partyrelationshipstatus partyrelationshipstatus) {
		super();
		this.partyrelationshipstatus = partyrelationshipstatus;
		this.setEntity(partyrelationshipstatus);
		if(partyrelationshipstatus.getUniverse() != null)this.setUniverseId(partyrelationshipstatus.getUniverse().getId());
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
	 * @return the partyrelationshipstatus
	 */
	public Partyrelationshipstatus getPartyrelationshipstatus() {
		return partyrelationshipstatus;
	}

	/**
	 * @param partyrelationshipstatus
	 *            the partyrelationshipstatus to set
	 */
	public void setPartyrelationshipstatus(Partyrelationshipstatus partyrelationshipstatus) {
		this.partyrelationshipstatus = partyrelationshipstatus;
	}

}
