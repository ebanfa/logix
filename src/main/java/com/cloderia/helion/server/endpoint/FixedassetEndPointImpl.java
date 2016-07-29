/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Fixedasset;
import com.cloderia.helion.client.shared.ops.FixedassetOperation;
import com.cloderia.helion.client.shared.endpoint.FixedassetEndPoint;
import com.cloderia.helion.client.shared.service.FixedassetService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class FixedassetEndPointImpl extends
		BaseEntityEndPointImpl<Fixedasset, FixedassetOperation> implements FixedassetEndPoint {

	@Inject
	FixedassetService entityService;
	
	public List<Fixedasset> findAll(){
		return findAllImpl();
	}
	  
	public Fixedasset findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Fixedasset entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(FixedassetEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(FixedassetOperation entityOperation){
		Fixedasset entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(FixedassetEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Fixedasset entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(FixedassetEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(FixedassetOperation entityOperation) {
		Fixedasset entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(FixedassetEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(FixedassetOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(FixedassetEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Fixedasset, FixedassetOperation> getEntityService() {
		return entityService;
	}
}
