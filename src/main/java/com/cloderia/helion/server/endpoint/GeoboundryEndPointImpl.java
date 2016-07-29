/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Geoboundry;
import com.cloderia.helion.client.shared.ops.GeoboundryOperation;
import com.cloderia.helion.client.shared.endpoint.GeoboundryEndPoint;
import com.cloderia.helion.client.shared.service.GeoboundryService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class GeoboundryEndPointImpl extends
		BaseEntityEndPointImpl<Geoboundry, GeoboundryOperation> implements GeoboundryEndPoint {

	@Inject
	GeoboundryService entityService;
	
	public List<Geoboundry> findAll(){
		return findAllImpl();
	}
	  
	public Geoboundry findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Geoboundry entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(GeoboundryEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(GeoboundryOperation entityOperation){
		Geoboundry entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(GeoboundryEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Geoboundry entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(GeoboundryEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(GeoboundryOperation entityOperation) {
		Geoboundry entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(GeoboundryEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(GeoboundryOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(GeoboundryEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Geoboundry, GeoboundryOperation> getEntityService() {
		return entityService;
	}
}
