
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

import com.cloderia.helion.client.shared.model.Agreementroletype;
import com.cloderia.helion.client.shared.ops.AgreementroletypeOperation;
import com.cloderia.helion.client.shared.service.AgreementroletypeService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class AgreementroletypeServiceImpl extends BaseEntityServiceImpl<Agreementroletype, AgreementroletypeOperation> implements
		AgreementroletypeService {


	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public AgreementroletypeServiceImpl() {
		super(Agreementroletype.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Agreementroletype.ALL_AGREEMENTROLETYPE_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Agreementroletype.FIND_AGREEMENTROLETYPE_BY_CODE_QUERY;
	}

	@Override
	public Agreementroletype createOperation(AgreementroletypeOperation agreementroletypeOperation) {
		Agreementroletype agreementroletype = agreementroletypeOperation.getAgreementroletype();
		agreementroletype.setRecSt("");
		agreementroletype.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		agreementroletype.setRowTs(new Date());
		agreementroletype.setCreatedDt(new Date());
		agreementroletype.setVersionNo(VERSIONING_ONE);
		agreementroletype.setLastModifiedDt(new Date());
		agreementroletype.setCreatedByUsr(DEFAULT_USER);
		agreementroletype.setRecSt(ENTITY_STATUS_ACTIVE);
		agreementroletype.setLastModifiedUsr(DEFAULT_USER);
		agreementroletype = super.createOperation(agreementroletypeOperation);
		return agreementroletype;
	}
	
	@Override
	public Agreementroletype updateOperation(AgreementroletypeOperation agreementroletypeOperation) {
		Agreementroletype agreementroletype = agreementroletypeOperation.getAgreementroletype();
		agreementroletype.setLastModifiedDt(new Date());
		agreementroletype.setRecSt(ENTITY_STATUS_ACTIVE);
		agreementroletype.setLastModifiedUsr(DEFAULT_USER);
		agreementroletype = super.updateOperation(agreementroletypeOperation);
		return agreementroletype;
	}
}