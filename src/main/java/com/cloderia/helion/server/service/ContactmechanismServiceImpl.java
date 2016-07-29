
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

import com.cloderia.helion.client.shared.model.Contactmechanism;
import com.cloderia.helion.client.shared.ops.ContactmechanismOperation;
import com.cloderia.helion.client.shared.service.ContactmechanismtypeService;
import com.cloderia.helion.client.shared.service.ContactmechanismService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class ContactmechanismServiceImpl extends BaseEntityServiceImpl<Contactmechanism, ContactmechanismOperation> implements
		ContactmechanismService {

	@Inject
	ContactmechanismtypeService contactmechanismtypeService;

	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public ContactmechanismServiceImpl() {
		super(Contactmechanism.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Contactmechanism.ALL_CONTACTMECHANISM_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Contactmechanism.FIND_CONTACTMECHANISM_BY_CODE_QUERY;
	}

	@Override
	public Contactmechanism createOperation(ContactmechanismOperation contactmechanismOperation) {
		Contactmechanism contactmechanism = contactmechanismOperation.getContactmechanism();
		contactmechanism.setContMechTy(contactmechanismtypeService.findById(contactmechanismOperation.getContMechTyId()));
		contactmechanism.setRecSt("");
		contactmechanism.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		contactmechanism.setRowTs(new Date());
		contactmechanism.setCreatedDt(new Date());
		contactmechanism.setVersionNo(VERSIONING_ONE);
		contactmechanism.setLastModifiedDt(new Date());
		contactmechanism.setCreatedByUsr(DEFAULT_USER);
		contactmechanism.setRecSt(ENTITY_STATUS_ACTIVE);
		contactmechanism.setLastModifiedUsr(DEFAULT_USER);
		contactmechanism = super.createOperation(contactmechanismOperation);
		return contactmechanism;
	}
	
	@Override
	public Contactmechanism updateOperation(ContactmechanismOperation contactmechanismOperation) {
		Contactmechanism contactmechanism = contactmechanismOperation.getContactmechanism();
		contactmechanism.setUniverse(universeService.findById(contactmechanismOperation.getUniverseId()));
		contactmechanism.setContMechTy(contactmechanismtypeService.findById(contactmechanismOperation.getContMechTyId()));
		contactmechanism.setLastModifiedDt(new Date());
		contactmechanism.setRecSt(ENTITY_STATUS_ACTIVE);
		contactmechanism.setLastModifiedUsr(DEFAULT_USER);
		contactmechanism = super.updateOperation(contactmechanismOperation);
		return contactmechanism;
	}
}