
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

import com.cloderia.helion.client.shared.model.Budget;
import com.cloderia.helion.client.shared.ops.BudgetOperation;
import com.cloderia.helion.client.shared.service.StandardtimeperiodService;
import com.cloderia.helion.client.shared.service.BudgetService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class BudgetServiceImpl extends BaseEntityServiceImpl<Budget, BudgetOperation> implements
		BudgetService {

	@Inject
	StandardtimeperiodService standardtimeperiodService;

	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public BudgetServiceImpl() {
		super(Budget.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Budget.ALL_BUDGET_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Budget.FIND_BUDGET_BY_CODE_QUERY;
	}

	@Override
	public Budget createOperation(BudgetOperation budgetOperation) {
		Budget budget = budgetOperation.getBudget();
		budget.setPeriod(standardtimeperiodService.findById(budgetOperation.getPeriodId()));
		budget.setRecSt("");
		budget.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		budget.setRowTs(new Date());
		budget.setCreatedDt(new Date());
		budget.setVersionNo(VERSIONING_ONE);
		budget.setLastModifiedDt(new Date());
		budget.setCreatedByUsr(DEFAULT_USER);
		budget.setRecSt(ENTITY_STATUS_ACTIVE);
		budget.setLastModifiedUsr(DEFAULT_USER);
		budget = super.createOperation(budgetOperation);
		return budget;
	}
	
	@Override
	public Budget updateOperation(BudgetOperation budgetOperation) {
		Budget budget = budgetOperation.getBudget();
		budget.setPeriod(standardtimeperiodService.findById(budgetOperation.getPeriodId()));
		budget.setLastModifiedDt(new Date());
		budget.setRecSt(ENTITY_STATUS_ACTIVE);
		budget.setLastModifiedUsr(DEFAULT_USER);
		budget = super.updateOperation(budgetOperation);
		return budget;
	}
}