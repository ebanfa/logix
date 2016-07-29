/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Financialaccounttransactiontype;

/**
 * @author adrian
 *
 */
@Portable
public class FinancialaccounttransactiontypeOperation  extends BaseOperation<Financialaccounttransactiontype> {

	private Financialaccounttransactiontype financialaccounttransactiontype;
	private Long universeId;

	/**
	 * 
	 */
	public FinancialaccounttransactiontypeOperation() {
	}
	
	/**
	 * @param financialaccounttransactiontype
	 */
	public FinancialaccounttransactiontypeOperation(Financialaccounttransactiontype financialaccounttransactiontype) {
		super();
		this.financialaccounttransactiontype = financialaccounttransactiontype;
		this.setEntity(financialaccounttransactiontype);
		if(financialaccounttransactiontype.getUniverse() != null)this.setUniverseId(financialaccounttransactiontype.getUniverse().getId());
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
	 * @return the financialaccounttransactiontype
	 */
	public Financialaccounttransactiontype getFinancialaccounttransactiontype() {
		return financialaccounttransactiontype;
	}

	/**
	 * @param financialaccounttransactiontype
	 *            the financialaccounttransactiontype to set
	 */
	public void setFinancialaccounttransactiontype(Financialaccounttransactiontype financialaccounttransactiontype) {
		this.financialaccounttransactiontype = financialaccounttransactiontype;
	}

}
