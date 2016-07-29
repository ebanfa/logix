/**
 * 
 */
package com.cloderia.helion.client.local.agreement;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Agreement;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/editagreement")
@Templated(value = "edit-agreement-page.html#app-container")
public class EditAgreementPage extends BaseAgreementPage {
	
	@Inject
	@DataField
	protected AgreementEditor agreementEditor;
	
	@PageState
	private int id;

	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		loadAgreementTys(agreementEditor);
		loadUniverses(agreementEditor);
		loadPartyRels(agreementEditor);
		agreementEditor.setEditMode(true);
		setViewTitle(BaseAgreementPage.UPDATE_AGREEMENT, "");
		
		agreementService.call(new RemoteCallback<Agreement>() {
			@Override
			public void callback(Agreement agreement) {
				agreementEditor.setValue(agreement);
			}
		}).findById(new Long(id));
		super.doSetup();
	}
	
}
