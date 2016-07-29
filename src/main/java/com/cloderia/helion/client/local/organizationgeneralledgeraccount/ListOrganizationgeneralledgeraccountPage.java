/**
 * 
 */
package com.cloderia.helion.client.local.organizationgeneralledgeraccount;

import java.util.List;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Organizationgeneralledgeraccount;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.DOM;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/listorganizationgeneralledgeraccount")
@Templated(value = "list-organizationgeneralledgeraccount-page.html#app-container")
public class ListOrganizationgeneralledgeraccountPage extends BaseOrganizationgeneralledgeraccountPage {

	@Inject
	@DataField
	private OrganizationgeneralledgeraccountListWidget listWidget;

	
	@DataField
	protected AnchorElement createNewOrganizationgeneralledgeraccountLink = DOM.createAnchor().cast();
	

    /**
	 * @param e
	 */
	@EventHandler("createNewOrganizationgeneralledgeraccountLink")
	public void submit(ClickEvent e) { createOrganizationgeneralledgeraccountPage.go();	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		organizationgeneralledgeraccountService.call(new RemoteCallback<List<Organizationgeneralledgeraccount>>() {
			@Override
			public void callback(List<Organizationgeneralledgeraccount> organizationgeneralledgeraccounts) {
				if (!organizationgeneralledgeraccounts.isEmpty()) listWidget.setItems(organizationgeneralledgeraccounts);
			}
		}).findAll();
	}
}
