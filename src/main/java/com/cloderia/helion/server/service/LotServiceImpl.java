
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

import com.cloderia.helion.client.shared.model.Lot;
import com.cloderia.helion.client.shared.ops.LotOperation;
import com.cloderia.helion.client.shared.service.LotService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class LotServiceImpl extends BaseEntityServiceImpl<Lot, LotOperation> implements
		LotService {


	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public LotServiceImpl() {
		super(Lot.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Lot.ALL_LOT_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Lot.FIND_LOT_BY_CODE_QUERY;
	}

	@Override
	public Lot createOperation(LotOperation lotOperation) {
		Lot lot = lotOperation.getLot();
		lot.setRecSt("");
		lot.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		lot.setRowTs(new Date());
		lot.setCreatedDt(new Date());
		lot.setVersionNo(VERSIONING_ONE);
		lot.setLastModifiedDt(new Date());
		lot.setCreatedByUsr(DEFAULT_USER);
		lot.setRecSt(ENTITY_STATUS_ACTIVE);
		lot.setLastModifiedUsr(DEFAULT_USER);
		lot = super.createOperation(lotOperation);
		return lot;
	}
	
	@Override
	public Lot updateOperation(LotOperation lotOperation) {
		Lot lot = lotOperation.getLot();
		lot.setLastModifiedDt(new Date());
		lot.setRecSt(ENTITY_STATUS_ACTIVE);
		lot.setLastModifiedUsr(DEFAULT_USER);
		lot = super.updateOperation(lotOperation);
		return lot;
	}
}