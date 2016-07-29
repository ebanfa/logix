
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

import com.cloderia.helion.client.shared.model.Productcategory;
import com.cloderia.helion.client.shared.ops.ProductcategoryOperation;
import com.cloderia.helion.client.shared.service.ProductcategorytypeService;
import com.cloderia.helion.client.shared.service.ProductcategoryService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class ProductcategoryServiceImpl extends BaseEntityServiceImpl<Productcategory, ProductcategoryOperation> implements
		ProductcategoryService {

	@Inject
	ProductcategorytypeService productcategorytypeService;

	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public ProductcategoryServiceImpl() {
		super(Productcategory.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Productcategory.ALL_PRODUCTCATEGORY_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Productcategory.FIND_PRODUCTCATEGORY_BY_CODE_QUERY;
	}

	@Override
	public Productcategory createOperation(ProductcategoryOperation productcategoryOperation) {
		Productcategory productcategory = productcategoryOperation.getProductcategory();
		productcategory.setProdCatTy(productcategorytypeService.findById(productcategoryOperation.getProdCatTyId()));
		productcategory.setRecSt("");
		productcategory.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		productcategory.setRowTs(new Date());
		productcategory.setCreatedDt(new Date());
		productcategory.setVersionNo(VERSIONING_ONE);
		productcategory.setLastModifiedDt(new Date());
		productcategory.setCreatedByUsr(DEFAULT_USER);
		productcategory.setRecSt(ENTITY_STATUS_ACTIVE);
		productcategory.setLastModifiedUsr(DEFAULT_USER);
		productcategory = super.createOperation(productcategoryOperation);
		return productcategory;
	}
	
	@Override
	public Productcategory updateOperation(ProductcategoryOperation productcategoryOperation) {
		Productcategory productcategory = productcategoryOperation.getProductcategory();
		productcategory.setProdCatTy(productcategorytypeService.findById(productcategoryOperation.getProdCatTyId()));
		productcategory.setLastModifiedDt(new Date());
		productcategory.setRecSt(ENTITY_STATUS_ACTIVE);
		productcategory.setLastModifiedUsr(DEFAULT_USER);
		productcategory = super.updateOperation(productcategoryOperation);
		return productcategory;
	}
}