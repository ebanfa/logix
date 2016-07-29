/**
 * 
 */
package com.cloderia.helion.client.local.organizationglaccountbalance;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Organizationglaccountbalance;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/editorganizationglaccountbalance")
@Templated(value = "edit-organizationglaccountbalance-page.html#app-container")
public class EditOrganizationglaccountbalancePage extends BaseOrganizationglaccountbalancePage {
	
	@Inject
	@DataField
	protected OrganizationglaccountbalanceEditor organizationglaccountbalanceEditor;
	
	@PageState
	private int id;

	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		loadGlAccounts(organizationglaccountbalanceEditor);
		loadUniverses(organizationglaccountbalanceEditor);
		loadAccountingPeriods(organizationglaccountbalanceEditor);
		organizationglaccountbalanceEditor.setEditMode(true);
		setViewTitle(BaseOrganizationglaccountbalancePage.UPDATE_ORGANIZATIONGLACCOUNTBALANCE, "");
		
		organizationglaccountbalanceService.call(new RemoteCallback<Organizationglaccountbalance>() {
			@Override
			public void callback(Organizationglaccountbalance organizationglaccountbalance) {
				organizationglaccountbalanceEditor.setValue(organizationglaccountbalance);
			}
		}).findById(new Long(id));
		super.doSetup();
	}
	
}
