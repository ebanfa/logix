/**
 * 
 */
package com.cloderia.helion.client.local.universe;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Universe;

/**
 * @author adrian
 *
 */
@Page(path = "/viewuniverse")
@Templated(value = "view-universe-page.html#app-container")
public class ViewUniversePage extends BaseUniversePage {

	@PageState
	private Long id;

	@Inject
	@AutoBound
	private DataBinder<Universe> binder;

	@Inject
	@DataField
	private UniverseDisplay entityDisplayComponent;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		this.setViewTitle(BaseUniversePage.VIEW_UNIVERSE, "");
		universeService.call(new RemoteCallback<Universe>() {
			@Override
			public void callback(Universe universe) {
				binder.setModel(universe);
				entityDisplayComponent.setValue(universe);
			}
		}).findById(new Long(id));
	}
}
