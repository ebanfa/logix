/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Standardtimeperiod;
import com.cloderia.helion.client.shared.ops.StandardtimeperiodOperation;
import com.cloderia.helion.client.shared.endpoint.StandardtimeperiodEndPoint;
import com.cloderia.helion.client.shared.service.StandardtimeperiodService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class StandardtimeperiodEndPointImpl extends
		BaseEntityEndPointImpl<Standardtimeperiod, StandardtimeperiodOperation> implements StandardtimeperiodEndPoint {

	@Inject
	StandardtimeperiodService entityService;
	
	public List<Standardtimeperiod> findAll(){
		return findAllImpl();
	}
	  
	public Standardtimeperiod findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Standardtimeperiod entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(StandardtimeperiodEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(StandardtimeperiodOperation entityOperation){
		Standardtimeperiod entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(StandardtimeperiodEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Standardtimeperiod entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(StandardtimeperiodEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(StandardtimeperiodOperation entityOperation) {
		Standardtimeperiod entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(StandardtimeperiodEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(StandardtimeperiodOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(StandardtimeperiodEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Standardtimeperiod, StandardtimeperiodOperation> getEntityService() {
		return entityService;
	}
}
