
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

import com.cloderia.helion.client.shared.model.Financialaccountrole;
import com.cloderia.helion.client.shared.ops.FinancialaccountroleOperation;
import com.cloderia.helion.client.shared.service.FinancialaccountService;
import com.cloderia.helion.client.shared.service.FinancialaccountroletypeService;
import com.cloderia.helion.client.shared.service.FinancialaccountroleService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class FinancialaccountroleServiceImpl extends BaseEntityServiceImpl<Financialaccountrole, FinancialaccountroleOperation> implements
		FinancialaccountroleService {

	@Inject
	FinancialaccountService financialaccountService;
	@Inject
	FinancialaccountroletypeService financialaccountroletypeService;

	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public FinancialaccountroleServiceImpl() {
		super(Financialaccountrole.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Financialaccountrole.ALL_FINANCIALACCOUNTROLE_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Financialaccountrole.FIND_FINANCIALACCOUNTROLE_BY_CODE_QUERY;
	}

	@Override
	public Financialaccountrole createOperation(FinancialaccountroleOperation financialaccountroleOperation) {
		Financialaccountrole financialaccountrole = financialaccountroleOperation.getFinancialaccountrole();
		financialaccountrole.setFinAcct(financialaccountService.findById(financialaccountroleOperation.getFinAcctId()));
		financialaccountrole.setRoleTy(financialaccountroletypeService.findById(financialaccountroleOperation.getRoleTyId()));
		financialaccountrole.setRecSt("");
		financialaccountrole.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		financialaccountrole.setRowTs(new Date());
		financialaccountrole.setCreatedDt(new Date());
		financialaccountrole.setVersionNo(VERSIONING_ONE);
		financialaccountrole.setLastModifiedDt(new Date());
		financialaccountrole.setCreatedByUsr(DEFAULT_USER);
		financialaccountrole.setRecSt(ENTITY_STATUS_ACTIVE);
		financialaccountrole.setLastModifiedUsr(DEFAULT_USER);
		financialaccountrole = super.createOperation(financialaccountroleOperation);
		return financialaccountrole;
	}
	
	@Override
	public Financialaccountrole updateOperation(FinancialaccountroleOperation financialaccountroleOperation) {
		Financialaccountrole financialaccountrole = financialaccountroleOperation.getFinancialaccountrole();
		financialaccountrole.setFinAcct(financialaccountService.findById(financialaccountroleOperation.getFinAcctId()));
		financialaccountrole.setRoleTy(financialaccountroletypeService.findById(financialaccountroleOperation.getRoleTyId()));
		financialaccountrole.setLastModifiedDt(new Date());
		financialaccountrole.setRecSt(ENTITY_STATUS_ACTIVE);
		financialaccountrole.setLastModifiedUsr(DEFAULT_USER);
		financialaccountrole = super.updateOperation(financialaccountroleOperation);
		return financialaccountrole;
	}
}