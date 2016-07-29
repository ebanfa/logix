/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Agreementtype;
import com.cloderia.helion.client.shared.ops.AgreementtypeOperation;
import com.cloderia.helion.client.shared.endpoint.AgreementtypeEndPoint;
import com.cloderia.helion.client.shared.service.AgreementtypeService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class AgreementtypeEndPointImpl extends
		BaseEntityEndPointImpl<Agreementtype, AgreementtypeOperation> implements AgreementtypeEndPoint {

	@Inject
	AgreementtypeService entityService;
	
	public List<Agreementtype> findAll(){
		return findAllImpl();
	}
	  
	public Agreementtype findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Agreementtype entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(AgreementtypeEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(AgreementtypeOperation entityOperation){
		Agreementtype entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(AgreementtypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Agreementtype entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(AgreementtypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(AgreementtypeOperation entityOperation) {
		Agreementtype entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(AgreementtypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(AgreementtypeOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(AgreementtypeEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Agreementtype, AgreementtypeOperation> getEntityService() {
		return entityService;
	}
}
