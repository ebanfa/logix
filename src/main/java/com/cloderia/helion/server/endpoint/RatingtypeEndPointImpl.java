/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Ratingtype;
import com.cloderia.helion.client.shared.ops.RatingtypeOperation;
import com.cloderia.helion.client.shared.endpoint.RatingtypeEndPoint;
import com.cloderia.helion.client.shared.service.RatingtypeService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class RatingtypeEndPointImpl extends
		BaseEntityEndPointImpl<Ratingtype, RatingtypeOperation> implements RatingtypeEndPoint {

	@Inject
	RatingtypeService entityService;
	
	public List<Ratingtype> findAll(){
		return findAllImpl();
	}
	  
	public Ratingtype findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Ratingtype entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(RatingtypeEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(RatingtypeOperation entityOperation){
		Ratingtype entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(RatingtypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Ratingtype entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(RatingtypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(RatingtypeOperation entityOperation) {
		Ratingtype entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(RatingtypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(RatingtypeOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(RatingtypeEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Ratingtype, RatingtypeOperation> getEntityService() {
		return entityService;
	}
}
