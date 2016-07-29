/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Budgetstatustype;

/**
 * @author adrian
 *
 */
@Portable
public class BudgetstatustypeOperation  extends BaseOperation<Budgetstatustype> {

	private Budgetstatustype budgetstatustype;
	private Long universeId;

	/**
	 * 
	 */
	public BudgetstatustypeOperation() {
	}
	
	/**
	 * @param budgetstatustype
	 */
	public BudgetstatustypeOperation(Budgetstatustype budgetstatustype) {
		super();
		this.budgetstatustype = budgetstatustype;
		this.setEntity(budgetstatustype);
		if(budgetstatustype.getUniverse() != null)this.setUniverseId(budgetstatustype.getUniverse().getId());
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
	 * @return the budgetstatustype
	 */
	public Budgetstatustype getBudgetstatustype() {
		return budgetstatustype;
	}

	/**
	 * @param budgetstatustype
	 *            the budgetstatustype to set
	 */
	public void setBudgetstatustype(Budgetstatustype budgetstatustype) {
		this.budgetstatustype = budgetstatustype;
	}

}
