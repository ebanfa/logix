
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

import com.cloderia.helion.client.shared.model.Paymentmethodtype;
import com.cloderia.helion.client.shared.ops.PaymentmethodtypeOperation;
import com.cloderia.helion.client.shared.service.PaymentmethodtypeService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class PaymentmethodtypeServiceImpl extends BaseEntityServiceImpl<Paymentmethodtype, PaymentmethodtypeOperation> implements
		PaymentmethodtypeService {


	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public PaymentmethodtypeServiceImpl() {
		super(Paymentmethodtype.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Paymentmethodtype.ALL_PAYMENTMETHODTYPE_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Paymentmethodtype.FIND_PAYMENTMETHODTYPE_BY_CODE_QUERY;
	}

	@Override
	public Paymentmethodtype createOperation(PaymentmethodtypeOperation paymentmethodtypeOperation) {
		Paymentmethodtype paymentmethodtype = paymentmethodtypeOperation.getPaymentmethodtype();
		paymentmethodtype.setRecSt("");
		paymentmethodtype.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		paymentmethodtype.setRowTs(new Date());
		paymentmethodtype.setCreatedDt(new Date());
		paymentmethodtype.setVersionNo(VERSIONING_ONE);
		paymentmethodtype.setLastModifiedDt(new Date());
		paymentmethodtype.setCreatedByUsr(DEFAULT_USER);
		paymentmethodtype.setRecSt(ENTITY_STATUS_ACTIVE);
		paymentmethodtype.setLastModifiedUsr(DEFAULT_USER);
		paymentmethodtype = super.createOperation(paymentmethodtypeOperation);
		return paymentmethodtype;
	}
	
	@Override
	public Paymentmethodtype updateOperation(PaymentmethodtypeOperation paymentmethodtypeOperation) {
		Paymentmethodtype paymentmethodtype = paymentmethodtypeOperation.getPaymentmethodtype();
		paymentmethodtype.setLastModifiedDt(new Date());
		paymentmethodtype.setRecSt(ENTITY_STATUS_ACTIVE);
		paymentmethodtype.setLastModifiedUsr(DEFAULT_USER);
		paymentmethodtype = super.updateOperation(paymentmethodtypeOperation);
		return paymentmethodtype;
	}
}