/**
 * 
 */
package com.cloderia.helion.client.local.productfeature;

import java.util.List;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Productfeature;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.DOM;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/listproductfeature")
@Templated(value = "list-productfeature-page.html#app-container")
public class ListProductfeaturePage extends BaseProductfeaturePage {

	@Inject
	@DataField
	private ProductfeatureListWidget listWidget;

	
	@DataField
	protected AnchorElement createNewProductfeatureLink = DOM.createAnchor().cast();
	

    /**
	 * @param e
	 */
	@EventHandler("createNewProductfeatureLink")
	public void submit(ClickEvent e) { createProductfeaturePage.go();	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		productfeatureService.call(new RemoteCallback<List<Productfeature>>() {
			@Override
			public void callback(List<Productfeature> productfeatures) {
				if (!productfeatures.isEmpty()) listWidget.setItems(productfeatures);
			}
		}).findAll();
	}
}
