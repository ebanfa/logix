/**
 * 
 */
package com.cloderia.helion.client.local.productcategory;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Productcategory;

/**
 * @author adrian
 *
 */
@Page(path = "/viewproductcategory")
@Templated(value = "view-productcategory-page.html#app-container")
public class ViewProductcategoryPage extends BaseProductcategoryPage {

	@PageState
	private Long id;

	@Inject
	@AutoBound
	private DataBinder<Productcategory> binder;

	@Inject
	@DataField
	private ProductcategoryDisplay entityDisplayComponent;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		this.setViewTitle(BaseProductcategoryPage.VIEW_PRODUCTCATEGORY, "");
		productcategoryService.call(new RemoteCallback<Productcategory>() {
			@Override
			public void callback(Productcategory productcategory) {
				binder.setModel(productcategory);
				entityDisplayComponent.setValue(productcategory);
			}
		}).findById(new Long(id));
	}
}
