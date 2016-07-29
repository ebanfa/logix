
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

import com.cloderia.helion.client.shared.model.Financialaccountroletype;
import com.cloderia.helion.client.shared.ops.FinancialaccountroletypeOperation;
import com.cloderia.helion.client.shared.service.FinancialaccountroletypeService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class FinancialaccountroletypeServiceImpl extends BaseEntityServiceImpl<Financialaccountroletype, FinancialaccountroletypeOperation> implements
		FinancialaccountroletypeService {


	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public FinancialaccountroletypeServiceImpl() {
		super(Financialaccountroletype.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Financialaccountroletype.ALL_FINANCIALACCOUNTROLETYPE_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Financialaccountroletype.FIND_FINANCIALACCOUNTROLETYPE_BY_CODE_QUERY;
	}

	@Override
	public Financialaccountroletype createOperation(FinancialaccountroletypeOperation financialaccountroletypeOperation) {
		Financialaccountroletype financialaccountroletype = financialaccountroletypeOperation.getFinancialaccountroletype();
		financialaccountroletype.setRecSt("");
		financialaccountroletype.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		financialaccountroletype.setRowTs(new Date());
		financialaccountroletype.setCreatedDt(new Date());
		financialaccountroletype.setVersionNo(VERSIONING_ONE);
		financialaccountroletype.setLastModifiedDt(new Date());
		financialaccountroletype.setCreatedByUsr(DEFAULT_USER);
		financialaccountroletype.setRecSt(ENTITY_STATUS_ACTIVE);
		financialaccountroletype.setLastModifiedUsr(DEFAULT_USER);
		financialaccountroletype = super.createOperation(financialaccountroletypeOperation);
		return financialaccountroletype;
	}
	
	@Override
	public Financialaccountroletype updateOperation(FinancialaccountroletypeOperation financialaccountroletypeOperation) {
		Financialaccountroletype financialaccountroletype = financialaccountroletypeOperation.getFinancialaccountroletype();
		financialaccountroletype.setLastModifiedDt(new Date());
		financialaccountroletype.setRecSt(ENTITY_STATUS_ACTIVE);
		financialaccountroletype.setLastModifiedUsr(DEFAULT_USER);
		financialaccountroletype = super.updateOperation(financialaccountroletypeOperation);
		return financialaccountroletype;
	}
}