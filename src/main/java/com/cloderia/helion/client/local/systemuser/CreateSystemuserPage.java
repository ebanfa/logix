/**
 * 
 */
package com.cloderia.helion.client.local.systemuser;
import javax.inject.Inject;

import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

/**
 * @author adrian
 *
 */
@Page(path = "/createsystemuser")
@Templated(value = "edit-systemuser-page.html#app-container")
public class CreateSystemuserPage extends BaseSystemuserPage {

	@Inject
	@DataField
	protected SystemuserEditor systemuserEditor;
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.party.BasePartyPage#doSetup()
	 */
	@Override
	protected void doSetup() {

		loadPartys(systemuserEditor);
		loadPartys(systemuserEditor);
		loadUniverses(systemuserEditor);
		loadUniverses(systemuserEditor);
		setViewTitle(BaseSystemuserPage.CREATE_SYSTEMUSER, "");
		super.doSetup();
	}
}
