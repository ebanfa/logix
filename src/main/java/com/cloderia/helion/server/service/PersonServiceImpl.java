
/**
 * 
 */
package com.cloderia.helion.server.service;

import static com.cloderia.helion.client.shared.Operation.OperationType.CREATE;
import static com.cloderia.helion.client.shared.Operation.OperationType.UPDATE;

import java.util.Date;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.enterprise.event.Event;
import javax.inject.Inject;

import com.cloderia.helion.client.shared.model.Person;
import com.cloderia.helion.client.shared.ops.PersonOperation;
import com.cloderia.helion.client.shared.service.PartyService;
import com.cloderia.helion.client.shared.service.PersonService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class PersonServiceImpl extends BaseEntityServiceImpl<Person, PersonOperation> implements
		PersonService {

	@Inject
	PartyService partyService;

	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public PersonServiceImpl() {
		super(Person.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Person.ALL_PERSON_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Person.FIND_PERSON_BY_CODE_QUERY;
	}

	@Override
	public Person createOperation(PersonOperation personOperation) {
		Person person = personOperation.getPerson();
		person.setParty(partyService.findById(personOperation.getPartyId()));
		person.setRecSt("");
		person.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		person.setRowTs(new Date());
		person.setCreatedDt(new Date());
		person.setVersionNo(VERSIONING_ONE);
		person.setLastModifiedDt(new Date());
		person.setCreatedByUsr(DEFAULT_USER);
		person.setRecSt(ENTITY_STATUS_ACTIVE);
		person.setLastModifiedUsr(DEFAULT_USER);
		person = super.createOperation(personOperation);
		return person;
	}
	
	@Override
	public Person updateOperation(PersonOperation personOperation) {
		Person person = personOperation.getPerson();
		person.setUniverse(universeService.findById(personOperation.getUniverseId()));
		person.setParty(partyService.findById(personOperation.getPartyId()));
		person.setLastModifiedDt(new Date());
		person.setRecSt(ENTITY_STATUS_ACTIVE);
		person.setLastModifiedUsr(DEFAULT_USER);
		person = super.updateOperation(personOperation);
		return person;
	}
}