/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Organization;

/**
 * @author adrian
 *
 */
@Portable
public class OrganizationOperation  extends BaseOperation<Organization> {

	private Organization organization;
	private Long universeId;
	private Long partyId;

	/**
	 * 
	 */
	public OrganizationOperation() {
	}
	
	/**
	 * @param organization
	 */
	public OrganizationOperation(Organization organization) {
		super();
		this.organization = organization;
		this.setEntity(organization);
		if(organization.getUniverse() != null)this.setUniverseId(organization.getUniverse().getId());
		if(organization.getParty() != null)this.setPartyId(organization.getParty().getId());
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
	 * @return the organization
	 */
	public Organization getOrganization() {
		return organization;
	}

	/**
	 * @param organization
	 *            the organization to set
	 */
	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

}
