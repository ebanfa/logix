/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Financialaccounttype;

/**
 * @author adrian
 *
 */
@Portable
public class FinancialaccounttypeOperation  extends BaseOperation<Financialaccounttype> {

	private Financialaccounttype financialaccounttype;
	private Long universeId;

	/**
	 * 
	 */
	public FinancialaccounttypeOperation() {
	}
	
	/**
	 * @param financialaccounttype
	 */
	public FinancialaccounttypeOperation(Financialaccounttype financialaccounttype) {
		super();
		this.financialaccounttype = financialaccounttype;
		this.setEntity(financialaccounttype);
		if(financialaccounttype.getUniverse() != null)this.setUniverseId(financialaccounttype.getUniverse().getId());
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
	 * @return the financialaccounttype
	 */
	public Financialaccounttype getFinancialaccounttype() {
		return financialaccounttype;
	}

	/**
	 * @param financialaccounttype
	 *            the financialaccounttype to set
	 */
	public void setFinancialaccounttype(Financialaccounttype financialaccounttype) {
		this.financialaccounttype = financialaccounttype;
	}

}
