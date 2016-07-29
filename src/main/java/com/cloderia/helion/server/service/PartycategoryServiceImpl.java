
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

import com.cloderia.helion.client.shared.model.Partycategory;
import com.cloderia.helion.client.shared.ops.PartycategoryOperation;
import com.cloderia.helion.client.shared.service.PartycategoryService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class PartycategoryServiceImpl extends BaseEntityServiceImpl<Partycategory, PartycategoryOperation> implements
		PartycategoryService {


	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public PartycategoryServiceImpl() {
		super(Partycategory.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Partycategory.ALL_PARTYCATEGORY_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Partycategory.FIND_PARTYCATEGORY_BY_CODE_QUERY;
	}

	@Override
	public Partycategory createOperation(PartycategoryOperation partycategoryOperation) {
		Partycategory partycategory = partycategoryOperation.getPartycategory();
		partycategory.setRecSt("");
		partycategory.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		partycategory.setRowTs(new Date());
		partycategory.setCreatedDt(new Date());
		partycategory.setVersionNo(VERSIONING_ONE);
		partycategory.setLastModifiedDt(new Date());
		partycategory.setCreatedByUsr(DEFAULT_USER);
		partycategory.setRecSt(ENTITY_STATUS_ACTIVE);
		partycategory.setLastModifiedUsr(DEFAULT_USER);
		partycategory = super.createOperation(partycategoryOperation);
		return partycategory;
	}
	
	@Override
	public Partycategory updateOperation(PartycategoryOperation partycategoryOperation) {
		Partycategory partycategory = partycategoryOperation.getPartycategory();
		partycategory.setUniverse(universeService.findById(partycategoryOperation.getUniverseId()));
		partycategory.setLastModifiedDt(new Date());
		partycategory.setRecSt(ENTITY_STATUS_ACTIVE);
		partycategory.setLastModifiedUsr(DEFAULT_USER);
		partycategory = super.updateOperation(partycategoryOperation);
		return partycategory;
	}
}