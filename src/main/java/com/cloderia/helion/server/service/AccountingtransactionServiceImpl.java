
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

import com.cloderia.helion.client.shared.model.Accountingtransaction;
import com.cloderia.helion.client.shared.ops.AccountingtransactionOperation;
import com.cloderia.helion.client.shared.service.AccountingtransactiontypeService;
import com.cloderia.helion.client.shared.service.FixedassetService;
import com.cloderia.helion.client.shared.service.AccountingtransactionService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class AccountingtransactionServiceImpl extends BaseEntityServiceImpl<Accountingtransaction, AccountingtransactionOperation> implements
		AccountingtransactionService {

	@Inject
	AccountingtransactiontypeService accountingtransactiontypeService;
	@Inject
	FixedassetService fixedassetService;

	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public AccountingtransactionServiceImpl() {
		super(Accountingtransaction.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Accountingtransaction.ALL_ACCOUNTINGTRANSACTION_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Accountingtransaction.FIND_ACCOUNTINGTRANSACTION_BY_CODE_QUERY;
	}

	@Override
	public Accountingtransaction createOperation(AccountingtransactionOperation accountingtransactionOperation) {
		Accountingtransaction accountingtransaction = accountingtransactionOperation.getAccountingtransaction();
		accountingtransaction.setTransactionTy(accountingtransactiontypeService.findById(accountingtransactionOperation.getTransactionTyId()));
		accountingtransaction.setFixedAsset(fixedassetService.findById(accountingtransactionOperation.getFixedAssetId()));
		accountingtransaction.setRecSt("");
		accountingtransaction.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		accountingtransaction.setRowTs(new Date());
		accountingtransaction.setCreatedDt(new Date());
		accountingtransaction.setVersionNo(VERSIONING_ONE);
		accountingtransaction.setLastModifiedDt(new Date());
		accountingtransaction.setCreatedByUsr(DEFAULT_USER);
		accountingtransaction.setRecSt(ENTITY_STATUS_ACTIVE);
		accountingtransaction.setLastModifiedUsr(DEFAULT_USER);
		accountingtransaction = super.createOperation(accountingtransactionOperation);
		return accountingtransaction;
	}
	
	@Override
	public Accountingtransaction updateOperation(AccountingtransactionOperation accountingtransactionOperation) {
		Accountingtransaction accountingtransaction = accountingtransactionOperation.getAccountingtransaction();
		accountingtransaction.setTransactionTy(accountingtransactiontypeService.findById(accountingtransactionOperation.getTransactionTyId()));
		accountingtransaction.setFixedAsset(fixedassetService.findById(accountingtransactionOperation.getFixedAssetId()));
		accountingtransaction.setLastModifiedDt(new Date());
		accountingtransaction.setRecSt(ENTITY_STATUS_ACTIVE);
		accountingtransaction.setLastModifiedUsr(DEFAULT_USER);
		accountingtransaction = super.updateOperation(accountingtransactionOperation);
		return accountingtransaction;
	}
}