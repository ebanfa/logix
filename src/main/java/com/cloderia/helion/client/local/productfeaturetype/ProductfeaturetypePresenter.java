/**
 * 
 */
package com.cloderia.helion.client.local.productfeaturetype;

import javax.inject.Inject;

import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;

import com.cloderia.helion.client.shared.model.Productfeaturetype;
import com.google.gwt.user.client.TakesValue;

import com.cloderia.helion.client.shared.ops.ProductfeaturetypeOperation;

/**
 * @author adrian
 *
 */
public class ProductfeaturetypePresenter implements TakesValue<Productfeaturetype> {

	@Inject
	@AutoBound
	protected DataBinder<Productfeaturetype> binder;

	private ProductfeaturetypeOperation productfeaturetypeOps;

	@Override
	public Productfeaturetype getValue() {
		return binder.getModel();
	}

	@Override
	public void setValue(final Productfeaturetype model) {
		binder.setModel(model);
	}

	/**
	 * @return the productfeaturetypeOps
	 */
	public ProductfeaturetypeOperation getProductfeaturetypeOps() {
		return productfeaturetypeOps;
	}

	/**
	 * @param productfeaturetypeOps
	 *            the productfeaturetypeOps to set
	 */
	public void setProductfeaturetypeOps(ProductfeaturetypeOperation productfeaturetypeOps) {
		this.productfeaturetypeOps = productfeaturetypeOps;
	}
	
	/**
	 * 
	 */
	protected ProductfeaturetypeOperation initOps() {
		ProductfeaturetypeOperation productfeaturetypeOperation = new ProductfeaturetypeOperation(this.getValue());
		this.setProductfeaturetypeOps(productfeaturetypeOperation);
		return productfeaturetypeOperation;
	}

}
