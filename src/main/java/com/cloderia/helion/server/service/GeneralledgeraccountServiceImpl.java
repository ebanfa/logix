
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

import com.cloderia.helion.client.shared.model.Generalledgeraccount;
import com.cloderia.helion.client.shared.ops.GeneralledgeraccountOperation;
import com.cloderia.helion.client.shared.service.GeneralledgeraccounttypeService;
import com.cloderia.helion.client.shared.service.GeneralledgeraccountService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class GeneralledgeraccountServiceImpl extends BaseEntityServiceImpl<Generalledgeraccount, GeneralledgeraccountOperation> implements
		GeneralledgeraccountService {

	@Inject
	GeneralledgeraccounttypeService generalledgeraccounttypeService;

	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public GeneralledgeraccountServiceImpl() {
		super(Generalledgeraccount.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Generalledgeraccount.ALL_GENERALLEDGERACCOUNT_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Generalledgeraccount.FIND_GENERALLEDGERACCOUNT_BY_CODE_QUERY;
	}

	@Override
	public Generalledgeraccount createOperation(GeneralledgeraccountOperation generalledgeraccountOperation) {
		Generalledgeraccount generalledgeraccount = generalledgeraccountOperation.getGeneralledgeraccount();
		generalledgeraccount.setGlAcctTy(generalledgeraccounttypeService.findById(generalledgeraccountOperation.getGlAcctTyId()));
		generalledgeraccount.setRecSt("");
		generalledgeraccount.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		generalledgeraccount.setRowTs(new Date());
		generalledgeraccount.setCreatedDt(new Date());
		generalledgeraccount.setVersionNo(VERSIONING_ONE);
		generalledgeraccount.setLastModifiedDt(new Date());
		generalledgeraccount.setCreatedByUsr(DEFAULT_USER);
		generalledgeraccount.setRecSt(ENTITY_STATUS_ACTIVE);
		generalledgeraccount.setLastModifiedUsr(DEFAULT_USER);
		generalledgeraccount = super.createOperation(generalledgeraccountOperation);
		return generalledgeraccount;
	}
	
	@Override
	public Generalledgeraccount updateOperation(GeneralledgeraccountOperation generalledgeraccountOperation) {
		Generalledgeraccount generalledgeraccount = generalledgeraccountOperation.getGeneralledgeraccount();
		generalledgeraccount.setGlAcctTy(generalledgeraccounttypeService.findById(generalledgeraccountOperation.getGlAcctTyId()));
		generalledgeraccount.setLastModifiedDt(new Date());
		generalledgeraccount.setRecSt(ENTITY_STATUS_ACTIVE);
		generalledgeraccount.setLastModifiedUsr(DEFAULT_USER);
		generalledgeraccount = super.updateOperation(generalledgeraccountOperation);
		return generalledgeraccount;
	}
}