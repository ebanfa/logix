/**
 * 
 */
package com.cloderia.helion.client.local.universe;
import javax.inject.Inject;

import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

/**
 * @author adrian
 *
 */
@Page(path = "/createuniverse")
@Templated(value = "edit-universe-page.html#app-container")
public class CreateUniversePage extends BaseUniversePage {

	@Inject
	@DataField
	protected UniverseEditor universeEditor;
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.party.BasePartyPage#doSetup()
	 */
	@Override
	protected void doSetup() {

		loadParentUniverses(universeEditor);
		loadParentUniverses(universeEditor);
		setViewTitle(BaseUniversePage.CREATE_UNIVERSE, "");
		super.doSetup();
	}
}
