/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Financialaccounttransaction;

/**
 * @author adrian
 *
 */
@Portable
public class FinancialaccounttransactionOperation  extends BaseOperation<Financialaccounttransaction> {

	private Financialaccounttransaction financialaccounttransaction;
	private Long universeId;
	private Long finTxnTyId;
	private Long finAcctId;
	private Long partyId;

	/**
	 * 
	 */
	public FinancialaccounttransactionOperation() {
	}
	
	/**
	 * @param financialaccounttransaction
	 */
	public FinancialaccounttransactionOperation(Financialaccounttransaction financialaccounttransaction) {
		super();
		this.financialaccounttransaction = financialaccounttransaction;
		this.setEntity(financialaccounttransaction);
		if(financialaccounttransaction.getUniverse() != null)this.setUniverseId(financialaccounttransaction.getUniverse().getId());
		if(financialaccounttransaction.getFinTxnTy() != null)this.setFinTxnTyId(financialaccounttransaction.getFinTxnTy().getId());
		if(financialaccounttransaction.getFinAcct() != null)this.setFinAcctId(financialaccounttransaction.getFinAcct().getId());
		if(financialaccounttransaction.getParty() != null)this.setPartyId(financialaccounttransaction.getParty().getId());
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
	 * @return the FinTxnTyId
	 */
	public Long getFinTxnTyId() {
		return finTxnTyId;
	}

	/**
	 * @param finTxnTyId
	 *            the finTxnTyId to set
	 */
	public void setFinTxnTyId(Long finTxnTyId) {
		this.finTxnTyId = finTxnTyId;
	}
	            
	/**
	 * @return the FinAcctId
	 */
	public Long getFinAcctId() {
		return finAcctId;
	}

	/**
	 * @param finAcctId
	 *            the finAcctId to set
	 */
	public void setFinAcctId(Long finAcctId) {
		this.finAcctId = finAcctId;
	}
	            
	/**
	 * @return the PartyId
	 */
	public Long getPartyId() {
		return partyId;
	}

	/**
	 * @param partyId
	 *            the partyId to set
	 */
	public void setPartyId(Long partyId) {
		this.partyId = partyId;
	}
	            

	/**
	 * @return the financialaccounttransaction
	 */
	public Financialaccounttransaction getFinancialaccounttransaction() {
		return financialaccounttransaction;
	}

	/**
	 * @param financialaccounttransaction
	 *            the financialaccounttransaction to set
	 */
	public void setFinancialaccounttransaction(Financialaccounttransaction financialaccounttransaction) {
		this.financialaccounttransaction = financialaccounttransaction;
	}

}
