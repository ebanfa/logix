/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Budgetitem;

/**
 * @author adrian
 *
 */
@Portable
public class BudgetitemOperation  extends BaseOperation<Budgetitem> {

	private Budgetitem budgetitem;
	private Long universeId;
	private Long itemTyId;
	private Long budgetId;
	private Long parentItemId;

	/**
	 * 
	 */
	public BudgetitemOperation() {
	}
	
	/**
	 * @param budgetitem
	 */
	public BudgetitemOperation(Budgetitem budgetitem) {
		super();
		this.budgetitem = budgetitem;
		this.setEntity(budgetitem);
		if(budgetitem.getUniverse() != null)this.setUniverseId(budgetitem.getUniverse().getId());
		if(budgetitem.getItemTy() != null)this.setItemTyId(budgetitem.getItemTy().getId());
		if(budgetitem.getBudget() != null)this.setBudgetId(budgetitem.getBudget().getId());
		if(budgetitem.getParentItem() != null)this.setParentItemId(budgetitem.getParentItem().getId());
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
	 * @return the ItemTyId
	 */
	public Long getItemTyId() {
		return itemTyId;
	}

	/**
	 * @param itemTyId
	 *            the itemTyId to set
	 */
	public void setItemTyId(Long itemTyId) {
		this.itemTyId = itemTyId;
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
	 * @return the ParentItemId
	 */
	public Long getParentItemId() {
		return parentItemId;
	}

	/**
	 * @param parentItemId
	 *            the parentItemId to set
	 */
	public void setParentItemId(Long parentItemId) {
		this.parentItemId = parentItemId;
	}
	            

	/**
	 * @return the budgetitem
	 */
	public Budgetitem getBudgetitem() {
		return budgetitem;
	}

	/**
	 * @param budgetitem
	 *            the budgetitem to set
	 */
	public void setBudgetitem(Budgetitem budgetitem) {
		this.budgetitem = budgetitem;
	}

}
