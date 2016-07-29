/**
 * 
 */
package com.cloderia.helion.client.local.systemuser;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Systemuser;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/editsystemuser")
@Templated(value = "edit-systemuser-page.html#app-container")
public class EditSystemuserPage extends BaseSystemuserPage {
	
	@Inject
	@DataField
	protected SystemuserEditor systemuserEditor;
	
	@PageState
	private int id;

	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		loadPartys(systemuserEditor);
		loadUniverses(systemuserEditor);
		systemuserEditor.setEditMode(true);
		setViewTitle(BaseSystemuserPage.UPDATE_SYSTEMUSER, "");
		
		systemuserService.call(new RemoteCallback<Systemuser>() {
			@Override
			public void callback(Systemuser systemuser) {
				systemuserEditor.setValue(systemuser);
			}
		}).findById(new Long(id));
		super.doSetup();
	}
	
}
