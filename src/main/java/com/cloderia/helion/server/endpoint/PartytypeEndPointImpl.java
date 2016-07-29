/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Partytype;
import com.cloderia.helion.client.shared.ops.PartytypeOperation;
import com.cloderia.helion.client.shared.endpoint.PartytypeEndPoint;
import com.cloderia.helion.client.shared.service.PartytypeService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class PartytypeEndPointImpl extends
		BaseEntityEndPointImpl<Partytype, PartytypeOperation> implements PartytypeEndPoint {

	@Inject
	PartytypeService entityService;
	
	public List<Partytype> findAll(){
		return findAllImpl();
	}
	  
	public Partytype findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Partytype entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(PartytypeEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(PartytypeOperation entityOperation){
		Partytype entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(PartytypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Partytype entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(PartytypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(PartytypeOperation entityOperation) {
		Partytype entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(PartytypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(PartytypeOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(PartytypeEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Partytype, PartytypeOperation> getEntityService() {
		return entityService;
	}
}
