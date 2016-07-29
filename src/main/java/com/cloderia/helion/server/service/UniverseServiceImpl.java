
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

import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.ops.UniverseOperation;
import com.cloderia.helion.client.shared.service.UniverseService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class UniverseServiceImpl extends BaseEntityServiceImpl<Universe, UniverseOperation> implements
		UniverseService {


	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public UniverseServiceImpl() {
		super(Universe.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Universe.ALL_UNIVERSE_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Universe.FIND_UNIVERSE_BY_CODE_QUERY;
	}

	@Override
	public Universe createOperation(UniverseOperation universeOperation) {
		Universe universe = universeOperation.getUniverse();
		universe.setRecSt("");
		universe.setRowTs(new Date());
		universe.setCreatedDt(new Date());
		universe.setVersionNo(VERSIONING_ONE);
		universe.setLastModifiedDt(new Date());
		universe.setCreatedByUsr(DEFAULT_USER);
		universe.setRecSt(ENTITY_STATUS_ACTIVE);
		universe.setLastModifiedUsr(DEFAULT_USER);
		universe = super.createOperation(universeOperation);
		return universe;
	}
	
	@Override
	public Universe updateOperation(UniverseOperation universeOperation) {
		Universe universe = universeOperation.getUniverse();
		universe.setParentUniverse(universeService.findById(universeOperation.getParentUniverseId()));
		universe.setLastModifiedDt(new Date());
		universe.setRecSt(ENTITY_STATUS_ACTIVE);
		universe.setLastModifiedUsr(DEFAULT_USER);
		universe = super.updateOperation(universeOperation);
		return universe;
	}
}