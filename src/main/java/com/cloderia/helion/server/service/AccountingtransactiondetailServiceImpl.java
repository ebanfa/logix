
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

import com.cloderia.helion.client.shared.model.Accountingtransactiondetail;
import com.cloderia.helion.client.shared.ops.AccountingtransactiondetailOperation;
import com.cloderia.helion.client.shared.service.AccountingtransactionService;
import com.cloderia.helion.client.shared.service.AccountingtransactiondetailService;
import com.cloderia.helion.client.shared.service.AccountingtransactiondetailService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class AccountingtransactiondetailServiceImpl extends BaseEntityServiceImpl<Accountingtransactiondetail, AccountingtransactiondetailOperation> implements
		AccountingtransactiondetailService {

	@Inject
	AccountingtransactionService accountingtransactionService;
	@Inject
	AccountingtransactiondetailService accountingtransactiondetailService;

	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public AccountingtransactiondetailServiceImpl() {
		super(Accountingtransactiondetail.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Accountingtransactiondetail.ALL_ACCOUNTINGTRANSACTIONDETAIL_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Accountingtransactiondetail.FIND_ACCOUNTINGTRANSACTIONDETAIL_BY_CODE_QUERY;
	}

	@Override
	public Accountingtransactiondetail createOperation(AccountingtransactiondetailOperation accountingtransactiondetailOperation) {
		Accountingtransactiondetail accountingtransactiondetail = accountingtransactiondetailOperation.getAccountingtransactiondetail();
		accountingtransactiondetail.setTransaction(accountingtransactionService.findById(accountingtransactiondetailOperation.getTransactionId()));
		accountingtransactiondetail.setAssociatedDetail(accountingtransactiondetailService.findById(accountingtransactiondetailOperation.getAssociatedDetailId()));
		accountingtransactiondetail.setRecSt("");
		accountingtransactiondetail.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		accountingtransactiondetail.setRowTs(new Date());
		accountingtransactiondetail.setCreatedDt(new Date());
		accountingtransactiondetail.setVersionNo(VERSIONING_ONE);
		accountingtransactiondetail.setLastModifiedDt(new Date());
		accountingtransactiondetail.setCreatedByUsr(DEFAULT_USER);
		accountingtransactiondetail.setRecSt(ENTITY_STATUS_ACTIVE);
		accountingtransactiondetail.setLastModifiedUsr(DEFAULT_USER);
		accountingtransactiondetail = super.createOperation(accountingtransactiondetailOperation);
		return accountingtransactiondetail;
	}
	
	@Override
	public Accountingtransactiondetail updateOperation(AccountingtransactiondetailOperation accountingtransactiondetailOperation) {
		Accountingtransactiondetail accountingtransactiondetail = accountingtransactiondetailOperation.getAccountingtransactiondetail();
		accountingtransactiondetail.setTransaction(accountingtransactionService.findById(accountingtransactiondetailOperation.getTransactionId()));
		accountingtransactiondetail.setAssociatedDetail(accountingtransactiondetailService.findById(accountingtransactiondetailOperation.getAssociatedDetailId()));
		accountingtransactiondetail.setLastModifiedDt(new Date());
		accountingtransactiondetail.setRecSt(ENTITY_STATUS_ACTIVE);
		accountingtransactiondetail.setLastModifiedUsr(DEFAULT_USER);
		accountingtransactiondetail = super.updateOperation(accountingtransactiondetailOperation);
		return accountingtransactiondetail;
	}
}