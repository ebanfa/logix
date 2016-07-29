/**
 * 
 */
package com.cloderia.helion.client.local.productfeature;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Productfeature;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/editproductfeature")
@Templated(value = "edit-productfeature-page.html#app-container")
public class EditProductfeaturePage extends BaseProductfeaturePage {
	
	@Inject
	@DataField
	protected ProductfeatureEditor productfeatureEditor;
	
	@PageState
	private int id;

	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		loadProdFeatCats(productfeatureEditor);
		loadUoms(productfeatureEditor);
		loadUniverses(productfeatureEditor);
		loadProdFeatTys(productfeatureEditor);
		productfeatureEditor.setEditMode(true);
		setViewTitle(BaseProductfeaturePage.UPDATE_PRODUCTFEATURE, "");
		
		productfeatureService.call(new RemoteCallback<Productfeature>() {
			@Override
			public void callback(Productfeature productfeature) {
				productfeatureEditor.setValue(productfeature);
			}
		}).findById(new Long(id));
		super.doSetup();
	}
	
}
