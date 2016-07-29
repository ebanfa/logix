/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Document;
import com.cloderia.helion.client.shared.ops.DocumentOperation;
import com.cloderia.helion.client.shared.endpoint.DocumentEndPoint;
import com.cloderia.helion.client.shared.service.DocumentService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class DocumentEndPointImpl extends
		BaseEntityEndPointImpl<Document, DocumentOperation> implements DocumentEndPoint {

	@Inject
	DocumentService entityService;
	
	public List<Document> findAll(){
		return findAllImpl();
	}
	  
	public Document findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Document entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(DocumentEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(DocumentOperation entityOperation){
		Document entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(DocumentEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Document entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(DocumentEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(DocumentOperation entityOperation) {
		Document entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(DocumentEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(DocumentOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(DocumentEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Document, DocumentOperation> getEntityService() {
		return entityService;
	}
}
