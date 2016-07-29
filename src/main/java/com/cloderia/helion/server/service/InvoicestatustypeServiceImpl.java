
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

import com.cloderia.helion.client.shared.model.Invoicestatustype;
import com.cloderia.helion.client.shared.ops.InvoicestatustypeOperation;
import com.cloderia.helion.client.shared.service.InvoicestatustypeService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class InvoicestatustypeServiceImpl extends BaseEntityServiceImpl<Invoicestatustype, InvoicestatustypeOperation> implements
		InvoicestatustypeService {


	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public InvoicestatustypeServiceImpl() {
		super(Invoicestatustype.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Invoicestatustype.ALL_INVOICESTATUSTYPE_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Invoicestatustype.FIND_INVOICESTATUSTYPE_BY_CODE_QUERY;
	}

	@Override
	public Invoicestatustype createOperation(InvoicestatustypeOperation invoicestatustypeOperation) {
		Invoicestatustype invoicestatustype = invoicestatustypeOperation.getInvoicestatustype();
		invoicestatustype.setRecSt("");
		invoicestatustype.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		invoicestatustype.setRowTs(new Date());
		invoicestatustype.setCreatedDt(new Date());
		invoicestatustype.setVersionNo(VERSIONING_ONE);
		invoicestatustype.setLastModifiedDt(new Date());
		invoicestatustype.setCreatedByUsr(DEFAULT_USER);
		invoicestatustype.setRecSt(ENTITY_STATUS_ACTIVE);
		invoicestatustype.setLastModifiedUsr(DEFAULT_USER);
		invoicestatustype = super.createOperation(invoicestatustypeOperation);
		return invoicestatustype;
	}
	
	@Override
	public Invoicestatustype updateOperation(InvoicestatustypeOperation invoicestatustypeOperation) {
		Invoicestatustype invoicestatustype = invoicestatustypeOperation.getInvoicestatustype();
		invoicestatustype.setLastModifiedDt(new Date());
		invoicestatustype.setRecSt(ENTITY_STATUS_ACTIVE);
		invoicestatustype.setLastModifiedUsr(DEFAULT_USER);
		invoicestatustype = super.updateOperation(invoicestatustypeOperation);
		return invoicestatustype;
	}
}