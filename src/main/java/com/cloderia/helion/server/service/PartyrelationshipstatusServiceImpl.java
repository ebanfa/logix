
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

import com.cloderia.helion.client.shared.model.Partyrelationshipstatus;
import com.cloderia.helion.client.shared.ops.PartyrelationshipstatusOperation;
import com.cloderia.helion.client.shared.service.PartyrelationshipstatusService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class PartyrelationshipstatusServiceImpl extends BaseEntityServiceImpl<Partyrelationshipstatus, PartyrelationshipstatusOperation> implements
		PartyrelationshipstatusService {


	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public PartyrelationshipstatusServiceImpl() {
		super(Partyrelationshipstatus.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Partyrelationshipstatus.ALL_PARTYRELATIONSHIPSTATUS_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Partyrelationshipstatus.FIND_PARTYRELATIONSHIPSTATUS_BY_CODE_QUERY;
	}

	@Override
	public Partyrelationshipstatus createOperation(PartyrelationshipstatusOperation partyrelationshipstatusOperation) {
		Partyrelationshipstatus partyrelationshipstatus = partyrelationshipstatusOperation.getPartyrelationshipstatus();
		partyrelationshipstatus.setRecSt("");
		partyrelationshipstatus.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		partyrelationshipstatus.setRowTs(new Date());
		partyrelationshipstatus.setCreatedDt(new Date());
		partyrelationshipstatus.setVersionNo(VERSIONING_ONE);
		partyrelationshipstatus.setLastModifiedDt(new Date());
		partyrelationshipstatus.setCreatedByUsr(DEFAULT_USER);
		partyrelationshipstatus.setRecSt(ENTITY_STATUS_ACTIVE);
		partyrelationshipstatus.setLastModifiedUsr(DEFAULT_USER);
		partyrelationshipstatus = super.createOperation(partyrelationshipstatusOperation);
		return partyrelationshipstatus;
	}
	
	@Override
	public Partyrelationshipstatus updateOperation(PartyrelationshipstatusOperation partyrelationshipstatusOperation) {
		Partyrelationshipstatus partyrelationshipstatus = partyrelationshipstatusOperation.getPartyrelationshipstatus();
		partyrelationshipstatus.setUniverse(universeService.findById(partyrelationshipstatusOperation.getUniverseId()));
		partyrelationshipstatus.setLastModifiedDt(new Date());
		partyrelationshipstatus.setRecSt(ENTITY_STATUS_ACTIVE);
		partyrelationshipstatus.setLastModifiedUsr(DEFAULT_USER);
		partyrelationshipstatus = super.updateOperation(partyrelationshipstatusOperation);
		return partyrelationshipstatus;
	}
}