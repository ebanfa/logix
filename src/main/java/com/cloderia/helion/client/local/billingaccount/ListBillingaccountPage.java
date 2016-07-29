/**
 * 
 */
package com.cloderia.helion.client.local.billingaccount;

import java.util.List;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Billingaccount;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.DOM;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/listbillingaccount")
@Templated(value = "list-billingaccount-page.html#app-container")
public class ListBillingaccountPage extends BaseBillingaccountPage {

	@Inject
	@DataField
	private BillingaccountListWidget listWidget;

	
	@DataField
	protected AnchorElement createNewBillingaccountLink = DOM.createAnchor().cast();
	

    /**
	 * @param e
	 */
	@EventHandler("createNewBillingaccountLink")
	public void submit(ClickEvent e) { createBillingaccountPage.go();	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		billingaccountService.call(new RemoteCallback<List<Billingaccount>>() {
			@Override
			public void callback(List<Billingaccount> billingaccounts) {
				if (!billingaccounts.isEmpty()) listWidget.setItems(billingaccounts);
			}
		}).findAll();
	}
}
