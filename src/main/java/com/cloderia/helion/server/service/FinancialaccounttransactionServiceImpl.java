
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

import com.cloderia.helion.client.shared.model.Financialaccounttransaction;
import com.cloderia.helion.client.shared.ops.FinancialaccounttransactionOperation;
import com.cloderia.helion.client.shared.service.FinancialaccounttransactiontypeService;
import com.cloderia.helion.client.shared.service.FinancialaccountService;
import com.cloderia.helion.client.shared.service.FinancialaccounttransactionService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class FinancialaccounttransactionServiceImpl extends BaseEntityServiceImpl<Financialaccounttransaction, FinancialaccounttransactionOperation> implements
		FinancialaccounttransactionService {

	@Inject
	FinancialaccounttransactiontypeService financialaccounttransactiontypeService;
	@Inject
	FinancialaccountService financialaccountService;

	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public FinancialaccounttransactionServiceImpl() {
		super(Financialaccounttransaction.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Financialaccounttransaction.ALL_FINANCIALACCOUNTTRANSACTION_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Financialaccounttransaction.FIND_FINANCIALACCOUNTTRANSACTION_BY_CODE_QUERY;
	}

	@Override
	public Financialaccounttransaction createOperation(FinancialaccounttransactionOperation financialaccounttransactionOperation) {
		Financialaccounttransaction financialaccounttransaction = financialaccounttransactionOperation.getFinancialaccounttransaction();
		financialaccounttransaction.setFinTxnTy(financialaccounttransactiontypeService.findById(financialaccounttransactionOperation.getFinTxnTyId()));
		financialaccounttransaction.setFinAcct(financialaccountService.findById(financialaccounttransactionOperation.getFinAcctId()));
		financialaccounttransaction.setRecSt("");
		financialaccounttransaction.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		financialaccounttransaction.setRowTs(new Date());
		financialaccounttransaction.setCreatedDt(new Date());
		financialaccounttransaction.setVersionNo(VERSIONING_ONE);
		financialaccounttransaction.setLastModifiedDt(new Date());
		financialaccounttransaction.setCreatedByUsr(DEFAULT_USER);
		financialaccounttransaction.setRecSt(ENTITY_STATUS_ACTIVE);
		financialaccounttransaction.setLastModifiedUsr(DEFAULT_USER);
		financialaccounttransaction = super.createOperation(financialaccounttransactionOperation);
		return financialaccounttransaction;
	}
	
	@Override
	public Financialaccounttransaction updateOperation(FinancialaccounttransactionOperation financialaccounttransactionOperation) {
		Financialaccounttransaction financialaccounttransaction = financialaccounttransactionOperation.getFinancialaccounttransaction();
		financialaccounttransaction.setFinTxnTy(financialaccounttransactiontypeService.findById(financialaccounttransactionOperation.getFinTxnTyId()));
		financialaccounttransaction.setFinAcct(financialaccountService.findById(financialaccounttransactionOperation.getFinAcctId()));
		financialaccounttransaction.setLastModifiedDt(new Date());
		financialaccounttransaction.setRecSt(ENTITY_STATUS_ACTIVE);
		financialaccounttransaction.setLastModifiedUsr(DEFAULT_USER);
		financialaccounttransaction = super.updateOperation(financialaccounttransactionOperation);
		return financialaccounttransaction;
	}
}