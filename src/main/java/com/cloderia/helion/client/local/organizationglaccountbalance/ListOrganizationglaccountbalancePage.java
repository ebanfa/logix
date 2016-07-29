/**
 * 
 */
package com.cloderia.helion.client.local.organizationglaccountbalance;

import java.util.List;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Organizationglaccountbalance;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.DOM;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/listorganizationglaccountbalance")
@Templated(value = "list-organizationglaccountbalance-page.html#app-container")
public class ListOrganizationglaccountbalancePage extends BaseOrganizationglaccountbalancePage {

	@Inject
	@DataField
	private OrganizationglaccountbalanceListWidget listWidget;

	
	@DataField
	protected AnchorElement createNewOrganizationglaccountbalanceLink = DOM.createAnchor().cast();
	

    /**
	 * @param e
	 */
	@EventHandler("createNewOrganizationglaccountbalanceLink")
	public void submit(ClickEvent e) { createOrganizationglaccountbalancePage.go();	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		organizationglaccountbalanceService.call(new RemoteCallback<List<Organizationglaccountbalance>>() {
			@Override
			public void callback(List<Organizationglaccountbalance> organizationglaccountbalances) {
				if (!organizationglaccountbalances.isEmpty()) listWidget.setItems(organizationglaccountbalances);
			}
		}).findAll();
	}
}
