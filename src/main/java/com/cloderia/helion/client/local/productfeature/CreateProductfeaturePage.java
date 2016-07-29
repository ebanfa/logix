/**
 * 
 */
package com.cloderia.helion.client.local.productfeature;
import javax.inject.Inject;

import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

/**
 * @author adrian
 *
 */
@Page(path = "/createproductfeature")
@Templated(value = "edit-productfeature-page.html#app-container")
public class CreateProductfeaturePage extends BaseProductfeaturePage {

	@Inject
	@DataField
	protected ProductfeatureEditor productfeatureEditor;
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.party.BasePartyPage#doSetup()
	 */
	@Override
	protected void doSetup() {

		loadProdFeatCats(productfeatureEditor);
		loadProdFeatCats(productfeatureEditor);
		loadUoms(productfeatureEditor);
		loadUoms(productfeatureEditor);
		loadUniverses(productfeatureEditor);
		loadUniverses(productfeatureEditor);
		loadProdFeatTys(productfeatureEditor);
		loadProdFeatTys(productfeatureEditor);
		setViewTitle(BaseProductfeaturePage.CREATE_PRODUCTFEATURE, "");
		super.doSetup();
	}
}
