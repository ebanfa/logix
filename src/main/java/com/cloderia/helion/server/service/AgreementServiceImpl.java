
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

import com.cloderia.helion.client.shared.model.Agreement;
import com.cloderia.helion.client.shared.ops.AgreementOperation;
import com.cloderia.helion.client.shared.service.AgreementtypeService;
import com.cloderia.helion.client.shared.service.AgreementService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class AgreementServiceImpl extends BaseEntityServiceImpl<Agreement, AgreementOperation> implements
		AgreementService {

	@Inject
	AgreementtypeService agreementtypeService;

	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public AgreementServiceImpl() {
		super(Agreement.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Agreement.ALL_AGREEMENT_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Agreement.FIND_AGREEMENT_BY_CODE_QUERY;
	}

	@Override
	public Agreement createOperation(AgreementOperation agreementOperation) {
		Agreement agreement = agreementOperation.getAgreement();
		agreement.setAgreementTy(agreementtypeService.findById(agreementOperation.getAgreementTyId()));
		agreement.setRecSt("");
		agreement.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		agreement.setRowTs(new Date());
		agreement.setCreatedDt(new Date());
		agreement.setVersionNo(VERSIONING_ONE);
		agreement.setLastModifiedDt(new Date());
		agreement.setCreatedByUsr(DEFAULT_USER);
		agreement.setRecSt(ENTITY_STATUS_ACTIVE);
		agreement.setLastModifiedUsr(DEFAULT_USER);
		agreement = super.createOperation(agreementOperation);
		return agreement;
	}
	
	@Override
	public Agreement updateOperation(AgreementOperation agreementOperation) {
		Agreement agreement = agreementOperation.getAgreement();
		agreement.setAgreementTy(agreementtypeService.findById(agreementOperation.getAgreementTyId()));
		agreement.setLastModifiedDt(new Date());
		agreement.setRecSt(ENTITY_STATUS_ACTIVE);
		agreement.setLastModifiedUsr(DEFAULT_USER);
		agreement = super.updateOperation(agreementOperation);
		return agreement;
	}
}