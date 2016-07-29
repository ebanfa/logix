/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Preferencetype;
import com.cloderia.helion.client.shared.ops.PreferencetypeOperation;
import com.cloderia.helion.client.shared.endpoint.PreferencetypeEndPoint;
import com.cloderia.helion.client.shared.service.PreferencetypeService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class PreferencetypeEndPointImpl extends
		BaseEntityEndPointImpl<Preferencetype, PreferencetypeOperation> implements PreferencetypeEndPoint {

	@Inject
	PreferencetypeService entityService;
	
	public List<Preferencetype> findAll(){
		return findAllImpl();
	}
	  
	public Preferencetype findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Preferencetype entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(PreferencetypeEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(PreferencetypeOperation entityOperation){
		Preferencetype entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(PreferencetypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Preferencetype entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(PreferencetypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(PreferencetypeOperation entityOperation) {
		Preferencetype entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(PreferencetypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(PreferencetypeOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(PreferencetypeEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Preferencetype, PreferencetypeOperation> getEntityService() {
		return entityService;
	}
}
