
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

import com.cloderia.helion.client.shared.model.Budgettype;
import com.cloderia.helion.client.shared.ops.BudgettypeOperation;
import com.cloderia.helion.client.shared.service.BudgettypeService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class BudgettypeServiceImpl extends BaseEntityServiceImpl<Budgettype, BudgettypeOperation> implements
		BudgettypeService {


	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public BudgettypeServiceImpl() {
		super(Budgettype.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Budgettype.ALL_BUDGETTYPE_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Budgettype.FIND_BUDGETTYPE_BY_CODE_QUERY;
	}

	@Override
	public Budgettype createOperation(BudgettypeOperation budgettypeOperation) {
		Budgettype budgettype = budgettypeOperation.getBudgettype();
		budgettype.setRecSt("");
		budgettype.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		budgettype.setRowTs(new Date());
		budgettype.setCreatedDt(new Date());
		budgettype.setVersionNo(VERSIONING_ONE);
		budgettype.setLastModifiedDt(new Date());
		budgettype.setCreatedByUsr(DEFAULT_USER);
		budgettype.setRecSt(ENTITY_STATUS_ACTIVE);
		budgettype.setLastModifiedUsr(DEFAULT_USER);
		budgettype = super.createOperation(budgettypeOperation);
		return budgettype;
	}
	
	@Override
	public Budgettype updateOperation(BudgettypeOperation budgettypeOperation) {
		Budgettype budgettype = budgettypeOperation.getBudgettype();
		budgettype.setLastModifiedDt(new Date());
		budgettype.setRecSt(ENTITY_STATUS_ACTIVE);
		budgettype.setLastModifiedUsr(DEFAULT_USER);
		budgettype = super.updateOperation(budgettypeOperation);
		return budgettype;
	}
}