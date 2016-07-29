
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

import com.cloderia.helion.client.shared.model.Supplierproduct;
import com.cloderia.helion.client.shared.ops.SupplierproductOperation;
import com.cloderia.helion.client.shared.service.ProductService;
import com.cloderia.helion.client.shared.service.PreferencetypeService;
import com.cloderia.helion.client.shared.service.RatingtypeService;
import com.cloderia.helion.client.shared.service.SupplierproductService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class SupplierproductServiceImpl extends BaseEntityServiceImpl<Supplierproduct, SupplierproductOperation> implements
		SupplierproductService {

	@Inject
	ProductService productService;
	@Inject
	PreferencetypeService preferencetypeService;
	@Inject
	RatingtypeService ratingtypeService;

	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public SupplierproductServiceImpl() {
		super(Supplierproduct.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Supplierproduct.ALL_SUPPLIERPRODUCT_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Supplierproduct.FIND_SUPPLIERPRODUCT_BY_CODE_QUERY;
	}

	@Override
	public Supplierproduct createOperation(SupplierproductOperation supplierproductOperation) {
		Supplierproduct supplierproduct = supplierproductOperation.getSupplierproduct();
		supplierproduct.setProd(productService.findById(supplierproductOperation.getProdId()));
		supplierproduct.setPref(preferencetypeService.findById(supplierproductOperation.getPrefId()));
		supplierproduct.setRating(ratingtypeService.findById(supplierproductOperation.getRatingId()));
		supplierproduct.setRecSt("");
		supplierproduct.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		supplierproduct.setRowTs(new Date());
		supplierproduct.setCreatedDt(new Date());
		supplierproduct.setVersionNo(VERSIONING_ONE);
		supplierproduct.setLastModifiedDt(new Date());
		supplierproduct.setCreatedByUsr(DEFAULT_USER);
		supplierproduct.setRecSt(ENTITY_STATUS_ACTIVE);
		supplierproduct.setLastModifiedUsr(DEFAULT_USER);
		supplierproduct = super.createOperation(supplierproductOperation);
		return supplierproduct;
	}
	
	@Override
	public Supplierproduct updateOperation(SupplierproductOperation supplierproductOperation) {
		Supplierproduct supplierproduct = supplierproductOperation.getSupplierproduct();
		supplierproduct.setProd(productService.findById(supplierproductOperation.getProdId()));
		supplierproduct.setPref(preferencetypeService.findById(supplierproductOperation.getPrefId()));
		supplierproduct.setRating(ratingtypeService.findById(supplierproductOperation.getRatingId()));
		supplierproduct.setLastModifiedDt(new Date());
		supplierproduct.setRecSt(ENTITY_STATUS_ACTIVE);
		supplierproduct.setLastModifiedUsr(DEFAULT_USER);
		supplierproduct = super.updateOperation(supplierproductOperation);
		return supplierproduct;
	}
}