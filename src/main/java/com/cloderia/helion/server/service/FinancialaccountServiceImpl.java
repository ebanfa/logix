
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

import com.cloderia.helion.client.shared.model.Financialaccount;
import com.cloderia.helion.client.shared.ops.FinancialaccountOperation;
import com.cloderia.helion.client.shared.service.FinancialaccounttypeService;
import com.cloderia.helion.client.shared.service.FinancialaccountService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class FinancialaccountServiceImpl extends BaseEntityServiceImpl<Financialaccount, FinancialaccountOperation> implements
		FinancialaccountService {

	@Inject
	FinancialaccounttypeService financialaccounttypeService;

	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public FinancialaccountServiceImpl() {
		super(Financialaccount.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Financialaccount.ALL_FINANCIALACCOUNT_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Financialaccount.FIND_FINANCIALACCOUNT_BY_CODE_QUERY;
	}

	@Override
	public Financialaccount createOperation(FinancialaccountOperation financialaccountOperation) {
		Financialaccount financialaccount = financialaccountOperation.getFinancialaccount();
		financialaccount.setFinAcctTy(financialaccounttypeService.findById(financialaccountOperation.getFinAcctTyId()));
		financialaccount.setRecSt("");
		financialaccount.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		financialaccount.setRowTs(new Date());
		financialaccount.setCreatedDt(new Date());
		financialaccount.setVersionNo(VERSIONING_ONE);
		financialaccount.setLastModifiedDt(new Date());
		financialaccount.setCreatedByUsr(DEFAULT_USER);
		financialaccount.setRecSt(ENTITY_STATUS_ACTIVE);
		financialaccount.setLastModifiedUsr(DEFAULT_USER);
		financialaccount = super.createOperation(financialaccountOperation);
		return financialaccount;
	}
	
	@Override
	public Financialaccount updateOperation(FinancialaccountOperation financialaccountOperation) {
		Financialaccount financialaccount = financialaccountOperation.getFinancialaccount();
		financialaccount.setFinAcctTy(financialaccounttypeService.findById(financialaccountOperation.getFinAcctTyId()));
		financialaccount.setLastModifiedDt(new Date());
		financialaccount.setRecSt(ENTITY_STATUS_ACTIVE);
		financialaccount.setLastModifiedUsr(DEFAULT_USER);
		financialaccount = super.updateOperation(financialaccountOperation);
		return financialaccount;
	}
}