
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

import com.cloderia.helion.client.shared.model.Facilitytype;
import com.cloderia.helion.client.shared.ops.FacilitytypeOperation;
import com.cloderia.helion.client.shared.service.FacilitytypeService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class FacilitytypeServiceImpl extends BaseEntityServiceImpl<Facilitytype, FacilitytypeOperation> implements
		FacilitytypeService {


	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public FacilitytypeServiceImpl() {
		super(Facilitytype.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Facilitytype.ALL_FACILITYTYPE_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Facilitytype.FIND_FACILITYTYPE_BY_CODE_QUERY;
	}

	@Override
	public Facilitytype createOperation(FacilitytypeOperation facilitytypeOperation) {
		Facilitytype facilitytype = facilitytypeOperation.getFacilitytype();
		facilitytype.setRecSt("");
		facilitytype.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		facilitytype.setRowTs(new Date());
		facilitytype.setCreatedDt(new Date());
		facilitytype.setVersionNo(VERSIONING_ONE);
		facilitytype.setLastModifiedDt(new Date());
		facilitytype.setCreatedByUsr(DEFAULT_USER);
		facilitytype.setRecSt(ENTITY_STATUS_ACTIVE);
		facilitytype.setLastModifiedUsr(DEFAULT_USER);
		facilitytype = super.createOperation(facilitytypeOperation);
		return facilitytype;
	}
	
	@Override
	public Facilitytype updateOperation(FacilitytypeOperation facilitytypeOperation) {
		Facilitytype facilitytype = facilitytypeOperation.getFacilitytype();
		facilitytype.setLastModifiedDt(new Date());
		facilitytype.setRecSt(ENTITY_STATUS_ACTIVE);
		facilitytype.setLastModifiedUsr(DEFAULT_USER);
		facilitytype = super.updateOperation(facilitytypeOperation);
		return facilitytype;
	}
}