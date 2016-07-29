
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

import com.cloderia.helion.client.shared.model.Contactmechanismpurposetype;
import com.cloderia.helion.client.shared.ops.ContactmechanismpurposetypeOperation;
import com.cloderia.helion.client.shared.service.ContactmechanismpurposetypeService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class ContactmechanismpurposetypeServiceImpl extends BaseEntityServiceImpl<Contactmechanismpurposetype, ContactmechanismpurposetypeOperation> implements
		ContactmechanismpurposetypeService {


	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public ContactmechanismpurposetypeServiceImpl() {
		super(Contactmechanismpurposetype.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Contactmechanismpurposetype.ALL_CONTACTMECHANISMPURPOSETYPE_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Contactmechanismpurposetype.FIND_CONTACTMECHANISMPURPOSETYPE_BY_CODE_QUERY;
	}

	@Override
	public Contactmechanismpurposetype createOperation(ContactmechanismpurposetypeOperation contactmechanismpurposetypeOperation) {
		Contactmechanismpurposetype contactmechanismpurposetype = contactmechanismpurposetypeOperation.getContactmechanismpurposetype();
		contactmechanismpurposetype.setRecSt("");
		contactmechanismpurposetype.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		contactmechanismpurposetype.setRowTs(new Date());
		contactmechanismpurposetype.setCreatedDt(new Date());
		contactmechanismpurposetype.setVersionNo(VERSIONING_ONE);
		contactmechanismpurposetype.setLastModifiedDt(new Date());
		contactmechanismpurposetype.setCreatedByUsr(DEFAULT_USER);
		contactmechanismpurposetype.setRecSt(ENTITY_STATUS_ACTIVE);
		contactmechanismpurposetype.setLastModifiedUsr(DEFAULT_USER);
		contactmechanismpurposetype = super.createOperation(contactmechanismpurposetypeOperation);
		return contactmechanismpurposetype;
	}
	
	@Override
	public Contactmechanismpurposetype updateOperation(ContactmechanismpurposetypeOperation contactmechanismpurposetypeOperation) {
		Contactmechanismpurposetype contactmechanismpurposetype = contactmechanismpurposetypeOperation.getContactmechanismpurposetype();
		contactmechanismpurposetype.setUniverse(universeService.findById(contactmechanismpurposetypeOperation.getUniverseId()));
		contactmechanismpurposetype.setLastModifiedDt(new Date());
		contactmechanismpurposetype.setRecSt(ENTITY_STATUS_ACTIVE);
		contactmechanismpurposetype.setLastModifiedUsr(DEFAULT_USER);
		contactmechanismpurposetype = super.updateOperation(contactmechanismpurposetypeOperation);
		return contactmechanismpurposetype;
	}
}