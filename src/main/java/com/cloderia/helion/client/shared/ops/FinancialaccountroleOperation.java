/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Financialaccountrole;

/**
 * @author adrian
 *
 */
@Portable
public class FinancialaccountroleOperation  extends BaseOperation<Financialaccountrole> {

	private Financialaccountrole financialaccountrole;
	private Long universeId;
	private Long partyId;
	private Long finAcctId;
	private Long roleTyId;

	/**
	 * 
	 */
	public FinancialaccountroleOperation() {
	}
	
	/**
	 * @param financialaccountrole
	 */
	public FinancialaccountroleOperation(Financialaccountrole financialaccountrole) {
		super();
		this.financialaccountrole = financialaccountrole;
		this.setEntity(financialaccountrole);
		if(financialaccountrole.getUniverse() != null)this.setUniverseId(financialaccountrole.getUniverse().getId());
		if(financialaccountrole.getParty() != null)this.setPartyId(financialaccountrole.getParty().getId());
		if(financialaccountrole.getFinAcct() != null)this.setFinAcctId(financialaccountrole.getFinAcct().getId());
		if(financialaccountrole.getRoleTy() != null)this.setRoleTyId(financialaccountrole.getRoleTy().getId());
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
	 * @return the RoleTyId
	 */
	public Long getRoleTyId() {
		return roleTyId;
	}

	/**
	 * @param roleTyId
	 *            the roleTyId to set
	 */
	public void setRoleTyId(Long roleTyId) {
		this.roleTyId = roleTyId;
	}
	            

	/**
	 * @return the financialaccountrole
	 */
	public Financialaccountrole getFinancialaccountrole() {
		return financialaccountrole;
	}

	/**
	 * @param financialaccountrole
	 *            the financialaccountrole to set
	 */
	public void setFinancialaccountrole(Financialaccountrole financialaccountrole) {
		this.financialaccountrole = financialaccountrole;
	}

}
