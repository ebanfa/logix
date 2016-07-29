
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

import com.cloderia.helion.client.shared.model.Terminationtype;
import com.cloderia.helion.client.shared.ops.TerminationtypeOperation;
import com.cloderia.helion.client.shared.service.TerminationtypeService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class TerminationtypeServiceImpl extends BaseEntityServiceImpl<Terminationtype, TerminationtypeOperation> implements
		TerminationtypeService {


	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public TerminationtypeServiceImpl() {
		super(Terminationtype.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Terminationtype.ALL_TERMINATIONTYPE_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Terminationtype.FIND_TERMINATIONTYPE_BY_CODE_QUERY;
	}

	@Override
	public Terminationtype createOperation(TerminationtypeOperation terminationtypeOperation) {
		Terminationtype terminationtype = terminationtypeOperation.getTerminationtype();
		terminationtype.setRecSt("");
		terminationtype.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		terminationtype.setRowTs(new Date());
		terminationtype.setCreatedDt(new Date());
		terminationtype.setVersionNo(VERSIONING_ONE);
		terminationtype.setLastModifiedDt(new Date());
		terminationtype.setCreatedByUsr(DEFAULT_USER);
		terminationtype.setRecSt(ENTITY_STATUS_ACTIVE);
		terminationtype.setLastModifiedUsr(DEFAULT_USER);
		terminationtype = super.createOperation(terminationtypeOperation);
		return terminationtype;
	}
	
	@Override
	public Terminationtype updateOperation(TerminationtypeOperation terminationtypeOperation) {
		Terminationtype terminationtype = terminationtypeOperation.getTerminationtype();
		terminationtype.setUniverse(universeService.findById(terminationtypeOperation.getUniverseId()));
		terminationtype.setLastModifiedDt(new Date());
		terminationtype.setRecSt(ENTITY_STATUS_ACTIVE);
		terminationtype.setLastModifiedUsr(DEFAULT_USER);
		terminationtype = super.updateOperation(terminationtypeOperation);
		return terminationtype;
	}
}