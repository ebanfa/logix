/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Productcategorytype;

/**
 * @author adrian
 *
 */
@Portable
public class ProductcategorytypeOperation  extends BaseOperation<Productcategorytype> {

	private Productcategorytype productcategorytype;
	private Long universeId;

	/**
	 * 
	 */
	public ProductcategorytypeOperation() {
	}
	
	/**
	 * @param productcategorytype
	 */
	public ProductcategorytypeOperation(Productcategorytype productcategorytype) {
		super();
		this.productcategorytype = productcategorytype;
		this.setEntity(productcategorytype);
		if(productcategorytype.getUniverse() != null)this.setUniverseId(productcategorytype.getUniverse().getId());
	}
	
	/**
	 * @return the UniverseId
	 */
	public Long getUniverseId() {
		return universeId;
	}

	/**
	 * @param universeId
	 *            the universeId to set
	 */
	public void setUniverseId(Long universeId) {
		this.universeId = universeId;
	}
	            

	/**
	 * @return the productcategorytype
	 */
	public Productcategorytype getProductcategorytype() {
		return productcategorytype;
	}

	/**
	 * @param productcategorytype
	 *            the productcategorytype to set
	 */
	public void setProductcategorytype(Productcategorytype productcategorytype) {
		this.productcategorytype = productcategorytype;
	}

}
