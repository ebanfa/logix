/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Terminationreason;

/**
 * @author adrian
 *
 */
@Portable
public class TerminationreasonOperation  extends BaseOperation<Terminationreason> {

	private Terminationreason terminationreason;
	private Long universeId;

	/**
	 * 
	 */
	public TerminationreasonOperation() {
	}
	
	/**
	 * @param terminationreason
	 */
	public TerminationreasonOperation(Terminationreason terminationreason) {
		super();
		this.terminationreason = terminationreason;
		this.setEntity(terminationreason);
		if(terminationreason.getUniverse() != null)this.setUniverseId(terminationreason.getUniverse().getId());
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
	 * @return the terminationreason
	 */
	public Terminationreason getTerminationreason() {
		return terminationreason;
	}

	/**
	 * @param terminationreason
	 *            the terminationreason to set
	 */
	public void setTerminationreason(Terminationreason terminationreason) {
		this.terminationreason = terminationreason;
	}

}
