/**
 * 
 */
package com.cloderia.helion.client.local.organization;

import java.util.List;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Organization;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.DOM;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/listorganization")
@Templated(value = "list-organization-page.html#app-container")
public class ListOrganizationPage extends BaseOrganizationPage {

	@Inject
	@DataField
	private OrganizationListWidget listWidget;

	
	@DataField
	protected AnchorElement createNewOrganizationLink = DOM.createAnchor().cast();
	

    /**
	 * @param e
	 */
	@EventHandler("createNewOrganizationLink")
	public void submit(ClickEvent e) { createOrganizationPage.go();	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		organizationService.call(new RemoteCallback<List<Organization>>() {
			@Override
			public void callback(List<Organization> organizations) {
				if (!organizations.isEmpty()) listWidget.setItems(organizations);
			}
		}).findAll();
	}
}
