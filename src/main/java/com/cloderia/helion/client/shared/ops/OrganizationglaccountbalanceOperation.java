/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Organizationglaccountbalance;

/**
 * @author adrian
 *
 */
@Portable
public class OrganizationglaccountbalanceOperation  extends BaseOperation<Organizationglaccountbalance> {

	private Organizationglaccountbalance organizationglaccountbalance;
	private Long universeId;
	private Long glAccountId;
	private Long accountingPeriodId;

	/**
	 * 
	 */
	public OrganizationglaccountbalanceOperation() {
	}
	
	/**
	 * @param organizationglaccountbalance
	 */
	public OrganizationglaccountbalanceOperation(Organizationglaccountbalance organizationglaccountbalance) {
		super();
		this.organizationglaccountbalance = organizationglaccountbalance;
		this.setEntity(organizationglaccountbalance);
		if(organizationglaccountbalance.getUniverse() != null)this.setUniverseId(organizationglaccountbalance.getUniverse().getId());
		if(organizationglaccountbalance.getGlAccount() != null)this.setGlAccountId(organizationglaccountbalance.getGlAccount().getId());
		if(organizationglaccountbalance.getAccountingPeriod() != null)this.setAccountingPeriodId(organizationglaccountbalance.getAccountingPeriod().getId());
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
	 * @return the GlAccountId
	 */
	public Long getGlAccountId() {
		return glAccountId;
	}

	/**
	 * @param glAccountId
	 *            the glAccountId to set
	 */
	public void setGlAccountId(Long glAccountId) {
		this.glAccountId = glAccountId;
	}
	            
	/**
	 * @return the AccountingPeriodId
	 */
	public Long getAccountingPeriodId() {
		return accountingPeriodId;
	}

	/**
	 * @param accountingPeriodId
	 *            the accountingPeriodId to set
	 */
	public void setAccountingPeriodId(Long accountingPeriodId) {
		this.accountingPeriodId = accountingPeriodId;
	}
	            

	/**
	 * @return the organizationglaccountbalance
	 */
	public Organizationglaccountbalance getOrganizationglaccountbalance() {
		return organizationglaccountbalance;
	}

	/**
	 * @param organizationglaccountbalance
	 *            the organizationglaccountbalance to set
	 */
	public void setOrganizationglaccountbalance(Organizationglaccountbalance organizationglaccountbalance) {
		this.organizationglaccountbalance = organizationglaccountbalance;
	}

}
