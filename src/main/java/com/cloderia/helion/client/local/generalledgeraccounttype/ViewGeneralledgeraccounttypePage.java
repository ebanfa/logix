/**
 * 
 */
package com.cloderia.helion.client.local.generalledgeraccounttype;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Generalledgeraccounttype;

/**
 * @author adrian
 *
 */
@Page(path = "/viewgeneralledgeraccounttype")
@Templated(value = "view-generalledgeraccounttype-page.html#app-container")
public class ViewGeneralledgeraccounttypePage extends BaseGeneralledgeraccounttypePage {

	@PageState
	private Long id;

	@Inject
	@AutoBound
	private DataBinder<Generalledgeraccounttype> binder;

	@Inject
	@DataField
	private GeneralledgeraccounttypeDisplay entityDisplayComponent;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		this.setViewTitle(BaseGeneralledgeraccounttypePage.VIEW_GENERALLEDGERACCOUNTTYPE, "");
		generalledgeraccounttypeService.call(new RemoteCallback<Generalledgeraccounttype>() {
			@Override
			public void callback(Generalledgeraccounttype generalledgeraccounttype) {
				binder.setModel(generalledgeraccounttype);
				entityDisplayComponent.setValue(generalledgeraccounttype);
			}
		}).findById(new Long(id));
	}
}
