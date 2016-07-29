/**
 * 
 */
package com.cloderia.helion.client.local.universe;

import java.util.List;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Universe;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.DOM;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/listuniverse")
@Templated(value = "list-universe-page.html#app-container")
public class ListUniversePage extends BaseUniversePage {

	@Inject
	@DataField
	private UniverseListWidget listWidget;

	
	@DataField
	protected AnchorElement createNewUniverseLink = DOM.createAnchor().cast();
	

    /**
	 * @param e
	 */
	@EventHandler("createNewUniverseLink")
	public void submit(ClickEvent e) { createUniversePage.go();	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		universeService.call(new RemoteCallback<List<Universe>>() {
			@Override
			public void callback(List<Universe> universes) {
				if (!universes.isEmpty()) listWidget.setItems(universes);
			}
		}).findAll();
	}
}
