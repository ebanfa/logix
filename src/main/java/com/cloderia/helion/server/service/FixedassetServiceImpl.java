
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

import com.cloderia.helion.client.shared.model.Fixedasset;
import com.cloderia.helion.client.shared.ops.FixedassetOperation;
import com.cloderia.helion.client.shared.service.FixedassettypeService;
import com.cloderia.helion.client.shared.service.FixedassetService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class FixedassetServiceImpl extends BaseEntityServiceImpl<Fixedasset, FixedassetOperation> implements
		FixedassetService {

	@Inject
	FixedassettypeService fixedassettypeService;

	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public FixedassetServiceImpl() {
		super(Fixedasset.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Fixedasset.ALL_FIXEDASSET_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Fixedasset.FIND_FIXEDASSET_BY_CODE_QUERY;
	}

	@Override
	public Fixedasset createOperation(FixedassetOperation fixedassetOperation) {
		Fixedasset fixedasset = fixedassetOperation.getFixedasset();
		fixedasset.setFixedAssetTy(fixedassettypeService.findById(fixedassetOperation.getFixedAssetTyId()));
		fixedasset.setRecSt("");
		fixedasset.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		fixedasset.setRowTs(new Date());
		fixedasset.setCreatedDt(new Date());
		fixedasset.setVersionNo(VERSIONING_ONE);
		fixedasset.setLastModifiedDt(new Date());
		fixedasset.setCreatedByUsr(DEFAULT_USER);
		fixedasset.setRecSt(ENTITY_STATUS_ACTIVE);
		fixedasset.setLastModifiedUsr(DEFAULT_USER);
		fixedasset = super.createOperation(fixedassetOperation);
		return fixedasset;
	}
	
	@Override
	public Fixedasset updateOperation(FixedassetOperation fixedassetOperation) {
		Fixedasset fixedasset = fixedassetOperation.getFixedasset();
		fixedasset.setFixedAssetTy(fixedassettypeService.findById(fixedassetOperation.getFixedAssetTyId()));
		fixedasset.setLastModifiedDt(new Date());
		fixedasset.setRecSt(ENTITY_STATUS_ACTIVE);
		fixedasset.setLastModifiedUsr(DEFAULT_USER);
		fixedasset = super.updateOperation(fixedassetOperation);
		return fixedasset;
	}
}