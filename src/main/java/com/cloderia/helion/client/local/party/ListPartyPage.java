/**
 * 
 */
package com.cloderia.helion.client.local.party;

import java.util.List;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Party;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.DOM;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/listparty")
@Templated(value = "list-party-page.html#app-container")
public class ListPartyPage extends BasePartyPage {

	@Inject
	@DataField
	private PartyListWidget listWidget;

	
	@DataField
	protected AnchorElement createNewPartyLink = DOM.createAnchor().cast();
	

    /**
	 * @param e
	 */
	@EventHandler("createNewPartyLink")
	public void submit(ClickEvent e) { createPartyPage.go();	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		partyService.call(new RemoteCallback<List<Party>>() {
			@Override
			public void callback(List<Party> partys) {
				if (!partys.isEmpty()) listWidget.setItems(partys);
			}
		}).findAll();
	}
}
