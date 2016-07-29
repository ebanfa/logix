
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

import com.cloderia.helion.client.shared.model.Invoiceterm;
import com.cloderia.helion.client.shared.ops.InvoicetermOperation;
import com.cloderia.helion.client.shared.service.InvoiceService;
import com.cloderia.helion.client.shared.service.InvoiceitemService;
import com.cloderia.helion.client.shared.service.InvoicetermService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class InvoicetermServiceImpl extends BaseEntityServiceImpl<Invoiceterm, InvoicetermOperation> implements
		InvoicetermService {

	@Inject
	InvoiceService invoiceService;
	@Inject
	InvoiceitemService invoiceitemService;

	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public InvoicetermServiceImpl() {
		super(Invoiceterm.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Invoiceterm.ALL_INVOICETERM_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Invoiceterm.FIND_INVOICETERM_BY_CODE_QUERY;
	}

	@Override
	public Invoiceterm createOperation(InvoicetermOperation invoicetermOperation) {
		Invoiceterm invoiceterm = invoicetermOperation.getInvoiceterm();
		invoiceterm.setInvoice(invoiceService.findById(invoicetermOperation.getInvoiceId()));
		invoiceterm.setInvoiceItem(invoiceitemService.findById(invoicetermOperation.getInvoiceItemId()));
		invoiceterm.setRecSt("");
		invoiceterm.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		invoiceterm.setRowTs(new Date());
		invoiceterm.setCreatedDt(new Date());
		invoiceterm.setVersionNo(VERSIONING_ONE);
		invoiceterm.setLastModifiedDt(new Date());
		invoiceterm.setCreatedByUsr(DEFAULT_USER);
		invoiceterm.setRecSt(ENTITY_STATUS_ACTIVE);
		invoiceterm.setLastModifiedUsr(DEFAULT_USER);
		invoiceterm = super.createOperation(invoicetermOperation);
		return invoiceterm;
	}
	
	@Override
	public Invoiceterm updateOperation(InvoicetermOperation invoicetermOperation) {
		Invoiceterm invoiceterm = invoicetermOperation.getInvoiceterm();
		invoiceterm.setInvoice(invoiceService.findById(invoicetermOperation.getInvoiceId()));
		invoiceterm.setInvoiceItem(invoiceitemService.findById(invoicetermOperation.getInvoiceItemId()));
		invoiceterm.setLastModifiedDt(new Date());
		invoiceterm.setRecSt(ENTITY_STATUS_ACTIVE);
		invoiceterm.setLastModifiedUsr(DEFAULT_USER);
		invoiceterm = super.updateOperation(invoicetermOperation);
		return invoiceterm;
	}
}