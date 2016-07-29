/**
 * 
 */
package com.cloderia.helion.client.local.inventoryitem;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Inventoryitem;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/editinventoryitem")
@Templated(value = "edit-inventoryitem-page.html#app-container")
public class EditInventoryitemPage extends BaseInventoryitemPage {
	
	@Inject
	@DataField
	protected InventoryitemEditor inventoryitemEditor;
	
	@PageState
	private int id;

	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		loadLots(inventoryitemEditor);
		loadContainers(inventoryitemEditor);
		loadStatuss(inventoryitemEditor);
		loadItemTys(inventoryitemEditor);
		loadUniverses(inventoryitemEditor);
		loadProds(inventoryitemEditor);
		loadFacilitys(inventoryitemEditor);
		inventoryitemEditor.setEditMode(true);
		setViewTitle(BaseInventoryitemPage.UPDATE_INVENTORYITEM, "");
		
		inventoryitemService.call(new RemoteCallback<Inventoryitem>() {
			@Override
			public void callback(Inventoryitem inventoryitem) {
				inventoryitemEditor.setValue(inventoryitem);
			}
		}).findById(new Long(id));
		super.doSetup();
	}
	
}
