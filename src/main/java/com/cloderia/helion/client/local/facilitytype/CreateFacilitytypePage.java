/**
 * 
 */
package com.cloderia.helion.client.local.facilitytype;
import javax.inject.Inject;

import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

/**
 * @author adrian
 *
 */
@Page(path = "/createfacilitytype")
@Templated(value = "edit-facilitytype-page.html#app-container")
public class CreateFacilitytypePage extends BaseFacilitytypePage {

	@Inject
	@DataField
	protected FacilitytypeEditor facilitytypeEditor;
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.party.BasePartyPage#doSetup()
	 */
	@Override
	protected void doSetup() {

		loadUniverses(facilitytypeEditor);
		loadUniverses(facilitytypeEditor);
		setViewTitle(BaseFacilitytypePage.CREATE_FACILITYTYPE, "");
		super.doSetup();
	}
}
