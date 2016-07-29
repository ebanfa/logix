/**
 * 
 */
package com.cloderia.helion.client.local.productcategory;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Productcategory;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/editproductcategory")
@Templated(value = "edit-productcategory-page.html#app-container")
public class EditProductcategoryPage extends BaseProductcategoryPage {
	
	@Inject
	@DataField
	protected ProductcategoryEditor productcategoryEditor;
	
	@PageState
	private int id;

	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		loadUniverses(productcategoryEditor);
		loadProdCatTys(productcategoryEditor);
		productcategoryEditor.setEditMode(true);
		setViewTitle(BaseProductcategoryPage.UPDATE_PRODUCTCATEGORY, "");
		
		productcategoryService.call(new RemoteCallback<Productcategory>() {
			@Override
			public void callback(Productcategory productcategory) {
				productcategoryEditor.setValue(productcategory);
			}
		}).findById(new Long(id));
		super.doSetup();
	}
	
}
