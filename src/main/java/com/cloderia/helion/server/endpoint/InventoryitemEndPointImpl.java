/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Inventoryitem;
import com.cloderia.helion.client.shared.ops.InventoryitemOperation;
import com.cloderia.helion.client.shared.endpoint.InventoryitemEndPoint;
import com.cloderia.helion.client.shared.service.InventoryitemService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class InventoryitemEndPointImpl extends
		BaseEntityEndPointImpl<Inventoryitem, InventoryitemOperation> implements InventoryitemEndPoint {

	@Inject
	InventoryitemService entityService;
	
	public List<Inventoryitem> findAll(){
		return findAllImpl();
	}
	  
	public Inventoryitem findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Inventoryitem entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(InventoryitemEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(InventoryitemOperation entityOperation){
		Inventoryitem entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(InventoryitemEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Inventoryitem entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(InventoryitemEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(InventoryitemOperation entityOperation) {
		Inventoryitem entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(InventoryitemEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(InventoryitemOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(InventoryitemEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Inventoryitem, InventoryitemOperation> getEntityService() {
		return entityService;
	}
}
