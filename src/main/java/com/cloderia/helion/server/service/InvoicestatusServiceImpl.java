
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

import com.cloderia.helion.client.shared.model.Invoicestatus;
import com.cloderia.helion.client.shared.ops.InvoicestatusOperation;
import com.cloderia.helion.client.shared.service.InvoiceService;
import com.cloderia.helion.client.shared.service.InvoicestatustypeService;
import com.cloderia.helion.client.shared.service.InvoicestatusService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class InvoicestatusServiceImpl extends BaseEntityServiceImpl<Invoicestatus, InvoicestatusOperation> implements
		InvoicestatusService {

	@Inject
	InvoiceService invoiceService;
	@Inject
	InvoicestatustypeService invoicestatustypeService;

	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public InvoicestatusServiceImpl() {
		super(Invoicestatus.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Invoicestatus.ALL_INVOICESTATUS_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Invoicestatus.FIND_INVOICESTATUS_BY_CODE_QUERY;
	}

	@Override
	public Invoicestatus createOperation(InvoicestatusOperation invoicestatusOperation) {
		Invoicestatus invoicestatus = invoicestatusOperation.getInvoicestatus();
		invoicestatus.setInvoice(invoiceService.findById(invoicestatusOperation.getInvoiceId()));
		invoicestatus.setInvoiceStatTy(invoicestatustypeService.findById(invoicestatusOperation.getInvoiceStatTyId()));
		invoicestatus.setRecSt("");
		invoicestatus.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		invoicestatus.setRowTs(new Date());
		invoicestatus.setCreatedDt(new Date());
		invoicestatus.setVersionNo(VERSIONING_ONE);
		invoicestatus.setLastModifiedDt(new Date());
		invoicestatus.setCreatedByUsr(DEFAULT_USER);
		invoicestatus.setRecSt(ENTITY_STATUS_ACTIVE);
		invoicestatus.setLastModifiedUsr(DEFAULT_USER);
		invoicestatus = super.createOperation(invoicestatusOperation);
		return invoicestatus;
	}
	
	@Override
	public Invoicestatus updateOperation(InvoicestatusOperation invoicestatusOperation) {
		Invoicestatus invoicestatus = invoicestatusOperation.getInvoicestatus();
		invoicestatus.setInvoice(invoiceService.findById(invoicestatusOperation.getInvoiceId()));
		invoicestatus.setInvoiceStatTy(invoicestatustypeService.findById(invoicestatusOperation.getInvoiceStatTyId()));
		invoicestatus.setLastModifiedDt(new Date());
		invoicestatus.setRecSt(ENTITY_STATUS_ACTIVE);
		invoicestatus.setLastModifiedUsr(DEFAULT_USER);
		invoicestatus = super.updateOperation(invoicestatusOperation);
		return invoicestatus;
	}
}