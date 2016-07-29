/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Termtype;

/**
 * @author adrian
 *
 */
@Portable
public class TermtypeOperation  extends BaseOperation<Termtype> {

	private Termtype termtype;
	private Long universeId;

	/**
	 * 
	 */
	public TermtypeOperation() {
	}
	
	/**
	 * @param termtype
	 */
	public TermtypeOperation(Termtype termtype) {
		super();
		this.termtype = termtype;
		this.setEntity(termtype);
		if(termtype.getUniverse() != null)this.setUniverseId(termtype.getUniverse().getId());
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
	 * @return the termtype
	 */
	public Termtype getTermtype() {
		return termtype;
	}

	/**
	 * @param termtype
	 *            the termtype to set
	 */
	public void setTermtype(Termtype termtype) {
		this.termtype = termtype;
	}

}
