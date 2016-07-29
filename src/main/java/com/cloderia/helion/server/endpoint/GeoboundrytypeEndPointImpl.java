/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Geoboundrytype;
import com.cloderia.helion.client.shared.ops.GeoboundrytypeOperation;
import com.cloderia.helion.client.shared.endpoint.GeoboundrytypeEndPoint;
import com.cloderia.helion.client.shared.service.GeoboundrytypeService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class GeoboundrytypeEndPointImpl extends
		BaseEntityEndPointImpl<Geoboundrytype, GeoboundrytypeOperation> implements GeoboundrytypeEndPoint {

	@Inject
	GeoboundrytypeService entityService;
	
	public List<Geoboundrytype> findAll(){
		return findAllImpl();
	}
	  
	public Geoboundrytype findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Geoboundrytype entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(GeoboundrytypeEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(GeoboundrytypeOperation entityOperation){
		Geoboundrytype entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(GeoboundrytypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Geoboundrytype entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(GeoboundrytypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(GeoboundrytypeOperation entityOperation) {
		Geoboundrytype entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(GeoboundrytypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(GeoboundrytypeOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(GeoboundrytypeEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Geoboundrytype, GeoboundrytypeOperation> getEntityService() {
		return entityService;
	}
}
