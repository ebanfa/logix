/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Budget;

/**
 * @author adrian
 *
 */
@Portable
public class BudgetOperation  extends BaseOperation<Budget> {

	private Budget budget;
	private Long universeId;
	private Long periodId;

	/**
	 * 
	 */
	public BudgetOperation() {
	}
	
	/**
	 * @param budget
	 */
	public BudgetOperation(Budget budget) {
		super();
		this.budget = budget;
		this.setEntity(budget);
		if(budget.getUniverse() != null)this.setUniverseId(budget.getUniverse().getId());
		if(budget.getPeriod() != null)this.setPeriodId(budget.getPeriod().getId());
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
	 * @return the PeriodId
	 */
	public Long getPeriodId() {
		return periodId;
	}

	/**
	 * @param periodId
	 *            the periodId to set
	 */
	public void setPeriodId(Long periodId) {
		this.periodId = periodId;
	}
	            

	/**
	 * @return the budget
	 */
	public Budget getBudget() {
		return budget;
	}

	/**
	 * @param budget
	 *            the budget to set
	 */
	public void setBudget(Budget budget) {
		this.budget = budget;
	}

}
