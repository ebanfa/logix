/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Agreementitemtype;

/**
 * @author adrian
 *
 */
@Portable
public class AgreementitemtypeOperation  extends BaseOperation<Agreementitemtype> {

	private Agreementitemtype agreementitemtype;
	private Long universeId;

	/**
	 * 
	 */
	public AgreementitemtypeOperation() {
	}
	
	/**
	 * @param agreementitemtype
	 */
	public AgreementitemtypeOperation(Agreementitemtype agreementitemtype) {
		super();
		this.agreementitemtype = agreementitemtype;
		this.setEntity(agreementitemtype);
		if(agreementitemtype.getUniverse() != null)this.setUniverseId(agreementitemtype.getUniverse().getId());
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
	 * @return the agreementitemtype
	 */
	public Agreementitemtype getAgreementitemtype() {
		return agreementitemtype;
	}

	/**
	 * @param agreementitemtype
	 *            the agreementitemtype to set
	 */
	public void setAgreementitemtype(Agreementitemtype agreementitemtype) {
		this.agreementitemtype = agreementitemtype;
	}

}
