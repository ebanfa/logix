
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

import com.cloderia.helion.client.shared.model.Financialaccounttype;
import com.cloderia.helion.client.shared.ops.FinancialaccounttypeOperation;
import com.cloderia.helion.client.shared.service.FinancialaccounttypeService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class FinancialaccounttypeServiceImpl extends BaseEntityServiceImpl<Financialaccounttype, FinancialaccounttypeOperation> implements
		FinancialaccounttypeService {


	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public FinancialaccounttypeServiceImpl() {
		super(Financialaccounttype.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Financialaccounttype.ALL_FINANCIALACCOUNTTYPE_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Financialaccounttype.FIND_FINANCIALACCOUNTTYPE_BY_CODE_QUERY;
	}

	@Override
	public Financialaccounttype createOperation(FinancialaccounttypeOperation financialaccounttypeOperation) {
		Financialaccounttype financialaccounttype = financialaccounttypeOperation.getFinancialaccounttype();
		financialaccounttype.setRecSt("");
		financialaccounttype.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		financialaccounttype.setRowTs(new Date());
		financialaccounttype.setCreatedDt(new Date());
		financialaccounttype.setVersionNo(VERSIONING_ONE);
		financialaccounttype.setLastModifiedDt(new Date());
		financialaccounttype.setCreatedByUsr(DEFAULT_USER);
		financialaccounttype.setRecSt(ENTITY_STATUS_ACTIVE);
		financialaccounttype.setLastModifiedUsr(DEFAULT_USER);
		financialaccounttype = super.createOperation(financialaccounttypeOperation);
		return financialaccounttype;
	}
	
	@Override
	public Financialaccounttype updateOperation(FinancialaccounttypeOperation financialaccounttypeOperation) {
		Financialaccounttype financialaccounttype = financialaccounttypeOperation.getFinancialaccounttype();
		financialaccounttype.setLastModifiedDt(new Date());
		financialaccounttype.setRecSt(ENTITY_STATUS_ACTIVE);
		financialaccounttype.setLastModifiedUsr(DEFAULT_USER);
		financialaccounttype = super.updateOperation(financialaccounttypeOperation);
		return financialaccounttype;
	}
}