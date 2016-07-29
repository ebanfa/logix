
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

import com.cloderia.helion.client.shared.model.Container;
import com.cloderia.helion.client.shared.ops.ContainerOperation;
import com.cloderia.helion.client.shared.service.FacilityService;
import com.cloderia.helion.client.shared.service.ContainertypeService;
import com.cloderia.helion.client.shared.service.ContainerService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class ContainerServiceImpl extends BaseEntityServiceImpl<Container, ContainerOperation> implements
		ContainerService {

	@Inject
	FacilityService facilityService;
	@Inject
	ContainertypeService containertypeService;

	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public ContainerServiceImpl() {
		super(Container.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Container.ALL_CONTAINER_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Container.FIND_CONTAINER_BY_CODE_QUERY;
	}

	@Override
	public Container createOperation(ContainerOperation containerOperation) {
		Container container = containerOperation.getContainer();
		container.setFacility(facilityService.findById(containerOperation.getFacilityId()));
		container.setContainerTy(containertypeService.findById(containerOperation.getContainerTyId()));
		container.setRecSt("");
		container.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		container.setRowTs(new Date());
		container.setCreatedDt(new Date());
		container.setVersionNo(VERSIONING_ONE);
		container.setLastModifiedDt(new Date());
		container.setCreatedByUsr(DEFAULT_USER);
		container.setRecSt(ENTITY_STATUS_ACTIVE);
		container.setLastModifiedUsr(DEFAULT_USER);
		container = super.createOperation(containerOperation);
		return container;
	}
	
	@Override
	public Container updateOperation(ContainerOperation containerOperation) {
		Container container = containerOperation.getContainer();
		container.setFacility(facilityService.findById(containerOperation.getFacilityId()));
		container.setContainerTy(containertypeService.findById(containerOperation.getContainerTyId()));
		container.setLastModifiedDt(new Date());
		container.setRecSt(ENTITY_STATUS_ACTIVE);
		container.setLastModifiedUsr(DEFAULT_USER);
		container = super.updateOperation(containerOperation);
		return container;
	}
}