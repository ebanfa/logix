
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

import com.cloderia.helion.client.shared.model.Agreementrole;
import com.cloderia.helion.client.shared.ops.AgreementroleOperation;
import com.cloderia.helion.client.shared.service.AgreementroletypeService;
import com.cloderia.helion.client.shared.service.AgreementService;
import com.cloderia.helion.client.shared.service.AgreementroleService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class AgreementroleServiceImpl extends BaseEntityServiceImpl<Agreementrole, AgreementroleOperation> implements
		AgreementroleService {

	@Inject
	AgreementroletypeService agreementroletypeService;
	@Inject
	AgreementService agreementService;

	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public AgreementroleServiceImpl() {
		super(Agreementrole.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Agreementrole.ALL_AGREEMENTROLE_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Agreementrole.FIND_AGREEMENTROLE_BY_CODE_QUERY;
	}

	@Override
	public Agreementrole createOperation(AgreementroleOperation agreementroleOperation) {
		Agreementrole agreementrole = agreementroleOperation.getAgreementrole();
		agreementrole.setAgreementRoleTy(agreementroletypeService.findById(agreementroleOperation.getAgreementRoleTyId()));
		agreementrole.setAgreement(agreementService.findById(agreementroleOperation.getAgreementId()));
		agreementrole.setRecSt("");
		agreementrole.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		agreementrole.setRowTs(new Date());
		agreementrole.setCreatedDt(new Date());
		agreementrole.setVersionNo(VERSIONING_ONE);
		agreementrole.setLastModifiedDt(new Date());
		agreementrole.setCreatedByUsr(DEFAULT_USER);
		agreementrole.setRecSt(ENTITY_STATUS_ACTIVE);
		agreementrole.setLastModifiedUsr(DEFAULT_USER);
		agreementrole = super.createOperation(agreementroleOperation);
		return agreementrole;
	}
	
	@Override
	public Agreementrole updateOperation(AgreementroleOperation agreementroleOperation) {
		Agreementrole agreementrole = agreementroleOperation.getAgreementrole();
		agreementrole.setAgreementRoleTy(agreementroletypeService.findById(agreementroleOperation.getAgreementRoleTyId()));
		agreementrole.setAgreement(agreementService.findById(agreementroleOperation.getAgreementId()));
		agreementrole.setLastModifiedDt(new Date());
		agreementrole.setRecSt(ENTITY_STATUS_ACTIVE);
		agreementrole.setLastModifiedUsr(DEFAULT_USER);
		agreementrole = super.updateOperation(agreementroleOperation);
		return agreementrole;
	}
}