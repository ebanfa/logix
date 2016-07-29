
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

import com.cloderia.helion.client.shared.model.Billingaccount;
import com.cloderia.helion.client.shared.ops.BillingaccountOperation;
import com.cloderia.helion.client.shared.service.BillingaccountService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class BillingaccountServiceImpl extends BaseEntityServiceImpl<Billingaccount, BillingaccountOperation> implements
		BillingaccountService {


	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public BillingaccountServiceImpl() {
		super(Billingaccount.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Billingaccount.ALL_BILLINGACCOUNT_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Billingaccount.FIND_BILLINGACCOUNT_BY_CODE_QUERY;
	}

	@Override
	public Billingaccount createOperation(BillingaccountOperation billingaccountOperation) {
		Billingaccount billingaccount = billingaccountOperation.getBillingaccount();
		billingaccount.setRecSt("");
		billingaccount.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		billingaccount.setRowTs(new Date());
		billingaccount.setCreatedDt(new Date());
		billingaccount.setVersionNo(VERSIONING_ONE);
		billingaccount.setLastModifiedDt(new Date());
		billingaccount.setCreatedByUsr(DEFAULT_USER);
		billingaccount.setRecSt(ENTITY_STATUS_ACTIVE);
		billingaccount.setLastModifiedUsr(DEFAULT_USER);
		billingaccount = super.createOperation(billingaccountOperation);
		return billingaccount;
	}
	
	@Override
	public Billingaccount updateOperation(BillingaccountOperation billingaccountOperation) {
		Billingaccount billingaccount = billingaccountOperation.getBillingaccount();
		billingaccount.setLastModifiedDt(new Date());
		billingaccount.setRecSt(ENTITY_STATUS_ACTIVE);
		billingaccount.setLastModifiedUsr(DEFAULT_USER);
		billingaccount = super.updateOperation(billingaccountOperation);
		return billingaccount;
	}
}