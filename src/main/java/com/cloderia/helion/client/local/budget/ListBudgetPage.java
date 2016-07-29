/**
 * 
 */
package com.cloderia.helion.client.local.budget;

import java.util.List;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Budget;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.DOM;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/listbudget")
@Templated(value = "list-budget-page.html#app-container")
public class ListBudgetPage extends BaseBudgetPage {

	@Inject
	@DataField
	private BudgetListWidget listWidget;

	
	@DataField
	protected AnchorElement createNewBudgetLink = DOM.createAnchor().cast();
	

    /**
	 * @param e
	 */
	@EventHandler("createNewBudgetLink")
	public void submit(ClickEvent e) { createBudgetPage.go();	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		budgetService.call(new RemoteCallback<List<Budget>>() {
			@Override
			public void callback(List<Budget> budgets) {
				if (!budgets.isEmpty()) listWidget.setItems(budgets);
			}
		}).findAll();
	}
}
