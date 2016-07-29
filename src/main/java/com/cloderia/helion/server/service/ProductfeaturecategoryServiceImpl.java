
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

import com.cloderia.helion.client.shared.model.Productfeaturecategory;
import com.cloderia.helion.client.shared.ops.ProductfeaturecategoryOperation;
import com.cloderia.helion.client.shared.service.ProductfeaturecategoryService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class ProductfeaturecategoryServiceImpl extends BaseEntityServiceImpl<Productfeaturecategory, ProductfeaturecategoryOperation> implements
		ProductfeaturecategoryService {


	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public ProductfeaturecategoryServiceImpl() {
		super(Productfeaturecategory.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Productfeaturecategory.ALL_PRODUCTFEATURECATEGORY_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Productfeaturecategory.FIND_PRODUCTFEATURECATEGORY_BY_CODE_QUERY;
	}

	@Override
	public Productfeaturecategory createOperation(ProductfeaturecategoryOperation productfeaturecategoryOperation) {
		Productfeaturecategory productfeaturecategory = productfeaturecategoryOperation.getProductfeaturecategory();
		productfeaturecategory.setRecSt("");
		productfeaturecategory.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		productfeaturecategory.setRowTs(new Date());
		productfeaturecategory.setCreatedDt(new Date());
		productfeaturecategory.setVersionNo(VERSIONING_ONE);
		productfeaturecategory.setLastModifiedDt(new Date());
		productfeaturecategory.setCreatedByUsr(DEFAULT_USER);
		productfeaturecategory.setRecSt(ENTITY_STATUS_ACTIVE);
		productfeaturecategory.setLastModifiedUsr(DEFAULT_USER);
		productfeaturecategory = super.createOperation(productfeaturecategoryOperation);
		return productfeaturecategory;
	}
	
	@Override
	public Productfeaturecategory updateOperation(ProductfeaturecategoryOperation productfeaturecategoryOperation) {
		Productfeaturecategory productfeaturecategory = productfeaturecategoryOperation.getProductfeaturecategory();
		productfeaturecategory.setLastModifiedDt(new Date());
		productfeaturecategory.setRecSt(ENTITY_STATUS_ACTIVE);
		productfeaturecategory.setLastModifiedUsr(DEFAULT_USER);
		productfeaturecategory = super.updateOperation(productfeaturecategoryOperation);
		return productfeaturecategory;
	}
}