
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

import com.cloderia.helion.client.shared.model.Preferencetype;
import com.cloderia.helion.client.shared.ops.PreferencetypeOperation;
import com.cloderia.helion.client.shared.service.PreferencetypeService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class PreferencetypeServiceImpl extends BaseEntityServiceImpl<Preferencetype, PreferencetypeOperation> implements
		PreferencetypeService {


	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public PreferencetypeServiceImpl() {
		super(Preferencetype.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Preferencetype.ALL_PREFERENCETYPE_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Preferencetype.FIND_PREFERENCETYPE_BY_CODE_QUERY;
	}

	@Override
	public Preferencetype createOperation(PreferencetypeOperation preferencetypeOperation) {
		Preferencetype preferencetype = preferencetypeOperation.getPreferencetype();
		preferencetype.setRecSt("");
		preferencetype.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		preferencetype.setRowTs(new Date());
		preferencetype.setCreatedDt(new Date());
		preferencetype.setVersionNo(VERSIONING_ONE);
		preferencetype.setLastModifiedDt(new Date());
		preferencetype.setCreatedByUsr(DEFAULT_USER);
		preferencetype.setRecSt(ENTITY_STATUS_ACTIVE);
		preferencetype.setLastModifiedUsr(DEFAULT_USER);
		preferencetype = super.createOperation(preferencetypeOperation);
		return preferencetype;
	}
	
	@Override
	public Preferencetype updateOperation(PreferencetypeOperation preferencetypeOperation) {
		Preferencetype preferencetype = preferencetypeOperation.getPreferencetype();
		preferencetype.setLastModifiedDt(new Date());
		preferencetype.setRecSt(ENTITY_STATUS_ACTIVE);
		preferencetype.setLastModifiedUsr(DEFAULT_USER);
		preferencetype = super.updateOperation(preferencetypeOperation);
		return preferencetype;
	}
}