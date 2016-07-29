/**
 * 
 */
package com.cloderia.helion.client.local.supplierproduct;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Supplierproduct;

/**
 * @author adrian
 *
 */
@Page(path = "/viewsupplierproduct")
@Templated(value = "view-supplierproduct-page.html#app-container")
public class ViewSupplierproductPage extends BaseSupplierproductPage {

	@PageState
	private Long id;

	@Inject
	@AutoBound
	private DataBinder<Supplierproduct> binder;

	@Inject
	@DataField
	private SupplierproductDisplay entityDisplayComponent;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		this.setViewTitle(BaseSupplierproductPage.VIEW_SUPPLIERPRODUCT, "");
		supplierproductService.call(new RemoteCallback<Supplierproduct>() {
			@Override
			public void callback(Supplierproduct supplierproduct) {
				binder.setModel(supplierproduct);
				entityDisplayComponent.setValue(supplierproduct);
			}
		}).findById(new Long(id));
	}
}
