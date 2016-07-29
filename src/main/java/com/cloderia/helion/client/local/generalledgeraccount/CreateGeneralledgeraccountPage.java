/**
 * 
 */
package com.cloderia.helion.client.local.generalledgeraccount;
import javax.inject.Inject;

import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

/**
 * @author adrian
 *
 */
@Page(path = "/creategeneralledgeraccount")
@Templated(value = "edit-generalledgeraccount-page.html#app-container")
public class CreateGeneralledgeraccountPage extends BaseGeneralledgeraccountPage {

	@Inject
	@DataField
	protected GeneralledgeraccountEditor generalledgeraccountEditor;
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.party.BasePartyPage#doSetup()
	 */
	@Override
	protected void doSetup() {

		loadUniverses(generalledgeraccountEditor);
		loadUniverses(generalledgeraccountEditor);
		loadGlAcctTys(generalledgeraccountEditor);
		loadGlAcctTys(generalledgeraccountEditor);
		setViewTitle(BaseGeneralledgeraccountPage.CREATE_GENERALLEDGERACCOUNT, "");
		super.doSetup();
	}
}
