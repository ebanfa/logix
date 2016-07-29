/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Partyrelationshiptype;
import com.cloderia.helion.client.shared.ops.PartyrelationshiptypeOperation;
import com.cloderia.helion.client.shared.endpoint.PartyrelationshiptypeEndPoint;
import com.cloderia.helion.client.shared.service.PartyrelationshiptypeService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class PartyrelationshiptypeEndPointImpl extends
		BaseEntityEndPointImpl<Partyrelationshiptype, PartyrelationshiptypeOperation> implements PartyrelationshiptypeEndPoint {

	@Inject
	PartyrelationshiptypeService entityService;
	
	public List<Partyrelationshiptype> findAll(){
		return findAllImpl();
	}
	  
	public Partyrelationshiptype findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Partyrelationshiptype entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(PartyrelationshiptypeEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(PartyrelationshiptypeOperation entityOperation){
		Partyrelationshiptype entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(PartyrelationshiptypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Partyrelationshiptype entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(PartyrelationshiptypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(PartyrelationshiptypeOperation entityOperation) {
		Partyrelationshiptype entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(PartyrelationshiptypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(PartyrelationshiptypeOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(PartyrelationshiptypeEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Partyrelationshiptype, PartyrelationshiptypeOperation> getEntityService() {
		return entityService;
	}
}
