/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Product;

/**
 * @author adrian
 *
 */
@Portable
public class ProductOperation  extends BaseOperation<Product> {

	private Product product;
	private Long universeId;
	private Long uomId;
	private Long prodTyId;
	private Long manufacturerId;

	/**
	 * 
	 */
	public ProductOperation() {
	}
	
	/**
	 * @param product
	 */
	public ProductOperation(Product product) {
		super();
		this.product = product;
		this.setEntity(product);
		if(product.getUniverse() != null)this.setUniverseId(product.getUniverse().getId());
		if(product.getUom() != null)this.setUomId(product.getUom().getId());
		if(product.getProdTy() != null)this.setProdTyId(product.getProdTy().getId());
		if(product.getManufacturer() != null)this.setManufacturerId(product.getManufacturer().getId());
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
	 * @return the UomId
	 */
	public Long getUomId() {
		return uomId;
	}

	/**
	 * @param uomId
	 *            the uomId to set
	 */
	public void setUomId(Long uomId) {
		this.uomId = uomId;
	}
	            
	/**
	 * @return the ProdTyId
	 */
	public Long getProdTyId() {
		return prodTyId;
	}

	/**
	 * @param prodTyId
	 *            the prodTyId to set
	 */
	public void setProdTyId(Long prodTyId) {
		this.prodTyId = prodTyId;
	}
	            
	/**
	 * @return the ManufacturerId
	 */
	public Long getManufacturerId() {
		return manufacturerId;
	}

	/**
	 * @param manufacturerId
	 *            the manufacturerId to set
	 */
	public void setManufacturerId(Long manufacturerId) {
		this.manufacturerId = manufacturerId;
	}
	            

	/**
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * @param product
	 *            the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}

}
