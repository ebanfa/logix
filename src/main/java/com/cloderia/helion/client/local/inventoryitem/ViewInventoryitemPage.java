/**
 * 
 */
package com.cloderia.helion.client.local.inventoryitem;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Inventoryitem;

/**
 * @author adrian
 *
 */
@Page(path = "/viewinventoryitem")
@Templated(value = "view-inventoryitem-page.html#app-container")
public class ViewInventoryitemPage extends BaseInventoryitemPage {

	@PageState
	private Long id;

	@Inject
	@AutoBound
	private DataBinder<Inventoryitem> binder;

	@Inject
	@DataField
	private InventoryitemDisplay entityDisplayComponent;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		this.setViewTitle(BaseInventoryitemPage.VIEW_INVENTORYITEM, "");
		inventoryitemService.call(new RemoteCallback<Inventoryitem>() {
			@Override
			public void callback(Inventoryitem inventoryitem) {
				binder.setModel(inventoryitem);
				entityDisplayComponent.setValue(inventoryitem);
			}
		}).findById(new Long(id));
	}
}
