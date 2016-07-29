/**
 * 
 */
package com.cloderia.helion.client.local.productfeature;

import javax.inject.Inject;

import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;

import com.cloderia.helion.client.shared.model.Productfeature;
import com.google.gwt.user.client.TakesValue;

import com.cloderia.helion.client.shared.ops.ProductfeatureOperation;

/**
 * @author adrian
 *
 */
public class ProductfeaturePresenter implements TakesValue<Productfeature> {

	@Inject
	@AutoBound
	protected DataBinder<Productfeature> binder;

	private ProductfeatureOperation productfeatureOps;

	@Override
	public Productfeature getValue() {
		return binder.getModel();
	}

	@Override
	public void setValue(final Productfeature model) {
		binder.setModel(model);
	}

	/**
	 * @return the productfeatureOps
	 */
	public ProductfeatureOperation getProductfeatureOps() {
		return productfeatureOps;
	}

	/**
	 * @param productfeatureOps
	 *            the productfeatureOps to set
	 */
	public void setProductfeatureOps(ProductfeatureOperation productfeatureOps) {
		this.productfeatureOps = productfeatureOps;
	}
	
	/**
	 * 
	 */
	protected ProductfeatureOperation initOps() {
		ProductfeatureOperation productfeatureOperation = new ProductfeatureOperation(this.getValue());
		this.setProductfeatureOps(productfeatureOperation);
		return productfeatureOperation;
	}

}
