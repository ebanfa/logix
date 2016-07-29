/**
 * 
 */
package com.cloderia.helion.client.local.generalledgeraccounttype;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Generalledgeraccounttype;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/editgeneralledgeraccounttype")
@Templated(value = "edit-generalledgeraccounttype-page.html#app-container")
public class EditGeneralledgeraccounttypePage extends BaseGeneralledgeraccounttypePage {
	
	@Inject
	@DataField
	protected GeneralledgeraccounttypeEditor generalledgeraccounttypeEditor;
	
	@PageState
	private int id;

	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		loadUniverses(generalledgeraccounttypeEditor);
		generalledgeraccounttypeEditor.setEditMode(true);
		setViewTitle(BaseGeneralledgeraccounttypePage.UPDATE_GENERALLEDGERACCOUNTTYPE, "");
		
		generalledgeraccounttypeService.call(new RemoteCallback<Generalledgeraccounttype>() {
			@Override
			public void callback(Generalledgeraccounttype generalledgeraccounttype) {
				generalledgeraccounttypeEditor.setValue(generalledgeraccounttype);
			}
		}).findById(new Long(id));
		super.doSetup();
	}
	
}
