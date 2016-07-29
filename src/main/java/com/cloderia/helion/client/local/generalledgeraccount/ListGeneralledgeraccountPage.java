/**
 * 
 */
package com.cloderia.helion.client.local.generalledgeraccount;

import java.util.List;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Generalledgeraccount;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.DOM;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/listgeneralledgeraccount")
@Templated(value = "list-generalledgeraccount-page.html#app-container")
public class ListGeneralledgeraccountPage extends BaseGeneralledgeraccountPage {

	@Inject
	@DataField
	private GeneralledgeraccountListWidget listWidget;

	
	@DataField
	protected AnchorElement createNewGeneralledgeraccountLink = DOM.createAnchor().cast();
	

    /**
	 * @param e
	 */
	@EventHandler("createNewGeneralledgeraccountLink")
	public void submit(ClickEvent e) { createGeneralledgeraccountPage.go();	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		generalledgeraccountService.call(new RemoteCallback<List<Generalledgeraccount>>() {
			@Override
			public void callback(List<Generalledgeraccount> generalledgeraccounts) {
				if (!generalledgeraccounts.isEmpty()) listWidget.setItems(generalledgeraccounts);
			}
		}).findAll();
	}
}
