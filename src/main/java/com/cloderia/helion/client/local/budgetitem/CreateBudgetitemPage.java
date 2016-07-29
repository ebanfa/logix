/**
 * 
 */
package com.cloderia.helion.client.local.budgetitem;
import javax.inject.Inject;

import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

/**
 * @author adrian
 *
 */
@Page(path = "/createbudgetitem")
@Templated(value = "edit-budgetitem-page.html#app-container")
public class CreateBudgetitemPage extends BaseBudgetitemPage {

	@Inject
	@DataField
	protected BudgetitemEditor budgetitemEditor;
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.party.BasePartyPage#doSetup()
	 */
	@Override
	protected void doSetup() {

		loadItemTys(budgetitemEditor);
		loadItemTys(budgetitemEditor);
		loadParentItems(budgetitemEditor);
		loadParentItems(budgetitemEditor);
		loadUniverses(budgetitemEditor);
		loadUniverses(budgetitemEditor);
		loadBudgets(budgetitemEditor);
		loadBudgets(budgetitemEditor);
		setViewTitle(BaseBudgetitemPage.CREATE_BUDGETITEM, "");
		super.doSetup();
	}
}
