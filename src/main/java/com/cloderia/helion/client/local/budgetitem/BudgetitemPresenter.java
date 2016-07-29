/**
 * 
 */
package com.cloderia.helion.client.local.budgetitem;

import javax.inject.Inject;

import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;

import com.cloderia.helion.client.shared.model.Budgetitem;
import com.google.gwt.user.client.TakesValue;

import com.cloderia.helion.client.shared.ops.BudgetitemOperation;

/**
 * @author adrian
 *
 */
public class BudgetitemPresenter implements TakesValue<Budgetitem> {

	@Inject
	@AutoBound
	protected DataBinder<Budgetitem> binder;

	private BudgetitemOperation budgetitemOps;

	@Override
	public Budgetitem getValue() {
		return binder.getModel();
	}

	@Override
	public void setValue(final Budgetitem model) {
		binder.setModel(model);
	}

	/**
	 * @return the budgetitemOps
	 */
	public BudgetitemOperation getBudgetitemOps() {
		return budgetitemOps;
	}

	/**
	 * @param budgetitemOps
	 *            the budgetitemOps to set
	 */
	public void setBudgetitemOps(BudgetitemOperation budgetitemOps) {
		this.budgetitemOps = budgetitemOps;
	}
	
	/**
	 * 
	 */
	protected BudgetitemOperation initOps() {
		BudgetitemOperation budgetitemOperation = new BudgetitemOperation(this.getValue());
		this.setBudgetitemOps(budgetitemOperation);
		return budgetitemOperation;
	}

}
