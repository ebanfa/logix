/**
 * 
 */
package com.cloderia.helion.client.local.productfeature;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Productfeature;

/**
 * @author adrian
 *
 */
@Page(path = "/viewproductfeature")
@Templated(value = "view-productfeature-page.html#app-container")
public class ViewProductfeaturePage extends BaseProductfeaturePage {

	@PageState
	private Long id;

	@Inject
	@AutoBound
	private DataBinder<Productfeature> binder;

	@Inject
	@DataField
	private ProductfeatureDisplay entityDisplayComponent;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		this.setViewTitle(BaseProductfeaturePage.VIEW_PRODUCTFEATURE, "");
		productfeatureService.call(new RemoteCallback<Productfeature>() {
			@Override
			public void callback(Productfeature productfeature) {
				binder.setModel(productfeature);
				entityDisplayComponent.setValue(productfeature);
			}
		}).findById(new Long(id));
	}
}
