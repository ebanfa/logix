
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

import com.cloderia.helion.client.shared.model.Inventoryitemstatus;
import com.cloderia.helion.client.shared.ops.InventoryitemstatusOperation;
import com.cloderia.helion.client.shared.service.InventoryitemstatusService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class InventoryitemstatusServiceImpl extends BaseEntityServiceImpl<Inventoryitemstatus, InventoryitemstatusOperation> implements
		InventoryitemstatusService {


	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public InventoryitemstatusServiceImpl() {
		super(Inventoryitemstatus.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Inventoryitemstatus.ALL_INVENTORYITEMSTATUS_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Inventoryitemstatus.FIND_INVENTORYITEMSTATUS_BY_CODE_QUERY;
	}

	@Override
	public Inventoryitemstatus createOperation(InventoryitemstatusOperation inventoryitemstatusOperation) {
		Inventoryitemstatus inventoryitemstatus = inventoryitemstatusOperation.getInventoryitemstatus();
		inventoryitemstatus.setRecSt("");
		inventoryitemstatus.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		inventoryitemstatus.setRowTs(new Date());
		inventoryitemstatus.setCreatedDt(new Date());
		inventoryitemstatus.setVersionNo(VERSIONING_ONE);
		inventoryitemstatus.setLastModifiedDt(new Date());
		inventoryitemstatus.setCreatedByUsr(DEFAULT_USER);
		inventoryitemstatus.setRecSt(ENTITY_STATUS_ACTIVE);
		inventoryitemstatus.setLastModifiedUsr(DEFAULT_USER);
		inventoryitemstatus = super.createOperation(inventoryitemstatusOperation);
		return inventoryitemstatus;
	}
	
	@Override
	public Inventoryitemstatus updateOperation(InventoryitemstatusOperation inventoryitemstatusOperation) {
		Inventoryitemstatus inventoryitemstatus = inventoryitemstatusOperation.getInventoryitemstatus();
		inventoryitemstatus.setLastModifiedDt(new Date());
		inventoryitemstatus.setRecSt(ENTITY_STATUS_ACTIVE);
		inventoryitemstatus.setLastModifiedUsr(DEFAULT_USER);
		inventoryitemstatus = super.updateOperation(inventoryitemstatusOperation);
		return inventoryitemstatus;
	}
}