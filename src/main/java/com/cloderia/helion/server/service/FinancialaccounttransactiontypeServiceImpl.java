
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

import com.cloderia.helion.client.shared.model.Financialaccounttransactiontype;
import com.cloderia.helion.client.shared.ops.FinancialaccounttransactiontypeOperation;
import com.cloderia.helion.client.shared.service.FinancialaccounttransactiontypeService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class FinancialaccounttransactiontypeServiceImpl extends BaseEntityServiceImpl<Financialaccounttransactiontype, FinancialaccounttransactiontypeOperation> implements
		FinancialaccounttransactiontypeService {


	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public FinancialaccounttransactiontypeServiceImpl() {
		super(Financialaccounttransactiontype.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Financialaccounttransactiontype.ALL_FINANCIALACCOUNTTRANSACTIONTYPE_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Financialaccounttransactiontype.FIND_FINANCIALACCOUNTTRANSACTIONTYPE_BY_CODE_QUERY;
	}

	@Override
	public Financialaccounttransactiontype createOperation(FinancialaccounttransactiontypeOperation financialaccounttransactiontypeOperation) {
		Financialaccounttransactiontype financialaccounttransactiontype = financialaccounttransactiontypeOperation.getFinancialaccounttransactiontype();
		financialaccounttransactiontype.setRecSt("");
		financialaccounttransactiontype.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		financialaccounttransactiontype.setRowTs(new Date());
		financialaccounttransactiontype.setCreatedDt(new Date());
		financialaccounttransactiontype.setVersionNo(VERSIONING_ONE);
		financialaccounttransactiontype.setLastModifiedDt(new Date());
		financialaccounttransactiontype.setCreatedByUsr(DEFAULT_USER);
		financialaccounttransactiontype.setRecSt(ENTITY_STATUS_ACTIVE);
		financialaccounttransactiontype.setLastModifiedUsr(DEFAULT_USER);
		financialaccounttransactiontype = super.createOperation(financialaccounttransactiontypeOperation);
		return financialaccounttransactiontype;
	}
	
	@Override
	public Financialaccounttransactiontype updateOperation(FinancialaccounttransactiontypeOperation financialaccounttransactiontypeOperation) {
		Financialaccounttransactiontype financialaccounttransactiontype = financialaccounttransactiontypeOperation.getFinancialaccounttransactiontype();
		financialaccounttransactiontype.setLastModifiedDt(new Date());
		financialaccounttransactiontype.setRecSt(ENTITY_STATUS_ACTIVE);
		financialaccounttransactiontype.setLastModifiedUsr(DEFAULT_USER);
		financialaccounttransactiontype = super.updateOperation(financialaccounttransactiontypeOperation);
		return financialaccounttransactiontype;
	}
}