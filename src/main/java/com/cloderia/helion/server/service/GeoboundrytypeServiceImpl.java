
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

import com.cloderia.helion.client.shared.model.Geoboundrytype;
import com.cloderia.helion.client.shared.ops.GeoboundrytypeOperation;
import com.cloderia.helion.client.shared.service.GeoboundrytypeService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class GeoboundrytypeServiceImpl extends BaseEntityServiceImpl<Geoboundrytype, GeoboundrytypeOperation> implements
		GeoboundrytypeService {


	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public GeoboundrytypeServiceImpl() {
		super(Geoboundrytype.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Geoboundrytype.ALL_GEOBOUNDRYTYPE_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Geoboundrytype.FIND_GEOBOUNDRYTYPE_BY_CODE_QUERY;
	}

	@Override
	public Geoboundrytype createOperation(GeoboundrytypeOperation geoboundrytypeOperation) {
		Geoboundrytype geoboundrytype = geoboundrytypeOperation.getGeoboundrytype();
		geoboundrytype.setRecSt("");
		geoboundrytype.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		geoboundrytype.setRowTs(new Date());
		geoboundrytype.setCreatedDt(new Date());
		geoboundrytype.setVersionNo(VERSIONING_ONE);
		geoboundrytype.setLastModifiedDt(new Date());
		geoboundrytype.setCreatedByUsr(DEFAULT_USER);
		geoboundrytype.setRecSt(ENTITY_STATUS_ACTIVE);
		geoboundrytype.setLastModifiedUsr(DEFAULT_USER);
		geoboundrytype = super.createOperation(geoboundrytypeOperation);
		return geoboundrytype;
	}
	
	@Override
	public Geoboundrytype updateOperation(GeoboundrytypeOperation geoboundrytypeOperation) {
		Geoboundrytype geoboundrytype = geoboundrytypeOperation.getGeoboundrytype();
		geoboundrytype.setUniverse(universeService.findById(geoboundrytypeOperation.getUniverseId()));
		geoboundrytype.setLastModifiedDt(new Date());
		geoboundrytype.setRecSt(ENTITY_STATUS_ACTIVE);
		geoboundrytype.setLastModifiedUsr(DEFAULT_USER);
		geoboundrytype = super.updateOperation(geoboundrytypeOperation);
		return geoboundrytype;
	}
}