/**
 * 
 */
package com.cloderia.helion.client.local.budgetitem;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Budgetitem;

/**
 * @author adrian
 *
 */
@Page(path = "/viewbudgetitem")
@Templated(value = "view-budgetitem-page.html#app-container")
public class ViewBudgetitemPage extends BaseBudgetitemPage {

	@PageState
	private Long id;

	@Inject
	@AutoBound
	private DataBinder<Budgetitem> binder;

	@Inject
	@DataField
	private BudgetitemDisplay entityDisplayComponent;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		this.setViewTitle(BaseBudgetitemPage.VIEW_BUDGETITEM, "");
		budgetitemService.call(new RemoteCallback<Budgetitem>() {
			@Override
			public void callback(Budgetitem budgetitem) {
				binder.setModel(budgetitem);
				entityDisplayComponent.setValue(budgetitem);
			}
		}).findById(new Long(id));
	}
}
