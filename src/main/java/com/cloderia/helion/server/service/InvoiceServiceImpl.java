
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

import com.cloderia.helion.client.shared.model.Invoice;
import com.cloderia.helion.client.shared.ops.InvoiceOperation;
import com.cloderia.helion.client.shared.service.InvoiceService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class InvoiceServiceImpl extends BaseEntityServiceImpl<Invoice, InvoiceOperation> implements
		InvoiceService {


	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public InvoiceServiceImpl() {
		super(Invoice.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Invoice.ALL_INVOICE_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Invoice.FIND_INVOICE_BY_CODE_QUERY;
	}

	@Override
	public Invoice createOperation(InvoiceOperation invoiceOperation) {
		Invoice invoice = invoiceOperation.getInvoice();
		invoice.setRecSt("");
		invoice.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		invoice.setRowTs(new Date());
		invoice.setCreatedDt(new Date());
		invoice.setVersionNo(VERSIONING_ONE);
		invoice.setLastModifiedDt(new Date());
		invoice.setCreatedByUsr(DEFAULT_USER);
		invoice.setRecSt(ENTITY_STATUS_ACTIVE);
		invoice.setLastModifiedUsr(DEFAULT_USER);
		invoice = super.createOperation(invoiceOperation);
		return invoice;
	}
	
	@Override
	public Invoice updateOperation(InvoiceOperation invoiceOperation) {
		Invoice invoice = invoiceOperation.getInvoice();
		invoice.setLastModifiedDt(new Date());
		invoice.setRecSt(ENTITY_STATUS_ACTIVE);
		invoice.setLastModifiedUsr(DEFAULT_USER);
		invoice = super.updateOperation(invoiceOperation);
		return invoice;
	}
}