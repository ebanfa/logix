
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

import com.cloderia.helion.client.shared.model.Budgetitemtype;
import com.cloderia.helion.client.shared.ops.BudgetitemtypeOperation;
import com.cloderia.helion.client.shared.service.BudgetitemtypeService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class BudgetitemtypeServiceImpl extends BaseEntityServiceImpl<Budgetitemtype, BudgetitemtypeOperation> implements
		BudgetitemtypeService {


	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public BudgetitemtypeServiceImpl() {
		super(Budgetitemtype.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Budgetitemtype.ALL_BUDGETITEMTYPE_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Budgetitemtype.FIND_BUDGETITEMTYPE_BY_CODE_QUERY;
	}

	@Override
	public Budgetitemtype createOperation(BudgetitemtypeOperation budgetitemtypeOperation) {
		Budgetitemtype budgetitemtype = budgetitemtypeOperation.getBudgetitemtype();
		budgetitemtype.setRecSt("");
		budgetitemtype.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		budgetitemtype.setRowTs(new Date());
		budgetitemtype.setCreatedDt(new Date());
		budgetitemtype.setVersionNo(VERSIONING_ONE);
		budgetitemtype.setLastModifiedDt(new Date());
		budgetitemtype.setCreatedByUsr(DEFAULT_USER);
		budgetitemtype.setRecSt(ENTITY_STATUS_ACTIVE);
		budgetitemtype.setLastModifiedUsr(DEFAULT_USER);
		budgetitemtype = super.createOperation(budgetitemtypeOperation);
		return budgetitemtype;
	}
	
	@Override
	public Budgetitemtype updateOperation(BudgetitemtypeOperation budgetitemtypeOperation) {
		Budgetitemtype budgetitemtype = budgetitemtypeOperation.getBudgetitemtype();
		budgetitemtype.setLastModifiedDt(new Date());
		budgetitemtype.setRecSt(ENTITY_STATUS_ACTIVE);
		budgetitemtype.setLastModifiedUsr(DEFAULT_USER);
		budgetitemtype = super.updateOperation(budgetitemtypeOperation);
		return budgetitemtype;
	}
}