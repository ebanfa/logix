/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Productfeature;
import com.cloderia.helion.client.shared.ops.ProductfeatureOperation;
import com.cloderia.helion.client.shared.endpoint.ProductfeatureEndPoint;
import com.cloderia.helion.client.shared.service.ProductfeatureService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class ProductfeatureEndPointImpl extends
		BaseEntityEndPointImpl<Productfeature, ProductfeatureOperation> implements ProductfeatureEndPoint {

	@Inject
	ProductfeatureService entityService;
	
	public List<Productfeature> findAll(){
		return findAllImpl();
	}
	  
	public Productfeature findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Productfeature entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(ProductfeatureEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(ProductfeatureOperation entityOperation){
		Productfeature entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(ProductfeatureEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Productfeature entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(ProductfeatureEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(ProductfeatureOperation entityOperation) {
		Productfeature entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(ProductfeatureEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(ProductfeatureOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(ProductfeatureEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Productfeature, ProductfeatureOperation> getEntityService() {
		return entityService;
	}
}
