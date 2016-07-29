
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

import com.cloderia.helion.client.shared.model.Facility;
import com.cloderia.helion.client.shared.ops.FacilityOperation;
import com.cloderia.helion.client.shared.service.FacilitytypeService;
import com.cloderia.helion.client.shared.service.FacilityService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class FacilityServiceImpl extends BaseEntityServiceImpl<Facility, FacilityOperation> implements
		FacilityService {

	@Inject
	FacilitytypeService facilitytypeService;

	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public FacilityServiceImpl() {
		super(Facility.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Facility.ALL_FACILITY_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Facility.FIND_FACILITY_BY_CODE_QUERY;
	}

	@Override
	public Facility createOperation(FacilityOperation facilityOperation) {
		Facility facility = facilityOperation.getFacility();
		facility.setFacilityTy(facilitytypeService.findById(facilityOperation.getFacilityTyId()));
		facility.setRecSt("");
		facility.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		facility.setRowTs(new Date());
		facility.setCreatedDt(new Date());
		facility.setVersionNo(VERSIONING_ONE);
		facility.setLastModifiedDt(new Date());
		facility.setCreatedByUsr(DEFAULT_USER);
		facility.setRecSt(ENTITY_STATUS_ACTIVE);
		facility.setLastModifiedUsr(DEFAULT_USER);
		facility = super.createOperation(facilityOperation);
		return facility;
	}
	
	@Override
	public Facility updateOperation(FacilityOperation facilityOperation) {
		Facility facility = facilityOperation.getFacility();
		facility.setFacilityTy(facilitytypeService.findById(facilityOperation.getFacilityTyId()));
		facility.setLastModifiedDt(new Date());
		facility.setRecSt(ENTITY_STATUS_ACTIVE);
		facility.setLastModifiedUsr(DEFAULT_USER);
		facility = super.updateOperation(facilityOperation);
		return facility;
	}
}