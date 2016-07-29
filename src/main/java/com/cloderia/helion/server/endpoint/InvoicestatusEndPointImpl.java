/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Invoicestatus;
import com.cloderia.helion.client.shared.ops.InvoicestatusOperation;
import com.cloderia.helion.client.shared.endpoint.InvoicestatusEndPoint;
import com.cloderia.helion.client.shared.service.InvoicestatusService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class InvoicestatusEndPointImpl extends
		BaseEntityEndPointImpl<Invoicestatus, InvoicestatusOperation> implements InvoicestatusEndPoint {

	@Inject
	InvoicestatusService entityService;
	
	public List<Invoicestatus> findAll(){
		return findAllImpl();
	}
	  
	public Invoicestatus findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Invoicestatus entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(InvoicestatusEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(InvoicestatusOperation entityOperation){
		Invoicestatus entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(InvoicestatusEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Invoicestatus entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(InvoicestatusEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(InvoicestatusOperation entityOperation) {
		Invoicestatus entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(InvoicestatusEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(InvoicestatusOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(InvoicestatusEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Invoicestatus, InvoicestatusOperation> getEntityService() {
		return entityService;
	}
}
