
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

import com.cloderia.helion.client.shared.model.Agreementtype;
import com.cloderia.helion.client.shared.ops.AgreementtypeOperation;
import com.cloderia.helion.client.shared.service.AgreementtypeService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class AgreementtypeServiceImpl extends BaseEntityServiceImpl<Agreementtype, AgreementtypeOperation> implements
		AgreementtypeService {


	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public AgreementtypeServiceImpl() {
		super(Agreementtype.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Agreementtype.ALL_AGREEMENTTYPE_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Agreementtype.FIND_AGREEMENTTYPE_BY_CODE_QUERY;
	}

	@Override
	public Agreementtype createOperation(AgreementtypeOperation agreementtypeOperation) {
		Agreementtype agreementtype = agreementtypeOperation.getAgreementtype();
		agreementtype.setRecSt("");
		agreementtype.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		agreementtype.setRowTs(new Date());
		agreementtype.setCreatedDt(new Date());
		agreementtype.setVersionNo(VERSIONING_ONE);
		agreementtype.setLastModifiedDt(new Date());
		agreementtype.setCreatedByUsr(DEFAULT_USER);
		agreementtype.setRecSt(ENTITY_STATUS_ACTIVE);
		agreementtype.setLastModifiedUsr(DEFAULT_USER);
		agreementtype = super.createOperation(agreementtypeOperation);
		return agreementtype;
	}
	
	@Override
	public Agreementtype updateOperation(AgreementtypeOperation agreementtypeOperation) {
		Agreementtype agreementtype = agreementtypeOperation.getAgreementtype();
		agreementtype.setLastModifiedDt(new Date());
		agreementtype.setRecSt(ENTITY_STATUS_ACTIVE);
		agreementtype.setLastModifiedUsr(DEFAULT_USER);
		agreementtype = super.updateOperation(agreementtypeOperation);
		return agreementtype;
	}
}