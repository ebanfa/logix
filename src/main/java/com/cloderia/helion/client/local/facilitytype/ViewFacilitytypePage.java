/**
 * 
 */
package com.cloderia.helion.client.local.facilitytype;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Facilitytype;

/**
 * @author adrian
 *
 */
@Page(path = "/viewfacilitytype")
@Templated(value = "view-facilitytype-page.html#app-container")
public class ViewFacilitytypePage extends BaseFacilitytypePage {

	@PageState
	private Long id;

	@Inject
	@AutoBound
	private DataBinder<Facilitytype> binder;

	@Inject
	@DataField
	private FacilitytypeDisplay entityDisplayComponent;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		this.setViewTitle(BaseFacilitytypePage.VIEW_FACILITYTYPE, "");
		facilitytypeService.call(new RemoteCallback<Facilitytype>() {
			@Override
			public void callback(Facilitytype facilitytype) {
				binder.setModel(facilitytype);
				entityDisplayComponent.setValue(facilitytype);
			}
		}).findById(new Long(id));
	}
}
