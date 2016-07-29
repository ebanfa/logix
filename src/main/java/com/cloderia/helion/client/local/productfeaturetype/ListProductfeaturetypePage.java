/**
 * 
 */
package com.cloderia.helion.client.local.productfeaturetype;

import java.util.List;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Productfeaturetype;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.DOM;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/listproductfeaturetype")
@Templated(value = "list-productfeaturetype-page.html#app-container")
public class ListProductfeaturetypePage extends BaseProductfeaturetypePage {

	@Inject
	@DataField
	private ProductfeaturetypeListWidget listWidget;

	
	@DataField
	protected AnchorElement createNewProductfeaturetypeLink = DOM.createAnchor().cast();
	

    /**
	 * @param e
	 */
	@EventHandler("createNewProductfeaturetypeLink")
	public void submit(ClickEvent e) { createProductfeaturetypePage.go();	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		productfeaturetypeService.call(new RemoteCallback<List<Productfeaturetype>>() {
			@Override
			public void callback(List<Productfeaturetype> productfeaturetypes) {
				if (!productfeaturetypes.isEmpty()) listWidget.setItems(productfeaturetypes);
			}
		}).findAll();
	}
}
