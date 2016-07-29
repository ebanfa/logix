/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Terminationtype;
import com.cloderia.helion.client.shared.ops.TerminationtypeOperation;
import com.cloderia.helion.client.shared.endpoint.TerminationtypeEndPoint;
import com.cloderia.helion.client.shared.service.TerminationtypeService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class TerminationtypeEndPointImpl extends
		BaseEntityEndPointImpl<Terminationtype, TerminationtypeOperation> implements TerminationtypeEndPoint {

	@Inject
	TerminationtypeService entityService;
	
	public List<Terminationtype> findAll(){
		return findAllImpl();
	}
	  
	public Terminationtype findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Terminationtype entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(TerminationtypeEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(TerminationtypeOperation entityOperation){
		Terminationtype entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(TerminationtypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Terminationtype entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(TerminationtypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(TerminationtypeOperation entityOperation) {
		Terminationtype entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(TerminationtypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(TerminationtypeOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(TerminationtypeEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Terminationtype, TerminationtypeOperation> getEntityService() {
		return entityService;
	}
}
