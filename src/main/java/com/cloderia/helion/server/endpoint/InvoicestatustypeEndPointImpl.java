/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Invoicestatustype;
import com.cloderia.helion.client.shared.ops.InvoicestatustypeOperation;
import com.cloderia.helion.client.shared.endpoint.InvoicestatustypeEndPoint;
import com.cloderia.helion.client.shared.service.InvoicestatustypeService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class InvoicestatustypeEndPointImpl extends
		BaseEntityEndPointImpl<Invoicestatustype, InvoicestatustypeOperation> implements InvoicestatustypeEndPoint {

	@Inject
	InvoicestatustypeService entityService;
	
	public List<Invoicestatustype> findAll(){
		return findAllImpl();
	}
	  
	public Invoicestatustype findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Invoicestatustype entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(InvoicestatustypeEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(InvoicestatustypeOperation entityOperation){
		Invoicestatustype entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(InvoicestatustypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Invoicestatustype entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(InvoicestatustypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(InvoicestatustypeOperation entityOperation) {
		Invoicestatustype entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(InvoicestatustypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(InvoicestatustypeOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(InvoicestatustypeEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Invoicestatustype, InvoicestatustypeOperation> getEntityService() {
		return entityService;
	}
}
