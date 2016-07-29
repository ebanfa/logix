/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Partyrelationship;
import com.cloderia.helion.client.shared.ops.PartyrelationshipOperation;
import com.cloderia.helion.client.shared.endpoint.PartyrelationshipEndPoint;
import com.cloderia.helion.client.shared.service.PartyrelationshipService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class PartyrelationshipEndPointImpl extends
		BaseEntityEndPointImpl<Partyrelationship, PartyrelationshipOperation> implements PartyrelationshipEndPoint {

	@Inject
	PartyrelationshipService entityService;
	
	public List<Partyrelationship> findAll(){
		return findAllImpl();
	}
	  
	public Partyrelationship findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Partyrelationship entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(PartyrelationshipEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(PartyrelationshipOperation entityOperation){
		Partyrelationship entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(PartyrelationshipEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Partyrelationship entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(PartyrelationshipEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(PartyrelationshipOperation entityOperation) {
		Partyrelationship entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(PartyrelationshipEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(PartyrelationshipOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(PartyrelationshipEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Partyrelationship, PartyrelationshipOperation> getEntityService() {
		return entityService;
	}
}
