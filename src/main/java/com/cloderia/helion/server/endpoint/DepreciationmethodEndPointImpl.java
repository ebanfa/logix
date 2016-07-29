/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Depreciationmethod;
import com.cloderia.helion.client.shared.ops.DepreciationmethodOperation;
import com.cloderia.helion.client.shared.endpoint.DepreciationmethodEndPoint;
import com.cloderia.helion.client.shared.service.DepreciationmethodService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class DepreciationmethodEndPointImpl extends
		BaseEntityEndPointImpl<Depreciationmethod, DepreciationmethodOperation> implements DepreciationmethodEndPoint {

	@Inject
	DepreciationmethodService entityService;
	
	public List<Depreciationmethod> findAll(){
		return findAllImpl();
	}
	  
	public Depreciationmethod findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Depreciationmethod entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(DepreciationmethodEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(DepreciationmethodOperation entityOperation){
		Depreciationmethod entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(DepreciationmethodEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Depreciationmethod entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(DepreciationmethodEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(DepreciationmethodOperation entityOperation) {
		Depreciationmethod entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(DepreciationmethodEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(DepreciationmethodOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(DepreciationmethodEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Depreciationmethod, DepreciationmethodOperation> getEntityService() {
		return entityService;
	}
}
