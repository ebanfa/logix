/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Uomconversion;
import com.cloderia.helion.client.shared.ops.UomconversionOperation;
import com.cloderia.helion.client.shared.endpoint.UomconversionEndPoint;
import com.cloderia.helion.client.shared.service.UomconversionService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class UomconversionEndPointImpl extends
		BaseEntityEndPointImpl<Uomconversion, UomconversionOperation> implements UomconversionEndPoint {

	@Inject
	UomconversionService entityService;
	
	public List<Uomconversion> findAll(){
		return findAllImpl();
	}
	  
	public Uomconversion findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Uomconversion entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(UomconversionEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(UomconversionOperation entityOperation){
		Uomconversion entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(UomconversionEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Uomconversion entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(UomconversionEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(UomconversionOperation entityOperation) {
		Uomconversion entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(UomconversionEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(UomconversionOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(UomconversionEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Uomconversion, UomconversionOperation> getEntityService() {
		return entityService;
	}
}
