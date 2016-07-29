/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Productfeaturecategory;

/**
 * @author adrian
 *
 */
@Portable
public class ProductfeaturecategoryOperation  extends BaseOperation<Productfeaturecategory> {

	private Productfeaturecategory productfeaturecategory;
	private Long universeId;

	/**
	 * 
	 */
	public ProductfeaturecategoryOperation() {
	}
	
	/**
	 * @param productfeaturecategory
	 */
	public ProductfeaturecategoryOperation(Productfeaturecategory productfeaturecategory) {
		super();
		this.productfeaturecategory = productfeaturecategory;
		this.setEntity(productfeaturecategory);
		if(productfeaturecategory.getUniverse() != null)this.setUniverseId(productfeaturecategory.getUniverse().getId());
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
	 * @return the productfeaturecategory
	 */
	public Productfeaturecategory getProductfeaturecategory() {
		return productfeaturecategory;
	}

	/**
	 * @param productfeaturecategory
	 *            the productfeaturecategory to set
	 */
	public void setProductfeaturecategory(Productfeaturecategory productfeaturecategory) {
		this.productfeaturecategory = productfeaturecategory;
	}

}
