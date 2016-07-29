
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

import com.cloderia.helion.client.shared.model.Invoiceitem;
import com.cloderia.helion.client.shared.ops.InvoiceitemOperation;
import com.cloderia.helion.client.shared.service.InvoiceitemtypeService;
import com.cloderia.helion.client.shared.service.InvoiceService;
import com.cloderia.helion.client.shared.service.InvoiceitemService;
import com.cloderia.helion.client.shared.service.InvoiceitemService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class InvoiceitemServiceImpl extends BaseEntityServiceImpl<Invoiceitem, InvoiceitemOperation> implements
		InvoiceitemService {

	@Inject
	InvoiceitemtypeService invoiceitemtypeService;
	@Inject
	InvoiceService invoiceService;
	@Inject
	InvoiceitemService invoiceitemService;

	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public InvoiceitemServiceImpl() {
		super(Invoiceitem.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Invoiceitem.ALL_INVOICEITEM_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Invoiceitem.FIND_INVOICEITEM_BY_CODE_QUERY;
	}

	@Override
	public Invoiceitem createOperation(InvoiceitemOperation invoiceitemOperation) {
		Invoiceitem invoiceitem = invoiceitemOperation.getInvoiceitem();
		invoiceitem.setItemTy(invoiceitemtypeService.findById(invoiceitemOperation.getItemTyId()));
		invoiceitem.setInvoice(invoiceService.findById(invoiceitemOperation.getInvoiceId()));
		invoiceitem.setSoldWithItem(invoiceitemService.findById(invoiceitemOperation.getSoldWithItemId()));
		invoiceitem.setAdjByItem(invoiceitemService.findById(invoiceitemOperation.getAdjByItemId()));
		invoiceitem.setRecSt("");
		invoiceitem.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		invoiceitem.setRowTs(new Date());
		invoiceitem.setCreatedDt(new Date());
		invoiceitem.setVersionNo(VERSIONING_ONE);
		invoiceitem.setLastModifiedDt(new Date());
		invoiceitem.setCreatedByUsr(DEFAULT_USER);
		invoiceitem.setRecSt(ENTITY_STATUS_ACTIVE);
		invoiceitem.setLastModifiedUsr(DEFAULT_USER);
		invoiceitem = super.createOperation(invoiceitemOperation);
		return invoiceitem;
	}
	
	@Override
	public Invoiceitem updateOperation(InvoiceitemOperation invoiceitemOperation) {
		Invoiceitem invoiceitem = invoiceitemOperation.getInvoiceitem();
		invoiceitem.setItemTy(invoiceitemtypeService.findById(invoiceitemOperation.getItemTyId()));
		invoiceitem.setInvoice(invoiceService.findById(invoiceitemOperation.getInvoiceId()));
		invoiceitem.setSoldWithItem(invoiceitemService.findById(invoiceitemOperation.getSoldWithItemId()));
		invoiceitem.setAdjByItem(invoiceitemService.findById(invoiceitemOperation.getAdjByItemId()));
		invoiceitem.setLastModifiedDt(new Date());
		invoiceitem.setRecSt(ENTITY_STATUS_ACTIVE);
		invoiceitem.setLastModifiedUsr(DEFAULT_USER);
		invoiceitem = super.updateOperation(invoiceitemOperation);
		return invoiceitem;
	}
}