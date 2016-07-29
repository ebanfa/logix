/**
 * 
 */
package com.cloderia.helion.client.local.agreement;
import javax.inject.Inject;

import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

/**
 * @author adrian
 *
 */
@Page(path = "/createagreement")
@Templated(value = "edit-agreement-page.html#app-container")
public class CreateAgreementPage extends BaseAgreementPage {

	@Inject
	@DataField
	protected AgreementEditor agreementEditor;
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.party.BasePartyPage#doSetup()
	 */
	@Override
	protected void doSetup() {

		loadAgreementTys(agreementEditor);
		loadAgreementTys(agreementEditor);
		loadUniverses(agreementEditor);
		loadUniverses(agreementEditor);
		loadPartyRels(agreementEditor);
		loadPartyRels(agreementEditor);
		setViewTitle(BaseAgreementPage.CREATE_AGREEMENT, "");
		super.doSetup();
	}
}
