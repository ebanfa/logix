/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Facilitytype;
import com.cloderia.helion.client.shared.ops.FacilitytypeOperation;
import com.cloderia.helion.client.shared.endpoint.FacilitytypeEndPoint;
import com.cloderia.helion.client.shared.service.FacilitytypeService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class FacilitytypeEndPointImpl extends
		BaseEntityEndPointImpl<Facilitytype, FacilitytypeOperation> implements FacilitytypeEndPoint {

	@Inject
	FacilitytypeService entityService;
	
	public List<Facilitytype> findAll(){
		return findAllImpl();
	}
	  
	public Facilitytype findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Facilitytype entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(FacilitytypeEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(FacilitytypeOperation entityOperation){
		Facilitytype entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(FacilitytypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Facilitytype entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(FacilitytypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(FacilitytypeOperation entityOperation) {
		Facilitytype entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(FacilitytypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(FacilitytypeOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(FacilitytypeEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Facilitytype, FacilitytypeOperation> getEntityService() {
		return entityService;
	}
}
