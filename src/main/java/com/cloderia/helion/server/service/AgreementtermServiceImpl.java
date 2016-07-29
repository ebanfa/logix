
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

import com.cloderia.helion.client.shared.model.Agreementterm;
import com.cloderia.helion.client.shared.ops.AgreementtermOperation;
import com.cloderia.helion.client.shared.service.AgreementService;
import com.cloderia.helion.client.shared.service.AgreementitemService;
import com.cloderia.helion.client.shared.service.TermtypeService;
import com.cloderia.helion.client.shared.service.AgreementtermService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class AgreementtermServiceImpl extends BaseEntityServiceImpl<Agreementterm, AgreementtermOperation> implements
		AgreementtermService {

	@Inject
	AgreementService agreementService;
	@Inject
	AgreementitemService agreementitemService;
	@Inject
	TermtypeService termtypeService;

	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public AgreementtermServiceImpl() {
		super(Agreementterm.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Agreementterm.ALL_AGREEMENTTERM_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Agreementterm.FIND_AGREEMENTTERM_BY_CODE_QUERY;
	}

	@Override
	public Agreementterm createOperation(AgreementtermOperation agreementtermOperation) {
		Agreementterm agreementterm = agreementtermOperation.getAgreementterm();
		agreementterm.setAgreement(agreementService.findById(agreementtermOperation.getAgreementId()));
		agreementterm.setAgreementItem(agreementitemService.findById(agreementtermOperation.getAgreementItemId()));
		agreementterm.setTermTy(termtypeService.findById(agreementtermOperation.getTermTyId()));
		agreementterm.setRecSt("");
		agreementterm.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		agreementterm.setRowTs(new Date());
		agreementterm.setCreatedDt(new Date());
		agreementterm.setVersionNo(VERSIONING_ONE);
		agreementterm.setLastModifiedDt(new Date());
		agreementterm.setCreatedByUsr(DEFAULT_USER);
		agreementterm.setRecSt(ENTITY_STATUS_ACTIVE);
		agreementterm.setLastModifiedUsr(DEFAULT_USER);
		agreementterm = super.createOperation(agreementtermOperation);
		return agreementterm;
	}
	
	@Override
	public Agreementterm updateOperation(AgreementtermOperation agreementtermOperation) {
		Agreementterm agreementterm = agreementtermOperation.getAgreementterm();
		agreementterm.setAgreement(agreementService.findById(agreementtermOperation.getAgreementId()));
		agreementterm.setAgreementItem(agreementitemService.findById(agreementtermOperation.getAgreementItemId()));
		agreementterm.setTermTy(termtypeService.findById(agreementtermOperation.getTermTyId()));
		agreementterm.setLastModifiedDt(new Date());
		agreementterm.setRecSt(ENTITY_STATUS_ACTIVE);
		agreementterm.setLastModifiedUsr(DEFAULT_USER);
		agreementterm = super.updateOperation(agreementtermOperation);
		return agreementterm;
	}
}