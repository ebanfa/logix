/**
 * 
 */
package com.cloderia.helion.client.local.partyroletype;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Partyroletype;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/editpartyroletype")
@Templated(value = "edit-partyroletype-page.html#app-container")
public class EditPartyroletypePage extends BasePartyroletypePage {
	
	@Inject
	@DataField
	protected PartyroletypeEditor partyroletypeEditor;
	
	@PageState
	private int id;

	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		loadParentRoleTys(partyroletypeEditor);
		loadUniverses(partyroletypeEditor);
		partyroletypeEditor.setEditMode(true);
		setViewTitle(BasePartyroletypePage.UPDATE_PARTYROLETYPE, "");
		
		partyroletypeService.call(new RemoteCallback<Partyroletype>() {
			@Override
			public void callback(Partyroletype partyroletype) {
				partyroletypeEditor.setValue(partyroletype);
			}
		}).findById(new Long(id));
		super.doSetup();
	}
	
}
