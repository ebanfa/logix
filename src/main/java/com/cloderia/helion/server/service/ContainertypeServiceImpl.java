
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

import com.cloderia.helion.client.shared.model.Containertype;
import com.cloderia.helion.client.shared.ops.ContainertypeOperation;
import com.cloderia.helion.client.shared.service.ContainertypeService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class ContainertypeServiceImpl extends BaseEntityServiceImpl<Containertype, ContainertypeOperation> implements
		ContainertypeService {


	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public ContainertypeServiceImpl() {
		super(Containertype.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Containertype.ALL_CONTAINERTYPE_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Containertype.FIND_CONTAINERTYPE_BY_CODE_QUERY;
	}

	@Override
	public Containertype createOperation(ContainertypeOperation containertypeOperation) {
		Containertype containertype = containertypeOperation.getContainertype();
		containertype.setRecSt("");
		containertype.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		containertype.setRowTs(new Date());
		containertype.setCreatedDt(new Date());
		containertype.setVersionNo(VERSIONING_ONE);
		containertype.setLastModifiedDt(new Date());
		containertype.setCreatedByUsr(DEFAULT_USER);
		containertype.setRecSt(ENTITY_STATUS_ACTIVE);
		containertype.setLastModifiedUsr(DEFAULT_USER);
		containertype = super.createOperation(containertypeOperation);
		return containertype;
	}
	
	@Override
	public Containertype updateOperation(ContainertypeOperation containertypeOperation) {
		Containertype containertype = containertypeOperation.getContainertype();
		containertype.setLastModifiedDt(new Date());
		containertype.setRecSt(ENTITY_STATUS_ACTIVE);
		containertype.setLastModifiedUsr(DEFAULT_USER);
		containertype = super.updateOperation(containertypeOperation);
		return containertype;
	}
}