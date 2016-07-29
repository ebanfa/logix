/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Accountingperiod;

/**
 * @author adrian
 *
 */
@Portable
public class AccountingperiodOperation  extends BaseOperation<Accountingperiod> {

	private Accountingperiod accountingperiod;
	private Long universeId;
	private Long parentPeriodTyId;
	private Long organizationId;
	private Long periodTyId;

	/**
	 * 
	 */
	public AccountingperiodOperation() {
	}
	
	/**
	 * @param accountingperiod
	 */
	public AccountingperiodOperation(Accountingperiod accountingperiod) {
		super();
		this.accountingperiod = accountingperiod;
		this.setEntity(accountingperiod);
		if(accountingperiod.getUniverse() != null)this.setUniverseId(accountingperiod.getUniverse().getId());
		if(accountingperiod.getParentPeriodTy() != null)this.setParentPeriodTyId(accountingperiod.getParentPeriodTy().getId());
		if(accountingperiod.getOrganization() != null)this.setOrganizationId(accountingperiod.getOrganization().getId());
		if(accountingperiod.getPeriodTy() != null)this.setPeriodTyId(accountingperiod.getPeriodTy().getId());
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
	 * @return the ParentPeriodTyId
	 */
	public Long getParentPeriodTyId() {
		return parentPeriodTyId;
	}

	/**
	 * @param parentPeriodTyId
	 *            the parentPeriodTyId to set
	 */
	public void setParentPeriodTyId(Long parentPeriodTyId) {
		this.parentPeriodTyId = parentPeriodTyId;
	}
	            
	/**
	 * @return the OrganizationId
	 */
	public Long getOrganizationId() {
		return organizationId;
	}

	/**
	 * @param organizationId
	 *            the organizationId to set
	 */
	public void setOrganizationId(Long organizationId) {
		this.organizationId = organizationId;
	}
	            
	/**
	 * @return the PeriodTyId
	 */
	public Long getPeriodTyId() {
		return periodTyId;
	}

	/**
	 * @param periodTyId
	 *            the periodTyId to set
	 */
	public void setPeriodTyId(Long periodTyId) {
		this.periodTyId = periodTyId;
	}
	            

	/**
	 * @return the accountingperiod
	 */
	public Accountingperiod getAccountingperiod() {
		return accountingperiod;
	}

	/**
	 * @param accountingperiod
	 *            the accountingperiod to set
	 */
	public void setAccountingperiod(Accountingperiod accountingperiod) {
		this.accountingperiod = accountingperiod;
	}

}
