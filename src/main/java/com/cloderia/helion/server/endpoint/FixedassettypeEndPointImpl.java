/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Fixedassettype;
import com.cloderia.helion.client.shared.ops.FixedassettypeOperation;
import com.cloderia.helion.client.shared.endpoint.FixedassettypeEndPoint;
import com.cloderia.helion.client.shared.service.FixedassettypeService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class FixedassettypeEndPointImpl extends
		BaseEntityEndPointImpl<Fixedassettype, FixedassettypeOperation> implements FixedassettypeEndPoint {

	@Inject
	FixedassettypeService entityService;
	
	public List<Fixedassettype> findAll(){
		return findAllImpl();
	}
	  
	public Fixedassettype findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Fixedassettype entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(FixedassettypeEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(FixedassettypeOperation entityOperation){
		Fixedassettype entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(FixedassettypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Fixedassettype entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(FixedassettypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(FixedassettypeOperation entityOperation) {
		Fixedassettype entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(FixedassettypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(FixedassettypeOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(FixedassettypeEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Fixedassettype, FixedassettypeOperation> getEntityService() {
		return entityService;
	}
}
