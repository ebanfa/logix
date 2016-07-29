/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Invoice;
import com.cloderia.helion.client.shared.ops.InvoiceOperation;
import com.cloderia.helion.client.shared.endpoint.InvoiceEndPoint;
import com.cloderia.helion.client.shared.service.InvoiceService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class InvoiceEndPointImpl extends
		BaseEntityEndPointImpl<Invoice, InvoiceOperation> implements InvoiceEndPoint {

	@Inject
	InvoiceService entityService;
	
	public List<Invoice> findAll(){
		return findAllImpl();
	}
	  
	public Invoice findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Invoice entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(InvoiceEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(InvoiceOperation entityOperation){
		Invoice entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(InvoiceEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Invoice entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(InvoiceEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(InvoiceOperation entityOperation) {
		Invoice entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(InvoiceEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(InvoiceOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(InvoiceEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Invoice, InvoiceOperation> getEntityService() {
		return entityService;
	}
}
