/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Agreementroletype;

/**
 * @author adrian
 *
 */
@Portable
public class AgreementroletypeOperation  extends BaseOperation<Agreementroletype> {

	private Agreementroletype agreementroletype;
	private Long universeId;

	/**
	 * 
	 */
	public AgreementroletypeOperation() {
	}
	
	/**
	 * @param agreementroletype
	 */
	public AgreementroletypeOperation(Agreementroletype agreementroletype) {
		super();
		this.agreementroletype = agreementroletype;
		this.setEntity(agreementroletype);
		if(agreementroletype.getUniverse() != null)this.setUniverseId(agreementroletype.getUniverse().getId());
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
	 * @return the agreementroletype
	 */
	public Agreementroletype getAgreementroletype() {
		return agreementroletype;
	}

	/**
	 * @param agreementroletype
	 *            the agreementroletype to set
	 */
	public void setAgreementroletype(Agreementroletype agreementroletype) {
		this.agreementroletype = agreementroletype;
	}

}
