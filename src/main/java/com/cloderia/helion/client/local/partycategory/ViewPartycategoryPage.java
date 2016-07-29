/**
 * 
 */
package com.cloderia.helion.client.local.partycategory;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Partycategory;

/**
 * @author adrian
 *
 */
@Page(path = "/viewpartycategory")
@Templated(value = "view-partycategory-page.html#app-container")
public class ViewPartycategoryPage extends BasePartycategoryPage {

	@PageState
	private Long id;

	@Inject
	@AutoBound
	private DataBinder<Partycategory> binder;

	@Inject
	@DataField
	private PartycategoryDisplay entityDisplayComponent;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		this.setViewTitle(BasePartycategoryPage.VIEW_PARTYCATEGORY, "");
		partycategoryService.call(new RemoteCallback<Partycategory>() {
			@Override
			public void callback(Partycategory partycategory) {
				binder.setModel(partycategory);
				entityDisplayComponent.setValue(partycategory);
			}
		}).findById(new Long(id));
	}
}
