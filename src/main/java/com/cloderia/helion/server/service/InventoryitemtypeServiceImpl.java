
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

import com.cloderia.helion.client.shared.model.Inventoryitemtype;
import com.cloderia.helion.client.shared.ops.InventoryitemtypeOperation;
import com.cloderia.helion.client.shared.service.InventoryitemtypeService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class InventoryitemtypeServiceImpl extends BaseEntityServiceImpl<Inventoryitemtype, InventoryitemtypeOperation> implements
		InventoryitemtypeService {


	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public InventoryitemtypeServiceImpl() {
		super(Inventoryitemtype.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Inventoryitemtype.ALL_INVENTORYITEMTYPE_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Inventoryitemtype.FIND_INVENTORYITEMTYPE_BY_CODE_QUERY;
	}

	@Override
	public Inventoryitemtype createOperation(InventoryitemtypeOperation inventoryitemtypeOperation) {
		Inventoryitemtype inventoryitemtype = inventoryitemtypeOperation.getInventoryitemtype();
		inventoryitemtype.setRecSt("");
		inventoryitemtype.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		inventoryitemtype.setRowTs(new Date());
		inventoryitemtype.setCreatedDt(new Date());
		inventoryitemtype.setVersionNo(VERSIONING_ONE);
		inventoryitemtype.setLastModifiedDt(new Date());
		inventoryitemtype.setCreatedByUsr(DEFAULT_USER);
		inventoryitemtype.setRecSt(ENTITY_STATUS_ACTIVE);
		inventoryitemtype.setLastModifiedUsr(DEFAULT_USER);
		inventoryitemtype = super.createOperation(inventoryitemtypeOperation);
		return inventoryitemtype;
	}
	
	@Override
	public Inventoryitemtype updateOperation(InventoryitemtypeOperation inventoryitemtypeOperation) {
		Inventoryitemtype inventoryitemtype = inventoryitemtypeOperation.getInventoryitemtype();
		inventoryitemtype.setLastModifiedDt(new Date());
		inventoryitemtype.setRecSt(ENTITY_STATUS_ACTIVE);
		inventoryitemtype.setLastModifiedUsr(DEFAULT_USER);
		inventoryitemtype = super.updateOperation(inventoryitemtypeOperation);
		return inventoryitemtype;
	}
}