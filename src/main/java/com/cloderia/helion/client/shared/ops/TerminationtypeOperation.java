/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Terminationtype;

/**
 * @author adrian
 *
 */
@Portable
public class TerminationtypeOperation  extends BaseOperation<Terminationtype> {

	private Terminationtype terminationtype;
	private Long universeId;

	/**
	 * 
	 */
	public TerminationtypeOperation() {
	}
	
	/**
	 * @param terminationtype
	 */
	public TerminationtypeOperation(Terminationtype terminationtype) {
		super();
		this.terminationtype = terminationtype;
		this.setEntity(terminationtype);
		if(terminationtype.getUniverse() != null)this.setUniverseId(terminationtype.getUniverse().getId());
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
	 * @return the terminationtype
	 */
	public Terminationtype getTerminationtype() {
		return terminationtype;
	}

	/**
	 * @param terminationtype
	 *            the terminationtype to set
	 */
	public void setTerminationtype(Terminationtype terminationtype) {
		this.terminationtype = terminationtype;
	}

}
