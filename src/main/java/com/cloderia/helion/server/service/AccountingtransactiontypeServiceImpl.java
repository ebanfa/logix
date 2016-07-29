
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

import com.cloderia.helion.client.shared.model.Accountingtransactiontype;
import com.cloderia.helion.client.shared.ops.AccountingtransactiontypeOperation;
import com.cloderia.helion.client.shared.service.AccountingtransactiontypeService;
import com.cloderia.helion.client.shared.service.AccountingtransactiontypeService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class AccountingtransactiontypeServiceImpl extends BaseEntityServiceImpl<Accountingtransactiontype, AccountingtransactiontypeOperation> implements
		AccountingtransactiontypeService {

	@Inject
	AccountingtransactiontypeService accountingtransactiontypeService;

	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public AccountingtransactiontypeServiceImpl() {
		super(Accountingtransactiontype.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Accountingtransactiontype.ALL_ACCOUNTINGTRANSACTIONTYPE_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Accountingtransactiontype.FIND_ACCOUNTINGTRANSACTIONTYPE_BY_CODE_QUERY;
	}

	@Override
	public Accountingtransactiontype createOperation(AccountingtransactiontypeOperation accountingtransactiontypeOperation) {
		Accountingtransactiontype accountingtransactiontype = accountingtransactiontypeOperation.getAccountingtransactiontype();
		accountingtransactiontype.setParentTy(accountingtransactiontypeService.findById(accountingtransactiontypeOperation.getParentTyId()));
		accountingtransactiontype.setRecSt("");
		accountingtransactiontype.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		accountingtransactiontype.setRowTs(new Date());
		accountingtransactiontype.setCreatedDt(new Date());
		accountingtransactiontype.setVersionNo(VERSIONING_ONE);
		accountingtransactiontype.setLastModifiedDt(new Date());
		accountingtransactiontype.setCreatedByUsr(DEFAULT_USER);
		accountingtransactiontype.setRecSt(ENTITY_STATUS_ACTIVE);
		accountingtransactiontype.setLastModifiedUsr(DEFAULT_USER);
		accountingtransactiontype = super.createOperation(accountingtransactiontypeOperation);
		return accountingtransactiontype;
	}
	
	@Override
	public Accountingtransactiontype updateOperation(AccountingtransactiontypeOperation accountingtransactiontypeOperation) {
		Accountingtransactiontype accountingtransactiontype = accountingtransactiontypeOperation.getAccountingtransactiontype();
		accountingtransactiontype.setParentTy(accountingtransactiontypeService.findById(accountingtransactiontypeOperation.getParentTyId()));
		accountingtransactiontype.setLastModifiedDt(new Date());
		accountingtransactiontype.setRecSt(ENTITY_STATUS_ACTIVE);
		accountingtransactiontype.setLastModifiedUsr(DEFAULT_USER);
		accountingtransactiontype = super.updateOperation(accountingtransactiontypeOperation);
		return accountingtransactiontype;
	}
}