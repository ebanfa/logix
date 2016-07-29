
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

import com.cloderia.helion.client.shared.model.Contactmechanismtype;
import com.cloderia.helion.client.shared.ops.ContactmechanismtypeOperation;
import com.cloderia.helion.client.shared.service.ContactmechanismtypeService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class ContactmechanismtypeServiceImpl extends BaseEntityServiceImpl<Contactmechanismtype, ContactmechanismtypeOperation> implements
		ContactmechanismtypeService {


	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public ContactmechanismtypeServiceImpl() {
		super(Contactmechanismtype.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Contactmechanismtype.ALL_CONTACTMECHANISMTYPE_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Contactmechanismtype.FIND_CONTACTMECHANISMTYPE_BY_CODE_QUERY;
	}

	@Override
	public Contactmechanismtype createOperation(ContactmechanismtypeOperation contactmechanismtypeOperation) {
		Contactmechanismtype contactmechanismtype = contactmechanismtypeOperation.getContactmechanismtype();
		contactmechanismtype.setRecSt("");
		contactmechanismtype.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		contactmechanismtype.setRowTs(new Date());
		contactmechanismtype.setCreatedDt(new Date());
		contactmechanismtype.setVersionNo(VERSIONING_ONE);
		contactmechanismtype.setLastModifiedDt(new Date());
		contactmechanismtype.setCreatedByUsr(DEFAULT_USER);
		contactmechanismtype.setRecSt(ENTITY_STATUS_ACTIVE);
		contactmechanismtype.setLastModifiedUsr(DEFAULT_USER);
		contactmechanismtype = super.createOperation(contactmechanismtypeOperation);
		return contactmechanismtype;
	}
	
	@Override
	public Contactmechanismtype updateOperation(ContactmechanismtypeOperation contactmechanismtypeOperation) {
		Contactmechanismtype contactmechanismtype = contactmechanismtypeOperation.getContactmechanismtype();
		contactmechanismtype.setUniverse(universeService.findById(contactmechanismtypeOperation.getUniverseId()));
		contactmechanismtype.setLastModifiedDt(new Date());
		contactmechanismtype.setRecSt(ENTITY_STATUS_ACTIVE);
		contactmechanismtype.setLastModifiedUsr(DEFAULT_USER);
		contactmechanismtype = super.updateOperation(contactmechanismtypeOperation);
		return contactmechanismtype;
	}
}