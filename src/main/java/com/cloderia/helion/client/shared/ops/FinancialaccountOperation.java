/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Financialaccount;

/**
 * @author adrian
 *
 */
@Portable
public class FinancialaccountOperation  extends BaseOperation<Financialaccount> {

	private Financialaccount financialaccount;
	private Long universeId;
	private Long finAcctTyId;

	/**
	 * 
	 */
	public FinancialaccountOperation() {
	}
	
	/**
	 * @param financialaccount
	 */
	public FinancialaccountOperation(Financialaccount financialaccount) {
		super();
		this.financialaccount = financialaccount;
		this.setEntity(financialaccount);
		if(financialaccount.getUniverse() != null)this.setUniverseId(financialaccount.getUniverse().getId());
		if(financialaccount.getFinAcctTy() != null)this.setFinAcctTyId(financialaccount.getFinAcctTy().getId());
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
	 * @return the FinAcctTyId
	 */
	public Long getFinAcctTyId() {
		return finAcctTyId;
	}

	/**
	 * @param finAcctTyId
	 *            the finAcctTyId to set
	 */
	public void setFinAcctTyId(Long finAcctTyId) {
		this.finAcctTyId = finAcctTyId;
	}
	            

	/**
	 * @return the financialaccount
	 */
	public Financialaccount getFinancialaccount() {
		return financialaccount;
	}

	/**
	 * @param financialaccount
	 *            the financialaccount to set
	 */
	public void setFinancialaccount(Financialaccount financialaccount) {
		this.financialaccount = financialaccount;
	}

}
