
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

import com.cloderia.helion.client.shared.model.Partytype;
import com.cloderia.helion.client.shared.ops.PartytypeOperation;
import com.cloderia.helion.client.shared.service.PartycategoryService;
import com.cloderia.helion.client.shared.service.PartytypeService;
import com.cloderia.helion.client.shared.service.PartytypeService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class PartytypeServiceImpl extends BaseEntityServiceImpl<Partytype, PartytypeOperation> implements
		PartytypeService {

	@Inject
	PartycategoryService partycategoryService;
	@Inject
	PartytypeService partytypeService;

	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public PartytypeServiceImpl() {
		super(Partytype.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Partytype.ALL_PARTYTYPE_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Partytype.FIND_PARTYTYPE_BY_CODE_QUERY;
	}

	@Override
	public Partytype createOperation(PartytypeOperation partytypeOperation) {
		Partytype partytype = partytypeOperation.getPartytype();
		partytype.setParentCategory(partycategoryService.findById(partytypeOperation.getParentCategoryId()));
		partytype.setParentType(partytypeService.findById(partytypeOperation.getParentTypeId()));
		partytype.setRecSt("");
		partytype.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		partytype.setRowTs(new Date());
		partytype.setCreatedDt(new Date());
		partytype.setVersionNo(VERSIONING_ONE);
		partytype.setLastModifiedDt(new Date());
		partytype.setCreatedByUsr(DEFAULT_USER);
		partytype.setRecSt(ENTITY_STATUS_ACTIVE);
		partytype.setLastModifiedUsr(DEFAULT_USER);
		partytype = super.createOperation(partytypeOperation);
		return partytype;
	}
	
	@Override
	public Partytype updateOperation(PartytypeOperation partytypeOperation) {
		Partytype partytype = partytypeOperation.getPartytype();
		partytype.setUniverse(universeService.findById(partytypeOperation.getUniverseId()));
		partytype.setParentCategory(partycategoryService.findById(partytypeOperation.getParentCategoryId()));
		partytype.setParentType(partytypeService.findById(partytypeOperation.getParentTypeId()));
		partytype.setLastModifiedDt(new Date());
		partytype.setRecSt(ENTITY_STATUS_ACTIVE);
		partytype.setLastModifiedUsr(DEFAULT_USER);
		partytype = super.updateOperation(partytypeOperation);
		return partytype;
	}
}