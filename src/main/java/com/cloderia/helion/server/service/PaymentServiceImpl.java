
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

import com.cloderia.helion.client.shared.model.Payment;
import com.cloderia.helion.client.shared.ops.PaymentOperation;
import com.cloderia.helion.client.shared.service.PaymentmethodtypeService;
import com.cloderia.helion.client.shared.service.PaymenttypeService;
import com.cloderia.helion.client.shared.service.PaymentService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class PaymentServiceImpl extends BaseEntityServiceImpl<Payment, PaymentOperation> implements
		PaymentService {

	@Inject
	PaymentmethodtypeService paymentmethodtypeService;
	@Inject
	PaymenttypeService paymenttypeService;

	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public PaymentServiceImpl() {
		super(Payment.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Payment.ALL_PAYMENT_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Payment.FIND_PAYMENT_BY_CODE_QUERY;
	}

	@Override
	public Payment createOperation(PaymentOperation paymentOperation) {
		Payment payment = paymentOperation.getPayment();
		payment.setMethodTy(paymentmethodtypeService.findById(paymentOperation.getMethodTyId()));
		payment.setPaymentTy(paymenttypeService.findById(paymentOperation.getPaymentTyId()));
		payment.setRecSt("");
		payment.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		payment.setRowTs(new Date());
		payment.setCreatedDt(new Date());
		payment.setVersionNo(VERSIONING_ONE);
		payment.setLastModifiedDt(new Date());
		payment.setCreatedByUsr(DEFAULT_USER);
		payment.setRecSt(ENTITY_STATUS_ACTIVE);
		payment.setLastModifiedUsr(DEFAULT_USER);
		payment = super.createOperation(paymentOperation);
		return payment;
	}
	
	@Override
	public Payment updateOperation(PaymentOperation paymentOperation) {
		Payment payment = paymentOperation.getPayment();
		payment.setMethodTy(paymentmethodtypeService.findById(paymentOperation.getMethodTyId()));
		payment.setPaymentTy(paymenttypeService.findById(paymentOperation.getPaymentTyId()));
		payment.setLastModifiedDt(new Date());
		payment.setRecSt(ENTITY_STATUS_ACTIVE);
		payment.setLastModifiedUsr(DEFAULT_USER);
		payment = super.updateOperation(paymentOperation);
		return payment;
	}
}