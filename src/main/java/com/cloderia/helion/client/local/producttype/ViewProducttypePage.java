/**
 * 
 */
package com.cloderia.helion.client.local.producttype;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Producttype;

/**
 * @author adrian
 *
 */
@Page(path = "/viewproducttype")
@Templated(value = "view-producttype-page.html#app-container")
public class ViewProducttypePage extends BaseProducttypePage {

	@PageState
	private Long id;

	@Inject
	@AutoBound
	private DataBinder<Producttype> binder;

	@Inject
	@DataField
	private ProducttypeDisplay entityDisplayComponent;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		this.setViewTitle(BaseProducttypePage.VIEW_PRODUCTTYPE, "");
		producttypeService.call(new RemoteCallback<Producttype>() {
			@Override
			public void callback(Producttype producttype) {
				binder.setModel(producttype);
				entityDisplayComponent.setValue(producttype);
			}
		}).findById(new Long(id));
	}
}
