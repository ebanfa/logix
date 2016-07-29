
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

import com.cloderia.helion.client.shared.model.Invoiceitemtype;
import com.cloderia.helion.client.shared.ops.InvoiceitemtypeOperation;
import com.cloderia.helion.client.shared.service.InvoiceitemtypeService;
import com.cloderia.helion.client.shared.service.InvoiceitemtypeService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class InvoiceitemtypeServiceImpl extends BaseEntityServiceImpl<Invoiceitemtype, InvoiceitemtypeOperation> implements
		InvoiceitemtypeService {

	@Inject
	InvoiceitemtypeService invoiceitemtypeService;

	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public InvoiceitemtypeServiceImpl() {
		super(Invoiceitemtype.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Invoiceitemtype.ALL_INVOICEITEMTYPE_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Invoiceitemtype.FIND_INVOICEITEMTYPE_BY_CODE_QUERY;
	}

	@Override
	public Invoiceitemtype createOperation(InvoiceitemtypeOperation invoiceitemtypeOperation) {
		Invoiceitemtype invoiceitemtype = invoiceitemtypeOperation.getInvoiceitemtype();
		invoiceitemtype.setParentItemTy(invoiceitemtypeService.findById(invoiceitemtypeOperation.getParentItemTyId()));
		invoiceitemtype.setRecSt("");
		invoiceitemtype.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		invoiceitemtype.setRowTs(new Date());
		invoiceitemtype.setCreatedDt(new Date());
		invoiceitemtype.setVersionNo(VERSIONING_ONE);
		invoiceitemtype.setLastModifiedDt(new Date());
		invoiceitemtype.setCreatedByUsr(DEFAULT_USER);
		invoiceitemtype.setRecSt(ENTITY_STATUS_ACTIVE);
		invoiceitemtype.setLastModifiedUsr(DEFAULT_USER);
		invoiceitemtype = super.createOperation(invoiceitemtypeOperation);
		return invoiceitemtype;
	}
	
	@Override
	public Invoiceitemtype updateOperation(InvoiceitemtypeOperation invoiceitemtypeOperation) {
		Invoiceitemtype invoiceitemtype = invoiceitemtypeOperation.getInvoiceitemtype();
		invoiceitemtype.setParentItemTy(invoiceitemtypeService.findById(invoiceitemtypeOperation.getParentItemTyId()));
		invoiceitemtype.setLastModifiedDt(new Date());
		invoiceitemtype.setRecSt(ENTITY_STATUS_ACTIVE);
		invoiceitemtype.setLastModifiedUsr(DEFAULT_USER);
		invoiceitemtype = super.updateOperation(invoiceitemtypeOperation);
		return invoiceitemtype;
	}
}