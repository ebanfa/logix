
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

import com.cloderia.helion.client.shared.model.Partyrelationshiptype;
import com.cloderia.helion.client.shared.ops.PartyrelationshiptypeOperation;
import com.cloderia.helion.client.shared.service.PartyrelationshiptypeService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class PartyrelationshiptypeServiceImpl extends BaseEntityServiceImpl<Partyrelationshiptype, PartyrelationshiptypeOperation> implements
		PartyrelationshiptypeService {


	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public PartyrelationshiptypeServiceImpl() {
		super(Partyrelationshiptype.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Partyrelationshiptype.ALL_PARTYRELATIONSHIPTYPE_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Partyrelationshiptype.FIND_PARTYRELATIONSHIPTYPE_BY_CODE_QUERY;
	}

	@Override
	public Partyrelationshiptype createOperation(PartyrelationshiptypeOperation partyrelationshiptypeOperation) {
		Partyrelationshiptype partyrelationshiptype = partyrelationshiptypeOperation.getPartyrelationshiptype();
		partyrelationshiptype.setRecSt("");
		partyrelationshiptype.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		partyrelationshiptype.setRowTs(new Date());
		partyrelationshiptype.setCreatedDt(new Date());
		partyrelationshiptype.setVersionNo(VERSIONING_ONE);
		partyrelationshiptype.setLastModifiedDt(new Date());
		partyrelationshiptype.setCreatedByUsr(DEFAULT_USER);
		partyrelationshiptype.setRecSt(ENTITY_STATUS_ACTIVE);
		partyrelationshiptype.setLastModifiedUsr(DEFAULT_USER);
		partyrelationshiptype = super.createOperation(partyrelationshiptypeOperation);
		return partyrelationshiptype;
	}
	
	@Override
	public Partyrelationshiptype updateOperation(PartyrelationshiptypeOperation partyrelationshiptypeOperation) {
		Partyrelationshiptype partyrelationshiptype = partyrelationshiptypeOperation.getPartyrelationshiptype();
		partyrelationshiptype.setUniverse(universeService.findById(partyrelationshiptypeOperation.getUniverseId()));
		partyrelationshiptype.setLastModifiedDt(new Date());
		partyrelationshiptype.setRecSt(ENTITY_STATUS_ACTIVE);
		partyrelationshiptype.setLastModifiedUsr(DEFAULT_USER);
		partyrelationshiptype = super.updateOperation(partyrelationshiptypeOperation);
		return partyrelationshiptype;
	}
}