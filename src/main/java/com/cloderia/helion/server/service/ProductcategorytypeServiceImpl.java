
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

import com.cloderia.helion.client.shared.model.Productcategorytype;
import com.cloderia.helion.client.shared.ops.ProductcategorytypeOperation;
import com.cloderia.helion.client.shared.service.ProductcategorytypeService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class ProductcategorytypeServiceImpl extends BaseEntityServiceImpl<Productcategorytype, ProductcategorytypeOperation> implements
		ProductcategorytypeService {


	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public ProductcategorytypeServiceImpl() {
		super(Productcategorytype.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Productcategorytype.ALL_PRODUCTCATEGORYTYPE_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Productcategorytype.FIND_PRODUCTCATEGORYTYPE_BY_CODE_QUERY;
	}

	@Override
	public Productcategorytype createOperation(ProductcategorytypeOperation productcategorytypeOperation) {
		Productcategorytype productcategorytype = productcategorytypeOperation.getProductcategorytype();
		productcategorytype.setRecSt("");
		productcategorytype.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		productcategorytype.setRowTs(new Date());
		productcategorytype.setCreatedDt(new Date());
		productcategorytype.setVersionNo(VERSIONING_ONE);
		productcategorytype.setLastModifiedDt(new Date());
		productcategorytype.setCreatedByUsr(DEFAULT_USER);
		productcategorytype.setRecSt(ENTITY_STATUS_ACTIVE);
		productcategorytype.setLastModifiedUsr(DEFAULT_USER);
		productcategorytype = super.createOperation(productcategorytypeOperation);
		return productcategorytype;
	}
	
	@Override
	public Productcategorytype updateOperation(ProductcategorytypeOperation productcategorytypeOperation) {
		Productcategorytype productcategorytype = productcategorytypeOperation.getProductcategorytype();
		productcategorytype.setLastModifiedDt(new Date());
		productcategorytype.setRecSt(ENTITY_STATUS_ACTIVE);
		productcategorytype.setLastModifiedUsr(DEFAULT_USER);
		productcategorytype = super.updateOperation(productcategorytypeOperation);
		return productcategorytype;
	}
}