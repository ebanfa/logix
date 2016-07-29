
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

import com.cloderia.helion.client.shared.model.Inventoryitem;
import com.cloderia.helion.client.shared.ops.InventoryitemOperation;
import com.cloderia.helion.client.shared.service.LotService;
import com.cloderia.helion.client.shared.service.InventoryitemstatusService;
import com.cloderia.helion.client.shared.service.ContainerService;
import com.cloderia.helion.client.shared.service.FacilityService;
import com.cloderia.helion.client.shared.service.InventoryitemtypeService;
import com.cloderia.helion.client.shared.service.InventoryitemService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class InventoryitemServiceImpl extends BaseEntityServiceImpl<Inventoryitem, InventoryitemOperation> implements
		InventoryitemService {

	@Inject
	LotService lotService;
	@Inject
	InventoryitemstatusService inventoryitemstatusService;
	@Inject
	ContainerService containerService;
	@Inject
	FacilityService facilityService;
	@Inject
	InventoryitemtypeService inventoryitemtypeService;

	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public InventoryitemServiceImpl() {
		super(Inventoryitem.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Inventoryitem.ALL_INVENTORYITEM_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Inventoryitem.FIND_INVENTORYITEM_BY_CODE_QUERY;
	}

	@Override
	public Inventoryitem createOperation(InventoryitemOperation inventoryitemOperation) {
		Inventoryitem inventoryitem = inventoryitemOperation.getInventoryitem();
		inventoryitem.setLot(lotService.findById(inventoryitemOperation.getLotId()));
		inventoryitem.setStatus(inventoryitemstatusService.findById(inventoryitemOperation.getStatusId()));
		inventoryitem.setContainer(containerService.findById(inventoryitemOperation.getContainerId()));
		inventoryitem.setFacility(facilityService.findById(inventoryitemOperation.getFacilityId()));
		inventoryitem.setItemTy(inventoryitemtypeService.findById(inventoryitemOperation.getItemTyId()));
		inventoryitem.setRecSt("");
		inventoryitem.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		inventoryitem.setRowTs(new Date());
		inventoryitem.setCreatedDt(new Date());
		inventoryitem.setVersionNo(VERSIONING_ONE);
		inventoryitem.setLastModifiedDt(new Date());
		inventoryitem.setCreatedByUsr(DEFAULT_USER);
		inventoryitem.setRecSt(ENTITY_STATUS_ACTIVE);
		inventoryitem.setLastModifiedUsr(DEFAULT_USER);
		inventoryitem = super.createOperation(inventoryitemOperation);
		return inventoryitem;
	}
	
	@Override
	public Inventoryitem updateOperation(InventoryitemOperation inventoryitemOperation) {
		Inventoryitem inventoryitem = inventoryitemOperation.getInventoryitem();
		inventoryitem.setLot(lotService.findById(inventoryitemOperation.getLotId()));
		inventoryitem.setStatus(inventoryitemstatusService.findById(inventoryitemOperation.getStatusId()));
		inventoryitem.setContainer(containerService.findById(inventoryitemOperation.getContainerId()));
		inventoryitem.setFacility(facilityService.findById(inventoryitemOperation.getFacilityId()));
		inventoryitem.setItemTy(inventoryitemtypeService.findById(inventoryitemOperation.getItemTyId()));
		inventoryitem.setLastModifiedDt(new Date());
		inventoryitem.setRecSt(ENTITY_STATUS_ACTIVE);
		inventoryitem.setLastModifiedUsr(DEFAULT_USER);
		inventoryitem = super.updateOperation(inventoryitemOperation);
		return inventoryitem;
	}
}