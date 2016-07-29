
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

import com.cloderia.helion.client.shared.model.Organizationglaccountbalance;
import com.cloderia.helion.client.shared.ops.OrganizationglaccountbalanceOperation;
import com.cloderia.helion.client.shared.service.OrganizationgeneralledgeraccountService;
import com.cloderia.helion.client.shared.service.AccountingperiodService;
import com.cloderia.helion.client.shared.service.OrganizationglaccountbalanceService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class OrganizationglaccountbalanceServiceImpl extends BaseEntityServiceImpl<Organizationglaccountbalance, OrganizationglaccountbalanceOperation> implements
		OrganizationglaccountbalanceService {

	@Inject
	OrganizationgeneralledgeraccountService organizationgeneralledgeraccountService;
	@Inject
	AccountingperiodService accountingperiodService;

	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public OrganizationglaccountbalanceServiceImpl() {
		super(Organizationglaccountbalance.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Organizationglaccountbalance.ALL_ORGANIZATIONGLACCOUNTBALANCE_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Organizationglaccountbalance.FIND_ORGANIZATIONGLACCOUNTBALANCE_BY_CODE_QUERY;
	}

	@Override
	public Organizationglaccountbalance createOperation(OrganizationglaccountbalanceOperation organizationglaccountbalanceOperation) {
		Organizationglaccountbalance organizationglaccountbalance = organizationglaccountbalanceOperation.getOrganizationglaccountbalance();
		organizationglaccountbalance.setGlAccount(organizationgeneralledgeraccountService.findById(organizationglaccountbalanceOperation.getGlAccountId()));
		organizationglaccountbalance.setAccountingPeriod(accountingperiodService.findById(organizationglaccountbalanceOperation.getAccountingPeriodId()));
		organizationglaccountbalance.setRecSt("");
		organizationglaccountbalance.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		organizationglaccountbalance.setRowTs(new Date());
		organizationglaccountbalance.setCreatedDt(new Date());
		organizationglaccountbalance.setVersionNo(VERSIONING_ONE);
		organizationglaccountbalance.setLastModifiedDt(new Date());
		organizationglaccountbalance.setCreatedByUsr(DEFAULT_USER);
		organizationglaccountbalance.setRecSt(ENTITY_STATUS_ACTIVE);
		organizationglaccountbalance.setLastModifiedUsr(DEFAULT_USER);
		organizationglaccountbalance = super.createOperation(organizationglaccountbalanceOperation);
		return organizationglaccountbalance;
	}
	
	@Override
	public Organizationglaccountbalance updateOperation(OrganizationglaccountbalanceOperation organizationglaccountbalanceOperation) {
		Organizationglaccountbalance organizationglaccountbalance = organizationglaccountbalanceOperation.getOrganizationglaccountbalance();
		organizationglaccountbalance.setGlAccount(organizationgeneralledgeraccountService.findById(organizationglaccountbalanceOperation.getGlAccountId()));
		organizationglaccountbalance.setAccountingPeriod(accountingperiodService.findById(organizationglaccountbalanceOperation.getAccountingPeriodId()));
		organizationglaccountbalance.setLastModifiedDt(new Date());
		organizationglaccountbalance.setRecSt(ENTITY_STATUS_ACTIVE);
		organizationglaccountbalance.setLastModifiedUsr(DEFAULT_USER);
		organizationglaccountbalance = super.updateOperation(organizationglaccountbalanceOperation);
		return organizationglaccountbalance;
	}
}