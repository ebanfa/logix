/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Agreementterm;
import com.cloderia.helion.client.shared.ops.AgreementtermOperation;
import com.cloderia.helion.client.shared.endpoint.AgreementtermEndPoint;
import com.cloderia.helion.client.shared.service.AgreementtermService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class AgreementtermEndPointImpl extends
		BaseEntityEndPointImpl<Agreementterm, AgreementtermOperation> implements AgreementtermEndPoint {

	@Inject
	AgreementtermService entityService;
	
	public List<Agreementterm> findAll(){
		return findAllImpl();
	}
	  
	public Agreementterm findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Agreementterm entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(AgreementtermEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(AgreementtermOperation entityOperation){
		Agreementterm entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(AgreementtermEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Agreementterm entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(AgreementtermEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(AgreementtermOperation entityOperation) {
		Agreementterm entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(AgreementtermEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(AgreementtermOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(AgreementtermEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Agreementterm, AgreementtermOperation> getEntityService() {
		return entityService;
	}
}
