/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Productcategory;
import com.cloderia.helion.client.shared.ops.ProductcategoryOperation;
import com.cloderia.helion.client.shared.endpoint.ProductcategoryEndPoint;
import com.cloderia.helion.client.shared.service.ProductcategoryService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class ProductcategoryEndPointImpl extends
		BaseEntityEndPointImpl<Productcategory, ProductcategoryOperation> implements ProductcategoryEndPoint {

	@Inject
	ProductcategoryService entityService;
	
	public List<Productcategory> findAll(){
		return findAllImpl();
	}
	  
	public Productcategory findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Productcategory entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(ProductcategoryEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(ProductcategoryOperation entityOperation){
		Productcategory entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(ProductcategoryEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Productcategory entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(ProductcategoryEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(ProductcategoryOperation entityOperation) {
		Productcategory entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(ProductcategoryEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(ProductcategoryOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(ProductcategoryEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Productcategory, ProductcategoryOperation> getEntityService() {
		return entityService;
	}
}
