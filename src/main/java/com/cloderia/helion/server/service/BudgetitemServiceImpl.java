
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

import com.cloderia.helion.client.shared.model.Budgetitem;
import com.cloderia.helion.client.shared.ops.BudgetitemOperation;
import com.cloderia.helion.client.shared.service.BudgetitemtypeService;
import com.cloderia.helion.client.shared.service.BudgetService;
import com.cloderia.helion.client.shared.service.BudgetitemService;
import com.cloderia.helion.client.shared.service.BudgetitemService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class BudgetitemServiceImpl extends BaseEntityServiceImpl<Budgetitem, BudgetitemOperation> implements
		BudgetitemService {

	@Inject
	BudgetitemtypeService budgetitemtypeService;
	@Inject
	BudgetService budgetService;
	@Inject
	BudgetitemService budgetitemService;

	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public BudgetitemServiceImpl() {
		super(Budgetitem.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Budgetitem.ALL_BUDGETITEM_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Budgetitem.FIND_BUDGETITEM_BY_CODE_QUERY;
	}

	@Override
	public Budgetitem createOperation(BudgetitemOperation budgetitemOperation) {
		Budgetitem budgetitem = budgetitemOperation.getBudgetitem();
		budgetitem.setItemTy(budgetitemtypeService.findById(budgetitemOperation.getItemTyId()));
		budgetitem.setBudget(budgetService.findById(budgetitemOperation.getBudgetId()));
		budgetitem.setParentItem(budgetitemService.findById(budgetitemOperation.getParentItemId()));
		budgetitem.setRecSt("");
		budgetitem.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		budgetitem.setRowTs(new Date());
		budgetitem.setCreatedDt(new Date());
		budgetitem.setVersionNo(VERSIONING_ONE);
		budgetitem.setLastModifiedDt(new Date());
		budgetitem.setCreatedByUsr(DEFAULT_USER);
		budgetitem.setRecSt(ENTITY_STATUS_ACTIVE);
		budgetitem.setLastModifiedUsr(DEFAULT_USER);
		budgetitem = super.createOperation(budgetitemOperation);
		return budgetitem;
	}
	
	@Override
	public Budgetitem updateOperation(BudgetitemOperation budgetitemOperation) {
		Budgetitem budgetitem = budgetitemOperation.getBudgetitem();
		budgetitem.setItemTy(budgetitemtypeService.findById(budgetitemOperation.getItemTyId()));
		budgetitem.setBudget(budgetService.findById(budgetitemOperation.getBudgetId()));
		budgetitem.setParentItem(budgetitemService.findById(budgetitemOperation.getParentItemId()));
		budgetitem.setLastModifiedDt(new Date());
		budgetitem.setRecSt(ENTITY_STATUS_ACTIVE);
		budgetitem.setLastModifiedUsr(DEFAULT_USER);
		budgetitem = super.updateOperation(budgetitemOperation);
		return budgetitem;
	}
}