/**
 * 
 */
package com.cloderia.helion.client.local.agreement;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Agreement;

/**
 * @author adrian
 *
 */
@Page(path = "/viewagreement")
@Templated(value = "view-agreement-page.html#app-container")
public class ViewAgreementPage extends BaseAgreementPage {

	@PageState
	private Long id;

	@Inject
	@AutoBound
	private DataBinder<Agreement> binder;

	@Inject
	@DataField
	private AgreementDisplay entityDisplayComponent;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		this.setViewTitle(BaseAgreementPage.VIEW_AGREEMENT, "");
		agreementService.call(new RemoteCallback<Agreement>() {
			@Override
			public void callback(Agreement agreement) {
				binder.setModel(agreement);
				entityDisplayComponent.setValue(agreement);
			}
		}).findById(new Long(id));
	}
}
