/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Paymenttype;

/**
 * @author adrian
 *
 */
@Portable
public class PaymenttypeOperation  extends BaseOperation<Paymenttype> {

	private Paymenttype paymenttype;
	private Long universeId;

	/**
	 * 
	 */
	public PaymenttypeOperation() {
	}
	
	/**
	 * @param paymenttype
	 */
	public PaymenttypeOperation(Paymenttype paymenttype) {
		super();
		this.paymenttype = paymenttype;
		this.setEntity(paymenttype);
		if(paymenttype.getUniverse() != null)this.setUniverseId(paymenttype.getUniverse().getId());
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
	 * @return the paymenttype
	 */
	public Paymenttype getPaymenttype() {
		return paymenttype;
	}

	/**
	 * @param paymenttype
	 *            the paymenttype to set
	 */
	public void setPaymenttype(Paymenttype paymenttype) {
		this.paymenttype = paymenttype;
	}

}
