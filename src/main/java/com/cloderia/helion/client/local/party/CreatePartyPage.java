/**
 * 
 */
package com.cloderia.helion.client.local.party;
import javax.inject.Inject;

import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

/**
 * @author adrian
 *
 */
@Page(path = "/createparty")
@Templated(value = "edit-party-page.html#app-container")
public class CreatePartyPage extends BasePartyPage {

	@Inject
	@DataField
	protected PartyEditor partyEditor;
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.party.BasePartyPage#doSetup()
	 */
	@Override
	protected void doSetup() {

		loadUniverses(partyEditor);
		loadUniverses(partyEditor);
		loadPartyTys(partyEditor);
		loadPartyTys(partyEditor);
		setViewTitle(BasePartyPage.CREATE_PARTY, "");
		super.doSetup();
	}
}
