/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Party;
import com.cloderia.helion.client.shared.ops.PartyOperation;
import com.cloderia.helion.client.shared.endpoint.PartyEndPoint;
import com.cloderia.helion.client.shared.service.PartyService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class PartyEndPointImpl extends
		BaseEntityEndPointImpl<Party, PartyOperation> implements PartyEndPoint {

	@Inject
	PartyService entityService;
	
	public List<Party> findAll(){
		return findAllImpl();
	}
	  
	public Party findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Party entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(PartyEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(PartyOperation entityOperation){
		Party entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(PartyEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Party entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(PartyEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(PartyOperation entityOperation) {
		Party entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(PartyEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(PartyOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(PartyEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Party, PartyOperation> getEntityService() {
		return entityService;
	}
}
