/**
 * 
 */
package com.cloderia.helion.client.local.party;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Party;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/editparty")
@Templated(value = "edit-party-page.html#app-container")
public class EditPartyPage extends BasePartyPage {
	
	@Inject
	@DataField
	protected PartyEditor partyEditor;
	
	@PageState
	private int id;

	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		loadUniverses(partyEditor);
		loadPartyTys(partyEditor);
		partyEditor.setEditMode(true);
		setViewTitle(BasePartyPage.UPDATE_PARTY, "");
		
		partyService.call(new RemoteCallback<Party>() {
			@Override
			public void callback(Party party) {
				partyEditor.setValue(party);
			}
		}).findById(new Long(id));
		super.doSetup();
	}
	
}
