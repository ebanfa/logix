/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Accountingtransaction;

/**
 * @author adrian
 *
 */
@Portable
public class AccountingtransactionOperation  extends BaseOperation<Accountingtransaction> {

	private Accountingtransaction accountingtransaction;
	private Long universeId;
	private Long transactionTyId;
	private Long partyRoleId;
	private Long fromPartyId;
	private Long toPartyId;
	private Long invoiceId;
	private Long paymentId;
	private Long fixedAssetId;

	/**
	 * 
	 */
	public AccountingtransactionOperation() {
	}
	
	/**
	 * @param accountingtransaction
	 */
	public AccountingtransactionOperation(Accountingtransaction accountingtransaction) {
		super();
		this.accountingtransaction = accountingtransaction;
		this.setEntity(accountingtransaction);
		if(accountingtransaction.getUniverse() != null)this.setUniverseId(accountingtransaction.getUniverse().getId());
		if(accountingtransaction.getTransactionTy() != null)this.setTransactionTyId(accountingtransaction.getTransactionTy().getId());
		if(accountingtransaction.getPartyRole() != null)this.setPartyRoleId(accountingtransaction.getPartyRole().getId());
		if(accountingtransaction.getFromParty() != null)this.setFromPartyId(accountingtransaction.getFromParty().getId());
		if(accountingtransaction.getToParty() != null)this.setToPartyId(accountingtransaction.getToParty().getId());
		if(accountingtransaction.getInvoice() != null)this.setInvoiceId(accountingtransaction.getInvoice().getId());
		if(accountingtransaction.getPayment() != null)this.setPaymentId(accountingtransaction.getPayment().getId());
		if(accountingtransaction.getFixedAsset() != null)this.setFixedAssetId(accountingtransaction.getFixedAsset().getId());
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
	 * @return the TransactionTyId
	 */
	public Long getTransactionTyId() {
		return transactionTyId;
	}

	/**
	 * @param transactionTyId
	 *            the transactionTyId to set
	 */
	public void setTransactionTyId(Long transactionTyId) {
		this.transactionTyId = transactionTyId;
	}
	            
	/**
	 * @return the PartyRoleId
	 */
	public Long getPartyRoleId() {
		return partyRoleId;
	}

	/**
	 * @param partyRoleId
	 *            the partyRoleId to set
	 */
	public void setPartyRoleId(Long partyRoleId) {
		this.partyRoleId = partyRoleId;
	}
	            
	/**
	 * @return the FromPartyId
	 */
	public Long getFromPartyId() {
		return fromPartyId;
	}

	/**
	 * @param fromPartyId
	 *            the fromPartyId to set
	 */
	public void setFromPartyId(Long fromPartyId) {
		this.fromPartyId = fromPartyId;
	}
	            
	/**
	 * @return the ToPartyId
	 */
	public Long getToPartyId() {
		return toPartyId;
	}

	/**
	 * @param toPartyId
	 *            the toPartyId to set
	 */
	public void setToPartyId(Long toPartyId) {
		this.toPartyId = toPartyId;
	}
	            
	/**
	 * @return the InvoiceId
	 */
	public Long getInvoiceId() {
		return invoiceId;
	}

	/**
	 * @param invoiceId
	 *            the invoiceId to set
	 */
	public void setInvoiceId(Long invoiceId) {
		this.invoiceId = invoiceId;
	}
	            
	/**
	 * @return the PaymentId
	 */
	public Long getPaymentId() {
		return paymentId;
	}

	/**
	 * @param paymentId
	 *            the paymentId to set
	 */
	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}
	            
	/**
	 * @return the FixedAssetId
	 */
	public Long getFixedAssetId() {
		return fixedAssetId;
	}

	/**
	 * @param fixedAssetId
	 *            the fixedAssetId to set
	 */
	public void setFixedAssetId(Long fixedAssetId) {
		this.fixedAssetId = fixedAssetId;
	}
	            

	/**
	 * @return the accountingtransaction
	 */
	public Accountingtransaction getAccountingtransaction() {
		return accountingtransaction;
	}

	/**
	 * @param accountingtransaction
	 *            the accountingtransaction to set
	 */
	public void setAccountingtransaction(Accountingtransaction accountingtransaction) {
		this.accountingtransaction = accountingtransaction;
	}

}
