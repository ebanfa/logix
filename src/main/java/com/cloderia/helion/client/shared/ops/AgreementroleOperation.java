/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Agreementrole;

/**
 * @author adrian
 *
 */
@Portable
public class AgreementroleOperation  extends BaseOperation<Agreementrole> {

	private Agreementrole agreementrole;
	private Long universeId;
	private Long agreementRoleTyId;
	private Long agreementId;
	private Long partyId;

	/**
	 * 
	 */
	public AgreementroleOperation() {
	}
	
	/**
	 * @param agreementrole
	 */
	public AgreementroleOperation(Agreementrole agreementrole) {
		super();
		this.agreementrole = agreementrole;
		this.setEntity(agreementrole);
		if(agreementrole.getUniverse() != null)this.setUniverseId(agreementrole.getUniverse().getId());
		if(agreementrole.getAgreementRoleTy() != null)this.setAgreementRoleTyId(agreementrole.getAgreementRoleTy().getId());
		if(agreementrole.getAgreement() != null)this.setAgreementId(agreementrole.getAgreement().getId());
		if(agreementrole.getParty() != null)this.setPartyId(agreementrole.getParty().getId());
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
	 * @return the AgreementRoleTyId
	 */
	public Long getAgreementRoleTyId() {
		return agreementRoleTyId;
	}

	/**
	 * @param agreementRoleTyId
	 *            the agreementRoleTyId to set
	 */
	public void setAgreementRoleTyId(Long agreementRoleTyId) {
		this.agreementRoleTyId = agreementRoleTyId;
	}
	            
	/**
	 * @return the AgreementId
	 */
	public Long getAgreementId() {
		return agreementId;
	}

	/**
	 * @param agreementId
	 *            the agreementId to set
	 */
	public void setAgreementId(Long agreementId) {
		this.agreementId = agreementId;
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
	 * @return the agreementrole
	 */
	public Agreementrole getAgreementrole() {
		return agreementrole;
	}

	/**
	 * @param agreementrole
	 *            the agreementrole to set
	 */
	public void setAgreementrole(Agreementrole agreementrole) {
		this.agreementrole = agreementrole;
	}

}
