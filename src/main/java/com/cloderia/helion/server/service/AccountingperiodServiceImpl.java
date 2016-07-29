
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

import com.cloderia.helion.client.shared.model.Accountingperiod;
import com.cloderia.helion.client.shared.ops.AccountingperiodOperation;
import com.cloderia.helion.client.shared.service.AccountingperiodService;
import com.cloderia.helion.client.shared.service.PeriodtypeService;
import com.cloderia.helion.client.shared.service.AccountingperiodService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class AccountingperiodServiceImpl extends BaseEntityServiceImpl<Accountingperiod, AccountingperiodOperation> implements
		AccountingperiodService {

	@Inject
	AccountingperiodService accountingperiodService;
	@Inject
	PeriodtypeService periodtypeService;

	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public AccountingperiodServiceImpl() {
		super(Accountingperiod.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Accountingperiod.ALL_ACCOUNTINGPERIOD_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Accountingperiod.FIND_ACCOUNTINGPERIOD_BY_CODE_QUERY;
	}

	@Override
	public Accountingperiod createOperation(AccountingperiodOperation accountingperiodOperation) {
		Accountingperiod accountingperiod = accountingperiodOperation.getAccountingperiod();
		accountingperiod.setParentPeriodTy(accountingperiodService.findById(accountingperiodOperation.getParentPeriodTyId()));
		accountingperiod.setPeriodTy(periodtypeService.findById(accountingperiodOperation.getPeriodTyId()));
		accountingperiod.setRecSt("");
		accountingperiod.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		accountingperiod.setRowTs(new Date());
		accountingperiod.setCreatedDt(new Date());
		accountingperiod.setVersionNo(VERSIONING_ONE);
		accountingperiod.setLastModifiedDt(new Date());
		accountingperiod.setCreatedByUsr(DEFAULT_USER);
		accountingperiod.setRecSt(ENTITY_STATUS_ACTIVE);
		accountingperiod.setLastModifiedUsr(DEFAULT_USER);
		accountingperiod = super.createOperation(accountingperiodOperation);
		return accountingperiod;
	}
	
	@Override
	public Accountingperiod updateOperation(AccountingperiodOperation accountingperiodOperation) {
		Accountingperiod accountingperiod = accountingperiodOperation.getAccountingperiod();
		accountingperiod.setParentPeriodTy(accountingperiodService.findById(accountingperiodOperation.getParentPeriodTyId()));
		accountingperiod.setPeriodTy(periodtypeService.findById(accountingperiodOperation.getPeriodTyId()));
		accountingperiod.setLastModifiedDt(new Date());
		accountingperiod.setRecSt(ENTITY_STATUS_ACTIVE);
		accountingperiod.setLastModifiedUsr(DEFAULT_USER);
		accountingperiod = super.updateOperation(accountingperiodOperation);
		return accountingperiod;
	}
}