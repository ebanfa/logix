/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Uom;
import com.cloderia.helion.client.shared.ops.UomOperation;
import com.cloderia.helion.client.shared.endpoint.UomEndPoint;
import com.cloderia.helion.client.shared.service.UomService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class UomEndPointImpl extends
		BaseEntityEndPointImpl<Uom, UomOperation> implements UomEndPoint {

	@Inject
	UomService entityService;
	
	public List<Uom> findAll(){
		return findAllImpl();
	}
	  
	public Uom findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Uom entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(UomEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(UomOperation entityOperation){
		Uom entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(UomEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Uom entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(UomEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(UomOperation entityOperation) {
		Uom entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(UomEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(UomOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(UomEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Uom, UomOperation> getEntityService() {
		return entityService;
	}
}
