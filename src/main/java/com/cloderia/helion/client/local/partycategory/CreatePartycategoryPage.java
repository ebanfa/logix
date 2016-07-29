/**
 * 
 */
package com.cloderia.helion.client.local.partycategory;
import javax.inject.Inject;

import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

/**
 * @author adrian
 *
 */
@Page(path = "/createpartycategory")
@Templated(value = "edit-partycategory-page.html#app-container")
public class CreatePartycategoryPage extends BasePartycategoryPage {

	@Inject
	@DataField
	protected PartycategoryEditor partycategoryEditor;
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.party.BasePartyPage#doSetup()
	 */
	@Override
	protected void doSetup() {

		loadUniverses(partycategoryEditor);
		loadUniverses(partycategoryEditor);
		setViewTitle(BasePartycategoryPage.CREATE_PARTYCATEGORY, "");
		super.doSetup();
	}
}
