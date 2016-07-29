/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Productcategorytype;
import com.cloderia.helion.client.shared.ops.ProductcategorytypeOperation;
import com.cloderia.helion.client.shared.endpoint.ProductcategorytypeEndPoint;
import com.cloderia.helion.client.shared.service.ProductcategorytypeService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class ProductcategorytypeEndPointImpl extends
		BaseEntityEndPointImpl<Productcategorytype, ProductcategorytypeOperation> implements ProductcategorytypeEndPoint {

	@Inject
	ProductcategorytypeService entityService;
	
	public List<Productcategorytype> findAll(){
		return findAllImpl();
	}
	  
	public Productcategorytype findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Productcategorytype entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(ProductcategorytypeEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(ProductcategorytypeOperation entityOperation){
		Productcategorytype entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(ProductcategorytypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Productcategorytype entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(ProductcategorytypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(ProductcategorytypeOperation entityOperation) {
		Productcategorytype entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(ProductcategorytypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(ProductcategorytypeOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(ProductcategorytypeEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Productcategorytype, ProductcategorytypeOperation> getEntityService() {
		return entityService;
	}
}
