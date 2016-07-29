/**
 * 
 */
package com.cloderia.helion.client.local.partycategory;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Partycategory;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/editpartycategory")
@Templated(value = "edit-partycategory-page.html#app-container")
public class EditPartycategoryPage extends BasePartycategoryPage {
	
	@Inject
	@DataField
	protected PartycategoryEditor partycategoryEditor;
	
	@PageState
	private int id;

	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		loadUniverses(partycategoryEditor);
		partycategoryEditor.setEditMode(true);
		setViewTitle(BasePartycategoryPage.UPDATE_PARTYCATEGORY, "");
		
		partycategoryService.call(new RemoteCallback<Partycategory>() {
			@Override
			public void callback(Partycategory partycategory) {
				partycategoryEditor.setValue(partycategory);
			}
		}).findById(new Long(id));
		super.doSetup();
	}
	
}
