/**
 * 
 */
package com.cloderia.helion.client.local.inventoryitem;

import javax.inject.Inject;

import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;

import com.cloderia.helion.client.shared.model.Inventoryitem;
import com.google.gwt.user.client.TakesValue;

import com.cloderia.helion.client.shared.ops.InventoryitemOperation;

/**
 * @author adrian
 *
 */
public class InventoryitemPresenter implements TakesValue<Inventoryitem> {

	@Inject
	@AutoBound
	protected DataBinder<Inventoryitem> binder;

	private InventoryitemOperation inventoryitemOps;

	@Override
	public Inventoryitem getValue() {
		return binder.getModel();
	}

	@Override
	public void setValue(final Inventoryitem model) {
		binder.setModel(model);
	}

	/**
	 * @return the inventoryitemOps
	 */
	public InventoryitemOperation getInventoryitemOps() {
		return inventoryitemOps;
	}

	/**
	 * @param inventoryitemOps
	 *            the inventoryitemOps to set
	 */
	public void setInventoryitemOps(InventoryitemOperation inventoryitemOps) {
		this.inventoryitemOps = inventoryitemOps;
	}
	
	/**
	 * 
	 */
	protected InventoryitemOperation initOps() {
		InventoryitemOperation inventoryitemOperation = new InventoryitemOperation(this.getValue());
		this.setInventoryitemOps(inventoryitemOperation);
		return inventoryitemOperation;
	}

}
