
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

import com.cloderia.helion.client.shared.model.Budgetstatus;
import com.cloderia.helion.client.shared.ops.BudgetstatusOperation;
import com.cloderia.helion.client.shared.service.BudgetstatustypeService;
import com.cloderia.helion.client.shared.service.BudgetService;
import com.cloderia.helion.client.shared.service.BudgetstatusService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class BudgetstatusServiceImpl extends BaseEntityServiceImpl<Budgetstatus, BudgetstatusOperation> implements
		BudgetstatusService {

	@Inject
	BudgetstatustypeService budgetstatustypeService;
	@Inject
	BudgetService budgetService;

	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public BudgetstatusServiceImpl() {
		super(Budgetstatus.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Budgetstatus.ALL_BUDGETSTATUS_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Budgetstatus.FIND_BUDGETSTATUS_BY_CODE_QUERY;
	}

	@Override
	public Budgetstatus createOperation(BudgetstatusOperation budgetstatusOperation) {
		Budgetstatus budgetstatus = budgetstatusOperation.getBudgetstatus();
		budgetstatus.setStatusTy(budgetstatustypeService.findById(budgetstatusOperation.getStatusTyId()));
		budgetstatus.setBudget(budgetService.findById(budgetstatusOperation.getBudgetId()));
		budgetstatus.setRecSt("");
		budgetstatus.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		budgetstatus.setRowTs(new Date());
		budgetstatus.setCreatedDt(new Date());
		budgetstatus.setVersionNo(VERSIONING_ONE);
		budgetstatus.setLastModifiedDt(new Date());
		budgetstatus.setCreatedByUsr(DEFAULT_USER);
		budgetstatus.setRecSt(ENTITY_STATUS_ACTIVE);
		budgetstatus.setLastModifiedUsr(DEFAULT_USER);
		budgetstatus = super.createOperation(budgetstatusOperation);
		return budgetstatus;
	}
	
	@Override
	public Budgetstatus updateOperation(BudgetstatusOperation budgetstatusOperation) {
		Budgetstatus budgetstatus = budgetstatusOperation.getBudgetstatus();
		budgetstatus.setStatusTy(budgetstatustypeService.findById(budgetstatusOperation.getStatusTyId()));
		budgetstatus.setBudget(budgetService.findById(budgetstatusOperation.getBudgetId()));
		budgetstatus.setLastModifiedDt(new Date());
		budgetstatus.setRecSt(ENTITY_STATUS_ACTIVE);
		budgetstatus.setLastModifiedUsr(DEFAULT_USER);
		budgetstatus = super.updateOperation(budgetstatusOperation);
		return budgetstatus;
	}
}