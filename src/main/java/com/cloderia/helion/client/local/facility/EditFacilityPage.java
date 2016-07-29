/**
 * 
 */
package com.cloderia.helion.client.local.facility;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Facility;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/editfacility")
@Templated(value = "edit-facility-page.html#app-container")
public class EditFacilityPage extends BaseFacilityPage {
	
	@Inject
	@DataField
	protected FacilityEditor facilityEditor;
	
	@PageState
	private int id;

	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		loadUniverses(facilityEditor);
		loadFacilityTys(facilityEditor);
		facilityEditor.setEditMode(true);
		setViewTitle(BaseFacilityPage.UPDATE_FACILITY, "");
		
		facilityService.call(new RemoteCallback<Facility>() {
			@Override
			public void callback(Facility facility) {
				facilityEditor.setValue(facility);
			}
		}).findById(new Long(id));
		super.doSetup();
	}
	
}
