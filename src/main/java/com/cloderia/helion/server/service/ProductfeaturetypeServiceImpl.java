
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

import com.cloderia.helion.client.shared.model.Productfeaturetype;
import com.cloderia.helion.client.shared.ops.ProductfeaturetypeOperation;
import com.cloderia.helion.client.shared.service.ProductfeaturetypeService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class ProductfeaturetypeServiceImpl extends BaseEntityServiceImpl<Productfeaturetype, ProductfeaturetypeOperation> implements
		ProductfeaturetypeService {


	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public ProductfeaturetypeServiceImpl() {
		super(Productfeaturetype.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Productfeaturetype.ALL_PRODUCTFEATURETYPE_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Productfeaturetype.FIND_PRODUCTFEATURETYPE_BY_CODE_QUERY;
	}

	@Override
	public Productfeaturetype createOperation(ProductfeaturetypeOperation productfeaturetypeOperation) {
		Productfeaturetype productfeaturetype = productfeaturetypeOperation.getProductfeaturetype();
		productfeaturetype.setRecSt("");
		productfeaturetype.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		productfeaturetype.setRowTs(new Date());
		productfeaturetype.setCreatedDt(new Date());
		productfeaturetype.setVersionNo(VERSIONING_ONE);
		productfeaturetype.setLastModifiedDt(new Date());
		productfeaturetype.setCreatedByUsr(DEFAULT_USER);
		productfeaturetype.setRecSt(ENTITY_STATUS_ACTIVE);
		productfeaturetype.setLastModifiedUsr(DEFAULT_USER);
		productfeaturetype = super.createOperation(productfeaturetypeOperation);
		return productfeaturetype;
	}
	
	@Override
	public Productfeaturetype updateOperation(ProductfeaturetypeOperation productfeaturetypeOperation) {
		Productfeaturetype productfeaturetype = productfeaturetypeOperation.getProductfeaturetype();
		productfeaturetype.setLastModifiedDt(new Date());
		productfeaturetype.setRecSt(ENTITY_STATUS_ACTIVE);
		productfeaturetype.setLastModifiedUsr(DEFAULT_USER);
		productfeaturetype = super.updateOperation(productfeaturetypeOperation);
		return productfeaturetype;
	}
}