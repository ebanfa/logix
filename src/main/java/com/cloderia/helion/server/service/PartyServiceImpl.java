
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

import com.cloderia.helion.client.shared.ApplicationException;
import com.cloderia.helion.client.shared.model.Party;
import com.cloderia.helion.client.shared.ops.PartyOperation;
import com.cloderia.helion.client.shared.service.PartytypeService;
import com.cloderia.helion.client.shared.service.PartyService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class PartyServiceImpl extends BaseEntityServiceImpl<Party, PartyOperation> implements
		PartyService {

	@Inject
	PartytypeService partytypeService;

	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public PartyServiceImpl() {
		super(Party.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Party.ALL_PARTY_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Party.FIND_PARTY_BY_CODE_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.shared.service.PartyService#createIndividualTypeParty(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public Party createIndividualTypeParty(String code, String name, String description) throws ApplicationException {
		if(findByCode(code) != null) throw new ApplicationException("Username already exist");
		Party entity = setTextProperties(initDefaultProperties(new Party()), code, name);
		entity.setDescription(description);
		PartyOperation ops = new PartyOperation(entity);
		ops.setPartyTyId(partytypeService.findByCode(INDIVIDUAL_PARTY_TYPE_CODE).getId());
		return createOperation(ops);
	}

	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.shared.service.PartyService#createOrganizationTypeParty(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public Party createOrganizationTypeParty(String code, String name, String description) throws ApplicationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Party createOperation(PartyOperation partyOperation) {
		Party party = partyOperation.getParty();
		party.setPartyTy(partytypeService.findById(partyOperation.getPartyTyId()));
		party.setRecSt("");
		party.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		party.setRowTs(new Date());
		party.setCreatedDt(new Date());
		party.setVersionNo(VERSIONING_ONE);
		party.setLastModifiedDt(new Date());
		party.setCreatedByUsr(DEFAULT_USER);
		party.setRecSt(ENTITY_STATUS_ACTIVE);
		party.setLastModifiedUsr(DEFAULT_USER);
		party = super.createOperation(partyOperation);
		return party;
	}
	
	@Override
	public Party updateOperation(PartyOperation partyOperation) {
		Party party = partyOperation.getParty();
		party.setUniverse(universeService.findById(partyOperation.getUniverseId()));
		party.setPartyTy(partytypeService.findById(partyOperation.getPartyTyId()));
		party.setLastModifiedDt(new Date());
		party.setRecSt(ENTITY_STATUS_ACTIVE);
		party.setLastModifiedUsr(DEFAULT_USER);
		party = super.updateOperation(partyOperation);
		return party;
	}
}