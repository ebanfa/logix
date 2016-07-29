/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Inventoryitemstatus;
import com.cloderia.helion.client.shared.ops.InventoryitemstatusOperation;
import com.cloderia.helion.client.shared.endpoint.InventoryitemstatusEndPoint;
import com.cloderia.helion.client.shared.service.InventoryitemstatusService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class InventoryitemstatusEndPointImpl extends
		BaseEntityEndPointImpl<Inventoryitemstatus, InventoryitemstatusOperation> implements InventoryitemstatusEndPoint {

	@Inject
	InventoryitemstatusService entityService;
	
	public List<Inventoryitemstatus> findAll(){
		return findAllImpl();
	}
	  
	public Inventoryitemstatus findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Inventoryitemstatus entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(InventoryitemstatusEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(InventoryitemstatusOperation entityOperation){
		Inventoryitemstatus entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(InventoryitemstatusEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Inventoryitemstatus entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(InventoryitemstatusEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(InventoryitemstatusOperation entityOperation) {
		Inventoryitemstatus entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(InventoryitemstatusEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(InventoryitemstatusOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(InventoryitemstatusEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Inventoryitemstatus, InventoryitemstatusOperation> getEntityService() {
		return entityService;
	}
}
