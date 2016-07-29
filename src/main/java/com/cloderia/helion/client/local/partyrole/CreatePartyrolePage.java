/**
 * 
 */
package com.cloderia.helion.client.local.partyrole;
import javax.inject.Inject;

import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

/**
 * @author adrian
 *
 */
@Page(path = "/createpartyrole")
@Templated(value = "edit-partyrole-page.html#app-container")
public class CreatePartyrolePage extends BasePartyrolePage {

	@Inject
	@DataField
	protected PartyroleEditor partyroleEditor;
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.party.BasePartyPage#doSetup()
	 */
	@Override
	protected void doSetup() {

		loadPartys(partyroleEditor);
		loadPartys(partyroleEditor);
		loadPartyRoleTys(partyroleEditor);
		loadPartyRoleTys(partyroleEditor);
		loadUniverses(partyroleEditor);
		loadUniverses(partyroleEditor);
		setViewTitle(BasePartyrolePage.CREATE_PARTYROLE, "");
		super.doSetup();
	}
}
