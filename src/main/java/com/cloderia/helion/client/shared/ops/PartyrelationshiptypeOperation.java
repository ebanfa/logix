/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Partyrelationshiptype;

/**
 * @author adrian
 *
 */
@Portable
public class PartyrelationshiptypeOperation  extends BaseOperation<Partyrelationshiptype> {

	private Partyrelationshiptype partyrelationshiptype;
	private Long universeId;

	/**
	 * 
	 */
	public PartyrelationshiptypeOperation() {
	}
	
	/**
	 * @param partyrelationshiptype
	 */
	public PartyrelationshiptypeOperation(Partyrelationshiptype partyrelationshiptype) {
		super();
		this.partyrelationshiptype = partyrelationshiptype;
		this.setEntity(partyrelationshiptype);
		if(partyrelationshiptype.getUniverse() != null)this.setUniverseId(partyrelationshiptype.getUniverse().getId());
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
	 * @return the partyrelationshiptype
	 */
	public Partyrelationshiptype getPartyrelationshiptype() {
		return partyrelationshiptype;
	}

	/**
	 * @param partyrelationshiptype
	 *            the partyrelationshiptype to set
	 */
	public void setPartyrelationshiptype(Partyrelationshiptype partyrelationshiptype) {
		this.partyrelationshiptype = partyrelationshiptype;
	}

}
