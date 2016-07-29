/**
 * 
 */
package com.cloderia.helion.client.local.accountingtransaction;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Accountingtransaction;

/**
 * @author adrian
 *
 */
@Page(path = "/viewaccountingtransaction")
@Templated(value = "view-accountingtransaction-page.html#app-container")
public class ViewAccountingtransactionPage extends BaseAccountingtransactionPage {

	@PageState
	private Long id;

	@Inject
	@AutoBound
	private DataBinder<Accountingtransaction> binder;

	@Inject
	@DataField
	private AccountingtransactionDisplay entityDisplayComponent;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		this.setViewTitle(BaseAccountingtransactionPage.VIEW_ACCOUNTINGTRANSACTION, "");
		accountingtransactionService.call(new RemoteCallback<Accountingtransaction>() {
			@Override
			public void callback(Accountingtransaction accountingtransaction) {
				binder.setModel(accountingtransaction);
				entityDisplayComponent.setValue(accountingtransaction);
			}
		}).findById(new Long(id));
	}
}
