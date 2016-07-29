/**
 * 
 */
package com.cloderia.helion.client.local.supplierproduct;

import java.util.List;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Supplierproduct;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.DOM;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/listsupplierproduct")
@Templated(value = "list-supplierproduct-page.html#app-container")
public class ListSupplierproductPage extends BaseSupplierproductPage {

	@Inject
	@DataField
	private SupplierproductListWidget listWidget;

	
	@DataField
	protected AnchorElement createNewSupplierproductLink = DOM.createAnchor().cast();
	

    /**
	 * @param e
	 */
	@EventHandler("createNewSupplierproductLink")
	public void submit(ClickEvent e) { createSupplierproductPage.go();	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		supplierproductService.call(new RemoteCallback<List<Supplierproduct>>() {
			@Override
			public void callback(List<Supplierproduct> supplierproducts) {
				if (!supplierproducts.isEmpty()) listWidget.setItems(supplierproducts);
			}
		}).findAll();
	}
}
