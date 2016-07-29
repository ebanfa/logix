/**
 * 
 */
package com.cloderia.helion.client.local.productcategory;

import java.util.List;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Productcategory;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.DOM;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/listproductcategory")
@Templated(value = "list-productcategory-page.html#app-container")
public class ListProductcategoryPage extends BaseProductcategoryPage {

	@Inject
	@DataField
	private ProductcategoryListWidget listWidget;

	
	@DataField
	protected AnchorElement createNewProductcategoryLink = DOM.createAnchor().cast();
	

    /**
	 * @param e
	 */
	@EventHandler("createNewProductcategoryLink")
	public void submit(ClickEvent e) { createProductcategoryPage.go();	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		productcategoryService.call(new RemoteCallback<List<Productcategory>>() {
			@Override
			public void callback(List<Productcategory> productcategorys) {
				if (!productcategorys.isEmpty()) listWidget.setItems(productcategorys);
			}
		}).findAll();
	}
}
