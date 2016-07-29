/**
 * 
 */
package com.cloderia.helion.client.local.facility;
import javax.inject.Inject;

import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

/**
 * @author adrian
 *
 */
@Page(path = "/createfacility")
@Templated(value = "edit-facility-page.html#app-container")
public class CreateFacilityPage extends BaseFacilityPage {

	@Inject
	@DataField
	protected FacilityEditor facilityEditor;
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.party.BasePartyPage#doSetup()
	 */
	@Override
	protected void doSetup() {

		loadUniverses(facilityEditor);
		loadUniverses(facilityEditor);
		loadFacilityTys(facilityEditor);
		loadFacilityTys(facilityEditor);
		setViewTitle(BaseFacilityPage.CREATE_FACILITY, "");
		super.doSetup();
	}
}
