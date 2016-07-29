/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Productfeature;

/**
 * @author adrian
 *
 */
@Portable
public class ProductfeatureOperation  extends BaseOperation<Productfeature> {

	private Productfeature productfeature;
	private Long universeId;
	private Long prodFeatTyId;
	private Long prodFeatCatId;
	private Long uomId;

	/**
	 * 
	 */
	public ProductfeatureOperation() {
	}
	
	/**
	 * @param productfeature
	 */
	public ProductfeatureOperation(Productfeature productfeature) {
		super();
		this.productfeature = productfeature;
		this.setEntity(productfeature);
		if(productfeature.getUniverse() != null)this.setUniverseId(productfeature.getUniverse().getId());
		if(productfeature.getProdFeatTy() != null)this.setProdFeatTyId(productfeature.getProdFeatTy().getId());
		if(productfeature.getProdFeatCat() != null)this.setProdFeatCatId(productfeature.getProdFeatCat().getId());
		if(productfeature.getUom() != null)this.setUomId(productfeature.getUom().getId());
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
	 * @return the ProdFeatTyId
	 */
	public Long getProdFeatTyId() {
		return prodFeatTyId;
	}

	/**
	 * @param prodFeatTyId
	 *            the prodFeatTyId to set
	 */
	public void setProdFeatTyId(Long prodFeatTyId) {
		this.prodFeatTyId = prodFeatTyId;
	}
	            
	/**
	 * @return the ProdFeatCatId
	 */
	public Long getProdFeatCatId() {
		return prodFeatCatId;
	}

	/**
	 * @param prodFeatCatId
	 *            the prodFeatCatId to set
	 */
	public void setProdFeatCatId(Long prodFeatCatId) {
		this.prodFeatCatId = prodFeatCatId;
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
	 * @return the productfeature
	 */
	public Productfeature getProductfeature() {
		return productfeature;
	}

	/**
	 * @param productfeature
	 *            the productfeature to set
	 */
	public void setProductfeature(Productfeature productfeature) {
		this.productfeature = productfeature;
	}

}
