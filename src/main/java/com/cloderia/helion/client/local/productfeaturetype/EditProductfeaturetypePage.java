/**
 * 
 */
package com.cloderia.helion.client.local.productfeaturetype;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Productfeaturetype;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/editproductfeaturetype")
@Templated(value = "edit-productfeaturetype-page.html#app-container")
public class EditProductfeaturetypePage extends BaseProductfeaturetypePage {
	
	@Inject
	@DataField
	protected ProductfeaturetypeEditor productfeaturetypeEditor;
	
	@PageState
	private int id;

	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		loadUniverses(productfeaturetypeEditor);
		productfeaturetypeEditor.setEditMode(true);
		setViewTitle(BaseProductfeaturetypePage.UPDATE_PRODUCTFEATURETYPE, "");
		
		productfeaturetypeService.call(new RemoteCallback<Productfeaturetype>() {
			@Override
			public void callback(Productfeaturetype productfeaturetype) {
				productfeaturetypeEditor.setValue(productfeaturetype);
			}
		}).findById(new Long(id));
		super.doSetup();
	}
	
}
