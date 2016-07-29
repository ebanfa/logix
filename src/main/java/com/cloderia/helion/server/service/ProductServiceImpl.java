
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

import com.cloderia.helion.client.shared.model.Product;
import com.cloderia.helion.client.shared.ops.ProductOperation;
import com.cloderia.helion.client.shared.service.UomService;
import com.cloderia.helion.client.shared.service.ProducttypeService;
import com.cloderia.helion.client.shared.service.ProductService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class ProductServiceImpl extends BaseEntityServiceImpl<Product, ProductOperation> implements
		ProductService {

	@Inject
	UomService uomService;
	@Inject
	ProducttypeService producttypeService;

	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public ProductServiceImpl() {
		super(Product.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Product.ALL_PRODUCT_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Product.FIND_PRODUCT_BY_CODE_QUERY;
	}

	@Override
	public Product createOperation(ProductOperation productOperation) {
		Product product = productOperation.getProduct();
		product.setUom(uomService.findById(productOperation.getUomId()));
		product.setProdTy(producttypeService.findById(productOperation.getProdTyId()));
		product.setRecSt("");
		product.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		product.setRowTs(new Date());
		product.setCreatedDt(new Date());
		product.setVersionNo(VERSIONING_ONE);
		product.setLastModifiedDt(new Date());
		product.setCreatedByUsr(DEFAULT_USER);
		product.setRecSt(ENTITY_STATUS_ACTIVE);
		product.setLastModifiedUsr(DEFAULT_USER);
		product = super.createOperation(productOperation);
		return product;
	}
	
	@Override
	public Product updateOperation(ProductOperation productOperation) {
		Product product = productOperation.getProduct();
		product.setUom(uomService.findById(productOperation.getUomId()));
		product.setProdTy(producttypeService.findById(productOperation.getProdTyId()));
		product.setLastModifiedDt(new Date());
		product.setRecSt(ENTITY_STATUS_ACTIVE);
		product.setLastModifiedUsr(DEFAULT_USER);
		product = super.updateOperation(productOperation);
		return product;
	}
}