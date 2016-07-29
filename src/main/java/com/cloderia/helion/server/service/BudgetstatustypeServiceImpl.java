
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

import com.cloderia.helion.client.shared.model.Budgetstatustype;
import com.cloderia.helion.client.shared.ops.BudgetstatustypeOperation;
import com.cloderia.helion.client.shared.service.BudgetstatustypeService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class BudgetstatustypeServiceImpl extends BaseEntityServiceImpl<Budgetstatustype, BudgetstatustypeOperation> implements
		BudgetstatustypeService {


	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public BudgetstatustypeServiceImpl() {
		super(Budgetstatustype.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Budgetstatustype.ALL_BUDGETSTATUSTYPE_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Budgetstatustype.FIND_BUDGETSTATUSTYPE_BY_CODE_QUERY;
	}

	@Override
	public Budgetstatustype createOperation(BudgetstatustypeOperation budgetstatustypeOperation) {
		Budgetstatustype budgetstatustype = budgetstatustypeOperation.getBudgetstatustype();
		budgetstatustype.setRecSt("");
		budgetstatustype.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		budgetstatustype.setRowTs(new Date());
		budgetstatustype.setCreatedDt(new Date());
		budgetstatustype.setVersionNo(VERSIONING_ONE);
		budgetstatustype.setLastModifiedDt(new Date());
		budgetstatustype.setCreatedByUsr(DEFAULT_USER);
		budgetstatustype.setRecSt(ENTITY_STATUS_ACTIVE);
		budgetstatustype.setLastModifiedUsr(DEFAULT_USER);
		budgetstatustype = super.createOperation(budgetstatustypeOperation);
		return budgetstatustype;
	}
	
	@Override
	public Budgetstatustype updateOperation(BudgetstatustypeOperation budgetstatustypeOperation) {
		Budgetstatustype budgetstatustype = budgetstatustypeOperation.getBudgetstatustype();
		budgetstatustype.setLastModifiedDt(new Date());
		budgetstatustype.setRecSt(ENTITY_STATUS_ACTIVE);
		budgetstatustype.setLastModifiedUsr(DEFAULT_USER);
		budgetstatustype = super.updateOperation(budgetstatustypeOperation);
		return budgetstatustype;
	}
}