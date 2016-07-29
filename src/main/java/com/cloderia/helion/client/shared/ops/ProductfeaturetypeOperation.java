/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Productfeaturetype;

/**
 * @author adrian
 *
 */
@Portable
public class ProductfeaturetypeOperation  extends BaseOperation<Productfeaturetype> {

	private Productfeaturetype productfeaturetype;
	private Long universeId;

	/**
	 * 
	 */
	public ProductfeaturetypeOperation() {
	}
	
	/**
	 * @param productfeaturetype
	 */
	public ProductfeaturetypeOperation(Productfeaturetype productfeaturetype) {
		super();
		this.productfeaturetype = productfeaturetype;
		this.setEntity(productfeaturetype);
		if(productfeaturetype.getUniverse() != null)this.setUniverseId(productfeaturetype.getUniverse().getId());
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
	 * @return the productfeaturetype
	 */
	public Productfeaturetype getProductfeaturetype() {
		return productfeaturetype;
	}

	/**
	 * @param productfeaturetype
	 *            the productfeaturetype to set
	 */
	public void setProductfeaturetype(Productfeaturetype productfeaturetype) {
		this.productfeaturetype = productfeaturetype;
	}

}
