
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

import com.cloderia.helion.client.shared.model.Productfeature;
import com.cloderia.helion.client.shared.ops.ProductfeatureOperation;
import com.cloderia.helion.client.shared.service.ProductfeaturetypeService;
import com.cloderia.helion.client.shared.service.ProductfeaturecategoryService;
import com.cloderia.helion.client.shared.service.UomService;
import com.cloderia.helion.client.shared.service.ProductfeatureService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class ProductfeatureServiceImpl extends BaseEntityServiceImpl<Productfeature, ProductfeatureOperation> implements
		ProductfeatureService {

	@Inject
	ProductfeaturetypeService productfeaturetypeService;
	@Inject
	ProductfeaturecategoryService productfeaturecategoryService;
	@Inject
	UomService uomService;

	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public ProductfeatureServiceImpl() {
		super(Productfeature.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Productfeature.ALL_PRODUCTFEATURE_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Productfeature.FIND_PRODUCTFEATURE_BY_CODE_QUERY;
	}

	@Override
	public Productfeature createOperation(ProductfeatureOperation productfeatureOperation) {
		Productfeature productfeature = productfeatureOperation.getProductfeature();
		productfeature.setProdFeatTy(productfeaturetypeService.findById(productfeatureOperation.getProdFeatTyId()));
		productfeature.setProdFeatCat(productfeaturecategoryService.findById(productfeatureOperation.getProdFeatCatId()));
		productfeature.setUom(uomService.findById(productfeatureOperation.getUomId()));
		productfeature.setRecSt("");
		productfeature.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		productfeature.setRowTs(new Date());
		productfeature.setCreatedDt(new Date());
		productfeature.setVersionNo(VERSIONING_ONE);
		productfeature.setLastModifiedDt(new Date());
		productfeature.setCreatedByUsr(DEFAULT_USER);
		productfeature.setRecSt(ENTITY_STATUS_ACTIVE);
		productfeature.setLastModifiedUsr(DEFAULT_USER);
		productfeature = super.createOperation(productfeatureOperation);
		return productfeature;
	}
	
	@Override
	public Productfeature updateOperation(ProductfeatureOperation productfeatureOperation) {
		Productfeature productfeature = productfeatureOperation.getProductfeature();
		productfeature.setProdFeatTy(productfeaturetypeService.findById(productfeatureOperation.getProdFeatTyId()));
		productfeature.setProdFeatCat(productfeaturecategoryService.findById(productfeatureOperation.getProdFeatCatId()));
		productfeature.setUom(uomService.findById(productfeatureOperation.getUomId()));
		productfeature.setLastModifiedDt(new Date());
		productfeature.setRecSt(ENTITY_STATUS_ACTIVE);
		productfeature.setLastModifiedUsr(DEFAULT_USER);
		productfeature = super.updateOperation(productfeatureOperation);
		return productfeature;
	}
}