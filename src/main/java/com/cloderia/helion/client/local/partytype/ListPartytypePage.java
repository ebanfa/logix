/**
 * 
 */
package com.cloderia.helion.client.local.partytype;

import java.util.List;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Partytype;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.DOM;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/listpartytype")
@Templated(value = "list-partytype-page.html#app-container")
public class ListPartytypePage extends BasePartytypePage {

	@Inject
	@DataField
	private PartytypeListWidget listWidget;

	
	@DataField
	protected AnchorElement createNewPartytypeLink = DOM.createAnchor().cast();
	

    /**
	 * @param e
	 */
	@EventHandler("createNewPartytypeLink")
	public void submit(ClickEvent e) { createPartytypePage.go();	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		partytypeService.call(new RemoteCallback<List<Partytype>>() {
			@Override
			public void callback(List<Partytype> partytypes) {
				if (!partytypes.isEmpty()) listWidget.setItems(partytypes);
			}
		}).findAll();
	}
}
