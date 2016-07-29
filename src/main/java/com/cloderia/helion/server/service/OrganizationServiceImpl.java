
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

import com.cloderia.helion.client.shared.model.Organization;
import com.cloderia.helion.client.shared.ops.OrganizationOperation;
import com.cloderia.helion.client.shared.service.PartyService;
import com.cloderia.helion.client.shared.service.OrganizationService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class OrganizationServiceImpl extends BaseEntityServiceImpl<Organization, OrganizationOperation> implements
		OrganizationService {

	@Inject
	PartyService partyService;

	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public OrganizationServiceImpl() {
		super(Organization.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Organization.ALL_ORGANIZATION_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Organization.FIND_ORGANIZATION_BY_CODE_QUERY;
	}

	@Override
	public Organization createOperation(OrganizationOperation organizationOperation) {
		Organization organization = organizationOperation.getOrganization();
		organization.setParty(partyService.findById(organizationOperation.getPartyId()));
		organization.setRecSt("");
		organization.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		organization.setRowTs(new Date());
		organization.setCreatedDt(new Date());
		organization.setVersionNo(VERSIONING_ONE);
		organization.setLastModifiedDt(new Date());
		organization.setCreatedByUsr(DEFAULT_USER);
		organization.setRecSt(ENTITY_STATUS_ACTIVE);
		organization.setLastModifiedUsr(DEFAULT_USER);
		organization = super.createOperation(organizationOperation);
		return organization;
	}
	
	@Override
	public Organization updateOperation(OrganizationOperation organizationOperation) {
		Organization organization = organizationOperation.getOrganization();
		organization.setUniverse(universeService.findById(organizationOperation.getUniverseId()));
		organization.setParty(partyService.findById(organizationOperation.getPartyId()));
		organization.setLastModifiedDt(new Date());
		organization.setRecSt(ENTITY_STATUS_ACTIVE);
		organization.setLastModifiedUsr(DEFAULT_USER);
		organization = super.updateOperation(organizationOperation);
		return organization;
	}
}