
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

import com.cloderia.helion.client.shared.model.Partyrole;
import com.cloderia.helion.client.shared.ops.PartyroleOperation;
import com.cloderia.helion.client.shared.service.PartyService;
import com.cloderia.helion.client.shared.service.PartyroletypeService;
import com.cloderia.helion.client.shared.service.PartyroleService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class PartyroleServiceImpl extends BaseEntityServiceImpl<Partyrole, PartyroleOperation> implements
		PartyroleService {

	@Inject
	PartyService partyService;
	@Inject
	PartyroletypeService partyroletypeService;

	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public PartyroleServiceImpl() {
		super(Partyrole.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Partyrole.ALL_PARTYROLE_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Partyrole.FIND_PARTYROLE_BY_CODE_QUERY;
	}

	@Override
	public Partyrole createOperation(PartyroleOperation partyroleOperation) {
		Partyrole partyrole = partyroleOperation.getPartyrole();
		partyrole.setParty(partyService.findById(partyroleOperation.getPartyId()));
		partyrole.setPartyRoleTy(partyroletypeService.findById(partyroleOperation.getPartyRoleTyId()));
		partyrole.setRecSt("");
		partyrole.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		partyrole.setRowTs(new Date());
		partyrole.setCreatedDt(new Date());
		partyrole.setVersionNo(VERSIONING_ONE);
		partyrole.setLastModifiedDt(new Date());
		partyrole.setCreatedByUsr(DEFAULT_USER);
		partyrole.setRecSt(ENTITY_STATUS_ACTIVE);
		partyrole.setLastModifiedUsr(DEFAULT_USER);
		partyrole = super.createOperation(partyroleOperation);
		return partyrole;
	}
	
	@Override
	public Partyrole updateOperation(PartyroleOperation partyroleOperation) {
		Partyrole partyrole = partyroleOperation.getPartyrole();
		partyrole.setUniverse(universeService.findById(partyroleOperation.getUniverseId()));
		partyrole.setParty(partyService.findById(partyroleOperation.getPartyId()));
		partyrole.setPartyRoleTy(partyroletypeService.findById(partyroleOperation.getPartyRoleTyId()));
		partyrole.setLastModifiedDt(new Date());
		partyrole.setRecSt(ENTITY_STATUS_ACTIVE);
		partyrole.setLastModifiedUsr(DEFAULT_USER);
		partyrole = super.updateOperation(partyroleOperation);
		return partyrole;
	}
}