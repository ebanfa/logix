/**
 * 
 */
package com.cloderia.helion.client.local.productcategory;

import javax.inject.Inject;

import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;

import com.cloderia.helion.client.shared.model.Productcategory;
import com.google.gwt.user.client.TakesValue;

import com.cloderia.helion.client.shared.ops.ProductcategoryOperation;

/**
 * @author adrian
 *
 */
public class ProductcategoryPresenter implements TakesValue<Productcategory> {

	@Inject
	@AutoBound
	protected DataBinder<Productcategory> binder;

	private ProductcategoryOperation productcategoryOps;

	@Override
	public Productcategory getValue() {
		return binder.getModel();
	}

	@Override
	public void setValue(final Productcategory model) {
		binder.setModel(model);
	}

	/**
	 * @return the productcategoryOps
	 */
	public ProductcategoryOperation getProductcategoryOps() {
		return productcategoryOps;
	}

	/**
	 * @param productcategoryOps
	 *            the productcategoryOps to set
	 */
	public void setProductcategoryOps(ProductcategoryOperation productcategoryOps) {
		this.productcategoryOps = productcategoryOps;
	}
	
	/**
	 * 
	 */
	protected ProductcategoryOperation initOps() {
		ProductcategoryOperation productcategoryOperation = new ProductcategoryOperation(this.getValue());
		this.setProductcategoryOps(productcategoryOperation);
		return productcategoryOperation;
	}

}
