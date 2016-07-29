/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Invoiceitemtype;
import com.cloderia.helion.client.shared.ops.InvoiceitemtypeOperation;
import com.cloderia.helion.client.shared.endpoint.InvoiceitemtypeEndPoint;
import com.cloderia.helion.client.shared.service.InvoiceitemtypeService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class InvoiceitemtypeEndPointImpl extends
		BaseEntityEndPointImpl<Invoiceitemtype, InvoiceitemtypeOperation> implements InvoiceitemtypeEndPoint {

	@Inject
	InvoiceitemtypeService entityService;
	
	public List<Invoiceitemtype> findAll(){
		return findAllImpl();
	}
	  
	public Invoiceitemtype findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Invoiceitemtype entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(InvoiceitemtypeEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(InvoiceitemtypeOperation entityOperation){
		Invoiceitemtype entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(InvoiceitemtypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Invoiceitemtype entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(InvoiceitemtypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(InvoiceitemtypeOperation entityOperation) {
		Invoiceitemtype entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(InvoiceitemtypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(InvoiceitemtypeOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(InvoiceitemtypeEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Invoiceitemtype, InvoiceitemtypeOperation> getEntityService() {
		return entityService;
	}
}
