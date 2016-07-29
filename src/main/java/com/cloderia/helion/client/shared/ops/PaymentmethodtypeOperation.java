/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Paymentmethodtype;

/**
 * @author adrian
 *
 */
@Portable
public class PaymentmethodtypeOperation  extends BaseOperation<Paymentmethodtype> {

	private Paymentmethodtype paymentmethodtype;
	private Long universeId;

	/**
	 * 
	 */
	public PaymentmethodtypeOperation() {
	}
	
	/**
	 * @param paymentmethodtype
	 */
	public PaymentmethodtypeOperation(Paymentmethodtype paymentmethodtype) {
		super();
		this.paymentmethodtype = paymentmethodtype;
		this.setEntity(paymentmethodtype);
		if(paymentmethodtype.getUniverse() != null)this.setUniverseId(paymentmethodtype.getUniverse().getId());
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
	 * @return the paymentmethodtype
	 */
	public Paymentmethodtype getPaymentmethodtype() {
		return paymentmethodtype;
	}

	/**
	 * @param paymentmethodtype
	 *            the paymentmethodtype to set
	 */
	public void setPaymentmethodtype(Paymentmethodtype paymentmethodtype) {
		this.paymentmethodtype = paymentmethodtype;
	}

}
