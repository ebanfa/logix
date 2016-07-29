/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Documenttype;
import com.cloderia.helion.client.shared.ops.DocumenttypeOperation;
import com.cloderia.helion.client.shared.endpoint.DocumenttypeEndPoint;
import com.cloderia.helion.client.shared.service.DocumenttypeService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class DocumenttypeEndPointImpl extends
		BaseEntityEndPointImpl<Documenttype, DocumenttypeOperation> implements DocumenttypeEndPoint {

	@Inject
	DocumenttypeService entityService;
	
	public List<Documenttype> findAll(){
		return findAllImpl();
	}
	  
	public Documenttype findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Documenttype entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(DocumenttypeEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(DocumenttypeOperation entityOperation){
		Documenttype entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(DocumenttypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Documenttype entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(DocumenttypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(DocumenttypeOperation entityOperation) {
		Documenttype entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(DocumenttypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(DocumenttypeOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(DocumenttypeEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Documenttype, DocumenttypeOperation> getEntityService() {
		return entityService;
	}
}
