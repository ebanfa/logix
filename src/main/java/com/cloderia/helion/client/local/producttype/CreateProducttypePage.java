/**
 * 
 */
package com.cloderia.helion.client.local.producttype;
import javax.inject.Inject;

import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

/**
 * @author adrian
 *
 */
@Page(path = "/createproducttype")
@Templated(value = "edit-producttype-page.html#app-container")
public class CreateProducttypePage extends BaseProducttypePage {

	@Inject
	@DataField
	protected ProducttypeEditor producttypeEditor;
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.party.BasePartyPage#doSetup()
	 */
	@Override
	protected void doSetup() {

		loadUniverses(producttypeEditor);
		loadUniverses(producttypeEditor);
		setViewTitle(BaseProducttypePage.CREATE_PRODUCTTYPE, "");
		super.doSetup();
	}
}
