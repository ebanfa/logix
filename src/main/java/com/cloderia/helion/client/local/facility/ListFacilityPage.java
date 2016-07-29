/**
 * 
 */
package com.cloderia.helion.client.local.facility;

import java.util.List;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Facility;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.DOM;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/listfacility")
@Templated(value = "list-facility-page.html#app-container")
public class ListFacilityPage extends BaseFacilityPage {

	@Inject
	@DataField
	private FacilityListWidget listWidget;

	
	@DataField
	protected AnchorElement createNewFacilityLink = DOM.createAnchor().cast();
	

    /**
	 * @param e
	 */
	@EventHandler("createNewFacilityLink")
	public void submit(ClickEvent e) { createFacilityPage.go();	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		facilityService.call(new RemoteCallback<List<Facility>>() {
			@Override
			public void callback(List<Facility> facilitys) {
				if (!facilitys.isEmpty()) listWidget.setItems(facilitys);
			}
		}).findAll();
	}
}
