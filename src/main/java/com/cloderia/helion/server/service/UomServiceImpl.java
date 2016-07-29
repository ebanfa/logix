
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

import com.cloderia.helion.client.shared.model.Uom;
import com.cloderia.helion.client.shared.ops.UomOperation;
import com.cloderia.helion.client.shared.service.UomService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class UomServiceImpl extends BaseEntityServiceImpl<Uom, UomOperation> implements
		UomService {


	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public UomServiceImpl() {
		super(Uom.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Uom.ALL_UOM_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Uom.FIND_UOM_BY_CODE_QUERY;
	}

	@Override
	public Uom createOperation(UomOperation uomOperation) {
		Uom uom = uomOperation.getUom();
		uom.setRecSt("");
		uom.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		uom.setRowTs(new Date());
		uom.setCreatedDt(new Date());
		uom.setVersionNo(VERSIONING_ONE);
		uom.setLastModifiedDt(new Date());
		uom.setCreatedByUsr(DEFAULT_USER);
		uom.setRecSt(ENTITY_STATUS_ACTIVE);
		uom.setLastModifiedUsr(DEFAULT_USER);
		uom = super.createOperation(uomOperation);
		return uom;
	}
	
	@Override
	public Uom updateOperation(UomOperation uomOperation) {
		Uom uom = uomOperation.getUom();
		uom.setLastModifiedDt(new Date());
		uom.setRecSt(ENTITY_STATUS_ACTIVE);
		uom.setLastModifiedUsr(DEFAULT_USER);
		uom = super.updateOperation(uomOperation);
		return uom;
	}
}