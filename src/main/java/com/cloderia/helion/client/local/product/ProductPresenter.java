/**
 * 
 */
package com.cloderia.helion.client.local.product;

import javax.inject.Inject;

import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;

import com.cloderia.helion.client.shared.model.Product;
import com.google.gwt.user.client.TakesValue;

import com.cloderia.helion.client.shared.ops.ProductOperation;

/**
 * @author adrian
 *
 */
public class ProductPresenter implements TakesValue<Product> {

	@Inject
	@AutoBound
	protected DataBinder<Product> binder;

	private ProductOperation productOps;

	@Override
	public Product getValue() {
		return binder.getModel();
	}

	@Override
	public void setValue(final Product model) {
		binder.setModel(model);
	}

	/**
	 * @return the productOps
	 */
	public ProductOperation getProductOps() {
		return productOps;
	}

	/**
	 * @param productOps
	 *            the productOps to set
	 */
	public void setProductOps(ProductOperation productOps) {
		this.productOps = productOps;
	}
	
	/**
	 * 
	 */
	protected ProductOperation initOps() {
		ProductOperation productOperation = new ProductOperation(this.getValue());
		this.setProductOps(productOperation);
		return productOperation;
	}

}
