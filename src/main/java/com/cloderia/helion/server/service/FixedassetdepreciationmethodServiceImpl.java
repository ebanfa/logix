
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

import com.cloderia.helion.client.shared.model.Fixedassetdepreciationmethod;
import com.cloderia.helion.client.shared.ops.FixedassetdepreciationmethodOperation;
import com.cloderia.helion.client.shared.service.FixedassetService;
import com.cloderia.helion.client.shared.service.DepreciationmethodService;
import com.cloderia.helion.client.shared.service.FixedassetdepreciationmethodService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class FixedassetdepreciationmethodServiceImpl extends BaseEntityServiceImpl<Fixedassetdepreciationmethod, FixedassetdepreciationmethodOperation> implements
		FixedassetdepreciationmethodService {

	@Inject
	FixedassetService fixedassetService;
	@Inject
	DepreciationmethodService depreciationmethodService;

	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public FixedassetdepreciationmethodServiceImpl() {
		super(Fixedassetdepreciationmethod.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Fixedassetdepreciationmethod.ALL_FIXEDASSETDEPRECIATIONMETHOD_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Fixedassetdepreciationmethod.FIND_FIXEDASSETDEPRECIATIONMETHOD_BY_CODE_QUERY;
	}

	@Override
	public Fixedassetdepreciationmethod createOperation(FixedassetdepreciationmethodOperation fixedassetdepreciationmethodOperation) {
		Fixedassetdepreciationmethod fixedassetdepreciationmethod = fixedassetdepreciationmethodOperation.getFixedassetdepreciationmethod();
		fixedassetdepreciationmethod.setFixedAsset(fixedassetService.findById(fixedassetdepreciationmethodOperation.getFixedAssetId()));
		fixedassetdepreciationmethod.setDepMethod(depreciationmethodService.findById(fixedassetdepreciationmethodOperation.getDepMethodId()));
		fixedassetdepreciationmethod.setRecSt("");
		fixedassetdepreciationmethod.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		fixedassetdepreciationmethod.setRowTs(new Date());
		fixedassetdepreciationmethod.setCreatedDt(new Date());
		fixedassetdepreciationmethod.setVersionNo(VERSIONING_ONE);
		fixedassetdepreciationmethod.setLastModifiedDt(new Date());
		fixedassetdepreciationmethod.setCreatedByUsr(DEFAULT_USER);
		fixedassetdepreciationmethod.setRecSt(ENTITY_STATUS_ACTIVE);
		fixedassetdepreciationmethod.setLastModifiedUsr(DEFAULT_USER);
		fixedassetdepreciationmethod = super.createOperation(fixedassetdepreciationmethodOperation);
		return fixedassetdepreciationmethod;
	}
	
	@Override
	public Fixedassetdepreciationmethod updateOperation(FixedassetdepreciationmethodOperation fixedassetdepreciationmethodOperation) {
		Fixedassetdepreciationmethod fixedassetdepreciationmethod = fixedassetdepreciationmethodOperation.getFixedassetdepreciationmethod();
		fixedassetdepreciationmethod.setFixedAsset(fixedassetService.findById(fixedassetdepreciationmethodOperation.getFixedAssetId()));
		fixedassetdepreciationmethod.setDepMethod(depreciationmethodService.findById(fixedassetdepreciationmethodOperation.getDepMethodId()));
		fixedassetdepreciationmethod.setLastModifiedDt(new Date());
		fixedassetdepreciationmethod.setRecSt(ENTITY_STATUS_ACTIVE);
		fixedassetdepreciationmethod.setLastModifiedUsr(DEFAULT_USER);
		fixedassetdepreciationmethod = super.updateOperation(fixedassetdepreciationmethodOperation);
		return fixedassetdepreciationmethod;
	}
}