/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Partycategory;
import com.cloderia.helion.client.shared.ops.PartycategoryOperation;
import com.cloderia.helion.client.shared.endpoint.PartycategoryEndPoint;
import com.cloderia.helion.client.shared.service.PartycategoryService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class PartycategoryEndPointImpl extends
		BaseEntityEndPointImpl<Partycategory, PartycategoryOperation> implements PartycategoryEndPoint {

	@Inject
	PartycategoryService entityService;
	
	public List<Partycategory> findAll(){
		return findAllImpl();
	}
	  
	public Partycategory findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Partycategory entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(PartycategoryEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(PartycategoryOperation entityOperation){
		Partycategory entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(PartycategoryEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Partycategory entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(PartycategoryEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(PartycategoryOperation entityOperation) {
		Partycategory entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(PartycategoryEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(PartycategoryOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(PartycategoryEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Partycategory, PartycategoryOperation> getEntityService() {
		return entityService;
	}
}
