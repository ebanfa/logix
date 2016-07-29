/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Documenttype;

/**
 * @author adrian
 *
 */
@Portable
public class DocumenttypeOperation  extends BaseOperation<Documenttype> {

	private Documenttype documenttype;
	private Long universeId;
	private Long parentTyId;

	/**
	 * 
	 */
	public DocumenttypeOperation() {
	}
	
	/**
	 * @param documenttype
	 */
	public DocumenttypeOperation(Documenttype documenttype) {
		super();
		this.documenttype = documenttype;
		this.setEntity(documenttype);
		if(documenttype.getUniverse() != null)this.setUniverseId(documenttype.getUniverse().getId());
		if(documenttype.getParentTy() != null)this.setParentTyId(documenttype.getParentTy().getId());
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
	 * @return the documenttype
	 */
	public Documenttype getDocumenttype() {
		return documenttype;
	}

	/**
	 * @param documenttype
	 *            the documenttype to set
	 */
	public void setDocumenttype(Documenttype documenttype) {
		this.documenttype = documenttype;
	}

}
