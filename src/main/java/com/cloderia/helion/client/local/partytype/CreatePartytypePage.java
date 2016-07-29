/**
 * 
 */
package com.cloderia.helion.client.local.partytype;
import javax.inject.Inject;

import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

/**
 * @author adrian
 *
 */
@Page(path = "/createpartytype")
@Templated(value = "edit-partytype-page.html#app-container")
public class CreatePartytypePage extends BasePartytypePage {

	@Inject
	@DataField
	protected PartytypeEditor partytypeEditor;
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.party.BasePartyPage#doSetup()
	 */
	@Override
	protected void doSetup() {

		loadUniverses(partytypeEditor);
		loadUniverses(partytypeEditor);
		loadParentTypes(partytypeEditor);
		loadParentTypes(partytypeEditor);
		loadParentCategorys(partytypeEditor);
		loadParentCategorys(partytypeEditor);
		setViewTitle(BasePartytypePage.CREATE_PARTYTYPE, "");
		super.doSetup();
	}
}
