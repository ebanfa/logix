
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

import com.cloderia.helion.client.shared.model.Producttype;
import com.cloderia.helion.client.shared.ops.ProducttypeOperation;
import com.cloderia.helion.client.shared.service.ProducttypeService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class ProducttypeServiceImpl extends BaseEntityServiceImpl<Producttype, ProducttypeOperation> implements
		ProducttypeService {


	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public ProducttypeServiceImpl() {
		super(Producttype.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Producttype.ALL_PRODUCTTYPE_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Producttype.FIND_PRODUCTTYPE_BY_CODE_QUERY;
	}

	@Override
	public Producttype createOperation(ProducttypeOperation producttypeOperation) {
		Producttype producttype = producttypeOperation.getProducttype();
		producttype.setRecSt("");
		producttype.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		producttype.setRowTs(new Date());
		producttype.setCreatedDt(new Date());
		producttype.setVersionNo(VERSIONING_ONE);
		producttype.setLastModifiedDt(new Date());
		producttype.setCreatedByUsr(DEFAULT_USER);
		producttype.setRecSt(ENTITY_STATUS_ACTIVE);
		producttype.setLastModifiedUsr(DEFAULT_USER);
		producttype = super.createOperation(producttypeOperation);
		return producttype;
	}
	
	@Override
	public Producttype updateOperation(ProducttypeOperation producttypeOperation) {
		Producttype producttype = producttypeOperation.getProducttype();
		producttype.setLastModifiedDt(new Date());
		producttype.setRecSt(ENTITY_STATUS_ACTIVE);
		producttype.setLastModifiedUsr(DEFAULT_USER);
		producttype = super.updateOperation(producttypeOperation);
		return producttype;
	}
}