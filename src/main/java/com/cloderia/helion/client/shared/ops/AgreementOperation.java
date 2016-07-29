/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Agreement;

/**
 * @author adrian
 *
 */
@Portable
public class AgreementOperation  extends BaseOperation<Agreement> {

	private Agreement agreement;
	private Long universeId;
	private Long agreementTyId;
	private Long partyRelId;

	/**
	 * 
	 */
	public AgreementOperation() {
	}
	
	/**
	 * @param agreement
	 */
	public AgreementOperation(Agreement agreement) {
		super();
		this.agreement = agreement;
		this.setEntity(agreement);
		if(agreement.getUniverse() != null)this.setUniverseId(agreement.getUniverse().getId());
		if(agreement.getAgreementTy() != null)this.setAgreementTyId(agreement.getAgreementTy().getId());
		if(agreement.getPartyRel() != null)this.setPartyRelId(agreement.getPartyRel().getId());
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
	 * @return the AgreementTyId
	 */
	public Long getAgreementTyId() {
		return agreementTyId;
	}

	/**
	 * @param agreementTyId
	 *            the agreementTyId to set
	 */
	public void setAgreementTyId(Long agreementTyId) {
		this.agreementTyId = agreementTyId;
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
	 * @return the agreement
	 */
	public Agreement getAgreement() {
		return agreement;
	}

	/**
	 * @param agreement
	 *            the agreement to set
	 */
	public void setAgreement(Agreement agreement) {
		this.agreement = agreement;
	}

}
