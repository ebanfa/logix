/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.ops.UniverseOperation;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.service.UniverseService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class UniverseEndPointImpl extends
		BaseEntityEndPointImpl<Universe, UniverseOperation> implements UniverseEndPoint {

	@Inject
	UniverseService entityService;
	
	public List<Universe> findAll(){
		return findAllImpl();
	}
	  
	public Universe findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Universe entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(UniverseEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(UniverseOperation entityOperation){
		Universe entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(UniverseEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Universe entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(UniverseEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(UniverseOperation entityOperation) {
		Universe entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(UniverseEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(UniverseOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(UniverseEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Universe, UniverseOperation> getEntityService() {
		return entityService;
	}
}
