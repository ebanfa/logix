/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Productfeaturetype;
import com.cloderia.helion.client.shared.ops.ProductfeaturetypeOperation;
import com.cloderia.helion.client.shared.endpoint.ProductfeaturetypeEndPoint;
import com.cloderia.helion.client.shared.service.ProductfeaturetypeService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class ProductfeaturetypeEndPointImpl extends
		BaseEntityEndPointImpl<Productfeaturetype, ProductfeaturetypeOperation> implements ProductfeaturetypeEndPoint {

	@Inject
	ProductfeaturetypeService entityService;
	
	public List<Productfeaturetype> findAll(){
		return findAllImpl();
	}
	  
	public Productfeaturetype findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Productfeaturetype entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(ProductfeaturetypeEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(ProductfeaturetypeOperation entityOperation){
		Productfeaturetype entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(ProductfeaturetypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Productfeaturetype entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(ProductfeaturetypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(ProductfeaturetypeOperation entityOperation) {
		Productfeaturetype entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(ProductfeaturetypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(ProductfeaturetypeOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(ProductfeaturetypeEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Productfeaturetype, ProductfeaturetypeOperation> getEntityService() {
		return entityService;
	}
}
