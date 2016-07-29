/**
 * 
 */
package com.cloderia.helion.client.local.billingaccount;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Billingaccount;

/**
 * @author adrian
 *
 */
@Page(path = "/viewbillingaccount")
@Templated(value = "view-billingaccount-page.html#app-container")
public class ViewBillingaccountPage extends BaseBillingaccountPage {

	@PageState
	private Long id;

	@Inject
	@AutoBound
	private DataBinder<Billingaccount> binder;

	@Inject
	@DataField
	private BillingaccountDisplay entityDisplayComponent;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		this.setViewTitle(BaseBillingaccountPage.VIEW_BILLINGACCOUNT, "");
		billingaccountService.call(new RemoteCallback<Billingaccount>() {
			@Override
			public void callback(Billingaccount billingaccount) {
				binder.setModel(billingaccount);
				entityDisplayComponent.setValue(billingaccount);
			}
		}).findById(new Long(id));
	}
}
