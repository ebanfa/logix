/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Lot;
import com.cloderia.helion.client.shared.ops.LotOperation;
import com.cloderia.helion.client.shared.endpoint.LotEndPoint;
import com.cloderia.helion.client.shared.service.LotService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class LotEndPointImpl extends
		BaseEntityEndPointImpl<Lot, LotOperation> implements LotEndPoint {

	@Inject
	LotService entityService;
	
	public List<Lot> findAll(){
		return findAllImpl();
	}
	  
	public Lot findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Lot entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(LotEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(LotOperation entityOperation){
		Lot entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(LotEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Lot entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(LotEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(LotOperation entityOperation) {
		Lot entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(LotEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(LotOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(LotEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Lot, LotOperation> getEntityService() {
		return entityService;
	}
}
