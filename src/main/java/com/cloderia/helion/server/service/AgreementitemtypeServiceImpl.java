
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

import com.cloderia.helion.client.shared.model.Agreementitemtype;
import com.cloderia.helion.client.shared.ops.AgreementitemtypeOperation;
import com.cloderia.helion.client.shared.service.AgreementitemtypeService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class AgreementitemtypeServiceImpl extends BaseEntityServiceImpl<Agreementitemtype, AgreementitemtypeOperation> implements
		AgreementitemtypeService {


	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public AgreementitemtypeServiceImpl() {
		super(Agreementitemtype.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Agreementitemtype.ALL_AGREEMENTITEMTYPE_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Agreementitemtype.FIND_AGREEMENTITEMTYPE_BY_CODE_QUERY;
	}

	@Override
	public Agreementitemtype createOperation(AgreementitemtypeOperation agreementitemtypeOperation) {
		Agreementitemtype agreementitemtype = agreementitemtypeOperation.getAgreementitemtype();
		agreementitemtype.setRecSt("");
		agreementitemtype.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		agreementitemtype.setRowTs(new Date());
		agreementitemtype.setCreatedDt(new Date());
		agreementitemtype.setVersionNo(VERSIONING_ONE);
		agreementitemtype.setLastModifiedDt(new Date());
		agreementitemtype.setCreatedByUsr(DEFAULT_USER);
		agreementitemtype.setRecSt(ENTITY_STATUS_ACTIVE);
		agreementitemtype.setLastModifiedUsr(DEFAULT_USER);
		agreementitemtype = super.createOperation(agreementitemtypeOperation);
		return agreementitemtype;
	}
	
	@Override
	public Agreementitemtype updateOperation(AgreementitemtypeOperation agreementitemtypeOperation) {
		Agreementitemtype agreementitemtype = agreementitemtypeOperation.getAgreementitemtype();
		agreementitemtype.setLastModifiedDt(new Date());
		agreementitemtype.setRecSt(ENTITY_STATUS_ACTIVE);
		agreementitemtype.setLastModifiedUsr(DEFAULT_USER);
		agreementitemtype = super.updateOperation(agreementitemtypeOperation);
		return agreementitemtype;
	}
}