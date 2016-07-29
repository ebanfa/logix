
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

import com.cloderia.helion.client.shared.model.Terminationreason;
import com.cloderia.helion.client.shared.ops.TerminationreasonOperation;
import com.cloderia.helion.client.shared.service.TerminationreasonService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class TerminationreasonServiceImpl extends BaseEntityServiceImpl<Terminationreason, TerminationreasonOperation> implements
		TerminationreasonService {


	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public TerminationreasonServiceImpl() {
		super(Terminationreason.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Terminationreason.ALL_TERMINATIONREASON_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Terminationreason.FIND_TERMINATIONREASON_BY_CODE_QUERY;
	}

	@Override
	public Terminationreason createOperation(TerminationreasonOperation terminationreasonOperation) {
		Terminationreason terminationreason = terminationreasonOperation.getTerminationreason();
		terminationreason.setRecSt("");
		terminationreason.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		terminationreason.setRowTs(new Date());
		terminationreason.setCreatedDt(new Date());
		terminationreason.setVersionNo(VERSIONING_ONE);
		terminationreason.setLastModifiedDt(new Date());
		terminationreason.setCreatedByUsr(DEFAULT_USER);
		terminationreason.setRecSt(ENTITY_STATUS_ACTIVE);
		terminationreason.setLastModifiedUsr(DEFAULT_USER);
		terminationreason = super.createOperation(terminationreasonOperation);
		return terminationreason;
	}
	
	@Override
	public Terminationreason updateOperation(TerminationreasonOperation terminationreasonOperation) {
		Terminationreason terminationreason = terminationreasonOperation.getTerminationreason();
		terminationreason.setUniverse(universeService.findById(terminationreasonOperation.getUniverseId()));
		terminationreason.setLastModifiedDt(new Date());
		terminationreason.setRecSt(ENTITY_STATUS_ACTIVE);
		terminationreason.setLastModifiedUsr(DEFAULT_USER);
		terminationreason = super.updateOperation(terminationreasonOperation);
		return terminationreason;
	}
}