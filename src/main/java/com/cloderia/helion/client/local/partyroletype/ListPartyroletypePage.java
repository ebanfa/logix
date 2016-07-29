/**
 * 
 */
package com.cloderia.helion.client.local.partyroletype;

import java.util.List;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Partyroletype;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.DOM;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/listpartyroletype")
@Templated(value = "list-partyroletype-page.html#app-container")
public class ListPartyroletypePage extends BasePartyroletypePage {

	@Inject
	@DataField
	private PartyroletypeListWidget listWidget;

	
	@DataField
	protected AnchorElement createNewPartyroletypeLink = DOM.createAnchor().cast();
	

    /**
	 * @param e
	 */
	@EventHandler("createNewPartyroletypeLink")
	public void submit(ClickEvent e) { createPartyroletypePage.go();	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		partyroletypeService.call(new RemoteCallback<List<Partyroletype>>() {
			@Override
			public void callback(List<Partyroletype> partyroletypes) {
				if (!partyroletypes.isEmpty()) listWidget.setItems(partyroletypes);
			}
		}).findAll();
	}
}
