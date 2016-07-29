/**
 * 
 */
package com.cloderia.helion.client.local.partyrole;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Partyrole;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/editpartyrole")
@Templated(value = "edit-partyrole-page.html#app-container")
public class EditPartyrolePage extends BasePartyrolePage {
	
	@Inject
	@DataField
	protected PartyroleEditor partyroleEditor;
	
	@PageState
	private int id;

	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		loadPartys(partyroleEditor);
		loadPartyRoleTys(partyroleEditor);
		loadUniverses(partyroleEditor);
		partyroleEditor.setEditMode(true);
		setViewTitle(BasePartyrolePage.UPDATE_PARTYROLE, "");
		
		partyroleService.call(new RemoteCallback<Partyrole>() {
			@Override
			public void callback(Partyrole partyrole) {
				partyroleEditor.setValue(partyrole);
			}
		}).findById(new Long(id));
		super.doSetup();
	}
	
}
