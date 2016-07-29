/**
 * 
 */
package com.cloderia.helion.client.local.budget;

import javax.inject.Inject;

import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;

import com.cloderia.helion.client.shared.model.Budget;
import com.google.gwt.user.client.TakesValue;

import com.cloderia.helion.client.shared.ops.BudgetOperation;

/**
 * @author adrian
 *
 */
public class BudgetPresenter implements TakesValue<Budget> {

	@Inject
	@AutoBound
	protected DataBinder<Budget> binder;

	private BudgetOperation budgetOps;

	@Override
	public Budget getValue() {
		return binder.getModel();
	}

	@Override
	public void setValue(final Budget model) {
		binder.setModel(model);
	}

	/**
	 * @return the budgetOps
	 */
	public BudgetOperation getBudgetOps() {
		return budgetOps;
	}

	/**
	 * @param budgetOps
	 *            the budgetOps to set
	 */
	public void setBudgetOps(BudgetOperation budgetOps) {
		this.budgetOps = budgetOps;
	}
	
	/**
	 * 
	 */
	protected BudgetOperation initOps() {
		BudgetOperation budgetOperation = new BudgetOperation(this.getValue());
		this.setBudgetOps(budgetOperation);
		return budgetOperation;
	}

}
