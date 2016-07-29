/**
 * 
 */
package com.cloderia.helion.client.local.systemuser;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Systemuser;

/**
 * @author adrian
 *
 */
@Page(path = "/viewsystemuser")
@Templated(value = "view-systemuser-page.html#app-container")
public class ViewSystemuserPage extends BaseSystemuserPage {

	@PageState
	private Long id;

	@Inject
	@AutoBound
	private DataBinder<Systemuser> binder;

	@Inject
	@DataField
	private SystemuserDisplay entityDisplayComponent;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		this.setViewTitle(BaseSystemuserPage.VIEW_SYSTEMUSER, "");
		systemuserService.call(new RemoteCallback<Systemuser>() {
			@Override
			public void callback(Systemuser systemuser) {
				binder.setModel(systemuser);
				entityDisplayComponent.setValue(systemuser);
			}
		}).findById(new Long(id));
	}
}
