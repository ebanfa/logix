/**
 * 
 */
package com.cloderia.helion.client.local.billingaccount;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Billingaccount;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/editbillingaccount")
@Templated(value = "edit-billingaccount-page.html#app-container")
public class EditBillingaccountPage extends BaseBillingaccountPage {
	
	@Inject
	@DataField
	protected BillingaccountEditor billingaccountEditor;
	
	@PageState
	private int id;

	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		loadToContMechs(billingaccountEditor);
		loadUniverses(billingaccountEditor);
		billingaccountEditor.setEditMode(true);
		setViewTitle(BaseBillingaccountPage.UPDATE_BILLINGACCOUNT, "");
		
		billingaccountService.call(new RemoteCallback<Billingaccount>() {
			@Override
			public void callback(Billingaccount billingaccount) {
				billingaccountEditor.setValue(billingaccount);
			}
		}).findById(new Long(id));
		super.doSetup();
	}
	
}
