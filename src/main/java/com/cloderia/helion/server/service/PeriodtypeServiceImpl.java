
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

import com.cloderia.helion.client.shared.model.Periodtype;
import com.cloderia.helion.client.shared.ops.PeriodtypeOperation;
import com.cloderia.helion.client.shared.service.PeriodtypeService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class PeriodtypeServiceImpl extends BaseEntityServiceImpl<Periodtype, PeriodtypeOperation> implements
		PeriodtypeService {


	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public PeriodtypeServiceImpl() {
		super(Periodtype.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Periodtype.ALL_PERIODTYPE_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Periodtype.FIND_PERIODTYPE_BY_CODE_QUERY;
	}

	@Override
	public Periodtype createOperation(PeriodtypeOperation periodtypeOperation) {
		Periodtype periodtype = periodtypeOperation.getPeriodtype();
		periodtype.setRecSt("");
		periodtype.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		periodtype.setRowTs(new Date());
		periodtype.setCreatedDt(new Date());
		periodtype.setVersionNo(VERSIONING_ONE);
		periodtype.setLastModifiedDt(new Date());
		periodtype.setCreatedByUsr(DEFAULT_USER);
		periodtype.setRecSt(ENTITY_STATUS_ACTIVE);
		periodtype.setLastModifiedUsr(DEFAULT_USER);
		periodtype = super.createOperation(periodtypeOperation);
		return periodtype;
	}
	
	@Override
	public Periodtype updateOperation(PeriodtypeOperation periodtypeOperation) {
		Periodtype periodtype = periodtypeOperation.getPeriodtype();
		periodtype.setLastModifiedDt(new Date());
		periodtype.setRecSt(ENTITY_STATUS_ACTIVE);
		periodtype.setLastModifiedUsr(DEFAULT_USER);
		periodtype = super.updateOperation(periodtypeOperation);
		return periodtype;
	}
}