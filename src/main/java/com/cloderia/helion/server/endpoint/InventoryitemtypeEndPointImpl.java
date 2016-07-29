/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Inventoryitemtype;
import com.cloderia.helion.client.shared.ops.InventoryitemtypeOperation;
import com.cloderia.helion.client.shared.endpoint.InventoryitemtypeEndPoint;
import com.cloderia.helion.client.shared.service.InventoryitemtypeService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class InventoryitemtypeEndPointImpl extends
		BaseEntityEndPointImpl<Inventoryitemtype, InventoryitemtypeOperation> implements InventoryitemtypeEndPoint {

	@Inject
	InventoryitemtypeService entityService;
	
	public List<Inventoryitemtype> findAll(){
		return findAllImpl();
	}
	  
	public Inventoryitemtype findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Inventoryitemtype entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(InventoryitemtypeEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(InventoryitemtypeOperation entityOperation){
		Inventoryitemtype entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(InventoryitemtypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Inventoryitemtype entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(InventoryitemtypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(InventoryitemtypeOperation entityOperation) {
		Inventoryitemtype entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(InventoryitemtypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(InventoryitemtypeOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(InventoryitemtypeEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Inventoryitemtype, InventoryitemtypeOperation> getEntityService() {
		return entityService;
	}
}
