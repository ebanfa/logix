
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

import com.cloderia.helion.client.shared.model.Invoiceroletype;
import com.cloderia.helion.client.shared.ops.InvoiceroletypeOperation;
import com.cloderia.helion.client.shared.service.InvoiceroletypeService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class InvoiceroletypeServiceImpl extends BaseEntityServiceImpl<Invoiceroletype, InvoiceroletypeOperation> implements
		InvoiceroletypeService {


	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public InvoiceroletypeServiceImpl() {
		super(Invoiceroletype.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Invoiceroletype.ALL_INVOICEROLETYPE_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Invoiceroletype.FIND_INVOICEROLETYPE_BY_CODE_QUERY;
	}

	@Override
	public Invoiceroletype createOperation(InvoiceroletypeOperation invoiceroletypeOperation) {
		Invoiceroletype invoiceroletype = invoiceroletypeOperation.getInvoiceroletype();
		invoiceroletype.setRecSt("");
		invoiceroletype.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		invoiceroletype.setRowTs(new Date());
		invoiceroletype.setCreatedDt(new Date());
		invoiceroletype.setVersionNo(VERSIONING_ONE);
		invoiceroletype.setLastModifiedDt(new Date());
		invoiceroletype.setCreatedByUsr(DEFAULT_USER);
		invoiceroletype.setRecSt(ENTITY_STATUS_ACTIVE);
		invoiceroletype.setLastModifiedUsr(DEFAULT_USER);
		invoiceroletype = super.createOperation(invoiceroletypeOperation);
		return invoiceroletype;
	}
	
	@Override
	public Invoiceroletype updateOperation(InvoiceroletypeOperation invoiceroletypeOperation) {
		Invoiceroletype invoiceroletype = invoiceroletypeOperation.getInvoiceroletype();
		invoiceroletype.setLastModifiedDt(new Date());
		invoiceroletype.setRecSt(ENTITY_STATUS_ACTIVE);
		invoiceroletype.setLastModifiedUsr(DEFAULT_USER);
		invoiceroletype = super.updateOperation(invoiceroletypeOperation);
		return invoiceroletype;
	}
}