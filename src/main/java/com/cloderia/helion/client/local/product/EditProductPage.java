/**
 * 
 */
package com.cloderia.helion.client.local.product;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Product;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/editproduct")
@Templated(value = "edit-product-page.html#app-container")
public class EditProductPage extends BaseProductPage {
	
	@Inject
	@DataField
	protected ProductEditor productEditor;
	
	@PageState
	private int id;

	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		loadUoms(productEditor);
		loadManufacturers(productEditor);
		loadProdTys(productEditor);
		loadUniverses(productEditor);
		productEditor.setEditMode(true);
		setViewTitle(BaseProductPage.UPDATE_PRODUCT, "");
		
		productService.call(new RemoteCallback<Product>() {
			@Override
			public void callback(Product product) {
				productEditor.setValue(product);
			}
		}).findById(new Long(id));
		super.doSetup();
	}
	
}
