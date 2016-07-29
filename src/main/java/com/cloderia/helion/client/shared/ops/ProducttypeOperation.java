/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Producttype;

/**
 * @author adrian
 *
 */
@Portable
public class ProducttypeOperation  extends BaseOperation<Producttype> {

	private Producttype producttype;
	private Long universeId;

	/**
	 * 
	 */
	public ProducttypeOperation() {
	}
	
	/**
	 * @param producttype
	 */
	public ProducttypeOperation(Producttype producttype) {
		super();
		this.producttype = producttype;
		this.setEntity(producttype);
		if(producttype.getUniverse() != null)this.setUniverseId(producttype.getUniverse().getId());
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
	 * @return the producttype
	 */
	public Producttype getProducttype() {
		return producttype;
	}

	/**
	 * @param producttype
	 *            the producttype to set
	 */
	public void setProducttype(Producttype producttype) {
		this.producttype = producttype;
	}

}
