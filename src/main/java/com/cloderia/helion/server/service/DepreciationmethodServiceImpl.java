
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

import com.cloderia.helion.client.shared.model.Depreciationmethod;
import com.cloderia.helion.client.shared.ops.DepreciationmethodOperation;
import com.cloderia.helion.client.shared.service.DepreciationmethodService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class DepreciationmethodServiceImpl extends BaseEntityServiceImpl<Depreciationmethod, DepreciationmethodOperation> implements
		DepreciationmethodService {


	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public DepreciationmethodServiceImpl() {
		super(Depreciationmethod.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Depreciationmethod.ALL_DEPRECIATIONMETHOD_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Depreciationmethod.FIND_DEPRECIATIONMETHOD_BY_CODE_QUERY;
	}

	@Override
	public Depreciationmethod createOperation(DepreciationmethodOperation depreciationmethodOperation) {
		Depreciationmethod depreciationmethod = depreciationmethodOperation.getDepreciationmethod();
		depreciationmethod.setRecSt("");
		depreciationmethod.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		depreciationmethod.setRowTs(new Date());
		depreciationmethod.setCreatedDt(new Date());
		depreciationmethod.setVersionNo(VERSIONING_ONE);
		depreciationmethod.setLastModifiedDt(new Date());
		depreciationmethod.setCreatedByUsr(DEFAULT_USER);
		depreciationmethod.setRecSt(ENTITY_STATUS_ACTIVE);
		depreciationmethod.setLastModifiedUsr(DEFAULT_USER);
		depreciationmethod = super.createOperation(depreciationmethodOperation);
		return depreciationmethod;
	}
	
	@Override
	public Depreciationmethod updateOperation(DepreciationmethodOperation depreciationmethodOperation) {
		Depreciationmethod depreciationmethod = depreciationmethodOperation.getDepreciationmethod();
		depreciationmethod.setLastModifiedDt(new Date());
		depreciationmethod.setRecSt(ENTITY_STATUS_ACTIVE);
		depreciationmethod.setLastModifiedUsr(DEFAULT_USER);
		depreciationmethod = super.updateOperation(depreciationmethodOperation);
		return depreciationmethod;
	}
}