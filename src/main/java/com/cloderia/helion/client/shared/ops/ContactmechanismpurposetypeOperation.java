/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Contactmechanismpurposetype;

/**
 * @author adrian
 *
 */
@Portable
public class ContactmechanismpurposetypeOperation  extends BaseOperation<Contactmechanismpurposetype> {

	private Contactmechanismpurposetype contactmechanismpurposetype;
	private Long universeId;

	/**
	 * 
	 */
	public ContactmechanismpurposetypeOperation() {
	}
	
	/**
	 * @param contactmechanismpurposetype
	 */
	public ContactmechanismpurposetypeOperation(Contactmechanismpurposetype contactmechanismpurposetype) {
		super();
		this.contactmechanismpurposetype = contactmechanismpurposetype;
		this.setEntity(contactmechanismpurposetype);
		if(contactmechanismpurposetype.getUniverse() != null)this.setUniverseId(contactmechanismpurposetype.getUniverse().getId());
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
	 * @return the contactmechanismpurposetype
	 */
	public Contactmechanismpurposetype getContactmechanismpurposetype() {
		return contactmechanismpurposetype;
	}

	/**
	 * @param contactmechanismpurposetype
	 *            the contactmechanismpurposetype to set
	 */
	public void setContactmechanismpurposetype(Contactmechanismpurposetype contactmechanismpurposetype) {
		this.contactmechanismpurposetype = contactmechanismpurposetype;
	}

}
