/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Glbudgetxref;

/**
 * @author adrian
 *
 */
@Portable
public class GlbudgetxrefOperation  extends BaseOperation<Glbudgetxref> {

	private Glbudgetxref glbudgetxref;
	private Long universeId;
	private Long budgetItemTyId;
	private Long glAccountId;

	/**
	 * 
	 */
	public GlbudgetxrefOperation() {
	}
	
	/**
	 * @param glbudgetxref
	 */
	public GlbudgetxrefOperation(Glbudgetxref glbudgetxref) {
		super();
		this.glbudgetxref = glbudgetxref;
		this.setEntity(glbudgetxref);
		if(glbudgetxref.getUniverse() != null)this.setUniverseId(glbudgetxref.getUniverse().getId());
		if(glbudgetxref.getBudgetItemTy() != null)this.setBudgetItemTyId(glbudgetxref.getBudgetItemTy().getId());
		if(glbudgetxref.getGlAccount() != null)this.setGlAccountId(glbudgetxref.getGlAccount().getId());
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
	 * @return the BudgetItemTyId
	 */
	public Long getBudgetItemTyId() {
		return budgetItemTyId;
	}

	/**
	 * @param budgetItemTyId
	 *            the budgetItemTyId to set
	 */
	public void setBudgetItemTyId(Long budgetItemTyId) {
		this.budgetItemTyId = budgetItemTyId;
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
	 * @return the glbudgetxref
	 */
	public Glbudgetxref getGlbudgetxref() {
		return glbudgetxref;
	}

	/**
	 * @param glbudgetxref
	 *            the glbudgetxref to set
	 */
	public void setGlbudgetxref(Glbudgetxref glbudgetxref) {
		this.glbudgetxref = glbudgetxref;
	}

}
