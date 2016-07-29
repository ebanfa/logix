
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

import com.cloderia.helion.client.shared.model.Uomconversion;
import com.cloderia.helion.client.shared.ops.UomconversionOperation;
import com.cloderia.helion.client.shared.service.UomService;
import com.cloderia.helion.client.shared.service.UomconversionService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class UomconversionServiceImpl extends BaseEntityServiceImpl<Uomconversion, UomconversionOperation> implements
		UomconversionService {

	@Inject
	UomService uomService;

	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public UomconversionServiceImpl() {
		super(Uomconversion.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Uomconversion.ALL_UOMCONVERSION_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Uomconversion.FIND_UOMCONVERSION_BY_CODE_QUERY;
	}

	@Override
	public Uomconversion createOperation(UomconversionOperation uomconversionOperation) {
		Uomconversion uomconversion = uomconversionOperation.getUomconversion();
		uomconversion.setFromUom(uomService.findById(uomconversionOperation.getFromUomId()));
		uomconversion.setToUom(uomService.findById(uomconversionOperation.getToUomId()));
		uomconversion.setRecSt("");
		uomconversion.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		uomconversion.setRowTs(new Date());
		uomconversion.setCreatedDt(new Date());
		uomconversion.setVersionNo(VERSIONING_ONE);
		uomconversion.setLastModifiedDt(new Date());
		uomconversion.setCreatedByUsr(DEFAULT_USER);
		uomconversion.setRecSt(ENTITY_STATUS_ACTIVE);
		uomconversion.setLastModifiedUsr(DEFAULT_USER);
		uomconversion = super.createOperation(uomconversionOperation);
		return uomconversion;
	}
	
	@Override
	public Uomconversion updateOperation(UomconversionOperation uomconversionOperation) {
		Uomconversion uomconversion = uomconversionOperation.getUomconversion();
		uomconversion.setFromUom(uomService.findById(uomconversionOperation.getFromUomId()));
		uomconversion.setToUom(uomService.findById(uomconversionOperation.getToUomId()));
		uomconversion.setLastModifiedDt(new Date());
		uomconversion.setRecSt(ENTITY_STATUS_ACTIVE);
		uomconversion.setLastModifiedUsr(DEFAULT_USER);
		uomconversion = super.updateOperation(uomconversionOperation);
		return uomconversion;
	}
}