/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Productfeaturecategory;
import com.cloderia.helion.client.shared.ops.ProductfeaturecategoryOperation;
import com.cloderia.helion.client.shared.endpoint.ProductfeaturecategoryEndPoint;
import com.cloderia.helion.client.shared.service.ProductfeaturecategoryService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class ProductfeaturecategoryEndPointImpl extends
		BaseEntityEndPointImpl<Productfeaturecategory, ProductfeaturecategoryOperation> implements ProductfeaturecategoryEndPoint {

	@Inject
	ProductfeaturecategoryService entityService;
	
	public List<Productfeaturecategory> findAll(){
		return findAllImpl();
	}
	  
	public Productfeaturecategory findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Productfeaturecategory entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(ProductfeaturecategoryEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(ProductfeaturecategoryOperation entityOperation){
		Productfeaturecategory entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(ProductfeaturecategoryEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Productfeaturecategory entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(ProductfeaturecategoryEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(ProductfeaturecategoryOperation entityOperation) {
		Productfeaturecategory entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(ProductfeaturecategoryEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(ProductfeaturecategoryOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(ProductfeaturecategoryEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Productfeaturecategory, ProductfeaturecategoryOperation> getEntityService() {
		return entityService;
	}
}
