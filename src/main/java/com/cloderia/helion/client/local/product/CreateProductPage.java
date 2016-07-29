/**
 * 
 */
package com.cloderia.helion.client.local.product;
import javax.inject.Inject;

import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

/**
 * @author adrian
 *
 */
@Page(path = "/createproduct")
@Templated(value = "edit-product-page.html#app-container")
public class CreateProductPage extends BaseProductPage {

	@Inject
	@DataField
	protected ProductEditor productEditor;
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.party.BasePartyPage#doSetup()
	 */
	@Override
	protected void doSetup() {

		loadUoms(productEditor);
		loadUoms(productEditor);
		loadManufacturers(productEditor);
		loadManufacturers(productEditor);
		loadProdTys(productEditor);
		loadProdTys(productEditor);
		loadUniverses(productEditor);
		loadUniverses(productEditor);
		setViewTitle(BaseProductPage.CREATE_PRODUCT, "");
		super.doSetup();
	}
}
