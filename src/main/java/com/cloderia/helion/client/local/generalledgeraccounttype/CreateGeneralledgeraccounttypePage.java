/**
 * 
 */
package com.cloderia.helion.client.local.generalledgeraccounttype;
import javax.inject.Inject;

import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

/**
 * @author adrian
 *
 */
@Page(path = "/creategeneralledgeraccounttype")
@Templated(value = "edit-generalledgeraccounttype-page.html#app-container")
public class CreateGeneralledgeraccounttypePage extends BaseGeneralledgeraccounttypePage {

	@Inject
	@DataField
	protected GeneralledgeraccounttypeEditor generalledgeraccounttypeEditor;
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.party.BasePartyPage#doSetup()
	 */
	@Override
	protected void doSetup() {

		loadUniverses(generalledgeraccounttypeEditor);
		loadUniverses(generalledgeraccounttypeEditor);
		setViewTitle(BaseGeneralledgeraccounttypePage.CREATE_GENERALLEDGERACCOUNTTYPE, "");
		super.doSetup();
	}
}
