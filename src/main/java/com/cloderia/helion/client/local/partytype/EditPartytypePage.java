/**
 * 
 */
package com.cloderia.helion.client.local.partytype;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Partytype;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/editpartytype")
@Templated(value = "edit-partytype-page.html#app-container")
public class EditPartytypePage extends BasePartytypePage {
	
	@Inject
	@DataField
	protected PartytypeEditor partytypeEditor;
	
	@PageState
	private int id;

	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		loadUniverses(partytypeEditor);
		loadParentTypes(partytypeEditor);
		loadParentCategorys(partytypeEditor);
		partytypeEditor.setEditMode(true);
		setViewTitle(BasePartytypePage.UPDATE_PARTYTYPE, "");
		
		partytypeService.call(new RemoteCallback<Partytype>() {
			@Override
			public void callback(Partytype partytype) {
				partytypeEditor.setValue(partytype);
			}
		}).findById(new Long(id));
		super.doSetup();
	}
	
}
