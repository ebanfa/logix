/**
 * 
 */
package com.cloderia.helion.client.local.budget;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Budget;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/editbudget")
@Templated(value = "edit-budget-page.html#app-container")
public class EditBudgetPage extends BaseBudgetPage {
	
	@Inject
	@DataField
	protected BudgetEditor budgetEditor;
	
	@PageState
	private int id;

	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		loadPeriods(budgetEditor);
		loadUniverses(budgetEditor);
		budgetEditor.setEditMode(true);
		setViewTitle(BaseBudgetPage.UPDATE_BUDGET, "");
		
		budgetService.call(new RemoteCallback<Budget>() {
			@Override
			public void callback(Budget budget) {
				budgetEditor.setValue(budget);
			}
		}).findById(new Long(id));
		super.doSetup();
	}
	
}
