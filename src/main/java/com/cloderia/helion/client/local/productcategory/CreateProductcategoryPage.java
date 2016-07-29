/**
 * 
 */
package com.cloderia.helion.client.local.productcategory;
import javax.inject.Inject;

import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

/**
 * @author adrian
 *
 */
@Page(path = "/createproductcategory")
@Templated(value = "edit-productcategory-page.html#app-container")
public class CreateProductcategoryPage extends BaseProductcategoryPage {

	@Inject
	@DataField
	protected ProductcategoryEditor productcategoryEditor;
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.party.BasePartyPage#doSetup()
	 */
	@Override
	protected void doSetup() {

		loadUniverses(productcategoryEditor);
		loadUniverses(productcategoryEditor);
		loadProdCatTys(productcategoryEditor);
		loadProdCatTys(productcategoryEditor);
		setViewTitle(BaseProductcategoryPage.CREATE_PRODUCTCATEGORY, "");
		super.doSetup();
	}
}
