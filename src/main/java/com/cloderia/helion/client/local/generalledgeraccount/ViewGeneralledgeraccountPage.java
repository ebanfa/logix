/**
 * 
 */
package com.cloderia.helion.client.local.generalledgeraccount;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Generalledgeraccount;

/**
 * @author adrian
 *
 */
@Page(path = "/viewgeneralledgeraccount")
@Templated(value = "view-generalledgeraccount-page.html#app-container")
public class ViewGeneralledgeraccountPage extends BaseGeneralledgeraccountPage {

	@PageState
	private Long id;

	@Inject
	@AutoBound
	private DataBinder<Generalledgeraccount> binder;

	@Inject
	@DataField
	private GeneralledgeraccountDisplay entityDisplayComponent;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		this.setViewTitle(BaseGeneralledgeraccountPage.VIEW_GENERALLEDGERACCOUNT, "");
		generalledgeraccountService.call(new RemoteCallback<Generalledgeraccount>() {
			@Override
			public void callback(Generalledgeraccount generalledgeraccount) {
				binder.setModel(generalledgeraccount);
				entityDisplayComponent.setValue(generalledgeraccount);
			}
		}).findById(new Long(id));
	}
}
