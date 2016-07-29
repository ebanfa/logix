/**
 * 
 */
package com.cloderia.helion.client.local.producttype;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Producttype;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/editproducttype")
@Templated(value = "edit-producttype-page.html#app-container")
public class EditProducttypePage extends BaseProducttypePage {
	
	@Inject
	@DataField
	protected ProducttypeEditor producttypeEditor;
	
	@PageState
	private int id;

	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		loadUniverses(producttypeEditor);
		producttypeEditor.setEditMode(true);
		setViewTitle(BaseProducttypePage.UPDATE_PRODUCTTYPE, "");
		
		producttypeService.call(new RemoteCallback<Producttype>() {
			@Override
			public void callback(Producttype producttype) {
				producttypeEditor.setValue(producttype);
			}
		}).findById(new Long(id));
		super.doSetup();
	}
	
}
