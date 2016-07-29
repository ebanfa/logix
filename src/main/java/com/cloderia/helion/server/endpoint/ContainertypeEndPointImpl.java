/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Containertype;
import com.cloderia.helion.client.shared.ops.ContainertypeOperation;
import com.cloderia.helion.client.shared.endpoint.ContainertypeEndPoint;
import com.cloderia.helion.client.shared.service.ContainertypeService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class ContainertypeEndPointImpl extends
		BaseEntityEndPointImpl<Containertype, ContainertypeOperation> implements ContainertypeEndPoint {

	@Inject
	ContainertypeService entityService;
	
	public List<Containertype> findAll(){
		return findAllImpl();
	}
	  
	public Containertype findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Containertype entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(ContainertypeEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(ContainertypeOperation entityOperation){
		Containertype entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(ContainertypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Containertype entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(ContainertypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(ContainertypeOperation entityOperation) {
		Containertype entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(ContainertypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(ContainertypeOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(ContainertypeEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Containertype, ContainertypeOperation> getEntityService() {
		return entityService;
	}
}
