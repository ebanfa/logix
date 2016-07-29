/**
 * 
 */
package com.cloderia.helion.client.local.inventoryitem;

import java.util.List;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Inventoryitem;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.DOM;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/listinventoryitem")
@Templated(value = "list-inventoryitem-page.html#app-container")
public class ListInventoryitemPage extends BaseInventoryitemPage {

	@Inject
	@DataField
	private InventoryitemListWidget listWidget;

	
	@DataField
	protected AnchorElement createNewInventoryitemLink = DOM.createAnchor().cast();
	

    /**
	 * @param e
	 */
	@EventHandler("createNewInventoryitemLink")
	public void submit(ClickEvent e) { createInventoryitemPage.go();	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		inventoryitemService.call(new RemoteCallback<List<Inventoryitem>>() {
			@Override
			public void callback(List<Inventoryitem> inventoryitems) {
				if (!inventoryitems.isEmpty()) listWidget.setItems(inventoryitems);
			}
		}).findAll();
	}
}
