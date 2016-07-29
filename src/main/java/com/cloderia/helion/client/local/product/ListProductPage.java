/**
 * 
 */
package com.cloderia.helion.client.local.product;

import java.util.List;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Product;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.DOM;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/listproduct")
@Templated(value = "list-product-page.html#app-container")
public class ListProductPage extends BaseProductPage {

	@Inject
	@DataField
	private ProductListWidget listWidget;

	
	@DataField
	protected AnchorElement createNewProductLink = DOM.createAnchor().cast();
	

    /**
	 * @param e
	 */
	@EventHandler("createNewProductLink")
	public void submit(ClickEvent e) { createProductPage.go();	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		productService.call(new RemoteCallback<List<Product>>() {
			@Override
			public void callback(List<Product> products) {
				if (!products.isEmpty()) listWidget.setItems(products);
			}
		}).findAll();
	}
}
