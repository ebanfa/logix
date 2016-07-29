/**
 * 
 */
package com.cloderia.helion.client.local.inventoryitem;
import javax.inject.Inject;

import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

/**
 * @author adrian
 *
 */
@Page(path = "/createinventoryitem")
@Templated(value = "edit-inventoryitem-page.html#app-container")
public class CreateInventoryitemPage extends BaseInventoryitemPage {

	@Inject
	@DataField
	protected InventoryitemEditor inventoryitemEditor;
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.party.BasePartyPage#doSetup()
	 */
	@Override
	protected void doSetup() {

		loadLots(inventoryitemEditor);
		loadLots(inventoryitemEditor);
		loadContainers(inventoryitemEditor);
		loadContainers(inventoryitemEditor);
		loadStatuss(inventoryitemEditor);
		loadStatuss(inventoryitemEditor);
		loadItemTys(inventoryitemEditor);
		loadItemTys(inventoryitemEditor);
		loadUniverses(inventoryitemEditor);
		loadUniverses(inventoryitemEditor);
		loadProds(inventoryitemEditor);
		loadProds(inventoryitemEditor);
		loadFacilitys(inventoryitemEditor);
		loadFacilitys(inventoryitemEditor);
		setViewTitle(BaseInventoryitemPage.CREATE_INVENTORYITEM, "");
		super.doSetup();
	}
}
