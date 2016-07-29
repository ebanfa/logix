/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Fixedassetdepreciationmethod;
import com.cloderia.helion.client.shared.ops.FixedassetdepreciationmethodOperation;
import com.cloderia.helion.client.shared.endpoint.FixedassetdepreciationmethodEndPoint;
import com.cloderia.helion.client.shared.service.FixedassetdepreciationmethodService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class FixedassetdepreciationmethodEndPointImpl extends
		BaseEntityEndPointImpl<Fixedassetdepreciationmethod, FixedassetdepreciationmethodOperation> implements FixedassetdepreciationmethodEndPoint {

	@Inject
	FixedassetdepreciationmethodService entityService;
	
	public List<Fixedassetdepreciationmethod> findAll(){
		return findAllImpl();
	}
	  
	public Fixedassetdepreciationmethod findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Fixedassetdepreciationmethod entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(FixedassetdepreciationmethodEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(FixedassetdepreciationmethodOperation entityOperation){
		Fixedassetdepreciationmethod entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(FixedassetdepreciationmethodEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Fixedassetdepreciationmethod entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(FixedassetdepreciationmethodEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(FixedassetdepreciationmethodOperation entityOperation) {
		Fixedassetdepreciationmethod entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(FixedassetdepreciationmethodEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(FixedassetdepreciationmethodOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(FixedassetdepreciationmethodEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Fixedassetdepreciationmethod, FixedassetdepreciationmethodOperation> getEntityService() {
		return entityService;
	}
}
