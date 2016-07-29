/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Product;
import com.cloderia.helion.client.shared.ops.ProductOperation;
import com.cloderia.helion.client.shared.endpoint.ProductEndPoint;
import com.cloderia.helion.client.shared.service.ProductService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class ProductEndPointImpl extends
		BaseEntityEndPointImpl<Product, ProductOperation> implements ProductEndPoint {

	@Inject
	ProductService entityService;
	
	public List<Product> findAll(){
		return findAllImpl();
	}
	  
	public Product findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Product entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(ProductEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(ProductOperation entityOperation){
		Product entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(ProductEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Product entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(ProductEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(ProductOperation entityOperation) {
		Product entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(ProductEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(ProductOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(ProductEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Product, ProductOperation> getEntityService() {
		return entityService;
	}
}
