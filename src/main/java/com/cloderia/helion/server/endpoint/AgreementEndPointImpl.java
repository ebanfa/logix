/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Agreement;
import com.cloderia.helion.client.shared.ops.AgreementOperation;
import com.cloderia.helion.client.shared.endpoint.AgreementEndPoint;
import com.cloderia.helion.client.shared.service.AgreementService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class AgreementEndPointImpl extends
		BaseEntityEndPointImpl<Agreement, AgreementOperation> implements AgreementEndPoint {

	@Inject
	AgreementService entityService;
	
	public List<Agreement> findAll(){
		return findAllImpl();
	}
	  
	public Agreement findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Agreement entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(AgreementEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(AgreementOperation entityOperation){
		Agreement entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(AgreementEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Agreement entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(AgreementEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(AgreementOperation entityOperation) {
		Agreement entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(AgreementEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(AgreementOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(AgreementEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Agreement, AgreementOperation> getEntityService() {
		return entityService;
	}
}
