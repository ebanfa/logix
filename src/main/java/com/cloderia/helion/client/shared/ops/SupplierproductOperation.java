/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Supplierproduct;

/**
 * @author adrian
 *
 */
@Portable
public class SupplierproductOperation  extends BaseOperation<Supplierproduct> {

	private Supplierproduct supplierproduct;
	private Long universeId;
	private Long prodId;
	private Long prefId;
	private Long ratingId;
	private Long supplierId;

	/**
	 * 
	 */
	public SupplierproductOperation() {
	}
	
	/**
	 * @param supplierproduct
	 */
	public SupplierproductOperation(Supplierproduct supplierproduct) {
		super();
		this.supplierproduct = supplierproduct;
		this.setEntity(supplierproduct);
		if(supplierproduct.getUniverse() != null)this.setUniverseId(supplierproduct.getUniverse().getId());
		if(supplierproduct.getProd() != null)this.setProdId(supplierproduct.getProd().getId());
		if(supplierproduct.getPref() != null)this.setPrefId(supplierproduct.getPref().getId());
		if(supplierproduct.getRating() != null)this.setRatingId(supplierproduct.getRating().getId());
		if(supplierproduct.getSupplier() != null)this.setSupplierId(supplierproduct.getSupplier().getId());
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
	 * @return the ProdId
	 */
	public Long getProdId() {
		return prodId;
	}

	/**
	 * @param prodId
	 *            the prodId to set
	 */
	public void setProdId(Long prodId) {
		this.prodId = prodId;
	}
	            
	/**
	 * @return the PrefId
	 */
	public Long getPrefId() {
		return prefId;
	}

	/**
	 * @param prefId
	 *            the prefId to set
	 */
	public void setPrefId(Long prefId) {
		this.prefId = prefId;
	}
	            
	/**
	 * @return the RatingId
	 */
	public Long getRatingId() {
		return ratingId;
	}

	/**
	 * @param ratingId
	 *            the ratingId to set
	 */
	public void setRatingId(Long ratingId) {
		this.ratingId = ratingId;
	}
	            
	/**
	 * @return the SupplierId
	 */
	public Long getSupplierId() {
		return supplierId;
	}

	/**
	 * @param supplierId
	 *            the supplierId to set
	 */
	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}
	            

	/**
	 * @return the supplierproduct
	 */
	public Supplierproduct getSupplierproduct() {
		return supplierproduct;
	}

	/**
	 * @param supplierproduct
	 *            the supplierproduct to set
	 */
	public void setSupplierproduct(Supplierproduct supplierproduct) {
		this.supplierproduct = supplierproduct;
	}

}
