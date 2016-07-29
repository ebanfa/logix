/**
 * 
 */
package com.cloderia.helion.client.local.supplierproduct;
import javax.inject.Inject;

import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

/**
 * @author adrian
 *
 */
@Page(path = "/createsupplierproduct")
@Templated(value = "edit-supplierproduct-page.html#app-container")
public class CreateSupplierproductPage extends BaseSupplierproductPage {

	@Inject
	@DataField
	protected SupplierproductEditor supplierproductEditor;
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.party.BasePartyPage#doSetup()
	 */
	@Override
	protected void doSetup() {

		loadSuppliers(supplierproductEditor);
		loadSuppliers(supplierproductEditor);
		loadRatings(supplierproductEditor);
		loadRatings(supplierproductEditor);
		loadUniverses(supplierproductEditor);
		loadUniverses(supplierproductEditor);
		loadProds(supplierproductEditor);
		loadProds(supplierproductEditor);
		loadPrefs(supplierproductEditor);
		loadPrefs(supplierproductEditor);
		setViewTitle(BaseSupplierproductPage.CREATE_SUPPLIERPRODUCT, "");
		super.doSetup();
	}
}
