/**
 * 
 */
package com.cloderia.helion.client.local.facilitytype;

import java.util.List;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Facilitytype;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.DOM;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/listfacilitytype")
@Templated(value = "list-facilitytype-page.html#app-container")
public class ListFacilitytypePage extends BaseFacilitytypePage {

	@Inject
	@DataField
	private FacilitytypeListWidget listWidget;

	
	@DataField
	protected AnchorElement createNewFacilitytypeLink = DOM.createAnchor().cast();
	

    /**
	 * @param e
	 */
	@EventHandler("createNewFacilitytypeLink")
	public void submit(ClickEvent e) { createFacilitytypePage.go();	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		facilitytypeService.call(new RemoteCallback<List<Facilitytype>>() {
			@Override
			public void callback(List<Facilitytype> facilitytypes) {
				if (!facilitytypes.isEmpty()) listWidget.setItems(facilitytypes);
			}
		}).findAll();
	}
}
