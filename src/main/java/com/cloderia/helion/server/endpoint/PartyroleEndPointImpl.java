/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Partyrole;
import com.cloderia.helion.client.shared.ops.PartyroleOperation;
import com.cloderia.helion.client.shared.endpoint.PartyroleEndPoint;
import com.cloderia.helion.client.shared.service.PartyroleService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class PartyroleEndPointImpl extends
		BaseEntityEndPointImpl<Partyrole, PartyroleOperation> implements PartyroleEndPoint {

	@Inject
	PartyroleService entityService;
	
	public List<Partyrole> findAll(){
		return findAllImpl();
	}
	  
	public Partyrole findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Partyrole entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(PartyroleEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(PartyroleOperation entityOperation){
		Partyrole entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(PartyroleEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Partyrole entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(PartyroleEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(PartyroleOperation entityOperation) {
		Partyrole entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(PartyroleEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(PartyroleOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(PartyroleEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Partyrole, PartyroleOperation> getEntityService() {
		return entityService;
	}
}
