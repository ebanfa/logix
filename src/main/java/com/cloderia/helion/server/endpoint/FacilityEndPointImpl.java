/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Facility;
import com.cloderia.helion.client.shared.ops.FacilityOperation;
import com.cloderia.helion.client.shared.endpoint.FacilityEndPoint;
import com.cloderia.helion.client.shared.service.FacilityService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class FacilityEndPointImpl extends
		BaseEntityEndPointImpl<Facility, FacilityOperation> implements FacilityEndPoint {

	@Inject
	FacilityService entityService;
	
	public List<Facility> findAll(){
		return findAllImpl();
	}
	  
	public Facility findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Facility entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(FacilityEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(FacilityOperation entityOperation){
		Facility entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(FacilityEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Facility entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(FacilityEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(FacilityOperation entityOperation) {
		Facility entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(FacilityEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(FacilityOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(FacilityEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Facility, FacilityOperation> getEntityService() {
		return entityService;
	}
}
