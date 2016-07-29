/**
 * 
 */
package com.cloderia.helion.client.local.product;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Product;

/**
 * @author adrian
 *
 */
@Page(path = "/viewproduct")
@Templated(value = "view-product-page.html#app-container")
public class ViewProductPage extends BaseProductPage {

	@PageState
	private Long id;

	@Inject
	@AutoBound
	private DataBinder<Product> binder;

	@Inject
	@DataField
	private ProductDisplay entityDisplayComponent;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		this.setViewTitle(BaseProductPage.VIEW_PRODUCT, "");
		productService.call(new RemoteCallback<Product>() {
			@Override
			public void callback(Product product) {
				binder.setModel(product);
				entityDisplayComponent.setValue(product);
			}
		}).findById(new Long(id));
	}
}
