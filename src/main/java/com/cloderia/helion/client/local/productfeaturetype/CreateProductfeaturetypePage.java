/**
 * 
 */
package com.cloderia.helion.client.local.productfeaturetype;
import javax.inject.Inject;

import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

/**
 * @author adrian
 *
 */
@Page(path = "/createproductfeaturetype")
@Templated(value = "edit-productfeaturetype-page.html#app-container")
public class CreateProductfeaturetypePage extends BaseProductfeaturetypePage {

	@Inject
	@DataField
	protected ProductfeaturetypeEditor productfeaturetypeEditor;
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.party.BasePartyPage#doSetup()
	 */
	@Override
	protected void doSetup() {

		loadUniverses(productfeaturetypeEditor);
		loadUniverses(productfeaturetypeEditor);
		setViewTitle(BaseProductfeaturetypePage.CREATE_PRODUCTFEATURETYPE, "");
		super.doSetup();
	}
}
