/**
 * 
 */
package com.cloderia.helion.client.local.partyrole;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Partyrole;

/**
 * @author adrian
 *
 */
@Page(path = "/viewpartyrole")
@Templated(value = "view-partyrole-page.html#app-container")
public class ViewPartyrolePage extends BasePartyrolePage {

	@PageState
	private Long id;

	@Inject
	@AutoBound
	private DataBinder<Partyrole> binder;

	@Inject
	@DataField
	private PartyroleDisplay entityDisplayComponent;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		this.setViewTitle(BasePartyrolePage.VIEW_PARTYROLE, "");
		partyroleService.call(new RemoteCallback<Partyrole>() {
			@Override
			public void callback(Partyrole partyrole) {
				binder.setModel(partyrole);
				entityDisplayComponent.setValue(partyrole);
			}
		}).findById(new Long(id));
	}
}
