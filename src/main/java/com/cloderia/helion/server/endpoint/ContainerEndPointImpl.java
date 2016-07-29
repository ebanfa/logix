/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Container;
import com.cloderia.helion.client.shared.ops.ContainerOperation;
import com.cloderia.helion.client.shared.endpoint.ContainerEndPoint;
import com.cloderia.helion.client.shared.service.ContainerService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class ContainerEndPointImpl extends
		BaseEntityEndPointImpl<Container, ContainerOperation> implements ContainerEndPoint {

	@Inject
	ContainerService entityService;
	
	public List<Container> findAll(){
		return findAllImpl();
	}
	  
	public Container findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Container entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(ContainerEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(ContainerOperation entityOperation){
		Container entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(ContainerEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Container entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(ContainerEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(ContainerOperation entityOperation) {
		Container entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(ContainerEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(ContainerOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(ContainerEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Container, ContainerOperation> getEntityService() {
		return entityService;
	}
}
