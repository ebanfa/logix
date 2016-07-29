/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Terminationreason;
import com.cloderia.helion.client.shared.ops.TerminationreasonOperation;
import com.cloderia.helion.client.shared.endpoint.TerminationreasonEndPoint;
import com.cloderia.helion.client.shared.service.TerminationreasonService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class TerminationreasonEndPointImpl extends
		BaseEntityEndPointImpl<Terminationreason, TerminationreasonOperation> implements TerminationreasonEndPoint {

	@Inject
	TerminationreasonService entityService;
	
	public List<Terminationreason> findAll(){
		return findAllImpl();
	}
	  
	public Terminationreason findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Terminationreason entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(TerminationreasonEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(TerminationreasonOperation entityOperation){
		Terminationreason entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(TerminationreasonEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Terminationreason entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(TerminationreasonEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(TerminationreasonOperation entityOperation) {
		Terminationreason entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(TerminationreasonEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(TerminationreasonOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(TerminationreasonEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Terminationreason, TerminationreasonOperation> getEntityService() {
		return entityService;
	}
}
