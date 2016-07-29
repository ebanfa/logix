/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Partyroletype;
import com.cloderia.helion.client.shared.ops.PartyroletypeOperation;
import com.cloderia.helion.client.shared.endpoint.PartyroletypeEndPoint;
import com.cloderia.helion.client.shared.service.PartyroletypeService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class PartyroletypeEndPointImpl extends
		BaseEntityEndPointImpl<Partyroletype, PartyroletypeOperation> implements PartyroletypeEndPoint {

	@Inject
	PartyroletypeService entityService;
	
	public List<Partyroletype> findAll(){
		return findAllImpl();
	}
	  
	public Partyroletype findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Partyroletype entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(PartyroletypeEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(PartyroletypeOperation entityOperation){
		Partyroletype entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(PartyroletypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Partyroletype entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(PartyroletypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(PartyroletypeOperation entityOperation) {
		Partyroletype entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(PartyroletypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(PartyroletypeOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(PartyroletypeEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Partyroletype, PartyroletypeOperation> getEntityService() {
		return entityService;
	}
}
