/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Fixedassettype;

/**
 * @author adrian
 *
 */
@Portable
public class FixedassettypeOperation  extends BaseOperation<Fixedassettype> {

	private Fixedassettype fixedassettype;
	private Long universeId;
	private Long parentTyId;

	/**
	 * 
	 */
	public FixedassettypeOperation() {
	}
	
	/**
	 * @param fixedassettype
	 */
	public FixedassettypeOperation(Fixedassettype fixedassettype) {
		super();
		this.fixedassettype = fixedassettype;
		this.setEntity(fixedassettype);
		if(fixedassettype.getUniverse() != null)this.setUniverseId(fixedassettype.getUniverse().getId());
		if(fixedassettype.getParentTy() != null)this.setParentTyId(fixedassettype.getParentTy().getId());
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
	 * @return the fixedassettype
	 */
	public Fixedassettype getFixedassettype() {
		return fixedassettype;
	}

	/**
	 * @param fixedassettype
	 *            the fixedassettype to set
	 */
	public void setFixedassettype(Fixedassettype fixedassettype) {
		this.fixedassettype = fixedassettype;
	}

}
