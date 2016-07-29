/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Partyrelationshipstatus;
import com.cloderia.helion.client.shared.ops.PartyrelationshipstatusOperation;
import com.cloderia.helion.client.shared.endpoint.PartyrelationshipstatusEndPoint;
import com.cloderia.helion.client.shared.service.PartyrelationshipstatusService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class PartyrelationshipstatusEndPointImpl extends
		BaseEntityEndPointImpl<Partyrelationshipstatus, PartyrelationshipstatusOperation> implements PartyrelationshipstatusEndPoint {

	@Inject
	PartyrelationshipstatusService entityService;
	
	public List<Partyrelationshipstatus> findAll(){
		return findAllImpl();
	}
	  
	public Partyrelationshipstatus findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Partyrelationshipstatus entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(PartyrelationshipstatusEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(PartyrelationshipstatusOperation entityOperation){
		Partyrelationshipstatus entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(PartyrelationshipstatusEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Partyrelationshipstatus entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(PartyrelationshipstatusEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(PartyrelationshipstatusOperation entityOperation) {
		Partyrelationshipstatus entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(PartyrelationshipstatusEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(PartyrelationshipstatusOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(PartyrelationshipstatusEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Partyrelationshipstatus, PartyrelationshipstatusOperation> getEntityService() {
		return entityService;
	}
}
