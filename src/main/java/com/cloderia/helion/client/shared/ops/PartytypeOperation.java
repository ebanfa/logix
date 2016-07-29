/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Partytype;

/**
 * @author adrian
 *
 */
@Portable
public class PartytypeOperation  extends BaseOperation<Partytype> {

	private Partytype partytype;
	private Long universeId;
	private Long parentCategoryId;
	private Long parentTypeId;

	/**
	 * 
	 */
	public PartytypeOperation() {
	}
	
	/**
	 * @param partytype
	 */
	public PartytypeOperation(Partytype partytype) {
		super();
		this.partytype = partytype;
		this.setEntity(partytype);
		if(partytype.getUniverse() != null)this.setUniverseId(partytype.getUniverse().getId());
		if(partytype.getParentCategory() != null)this.setParentCategoryId(partytype.getParentCategory().getId());
		if(partytype.getParentType() != null)this.setParentTypeId(partytype.getParentType().getId());
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
	 * @return the ParentCategoryId
	 */
	public Long getParentCategoryId() {
		return parentCategoryId;
	}

	/**
	 * @param parentCategoryId
	 *            the parentCategoryId to set
	 */
	public void setParentCategoryId(Long parentCategoryId) {
		this.parentCategoryId = parentCategoryId;
	}
	            
	/**
	 * @return the ParentTypeId
	 */
	public Long getParentTypeId() {
		return parentTypeId;
	}

	/**
	 * @param parentTypeId
	 *            the parentTypeId to set
	 */
	public void setParentTypeId(Long parentTypeId) {
		this.parentTypeId = parentTypeId;
	}
	            

	/**
	 * @return the partytype
	 */
	public Partytype getPartytype() {
		return partytype;
	}

	/**
	 * @param partytype
	 *            the partytype to set
	 */
	public void setPartytype(Partytype partytype) {
		this.partytype = partytype;
	}

}
