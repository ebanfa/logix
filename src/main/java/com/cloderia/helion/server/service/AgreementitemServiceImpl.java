
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

import com.cloderia.helion.client.shared.model.Agreementitem;
import com.cloderia.helion.client.shared.ops.AgreementitemOperation;
import com.cloderia.helion.client.shared.service.AgreementitemtypeService;
import com.cloderia.helion.client.shared.service.AgreementService;
import com.cloderia.helion.client.shared.service.AgreementitemService;
import com.cloderia.helion.client.shared.service.AgreementitemService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class AgreementitemServiceImpl extends BaseEntityServiceImpl<Agreementitem, AgreementitemOperation> implements
		AgreementitemService {

	@Inject
	AgreementitemtypeService agreementitemtypeService;
	@Inject
	AgreementService agreementService;
	@Inject
	AgreementitemService agreementitemService;

	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public AgreementitemServiceImpl() {
		super(Agreementitem.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Agreementitem.ALL_AGREEMENTITEM_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Agreementitem.FIND_AGREEMENTITEM_BY_CODE_QUERY;
	}

	@Override
	public Agreementitem createOperation(AgreementitemOperation agreementitemOperation) {
		Agreementitem agreementitem = agreementitemOperation.getAgreementitem();
		agreementitem.setAgreementItemTy(agreementitemtypeService.findById(agreementitemOperation.getAgreementItemTyId()));
		agreementitem.setAgreement(agreementService.findById(agreementitemOperation.getAgreementId()));
		agreementitem.setAgreementItem(agreementitemService.findById(agreementitemOperation.getAgreementItemId()));
		agreementitem.setRecSt("");
		agreementitem.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		agreementitem.setRowTs(new Date());
		agreementitem.setCreatedDt(new Date());
		agreementitem.setVersionNo(VERSIONING_ONE);
		agreementitem.setLastModifiedDt(new Date());
		agreementitem.setCreatedByUsr(DEFAULT_USER);
		agreementitem.setRecSt(ENTITY_STATUS_ACTIVE);
		agreementitem.setLastModifiedUsr(DEFAULT_USER);
		agreementitem = super.createOperation(agreementitemOperation);
		return agreementitem;
	}
	
	@Override
	public Agreementitem updateOperation(AgreementitemOperation agreementitemOperation) {
		Agreementitem agreementitem = agreementitemOperation.getAgreementitem();
		agreementitem.setAgreementItemTy(agreementitemtypeService.findById(agreementitemOperation.getAgreementItemTyId()));
		agreementitem.setAgreement(agreementService.findById(agreementitemOperation.getAgreementId()));
		agreementitem.setAgreementItem(agreementitemService.findById(agreementitemOperation.getAgreementItemId()));
		agreementitem.setLastModifiedDt(new Date());
		agreementitem.setRecSt(ENTITY_STATUS_ACTIVE);
		agreementitem.setLastModifiedUsr(DEFAULT_USER);
		agreementitem = super.updateOperation(agreementitemOperation);
		return agreementitem;
	}
}