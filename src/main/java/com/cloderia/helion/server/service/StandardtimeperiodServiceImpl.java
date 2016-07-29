
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

import com.cloderia.helion.client.shared.model.Standardtimeperiod;
import com.cloderia.helion.client.shared.ops.StandardtimeperiodOperation;
import com.cloderia.helion.client.shared.service.PeriodtypeService;
import com.cloderia.helion.client.shared.service.StandardtimeperiodService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class StandardtimeperiodServiceImpl extends BaseEntityServiceImpl<Standardtimeperiod, StandardtimeperiodOperation> implements
		StandardtimeperiodService {

	@Inject
	PeriodtypeService periodtypeService;

	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public StandardtimeperiodServiceImpl() {
		super(Standardtimeperiod.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Standardtimeperiod.ALL_STANDARDTIMEPERIOD_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Standardtimeperiod.FIND_STANDARDTIMEPERIOD_BY_CODE_QUERY;
	}

	@Override
	public Standardtimeperiod createOperation(StandardtimeperiodOperation standardtimeperiodOperation) {
		Standardtimeperiod standardtimeperiod = standardtimeperiodOperation.getStandardtimeperiod();
		standardtimeperiod.setPeriodTy(periodtypeService.findById(standardtimeperiodOperation.getPeriodTyId()));
		standardtimeperiod.setRecSt("");
		standardtimeperiod.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		standardtimeperiod.setRowTs(new Date());
		standardtimeperiod.setCreatedDt(new Date());
		standardtimeperiod.setVersionNo(VERSIONING_ONE);
		standardtimeperiod.setLastModifiedDt(new Date());
		standardtimeperiod.setCreatedByUsr(DEFAULT_USER);
		standardtimeperiod.setRecSt(ENTITY_STATUS_ACTIVE);
		standardtimeperiod.setLastModifiedUsr(DEFAULT_USER);
		standardtimeperiod = super.createOperation(standardtimeperiodOperation);
		return standardtimeperiod;
	}
	
	@Override
	public Standardtimeperiod updateOperation(StandardtimeperiodOperation standardtimeperiodOperation) {
		Standardtimeperiod standardtimeperiod = standardtimeperiodOperation.getStandardtimeperiod();
		standardtimeperiod.setPeriodTy(periodtypeService.findById(standardtimeperiodOperation.getPeriodTyId()));
		standardtimeperiod.setLastModifiedDt(new Date());
		standardtimeperiod.setRecSt(ENTITY_STATUS_ACTIVE);
		standardtimeperiod.setLastModifiedUsr(DEFAULT_USER);
		standardtimeperiod = super.updateOperation(standardtimeperiodOperation);
		return standardtimeperiod;
	}
}