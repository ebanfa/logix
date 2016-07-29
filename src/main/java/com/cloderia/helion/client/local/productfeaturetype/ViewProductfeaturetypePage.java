/**
 * 
 */
package com.cloderia.helion.client.local.productfeaturetype;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Productfeaturetype;

/**
 * @author adrian
 *
 */
@Page(path = "/viewproductfeaturetype")
@Templated(value = "view-productfeaturetype-page.html#app-container")
public class ViewProductfeaturetypePage extends BaseProductfeaturetypePage {

	@PageState
	private Long id;

	@Inject
	@AutoBound
	private DataBinder<Productfeaturetype> binder;

	@Inject
	@DataField
	private ProductfeaturetypeDisplay entityDisplayComponent;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		this.setViewTitle(BaseProductfeaturetypePage.VIEW_PRODUCTFEATURETYPE, "");
		productfeaturetypeService.call(new RemoteCallback<Productfeaturetype>() {
			@Override
			public void callback(Productfeaturetype productfeaturetype) {
				binder.setModel(productfeaturetype);
				entityDisplayComponent.setValue(productfeaturetype);
			}
		}).findById(new Long(id));
	}
}
