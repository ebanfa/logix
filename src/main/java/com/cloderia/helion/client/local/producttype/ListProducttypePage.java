/**
 * 
 */
package com.cloderia.helion.client.local.producttype;

import java.util.List;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Producttype;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.DOM;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/listproducttype")
@Templated(value = "list-producttype-page.html#app-container")
public class ListProducttypePage extends BaseProducttypePage {

	@Inject
	@DataField
	private ProducttypeListWidget listWidget;

	
	@DataField
	protected AnchorElement createNewProducttypeLink = DOM.createAnchor().cast();
	

    /**
	 * @param e
	 */
	@EventHandler("createNewProducttypeLink")
	public void submit(ClickEvent e) { createProducttypePage.go();	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		producttypeService.call(new RemoteCallback<List<Producttype>>() {
			@Override
			public void callback(List<Producttype> producttypes) {
				if (!producttypes.isEmpty()) listWidget.setItems(producttypes);
			}
		}).findAll();
	}
}
