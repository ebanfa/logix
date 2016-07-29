/**
 * 
 */
package com.cloderia.helion.client.local.producttype;

import javax.inject.Inject;

import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;

import com.cloderia.helion.client.shared.model.Producttype;
import com.google.gwt.user.client.TakesValue;

import com.cloderia.helion.client.shared.ops.ProducttypeOperation;

/**
 * @author adrian
 *
 */
public class ProducttypePresenter implements TakesValue<Producttype> {

	@Inject
	@AutoBound
	protected DataBinder<Producttype> binder;

	private ProducttypeOperation producttypeOps;

	@Override
	public Producttype getValue() {
		return binder.getModel();
	}

	@Override
	public void setValue(final Producttype model) {
		binder.setModel(model);
	}

	/**
	 * @return the producttypeOps
	 */
	public ProducttypeOperation getProducttypeOps() {
		return producttypeOps;
	}

	/**
	 * @param producttypeOps
	 *            the producttypeOps to set
	 */
	public void setProducttypeOps(ProducttypeOperation producttypeOps) {
		this.producttypeOps = producttypeOps;
	}
	
	/**
	 * 
	 */
	protected ProducttypeOperation initOps() {
		ProducttypeOperation producttypeOperation = new ProducttypeOperation(this.getValue());
		this.setProducttypeOps(producttypeOperation);
		return producttypeOperation;
	}

}
