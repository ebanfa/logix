/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Accountingtransactiontype;

/**
 * @author adrian
 *
 */
@Portable
public class AccountingtransactiontypeOperation  extends BaseOperation<Accountingtransactiontype> {

	private Accountingtransactiontype accountingtransactiontype;
	private Long universeId;
	private Long parentTyId;

	/**
	 * 
	 */
	public AccountingtransactiontypeOperation() {
	}
	
	/**
	 * @param accountingtransactiontype
	 */
	public AccountingtransactiontypeOperation(Accountingtransactiontype accountingtransactiontype) {
		super();
		this.accountingtransactiontype = accountingtransactiontype;
		this.setEntity(accountingtransactiontype);
		if(accountingtransactiontype.getUniverse() != null)this.setUniverseId(accountingtransactiontype.getUniverse().getId());
		if(accountingtransactiontype.getParentTy() != null)this.setParentTyId(accountingtransactiontype.getParentTy().getId());
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
	 * @return the ParentTyId
	 */
	public Long getParentTyId() {
		return parentTyId;
	}

	/**
	 * @param parentTyId
	 *            the parentTyId to set
	 */
	public void setParentTyId(Long parentTyId) {
		this.parentTyId = parentTyId;
	}
	            

	/**
	 * @return the accountingtransactiontype
	 */
	public Accountingtransactiontype getAccountingtransactiontype() {
		return accountingtransactiontype;
	}

	/**
	 * @param accountingtransactiontype
	 *            the accountingtransactiontype to set
	 */
	public void setAccountingtransactiontype(Accountingtransactiontype accountingtransactiontype) {
		this.accountingtransactiontype = accountingtransactiontype;
	}

}
