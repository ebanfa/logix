/**
 * 
 */
package com.cloderia.helion.client.local.person;
import javax.inject.Inject;

import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

/**
 * @author adrian
 *
 */
@Page(path = "/createperson")
@Templated(value = "edit-person-page.html#app-container")
public class CreatePersonPage extends BasePersonPage {

	@Inject
	@DataField
	protected PersonEditor personEditor;
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.party.BasePartyPage#doSetup()
	 */
	@Override
	protected void doSetup() {

		loadPartys(personEditor);
		loadPartys(personEditor);
		loadUniverses(personEditor);
		loadUniverses(personEditor);
		setViewTitle(BasePersonPage.CREATE_PERSON, "");
		super.doSetup();
	}
}
