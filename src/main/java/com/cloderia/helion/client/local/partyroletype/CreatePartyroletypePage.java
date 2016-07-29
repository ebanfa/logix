/**
 * 
 */
package com.cloderia.helion.client.local.partyroletype;
import javax.inject.Inject;

import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

/**
 * @author adrian
 *
 */
@Page(path = "/createpartyroletype")
@Templated(value = "edit-partyroletype-page.html#app-container")
public class CreatePartyroletypePage extends BasePartyroletypePage {

	@Inject
	@DataField
	protected PartyroletypeEditor partyroletypeEditor;
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.party.BasePartyPage#doSetup()
	 */
	@Override
	protected void doSetup() {

		loadParentRoleTys(partyroletypeEditor);
		loadParentRoleTys(partyroletypeEditor);
		loadUniverses(partyroletypeEditor);
		loadUniverses(partyroletypeEditor);
		setViewTitle(BasePartyroletypePage.CREATE_PARTYROLETYPE, "");
		super.doSetup();
	}
}
