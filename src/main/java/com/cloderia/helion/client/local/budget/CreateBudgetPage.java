/**
 * 
 */
package com.cloderia.helion.client.local.budget;
import javax.inject.Inject;

import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

/**
 * @author adrian
 *
 */
@Page(path = "/createbudget")
@Templated(value = "edit-budget-page.html#app-container")
public class CreateBudgetPage extends BaseBudgetPage {

	@Inject
	@DataField
	protected BudgetEditor budgetEditor;
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.party.BasePartyPage#doSetup()
	 */
	@Override
	protected void doSetup() {

		loadPeriods(budgetEditor);
		loadPeriods(budgetEditor);
		loadUniverses(budgetEditor);
		loadUniverses(budgetEditor);
		setViewTitle(BaseBudgetPage.CREATE_BUDGET, "");
		super.doSetup();
	}
}
