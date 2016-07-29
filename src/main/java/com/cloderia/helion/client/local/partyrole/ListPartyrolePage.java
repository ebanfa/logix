/**
 * 
 */
package com.cloderia.helion.client.local.partyrole;

import java.util.List;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Partyrole;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.DOM;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/listpartyrole")
@Templated(value = "list-partyrole-page.html#app-container")
public class ListPartyrolePage extends BasePartyrolePage {

	@Inject
	@DataField
	private PartyroleListWidget listWidget;

	
	@DataField
	protected AnchorElement createNewPartyroleLink = DOM.createAnchor().cast();
	

    /**
	 * @param e
	 */
	@EventHandler("createNewPartyroleLink")
	public void submit(ClickEvent e) { createPartyrolePage.go();	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		partyroleService.call(new RemoteCallback<List<Partyrole>>() {
			@Override
			public void callback(List<Partyrole> partyroles) {
				if (!partyroles.isEmpty()) listWidget.setItems(partyroles);
			}
		}).findAll();
	}
}
