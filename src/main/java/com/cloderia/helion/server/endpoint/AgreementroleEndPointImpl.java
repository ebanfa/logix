/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Agreementrole;
import com.cloderia.helion.client.shared.ops.AgreementroleOperation;
import com.cloderia.helion.client.shared.endpoint.AgreementroleEndPoint;
import com.cloderia.helion.client.shared.service.AgreementroleService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class AgreementroleEndPointImpl extends
		BaseEntityEndPointImpl<Agreementrole, AgreementroleOperation> implements AgreementroleEndPoint {

	@Inject
	AgreementroleService entityService;
	
	public List<Agreementrole> findAll(){
		return findAllImpl();
	}
	  
	public Agreementrole findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Agreementrole entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(AgreementroleEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(AgreementroleOperation entityOperation){
		Agreementrole entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(AgreementroleEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Agreementrole entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(AgreementroleEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(AgreementroleOperation entityOperation) {
		Agreementrole entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(AgreementroleEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(AgreementroleOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(AgreementroleEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Agreementrole, AgreementroleOperation> getEntityService() {
		return entityService;
	}
}
