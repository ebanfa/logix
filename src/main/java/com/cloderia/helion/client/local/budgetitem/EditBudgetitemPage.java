/**
 * 
 */
package com.cloderia.helion.client.local.budgetitem;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Budgetitem;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/editbudgetitem")
@Templated(value = "edit-budgetitem-page.html#app-container")
public class EditBudgetitemPage extends BaseBudgetitemPage {
	
	@Inject
	@DataField
	protected BudgetitemEditor budgetitemEditor;
	
	@PageState
	private int id;

	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		loadItemTys(budgetitemEditor);
		loadParentItems(budgetitemEditor);
		loadUniverses(budgetitemEditor);
		loadBudgets(budgetitemEditor);
		budgetitemEditor.setEditMode(true);
		setViewTitle(BaseBudgetitemPage.UPDATE_BUDGETITEM, "");
		
		budgetitemService.call(new RemoteCallback<Budgetitem>() {
			@Override
			public void callback(Budgetitem budgetitem) {
				budgetitemEditor.setValue(budgetitem);
			}
		}).findById(new Long(id));
		super.doSetup();
	}
	
}
