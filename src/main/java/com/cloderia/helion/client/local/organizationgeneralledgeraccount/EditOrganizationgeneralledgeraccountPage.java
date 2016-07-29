/**
 * 
 */
package com.cloderia.helion.client.local.organizationgeneralledgeraccount;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Organizationgeneralledgeraccount;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/editorganizationgeneralledgeraccount")
@Templated(value = "edit-organizationgeneralledgeraccount-page.html#app-container")
public class EditOrganizationgeneralledgeraccountPage extends BaseOrganizationgeneralledgeraccountPage {
	
	@Inject
	@DataField
	protected OrganizationgeneralledgeraccountEditor organizationgeneralledgeraccountEditor;
	
	@PageState
	private int id;

	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		loadOrganizations(organizationgeneralledgeraccountEditor);
		loadProductCats(organizationgeneralledgeraccountEditor);
		loadUniverses(organizationgeneralledgeraccountEditor);
		loadProducts(organizationgeneralledgeraccountEditor);
		loadGlAccounts(organizationgeneralledgeraccountEditor);
		organizationgeneralledgeraccountEditor.setEditMode(true);
		setViewTitle(BaseOrganizationgeneralledgeraccountPage.UPDATE_ORGANIZATIONGENERALLEDGERACCOUNT, "");
		
		organizationgeneralledgeraccountService.call(new RemoteCallback<Organizationgeneralledgeraccount>() {
			@Override
			public void callback(Organizationgeneralledgeraccount organizationgeneralledgeraccount) {
				organizationgeneralledgeraccountEditor.setValue(organizationgeneralledgeraccount);
			}
		}).findById(new Long(id));
		super.doSetup();
	}
	
}
