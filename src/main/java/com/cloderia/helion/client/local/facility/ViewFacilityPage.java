/**
 * 
 */
package com.cloderia.helion.client.local.facility;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Facility;

/**
 * @author adrian
 *
 */
@Page(path = "/viewfacility")
@Templated(value = "view-facility-page.html#app-container")
public class ViewFacilityPage extends BaseFacilityPage {

	@PageState
	private Long id;

	@Inject
	@AutoBound
	private DataBinder<Facility> binder;

	@Inject
	@DataField
	private FacilityDisplay entityDisplayComponent;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		this.setViewTitle(BaseFacilityPage.VIEW_FACILITY, "");
		facilityService.call(new RemoteCallback<Facility>() {
			@Override
			public void callback(Facility facility) {
				binder.setModel(facility);
				entityDisplayComponent.setValue(facility);
			}
		}).findById(new Long(id));
	}
}
