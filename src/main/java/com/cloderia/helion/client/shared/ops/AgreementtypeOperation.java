/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Agreementtype;

/**
 * @author adrian
 *
 */
@Portable
public class AgreementtypeOperation  extends BaseOperation<Agreementtype> {

	private Agreementtype agreementtype;
	private Long universeId;

	/**
	 * 
	 */
	public AgreementtypeOperation() {
	}
	
	/**
	 * @param agreementtype
	 */
	public AgreementtypeOperation(Agreementtype agreementtype) {
		super();
		this.agreementtype = agreementtype;
		this.setEntity(agreementtype);
		if(agreementtype.getUniverse() != null)this.setUniverseId(agreementtype.getUniverse().getId());
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
	 * @return the agreementtype
	 */
	public Agreementtype getAgreementtype() {
		return agreementtype;
	}

	/**
	 * @param agreementtype
	 *            the agreementtype to set
	 */
	public void setAgreementtype(Agreementtype agreementtype) {
		this.agreementtype = agreementtype;
	}

}
