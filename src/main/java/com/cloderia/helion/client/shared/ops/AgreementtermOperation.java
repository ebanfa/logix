/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Agreementterm;

/**
 * @author adrian
 *
 */
@Portable
public class AgreementtermOperation  extends BaseOperation<Agreementterm> {

	private Agreementterm agreementterm;
	private Long universeId;
	private Long agreementId;
	private Long agreementItemId;
	private Long termTyId;

	/**
	 * 
	 */
	public AgreementtermOperation() {
	}
	
	/**
	 * @param agreementterm
	 */
	public AgreementtermOperation(Agreementterm agreementterm) {
		super();
		this.agreementterm = agreementterm;
		this.setEntity(agreementterm);
		if(agreementterm.getUniverse() != null)this.setUniverseId(agreementterm.getUniverse().getId());
		if(agreementterm.getAgreement() != null)this.setAgreementId(agreementterm.getAgreement().getId());
		if(agreementterm.getAgreementItem() != null)this.setAgreementItemId(agreementterm.getAgreementItem().getId());
		if(agreementterm.getTermTy() != null)this.setTermTyId(agreementterm.getTermTy().getId());
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
	 * @return the AgreementItemId
	 */
	public Long getAgreementItemId() {
		return agreementItemId;
	}

	/**
	 * @param agreementItemId
	 *            the agreementItemId to set
	 */
	public void setAgreementItemId(Long agreementItemId) {
		this.agreementItemId = agreementItemId;
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
	 * @return the agreementterm
	 */
	public Agreementterm getAgreementterm() {
		return agreementterm;
	}

	/**
	 * @param agreementterm
	 *            the agreementterm to set
	 */
	public void setAgreementterm(Agreementterm agreementterm) {
		this.agreementterm = agreementterm;
	}

}
