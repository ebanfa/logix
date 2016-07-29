/**
 * 
 */
package com.cloderia.helion.client.local.supplierproduct;

import javax.inject.Inject;

import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;

import com.cloderia.helion.client.shared.model.Supplierproduct;
import com.google.gwt.user.client.TakesValue;

import com.cloderia.helion.client.shared.ops.SupplierproductOperation;

/**
 * @author adrian
 *
 */
public class SupplierproductPresenter implements TakesValue<Supplierproduct> {

	@Inject
	@AutoBound
	protected DataBinder<Supplierproduct> binder;

	private SupplierproductOperation supplierproductOps;

	@Override
	public Supplierproduct getValue() {
		return binder.getModel();
	}

	@Override
	public void setValue(final Supplierproduct model) {
		binder.setModel(model);
	}

	/**
	 * @return the supplierproductOps
	 */
	public SupplierproductOperation getSupplierproductOps() {
		return supplierproductOps;
	}

	/**
	 * @param supplierproductOps
	 *            the supplierproductOps to set
	 */
	public void setSupplierproductOps(SupplierproductOperation supplierproductOps) {
		this.supplierproductOps = supplierproductOps;
	}
	
	/**
	 * 
	 */
	protected SupplierproductOperation initOps() {
		SupplierproductOperation supplierproductOperation = new SupplierproductOperation(this.getValue());
		this.setSupplierproductOps(supplierproductOperation);
		return supplierproductOperation;
	}

}
