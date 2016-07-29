/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Financialaccountroletype;

/**
 * @author adrian
 *
 */
@Portable
public class FinancialaccountroletypeOperation  extends BaseOperation<Financialaccountroletype> {

	private Financialaccountroletype financialaccountroletype;
	private Long universeId;

	/**
	 * 
	 */
	public FinancialaccountroletypeOperation() {
	}
	
	/**
	 * @param financialaccountroletype
	 */
	public FinancialaccountroletypeOperation(Financialaccountroletype financialaccountroletype) {
		super();
		this.financialaccountroletype = financialaccountroletype;
		this.setEntity(financialaccountroletype);
		if(financialaccountroletype.getUniverse() != null)this.setUniverseId(financialaccountroletype.getUniverse().getId());
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
	 * @return the financialaccountroletype
	 */
	public Financialaccountroletype getFinancialaccountroletype() {
		return financialaccountroletype;
	}

	/**
	 * @param financialaccountroletype
	 *            the financialaccountroletype to set
	 */
	public void setFinancialaccountroletype(Financialaccountroletype financialaccountroletype) {
		this.financialaccountroletype = financialaccountroletype;
	}

}
