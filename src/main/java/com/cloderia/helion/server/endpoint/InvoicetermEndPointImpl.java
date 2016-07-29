/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Invoiceterm;
import com.cloderia.helion.client.shared.ops.InvoicetermOperation;
import com.cloderia.helion.client.shared.endpoint.InvoicetermEndPoint;
import com.cloderia.helion.client.shared.service.InvoicetermService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class InvoicetermEndPointImpl extends
		BaseEntityEndPointImpl<Invoiceterm, InvoicetermOperation> implements InvoicetermEndPoint {

	@Inject
	InvoicetermService entityService;
	
	public List<Invoiceterm> findAll(){
		return findAllImpl();
	}
	  
	public Invoiceterm findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Invoiceterm entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(InvoicetermEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(InvoicetermOperation entityOperation){
		Invoiceterm entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(InvoicetermEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Invoiceterm entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(InvoicetermEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(InvoicetermOperation entityOperation) {
		Invoiceterm entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(InvoicetermEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(InvoicetermOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(InvoicetermEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Invoiceterm, InvoicetermOperation> getEntityService() {
		return entityService;
	}
}
