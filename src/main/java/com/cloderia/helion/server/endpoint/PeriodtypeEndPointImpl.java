/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Periodtype;
import com.cloderia.helion.client.shared.ops.PeriodtypeOperation;
import com.cloderia.helion.client.shared.endpoint.PeriodtypeEndPoint;
import com.cloderia.helion.client.shared.service.PeriodtypeService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class PeriodtypeEndPointImpl extends
		BaseEntityEndPointImpl<Periodtype, PeriodtypeOperation> implements PeriodtypeEndPoint {

	@Inject
	PeriodtypeService entityService;
	
	public List<Periodtype> findAll(){
		return findAllImpl();
	}
	  
	public Periodtype findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Periodtype entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(PeriodtypeEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(PeriodtypeOperation entityOperation){
		Periodtype entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(PeriodtypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Periodtype entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(PeriodtypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(PeriodtypeOperation entityOperation) {
		Periodtype entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(PeriodtypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(PeriodtypeOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(PeriodtypeEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Periodtype, PeriodtypeOperation> getEntityService() {
		return entityService;
	}
}
