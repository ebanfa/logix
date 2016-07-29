/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Organizationgeneralledgeraccount;

/**
 * @author adrian
 *
 */
@Portable
public class OrganizationgeneralledgeraccountOperation  extends BaseOperation<Organizationgeneralledgeraccount> {

	private Organizationgeneralledgeraccount organizationgeneralledgeraccount;
	private Long universeId;
	private Long organizationId;
	private Long productCatId;
	private Long glAccountId;
	private Long productId;
	private Long refPartyId;

	/**
	 * 
	 */
	public OrganizationgeneralledgeraccountOperation() {
	}
	
	/**
	 * @param organizationgeneralledgeraccount
	 */
	public OrganizationgeneralledgeraccountOperation(Organizationgeneralledgeraccount organizationgeneralledgeraccount) {
		super();
		this.organizationgeneralledgeraccount = organizationgeneralledgeraccount;
		this.setEntity(organizationgeneralledgeraccount);
		if(organizationgeneralledgeraccount.getUniverse() != null)this.setUniverseId(organizationgeneralledgeraccount.getUniverse().getId());
		if(organizationgeneralledgeraccount.getOrganization() != null)this.setOrganizationId(organizationgeneralledgeraccount.getOrganization().getId());
		if(organizationgeneralledgeraccount.getProductCat() != null)this.setProductCatId(organizationgeneralledgeraccount.getProductCat().getId());
		if(organizationgeneralledgeraccount.getGlAccount() != null)this.setGlAccountId(organizationgeneralledgeraccount.getGlAccount().getId());
		if(organizationgeneralledgeraccount.getProduct() != null)this.setProductId(organizationgeneralledgeraccount.getProduct().getId());
		if(organizationgeneralledgeraccount.getRefParty() != null)this.setRefPartyId(organizationgeneralledgeraccount.getRefParty().getId());
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
	 * @return the OrganizationId
	 */
	public Long getOrganizationId() {
		return organizationId;
	}

	/**
	 * @param organizationId
	 *            the organizationId to set
	 */
	public void setOrganizationId(Long organizationId) {
		this.organizationId = organizationId;
	}
	            
	/**
	 * @return the ProductCatId
	 */
	public Long getProductCatId() {
		return productCatId;
	}

	/**
	 * @param productCatId
	 *            the productCatId to set
	 */
	public void setProductCatId(Long productCatId) {
		this.productCatId = productCatId;
	}
	            
	/**
	 * @return the GlAccountId
	 */
	public Long getGlAccountId() {
		return glAccountId;
	}

	/**
	 * @param glAccountId
	 *            the glAccountId to set
	 */
	public void setGlAccountId(Long glAccountId) {
		this.glAccountId = glAccountId;
	}
	            
	/**
	 * @return the ProductId
	 */
	public Long getProductId() {
		return productId;
	}

	/**
	 * @param productId
	 *            the productId to set
	 */
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	            
	/**
	 * @return the RefPartyId
	 */
	public Long getRefPartyId() {
		return refPartyId;
	}

	/**
	 * @param refPartyId
	 *            the refPartyId to set
	 */
	public void setRefPartyId(Long refPartyId) {
		this.refPartyId = refPartyId;
	}
	            

	/**
	 * @return the organizationgeneralledgeraccount
	 */
	public Organizationgeneralledgeraccount getOrganizationgeneralledgeraccount() {
		return organizationgeneralledgeraccount;
	}

	/**
	 * @param organizationgeneralledgeraccount
	 *            the organizationgeneralledgeraccount to set
	 */
	public void setOrganizationgeneralledgeraccount(Organizationgeneralledgeraccount organizationgeneralledgeraccount) {
		this.organizationgeneralledgeraccount = organizationgeneralledgeraccount;
	}

}
