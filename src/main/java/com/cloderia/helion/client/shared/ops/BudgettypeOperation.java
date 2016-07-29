/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Budgettype;

/**
 * @author adrian
 *
 */
@Portable
public class BudgettypeOperation  extends BaseOperation<Budgettype> {

	private Budgettype budgettype;
	private Long universeId;

	/**
	 * 
	 */
	public BudgettypeOperation() {
	}
	
	/**
	 * @param budgettype
	 */
	public BudgettypeOperation(Budgettype budgettype) {
		super();
		this.budgettype = budgettype;
		this.setEntity(budgettype);
		if(budgettype.getUniverse() != null)this.setUniverseId(budgettype.getUniverse().getId());
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
	 * @return the budgettype
	 */
	public Budgettype getBudgettype() {
		return budgettype;
	}

	/**
	 * @param budgettype
	 *            the budgettype to set
	 */
	public void setBudgettype(Budgettype budgettype) {
		this.budgettype = budgettype;
	}

}
