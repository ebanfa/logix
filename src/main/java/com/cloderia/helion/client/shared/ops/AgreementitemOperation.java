/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Agreementitem;

/**
 * @author adrian
 *
 */
@Portable
public class AgreementitemOperation  extends BaseOperation<Agreementitem> {

	private Agreementitem agreementitem;
	private Long universeId;
	private Long agreementItemTyId;
	private Long agreementId;
	private Long agreementItemId;

	/**
	 * 
	 */
	public AgreementitemOperation() {
	}
	
	/**
	 * @param agreementitem
	 */
	public AgreementitemOperation(Agreementitem agreementitem) {
		super();
		this.agreementitem = agreementitem;
		this.setEntity(agreementitem);
		if(agreementitem.getUniverse() != null)this.setUniverseId(agreementitem.getUniverse().getId());
		if(agreementitem.getAgreementItemTy() != null)this.setAgreementItemTyId(agreementitem.getAgreementItemTy().getId());
		if(agreementitem.getAgreement() != null)this.setAgreementId(agreementitem.getAgreement().getId());
		if(agreementitem.getAgreementItem() != null)this.setAgreementItemId(agreementitem.getAgreementItem().getId());
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
	 * @return the AgreementItemTyId
	 */
	public Long getAgreementItemTyId() {
		return agreementItemTyId;
	}

	/**
	 * @param agreementItemTyId
	 *            the agreementItemTyId to set
	 */
	public void setAgreementItemTyId(Long agreementItemTyId) {
		this.agreementItemTyId = agreementItemTyId;
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
	 * @return the agreementitem
	 */
	public Agreementitem getAgreementitem() {
		return agreementitem;
	}

	/**
	 * @param agreementitem
	 *            the agreementitem to set
	 */
	public void setAgreementitem(Agreementitem agreementitem) {
		this.agreementitem = agreementitem;
	}

}
