
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

import com.cloderia.helion.client.shared.model.Partyroletype;
import com.cloderia.helion.client.shared.ops.PartyroletypeOperation;
import com.cloderia.helion.client.shared.service.PartyroletypeService;
import com.cloderia.helion.client.shared.service.PartyroletypeService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class PartyroletypeServiceImpl extends BaseEntityServiceImpl<Partyroletype, PartyroletypeOperation> implements
		PartyroletypeService {

	@Inject
	PartyroletypeService partyroletypeService;

	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public PartyroletypeServiceImpl() {
		super(Partyroletype.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Partyroletype.ALL_PARTYROLETYPE_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Partyroletype.FIND_PARTYROLETYPE_BY_CODE_QUERY;
	}

	@Override
	public Partyroletype createOperation(PartyroletypeOperation partyroletypeOperation) {
		Partyroletype partyroletype = partyroletypeOperation.getPartyroletype();
		partyroletype.setParentRoleTy(partyroletypeService.findById(partyroletypeOperation.getParentRoleTyId()));
		partyroletype.setRecSt("");
		partyroletype.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		partyroletype.setRowTs(new Date());
		partyroletype.setCreatedDt(new Date());
		partyroletype.setVersionNo(VERSIONING_ONE);
		partyroletype.setLastModifiedDt(new Date());
		partyroletype.setCreatedByUsr(DEFAULT_USER);
		partyroletype.setRecSt(ENTITY_STATUS_ACTIVE);
		partyroletype.setLastModifiedUsr(DEFAULT_USER);
		partyroletype = super.createOperation(partyroletypeOperation);
		return partyroletype;
	}
	
	@Override
	public Partyroletype updateOperation(PartyroletypeOperation partyroletypeOperation) {
		Partyroletype partyroletype = partyroletypeOperation.getPartyroletype();
		partyroletype.setUniverse(universeService.findById(partyroletypeOperation.getUniverseId()));
		partyroletype.setParentRoleTy(partyroletypeService.findById(partyroletypeOperation.getParentRoleTyId()));
		partyroletype.setLastModifiedDt(new Date());
		partyroletype.setRecSt(ENTITY_STATUS_ACTIVE);
		partyroletype.setLastModifiedUsr(DEFAULT_USER);
		partyroletype = super.updateOperation(partyroletypeOperation);
		return partyroletype;
	}
}