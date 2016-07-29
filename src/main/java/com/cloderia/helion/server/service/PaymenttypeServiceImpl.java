
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

import com.cloderia.helion.client.shared.model.Paymenttype;
import com.cloderia.helion.client.shared.ops.PaymenttypeOperation;
import com.cloderia.helion.client.shared.service.PaymenttypeService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class PaymenttypeServiceImpl extends BaseEntityServiceImpl<Paymenttype, PaymenttypeOperation> implements
		PaymenttypeService {


	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public PaymenttypeServiceImpl() {
		super(Paymenttype.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Paymenttype.ALL_PAYMENTTYPE_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Paymenttype.FIND_PAYMENTTYPE_BY_CODE_QUERY;
	}

	@Override
	public Paymenttype createOperation(PaymenttypeOperation paymenttypeOperation) {
		Paymenttype paymenttype = paymenttypeOperation.getPaymenttype();
		paymenttype.setRecSt("");
		paymenttype.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		paymenttype.setRowTs(new Date());
		paymenttype.setCreatedDt(new Date());
		paymenttype.setVersionNo(VERSIONING_ONE);
		paymenttype.setLastModifiedDt(new Date());
		paymenttype.setCreatedByUsr(DEFAULT_USER);
		paymenttype.setRecSt(ENTITY_STATUS_ACTIVE);
		paymenttype.setLastModifiedUsr(DEFAULT_USER);
		paymenttype = super.createOperation(paymenttypeOperation);
		return paymenttype;
	}
	
	@Override
	public Paymenttype updateOperation(PaymenttypeOperation paymenttypeOperation) {
		Paymenttype paymenttype = paymenttypeOperation.getPaymenttype();
		paymenttype.setLastModifiedDt(new Date());
		paymenttype.setRecSt(ENTITY_STATUS_ACTIVE);
		paymenttype.setLastModifiedUsr(DEFAULT_USER);
		paymenttype = super.updateOperation(paymenttypeOperation);
		return paymenttype;
	}
}