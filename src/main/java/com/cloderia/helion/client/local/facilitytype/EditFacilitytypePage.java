/**
 * 
 */
package com.cloderia.helion.client.local.facilitytype;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Facilitytype;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/editfacilitytype")
@Templated(value = "edit-facilitytype-page.html#app-container")
public class EditFacilitytypePage extends BaseFacilitytypePage {
	
	@Inject
	@DataField
	protected FacilitytypeEditor facilitytypeEditor;
	
	@PageState
	private int id;

	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		loadUniverses(facilitytypeEditor);
		facilitytypeEditor.setEditMode(true);
		setViewTitle(BaseFacilitytypePage.UPDATE_FACILITYTYPE, "");
		
		facilitytypeService.call(new RemoteCallback<Facilitytype>() {
			@Override
			public void callback(Facilitytype facilitytype) {
				facilitytypeEditor.setValue(facilitytype);
			}
		}).findById(new Long(id));
		super.doSetup();
	}
	
}
