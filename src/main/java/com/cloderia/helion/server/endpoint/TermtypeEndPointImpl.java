/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Termtype;
import com.cloderia.helion.client.shared.ops.TermtypeOperation;
import com.cloderia.helion.client.shared.endpoint.TermtypeEndPoint;
import com.cloderia.helion.client.shared.service.TermtypeService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class TermtypeEndPointImpl extends
		BaseEntityEndPointImpl<Termtype, TermtypeOperation> implements TermtypeEndPoint {

	@Inject
	TermtypeService entityService;
	
	public List<Termtype> findAll(){
		return findAllImpl();
	}
	  
	public Termtype findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Termtype entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(TermtypeEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(TermtypeOperation entityOperation){
		Termtype entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(TermtypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Termtype entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(TermtypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(TermtypeOperation entityOperation) {
		Termtype entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(TermtypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(TermtypeOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(TermtypeEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Termtype, TermtypeOperation> getEntityService() {
		return entityService;
	}
}
