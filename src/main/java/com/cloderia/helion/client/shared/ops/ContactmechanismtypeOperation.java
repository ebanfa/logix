/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Contactmechanismtype;

/**
 * @author adrian
 *
 */
@Portable
public class ContactmechanismtypeOperation  extends BaseOperation<Contactmechanismtype> {

	private Contactmechanismtype contactmechanismtype;
	private Long universeId;

	/**
	 * 
	 */
	public ContactmechanismtypeOperation() {
	}
	
	/**
	 * @param contactmechanismtype
	 */
	public ContactmechanismtypeOperation(Contactmechanismtype contactmechanismtype) {
		super();
		this.contactmechanismtype = contactmechanismtype;
		this.setEntity(contactmechanismtype);
		if(contactmechanismtype.getUniverse() != null)this.setUniverseId(contactmechanismtype.getUniverse().getId());
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
	 * @return the contactmechanismtype
	 */
	public Contactmechanismtype getContactmechanismtype() {
		return contactmechanismtype;
	}

	/**
	 * @param contactmechanismtype
	 *            the contactmechanismtype to set
	 */
	public void setContactmechanismtype(Contactmechanismtype contactmechanismtype) {
		this.contactmechanismtype = contactmechanismtype;
	}

}
