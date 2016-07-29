/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Productcategory;

/**
 * @author adrian
 *
 */
@Portable
public class ProductcategoryOperation  extends BaseOperation<Productcategory> {

	private Productcategory productcategory;
	private Long universeId;
	private Long prodCatTyId;

	/**
	 * 
	 */
	public ProductcategoryOperation() {
	}
	
	/**
	 * @param productcategory
	 */
	public ProductcategoryOperation(Productcategory productcategory) {
		super();
		this.productcategory = productcategory;
		this.setEntity(productcategory);
		if(productcategory.getUniverse() != null)this.setUniverseId(productcategory.getUniverse().getId());
		if(productcategory.getProdCatTy() != null)this.setProdCatTyId(productcategory.getProdCatTy().getId());
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
	 * @return the ProdCatTyId
	 */
	public Long getProdCatTyId() {
		return prodCatTyId;
	}

	/**
	 * @param prodCatTyId
	 *            the prodCatTyId to set
	 */
	public void setProdCatTyId(Long prodCatTyId) {
		this.prodCatTyId = prodCatTyId;
	}
	            

	/**
	 * @return the productcategory
	 */
	public Productcategory getProductcategory() {
		return productcategory;
	}

	/**
	 * @param productcategory
	 *            the productcategory to set
	 */
	public void setProductcategory(Productcategory productcategory) {
		this.productcategory = productcategory;
	}

}
