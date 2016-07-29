/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Accountingtransactiondetail;

/**
 * @author adrian
 *
 */
@Portable
public class AccountingtransactiondetailOperation  extends BaseOperation<Accountingtransactiondetail> {

	private Accountingtransactiondetail accountingtransactiondetail;
	private Long universeId;
	private Long transactionId;
	private Long associatedDetailId;

	/**
	 * 
	 */
	public AccountingtransactiondetailOperation() {
	}
	
	/**
	 * @param accountingtransactiondetail
	 */
	public AccountingtransactiondetailOperation(Accountingtransactiondetail accountingtransactiondetail) {
		super();
		this.accountingtransactiondetail = accountingtransactiondetail;
		this.setEntity(accountingtransactiondetail);
		if(accountingtransactiondetail.getUniverse() != null)this.setUniverseId(accountingtransactiondetail.getUniverse().getId());
		if(accountingtransactiondetail.getTransaction() != null)this.setTransactionId(accountingtransactiondetail.getTransaction().getId());
		if(accountingtransactiondetail.getAssociatedDetail() != null)this.setAssociatedDetailId(accountingtransactiondetail.getAssociatedDetail().getId());
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
	 * @return the TransactionId
	 */
	public Long getTransactionId() {
		return transactionId;
	}

	/**
	 * @param transactionId
	 *            the transactionId to set
	 */
	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}
	            
	/**
	 * @return the AssociatedDetailId
	 */
	public Long getAssociatedDetailId() {
		return associatedDetailId;
	}

	/**
	 * @param associatedDetailId
	 *            the associatedDetailId to set
	 */
	public void setAssociatedDetailId(Long associatedDetailId) {
		this.associatedDetailId = associatedDetailId;
	}
	            

	/**
	 * @return the accountingtransactiondetail
	 */
	public Accountingtransactiondetail getAccountingtransactiondetail() {
		return accountingtransactiondetail;
	}

	/**
	 * @param accountingtransactiondetail
	 *            the accountingtransactiondetail to set
	 */
	public void setAccountingtransactiondetail(Accountingtransactiondetail accountingtransactiondetail) {
		this.accountingtransactiondetail = accountingtransactiondetail;
	}

}
