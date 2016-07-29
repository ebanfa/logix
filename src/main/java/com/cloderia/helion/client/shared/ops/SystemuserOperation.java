/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Systemuser;

/**
 * @author adrian
 *
 */
@Portable
public class SystemuserOperation  extends BaseOperation<Systemuser> {

	private Systemuser systemuser;
	private Long universeId;
	private Long partyId;

	/**
	 * 
	 */
	public SystemuserOperation() {
	}
	
	/**
	 * @param systemuser
	 */
	public SystemuserOperation(Systemuser systemuser) {
		super();
		this.systemuser = systemuser;
		this.setEntity(systemuser);
		if(systemuser.getUniverse() != null)this.setUniverseId(systemuser.getUniverse().getId());
		if(systemuser.getParty() != null)this.setPartyId(systemuser.getParty().getId());
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
	 * @return the systemuser
	 */
	public Systemuser getSystemuser() {
		return systemuser;
	}

	/**
	 * @param systemuser
	 *            the systemuser to set
	 */
	public void setSystemuser(Systemuser systemuser) {
		this.systemuser = systemuser;
	}

}
