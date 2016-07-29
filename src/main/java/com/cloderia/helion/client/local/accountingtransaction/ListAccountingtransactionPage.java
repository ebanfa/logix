/**
 * 
 */
package com.cloderia.helion.client.local.accountingtransaction;

import java.util.List;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Accountingtransaction;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.DOM;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/listaccountingtransaction")
@Templated(value = "list-accountingtransaction-page.html#app-container")
public class ListAccountingtransactionPage extends BaseAccountingtransactionPage {

	@Inject
	@DataField
	private AccountingtransactionListWidget listWidget;

	
	@DataField
	protected AnchorElement createNewAccountingtransactionLink = DOM.createAnchor().cast();
	

    /**
	 * @param e
	 */
	@EventHandler("createNewAccountingtransactionLink")
	public void submit(ClickEvent e) { createAccountingtransactionPage.go();	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		accountingtransactionService.call(new RemoteCallback<List<Accountingtransaction>>() {
			@Override
			public void callback(List<Accountingtransaction> accountingtransactions) {
				if (!accountingtransactions.isEmpty()) listWidget.setItems(accountingtransactions);
			}
		}).findAll();
	}
}
