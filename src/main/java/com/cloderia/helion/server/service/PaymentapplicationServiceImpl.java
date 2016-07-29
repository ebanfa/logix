
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

import com.cloderia.helion.client.shared.model.Paymentapplication;
import com.cloderia.helion.client.shared.ops.PaymentapplicationOperation;
import com.cloderia.helion.client.shared.service.PaymentService;
import com.cloderia.helion.client.shared.service.InvoiceService;
import com.cloderia.helion.client.shared.service.InvoiceitemService;
import com.cloderia.helion.client.shared.service.PaymentapplicationService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class PaymentapplicationServiceImpl extends BaseEntityServiceImpl<Paymentapplication, PaymentapplicationOperation> implements
		PaymentapplicationService {

	@Inject
	PaymentService paymentService;
	@Inject
	InvoiceService invoiceService;
	@Inject
	InvoiceitemService invoiceitemService;

	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public PaymentapplicationServiceImpl() {
		super(Paymentapplication.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Paymentapplication.ALL_PAYMENTAPPLICATION_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Paymentapplication.FIND_PAYMENTAPPLICATION_BY_CODE_QUERY;
	}

	@Override
	public Paymentapplication createOperation(PaymentapplicationOperation paymentapplicationOperation) {
		Paymentapplication paymentapplication = paymentapplicationOperation.getPaymentapplication();
		paymentapplication.setPayment(paymentService.findById(paymentapplicationOperation.getPaymentId()));
		paymentapplication.setInvoice(invoiceService.findById(paymentapplicationOperation.getInvoiceId()));
		paymentapplication.setInvoiceItem(invoiceitemService.findById(paymentapplicationOperation.getInvoiceItemId()));
		paymentapplication.setRecSt("");
		paymentapplication.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		paymentapplication.setRowTs(new Date());
		paymentapplication.setCreatedDt(new Date());
		paymentapplication.setVersionNo(VERSIONING_ONE);
		paymentapplication.setLastModifiedDt(new Date());
		paymentapplication.setCreatedByUsr(DEFAULT_USER);
		paymentapplication.setRecSt(ENTITY_STATUS_ACTIVE);
		paymentapplication.setLastModifiedUsr(DEFAULT_USER);
		paymentapplication = super.createOperation(paymentapplicationOperation);
		return paymentapplication;
	}
	
	@Override
	public Paymentapplication updateOperation(PaymentapplicationOperation paymentapplicationOperation) {
		Paymentapplication paymentapplication = paymentapplicationOperation.getPaymentapplication();
		paymentapplication.setPayment(paymentService.findById(paymentapplicationOperation.getPaymentId()));
		paymentapplication.setInvoice(invoiceService.findById(paymentapplicationOperation.getInvoiceId()));
		paymentapplication.setInvoiceItem(invoiceitemService.findById(paymentapplicationOperation.getInvoiceItemId()));
		paymentapplication.setLastModifiedDt(new Date());
		paymentapplication.setRecSt(ENTITY_STATUS_ACTIVE);
		paymentapplication.setLastModifiedUsr(DEFAULT_USER);
		paymentapplication = super.updateOperation(paymentapplicationOperation);
		return paymentapplication;
	}
}