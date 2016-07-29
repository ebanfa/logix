/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Budgetstatus;

/**
 * @author adrian
 *
 */
@Portable
public class BudgetstatusOperation  extends BaseOperation<Budgetstatus> {

	private Budgetstatus budgetstatus;
	private Long universeId;
	private Long statusTyId;
	private Long budgetId;

	/**
	 * 
	 */
	public BudgetstatusOperation() {
	}
	
	/**
	 * @param budgetstatus
	 */
	public BudgetstatusOperation(Budgetstatus budgetstatus) {
		super();
		this.budgetstatus = budgetstatus;
		this.setEntity(budgetstatus);
		if(budgetstatus.getUniverse() != null)this.setUniverseId(budgetstatus.getUniverse().getId());
		if(budgetstatus.getStatusTy() != null)this.setStatusTyId(budgetstatus.getStatusTy().getId());
		if(budgetstatus.getBudget() != null)this.setBudgetId(budgetstatus.getBudget().getId());
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
	 * @return the StatusTyId
	 */
	public Long getStatusTyId() {
		return statusTyId;
	}

	/**
	 * @param statusTyId
	 *            the statusTyId to set
	 */
	public void setStatusTyId(Long statusTyId) {
		this.statusTyId = statusTyId;
	}
	            
	/**
	 * @return the BudgetId
	 */
	public Long getBudgetId() {
		return budgetId;
	}

	/**
	 * @param budgetId
	 *            the budgetId to set
	 */
	public void setBudgetId(Long budgetId) {
		this.budgetId = budgetId;
	}
	            

	/**
	 * @return the budgetstatus
	 */
	public Budgetstatus getBudgetstatus() {
		return budgetstatus;
	}

	/**
	 * @param budgetstatus
	 *            the budgetstatus to set
	 */
	public void setBudgetstatus(Budgetstatus budgetstatus) {
		this.budgetstatus = budgetstatus;
	}

}
