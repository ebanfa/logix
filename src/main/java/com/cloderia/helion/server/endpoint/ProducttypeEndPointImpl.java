/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Producttype;
import com.cloderia.helion.client.shared.ops.ProducttypeOperation;
import com.cloderia.helion.client.shared.endpoint.ProducttypeEndPoint;
import com.cloderia.helion.client.shared.service.ProducttypeService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class ProducttypeEndPointImpl extends
		BaseEntityEndPointImpl<Producttype, ProducttypeOperation> implements ProducttypeEndPoint {

	@Inject
	ProducttypeService entityService;
	
	public List<Producttype> findAll(){
		return findAllImpl();
	}
	  
	public Producttype findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Producttype entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(ProducttypeEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(ProducttypeOperation entityOperation){
		Producttype entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(ProducttypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Producttype entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(ProducttypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(ProducttypeOperation entityOperation) {
		Producttype entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(ProducttypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(ProducttypeOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(ProducttypeEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Producttype, ProducttypeOperation> getEntityService() {
		return entityService;
	}
}
