/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Person;

/**
 * @author adrian
 *
 */
@Portable
public class PersonOperation  extends BaseOperation<Person> {

	private Person person;
	private Long universeId;
	private Long partyId;

	/**
	 * 
	 */
	public PersonOperation() {
	}
	
	/**
	 * @param person
	 */
	public PersonOperation(Person person) {
		super();
		this.person = person;
		this.setEntity(person);
		if(person.getUniverse() != null)this.setUniverseId(person.getUniverse().getId());
		if(person.getParty() != null)this.setPartyId(person.getParty().getId());
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
	 * @return the PartyId
	 */
	public Long getPartyId() {
		return partyId;
	}

	/**
	 * @param partyId
	 *            the partyId to set
	 */
	public void setPartyId(Long partyId) {
		this.partyId = partyId;
	}
	            

	/**
	 * @return the person
	 */
	public Person getPerson() {
		return person;
	}

	/**
	 * @param person
	 *            the person to set
	 */
	public void setPerson(Person person) {
		this.person = person;
	}

}
