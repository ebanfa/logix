/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Billingaccount;

/**
 * @author adrian
 *
 */
@Portable
public class BillingaccountOperation  extends BaseOperation<Billingaccount> {

	private Billingaccount billingaccount;
	private Long universeId;
	private Long toContMechId;

	/**
	 * 
	 */
	public BillingaccountOperation() {
	}
	
	/**
	 * @param billingaccount
	 */
	public BillingaccountOperation(Billingaccount billingaccount) {
		super();
		this.billingaccount = billingaccount;
		this.setEntity(billingaccount);
		if(billingaccount.getUniverse() != null)this.setUniverseId(billingaccount.getUniverse().getId());
		if(billingaccount.getToContMech() != null)this.setToContMechId(billingaccount.getToContMech().getId());
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
	 * @return the ToContMechId
	 */
	public Long getToContMechId() {
		return toContMechId;
	}

	/**
	 * @param toContMechId
	 *            the toContMechId to set
	 */
	public void setToContMechId(Long toContMechId) {
		this.toContMechId = toContMechId;
	}
	            

	/**
	 * @return the billingaccount
	 */
	public Billingaccount getBillingaccount() {
		return billingaccount;
	}

	/**
	 * @param billingaccount
	 *            the billingaccount to set
	 */
	public void setBillingaccount(Billingaccount billingaccount) {
		this.billingaccount = billingaccount;
	}

}
