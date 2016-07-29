/**
 * 
 */
package com.cloderia.helion.client.local.budgetitem;

import java.util.List;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Budgetitem;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.DOM;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/listbudgetitem")
@Templated(value = "list-budgetitem-page.html#app-container")
public class ListBudgetitemPage extends BaseBudgetitemPage {

	@Inject
	@DataField
	private BudgetitemListWidget listWidget;

	
	@DataField
	protected AnchorElement createNewBudgetitemLink = DOM.createAnchor().cast();
	

    /**
	 * @param e
	 */
	@EventHandler("createNewBudgetitemLink")
	public void submit(ClickEvent e) { createBudgetitemPage.go();	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		budgetitemService.call(new RemoteCallback<List<Budgetitem>>() {
			@Override
			public void callback(List<Budgetitem> budgetitems) {
				if (!budgetitems.isEmpty()) listWidget.setItems(budgetitems);
			}
		}).findAll();
	}
}
