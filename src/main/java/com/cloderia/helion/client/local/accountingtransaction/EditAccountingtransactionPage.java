/**
 * 
 */
package com.cloderia.helion.client.local.accountingtransaction;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Accountingtransaction;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/editaccountingtransaction")
@Templated(value = "edit-accountingtransaction-page.html#app-container")
public class EditAccountingtransactionPage extends BaseAccountingtransactionPage {
	
	@Inject
	@DataField
	protected AccountingtransactionEditor accountingtransactionEditor;
	
	@PageState
	private int id;

	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		loadPayments(accountingtransactionEditor);
		loadFromPartys(accountingtransactionEditor);
		loadInvoices(accountingtransactionEditor);
		loadFixedAssets(accountingtransactionEditor);
		loadPartyRoles(accountingtransactionEditor);
		loadUniverses(accountingtransactionEditor);
		loadTransactionTys(accountingtransactionEditor);
		accountingtransactionEditor.setEditMode(true);
		setViewTitle(BaseAccountingtransactionPage.UPDATE_ACCOUNTINGTRANSACTION, "");
		
		accountingtransactionService.call(new RemoteCallback<Accountingtransaction>() {
			@Override
			public void callback(Accountingtransaction accountingtransaction) {
				accountingtransactionEditor.setValue(accountingtransaction);
			}
		}).findById(new Long(id));
		super.doSetup();
	}
	
}
