
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

import com.cloderia.helion.client.shared.model.Geoboundry;
import com.cloderia.helion.client.shared.ops.GeoboundryOperation;
import com.cloderia.helion.client.shared.service.GeoboundrytypeService;
import com.cloderia.helion.client.shared.service.GeoboundryService;
import com.cloderia.helion.client.shared.service.GeoboundryService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class GeoboundryServiceImpl extends BaseEntityServiceImpl<Geoboundry, GeoboundryOperation> implements
		GeoboundryService {

	@Inject
	GeoboundrytypeService geoboundrytypeService;
	@Inject
	GeoboundryService geoboundryService;

	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public GeoboundryServiceImpl() {
		super(Geoboundry.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Geoboundry.ALL_GEOBOUNDRY_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Geoboundry.FIND_GEOBOUNDRY_BY_CODE_QUERY;
	}

	@Override
	public Geoboundry createOperation(GeoboundryOperation geoboundryOperation) {
		Geoboundry geoboundry = geoboundryOperation.getGeoboundry();
		geoboundry.setGeoBoundryTy(geoboundrytypeService.findById(geoboundryOperation.getGeoBoundryTyId()));
		geoboundry.setParentGeoBoundry(geoboundryService.findById(geoboundryOperation.getParentGeoBoundryId()));
		geoboundry.setRecSt("");
		geoboundry.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		geoboundry.setRowTs(new Date());
		geoboundry.setCreatedDt(new Date());
		geoboundry.setVersionNo(VERSIONING_ONE);
		geoboundry.setLastModifiedDt(new Date());
		geoboundry.setCreatedByUsr(DEFAULT_USER);
		geoboundry.setRecSt(ENTITY_STATUS_ACTIVE);
		geoboundry.setLastModifiedUsr(DEFAULT_USER);
		geoboundry = super.createOperation(geoboundryOperation);
		return geoboundry;
	}
	
	@Override
	public Geoboundry updateOperation(GeoboundryOperation geoboundryOperation) {
		Geoboundry geoboundry = geoboundryOperation.getGeoboundry();
		geoboundry.setUniverse(universeService.findById(geoboundryOperation.getUniverseId()));
		geoboundry.setGeoBoundryTy(geoboundrytypeService.findById(geoboundryOperation.getGeoBoundryTyId()));
		geoboundry.setParentGeoBoundry(geoboundryService.findById(geoboundryOperation.getParentGeoBoundryId()));
		geoboundry.setLastModifiedDt(new Date());
		geoboundry.setRecSt(ENTITY_STATUS_ACTIVE);
		geoboundry.setLastModifiedUsr(DEFAULT_USER);
		geoboundry = super.updateOperation(geoboundryOperation);
		return geoboundry;
	}
}