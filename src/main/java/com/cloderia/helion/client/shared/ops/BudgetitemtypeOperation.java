/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Budgetitemtype;

/**
 * @author adrian
 *
 */
@Portable
public class BudgetitemtypeOperation  extends BaseOperation<Budgetitemtype> {

	private Budgetitemtype budgetitemtype;
	private Long universeId;

	/**
	 * 
	 */
	public BudgetitemtypeOperation() {
	}
	
	/**
	 * @param budgetitemtype
	 */
	public BudgetitemtypeOperation(Budgetitemtype budgetitemtype) {
		super();
		this.budgetitemtype = budgetitemtype;
		this.setEntity(budgetitemtype);
		if(budgetitemtype.getUniverse() != null)this.setUniverseId(budgetitemtype.getUniverse().getId());
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
	 * @return the budgetitemtype
	 */
	public Budgetitemtype getBudgetitemtype() {
		return budgetitemtype;
	}

	/**
	 * @param budgetitemtype
	 *            the budgetitemtype to set
	 */
	public void setBudgetitemtype(Budgetitemtype budgetitemtype) {
		this.budgetitemtype = budgetitemtype;
	}

}
