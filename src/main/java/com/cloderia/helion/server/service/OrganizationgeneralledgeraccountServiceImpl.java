
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

import com.cloderia.helion.client.shared.model.Organizationgeneralledgeraccount;
import com.cloderia.helion.client.shared.ops.OrganizationgeneralledgeraccountOperation;
import com.cloderia.helion.client.shared.service.GeneralledgeraccountService;
import com.cloderia.helion.client.shared.service.OrganizationgeneralledgeraccountService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class OrganizationgeneralledgeraccountServiceImpl extends BaseEntityServiceImpl<Organizationgeneralledgeraccount, OrganizationgeneralledgeraccountOperation> implements
		OrganizationgeneralledgeraccountService {

	@Inject
	GeneralledgeraccountService generalledgeraccountService;

	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public OrganizationgeneralledgeraccountServiceImpl() {
		super(Organizationgeneralledgeraccount.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Organizationgeneralledgeraccount.ALL_ORGANIZATIONGENERALLEDGERACCOUNT_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Organizationgeneralledgeraccount.FIND_ORGANIZATIONGENERALLEDGERACCOUNT_BY_CODE_QUERY;
	}

	@Override
	public Organizationgeneralledgeraccount createOperation(OrganizationgeneralledgeraccountOperation organizationgeneralledgeraccountOperation) {
		Organizationgeneralledgeraccount organizationgeneralledgeraccount = organizationgeneralledgeraccountOperation.getOrganizationgeneralledgeraccount();
		organizationgeneralledgeraccount.setGlAccount(generalledgeraccountService.findById(organizationgeneralledgeraccountOperation.getGlAccountId()));
		organizationgeneralledgeraccount.setRecSt("");
		organizationgeneralledgeraccount.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		organizationgeneralledgeraccount.setRowTs(new Date());
		organizationgeneralledgeraccount.setCreatedDt(new Date());
		organizationgeneralledgeraccount.setVersionNo(VERSIONING_ONE);
		organizationgeneralledgeraccount.setLastModifiedDt(new Date());
		organizationgeneralledgeraccount.setCreatedByUsr(DEFAULT_USER);
		organizationgeneralledgeraccount.setRecSt(ENTITY_STATUS_ACTIVE);
		organizationgeneralledgeraccount.setLastModifiedUsr(DEFAULT_USER);
		organizationgeneralledgeraccount = super.createOperation(organizationgeneralledgeraccountOperation);
		return organizationgeneralledgeraccount;
	}
	
	@Override
	public Organizationgeneralledgeraccount updateOperation(OrganizationgeneralledgeraccountOperation organizationgeneralledgeraccountOperation) {
		Organizationgeneralledgeraccount organizationgeneralledgeraccount = organizationgeneralledgeraccountOperation.getOrganizationgeneralledgeraccount();
		organizationgeneralledgeraccount.setGlAccount(generalledgeraccountService.findById(organizationgeneralledgeraccountOperation.getGlAccountId()));
		organizationgeneralledgeraccount.setLastModifiedDt(new Date());
		organizationgeneralledgeraccount.setRecSt(ENTITY_STATUS_ACTIVE);
		organizationgeneralledgeraccount.setLastModifiedUsr(DEFAULT_USER);
		organizationgeneralledgeraccount = super.updateOperation(organizationgeneralledgeraccountOperation);
		return organizationgeneralledgeraccount;
	}
}