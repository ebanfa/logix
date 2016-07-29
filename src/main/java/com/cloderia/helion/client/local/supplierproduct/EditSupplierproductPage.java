/**
 * 
 */
package com.cloderia.helion.client.local.supplierproduct;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Supplierproduct;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/editsupplierproduct")
@Templated(value = "edit-supplierproduct-page.html#app-container")
public class EditSupplierproductPage extends BaseSupplierproductPage {
	
	@Inject
	@DataField
	protected SupplierproductEditor supplierproductEditor;
	
	@PageState
	private int id;

	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		loadSuppliers(supplierproductEditor);
		loadRatings(supplierproductEditor);
		loadUniverses(supplierproductEditor);
		loadProds(supplierproductEditor);
		loadPrefs(supplierproductEditor);
		supplierproductEditor.setEditMode(true);
		setViewTitle(BaseSupplierproductPage.UPDATE_SUPPLIERPRODUCT, "");
		
		supplierproductService.call(new RemoteCallback<Supplierproduct>() {
			@Override
			public void callback(Supplierproduct supplierproduct) {
				supplierproductEditor.setValue(supplierproduct);
			}
		}).findById(new Long(id));
		super.doSetup();
	}
	
}
