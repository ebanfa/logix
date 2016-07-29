/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Contactmechanism;

/**
 * @author adrian
 *
 */
@Portable
public class ContactmechanismOperation  extends BaseOperation<Contactmechanism> {

	private Contactmechanism contactmechanism;
	private Long universeId;
	private Long contMechTyId;

	/**
	 * 
	 */
	public ContactmechanismOperation() {
	}
	
	/**
	 * @param contactmechanism
	 */
	public ContactmechanismOperation(Contactmechanism contactmechanism) {
		super();
		this.contactmechanism = contactmechanism;
		this.setEntity(contactmechanism);
		if(contactmechanism.getUniverse() != null)this.setUniverseId(contactmechanism.getUniverse().getId());
		if(contactmechanism.getContMechTy() != null)this.setContMechTyId(contactmechanism.getContMechTy().getId());
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
	 * @return the ContMechTyId
	 */
	public Long getContMechTyId() {
		return contMechTyId;
	}

	/**
	 * @param contMechTyId
	 *            the contMechTyId to set
	 */
	public void setContMechTyId(Long contMechTyId) {
		this.contMechTyId = contMechTyId;
	}
	            

	/**
	 * @return the contactmechanism
	 */
	public Contactmechanism getContactmechanism() {
		return contactmechanism;
	}

	/**
	 * @param contactmechanism
	 *            the contactmechanism to set
	 */
	public void setContactmechanism(Contactmechanism contactmechanism) {
		this.contactmechanism = contactmechanism;
	}

}
