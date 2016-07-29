/**
 * 
 */
package com.cloderia.helion.client.local.generalledgeraccount;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Generalledgeraccount;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/editgeneralledgeraccount")
@Templated(value = "edit-generalledgeraccount-page.html#app-container")
public class EditGeneralledgeraccountPage extends BaseGeneralledgeraccountPage {
	
	@Inject
	@DataField
	protected GeneralledgeraccountEditor generalledgeraccountEditor;
	
	@PageState
	private int id;

	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		loadUniverses(generalledgeraccountEditor);
		loadGlAcctTys(generalledgeraccountEditor);
		generalledgeraccountEditor.setEditMode(true);
		setViewTitle(BaseGeneralledgeraccountPage.UPDATE_GENERALLEDGERACCOUNT, "");
		
		generalledgeraccountService.call(new RemoteCallback<Generalledgeraccount>() {
			@Override
			public void callback(Generalledgeraccount generalledgeraccount) {
				generalledgeraccountEditor.setValue(generalledgeraccount);
			}
		}).findById(new Long(id));
		super.doSetup();
	}
	
}
