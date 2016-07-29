
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

import com.cloderia.helion.client.shared.model.Partyrelationship;
import com.cloderia.helion.client.shared.ops.PartyrelationshipOperation;
import com.cloderia.helion.client.shared.service.TerminationtypeService;
import com.cloderia.helion.client.shared.service.TerminationreasonService;
import com.cloderia.helion.client.shared.service.PartyroleService;
import com.cloderia.helion.client.shared.service.PartyrelationshiptypeService;
import com.cloderia.helion.client.shared.service.PartyrelationshipstatusService;
import com.cloderia.helion.client.shared.service.PartyrelationshipService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class PartyrelationshipServiceImpl extends BaseEntityServiceImpl<Partyrelationship, PartyrelationshipOperation> implements
		PartyrelationshipService {

	@Inject
	TerminationtypeService terminationtypeService;
	@Inject
	TerminationreasonService terminationreasonService;
	@Inject
	PartyroleService partyroleService;
	@Inject
	PartyrelationshiptypeService partyrelationshiptypeService;
	@Inject
	PartyrelationshipstatusService partyrelationshipstatusService;

	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public PartyrelationshipServiceImpl() {
		super(Partyrelationship.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Partyrelationship.ALL_PARTYRELATIONSHIP_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Partyrelationship.FIND_PARTYRELATIONSHIP_BY_CODE_QUERY;
	}

	@Override
	public Partyrelationship createOperation(PartyrelationshipOperation partyrelationshipOperation) {
		Partyrelationship partyrelationship = partyrelationshipOperation.getPartyrelationship();
		partyrelationship.setTermTy(terminationtypeService.findById(partyrelationshipOperation.getTermTyId()));
		partyrelationship.setTermReason(terminationreasonService.findById(partyrelationshipOperation.getTermReasonId()));
		partyrelationship.setFromPartyRole(partyroleService.findById(partyrelationshipOperation.getFromPartyRoleId()));
		partyrelationship.setToPartyRole(partyroleService.findById(partyrelationshipOperation.getToPartyRoleId()));
		partyrelationship.setPartyRel(partyrelationshiptypeService.findById(partyrelationshipOperation.getPartyRelId()));
		partyrelationship.setPartyRelStat(partyrelationshipstatusService.findById(partyrelationshipOperation.getPartyRelStatId()));
		partyrelationship.setRecSt("");
		partyrelationship.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		partyrelationship.setRowTs(new Date());
		partyrelationship.setCreatedDt(new Date());
		partyrelationship.setVersionNo(VERSIONING_ONE);
		partyrelationship.setLastModifiedDt(new Date());
		partyrelationship.setCreatedByUsr(DEFAULT_USER);
		partyrelationship.setRecSt(ENTITY_STATUS_ACTIVE);
		partyrelationship.setLastModifiedUsr(DEFAULT_USER);
		partyrelationship = super.createOperation(partyrelationshipOperation);
		return partyrelationship;
	}
	
	@Override
	public Partyrelationship updateOperation(PartyrelationshipOperation partyrelationshipOperation) {
		Partyrelationship partyrelationship = partyrelationshipOperation.getPartyrelationship();
		partyrelationship.setUniverse(universeService.findById(partyrelationshipOperation.getUniverseId()));
		partyrelationship.setTermTy(terminationtypeService.findById(partyrelationshipOperation.getTermTyId()));
		partyrelationship.setTermReason(terminationreasonService.findById(partyrelationshipOperation.getTermReasonId()));
		partyrelationship.setFromPartyRole(partyroleService.findById(partyrelationshipOperation.getFromPartyRoleId()));
		partyrelationship.setToPartyRole(partyroleService.findById(partyrelationshipOperation.getToPartyRoleId()));
		partyrelationship.setPartyRel(partyrelationshiptypeService.findById(partyrelationshipOperation.getPartyRelId()));
		partyrelationship.setPartyRelStat(partyrelationshipstatusService.findById(partyrelationshipOperation.getPartyRelStatId()));
		partyrelationship.setLastModifiedDt(new Date());
		partyrelationship.setRecSt(ENTITY_STATUS_ACTIVE);
		partyrelationship.setLastModifiedUsr(DEFAULT_USER);
		partyrelationship = super.updateOperation(partyrelationshipOperation);
		return partyrelationship;
	}
}