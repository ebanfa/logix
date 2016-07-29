/**
 * 
 */
package com.cloderia.helion.client.local.budget;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Budget;

/**
 * @author adrian
 *
 */
@Page(path = "/viewbudget")
@Templated(value = "view-budget-page.html#app-container")
public class ViewBudgetPage extends BaseBudgetPage {

	@PageState
	private Long id;

	@Inject
	@AutoBound
	private DataBinder<Budget> binder;

	@Inject
	@DataField
	private BudgetDisplay entityDisplayComponent;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		this.setViewTitle(BaseBudgetPage.VIEW_BUDGET, "");
		budgetService.call(new RemoteCallback<Budget>() {
			@Override
			public void callback(Budget budget) {
				binder.setModel(budget);
				entityDisplayComponent.setValue(budget);
			}
		}).findById(new Long(id));
	}
}
