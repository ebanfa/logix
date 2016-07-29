/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Invoiceitem;
import com.cloderia.helion.client.shared.ops.InvoiceitemOperation;
import com.cloderia.helion.client.shared.endpoint.InvoiceitemEndPoint;
import com.cloderia.helion.client.shared.service.InvoiceitemService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class InvoiceitemEndPointImpl extends
		BaseEntityEndPointImpl<Invoiceitem, InvoiceitemOperation> implements InvoiceitemEndPoint {

	@Inject
	InvoiceitemService entityService;
	
	public List<Invoiceitem> findAll(){
		return findAllImpl();
	}
	  
	public Invoiceitem findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Invoiceitem entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(InvoiceitemEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(InvoiceitemOperation entityOperation){
		Invoiceitem entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(InvoiceitemEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Invoiceitem entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(InvoiceitemEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(InvoiceitemOperation entityOperation) {
		Invoiceitem entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(InvoiceitemEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(InvoiceitemOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(InvoiceitemEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Invoiceitem, InvoiceitemOperation> getEntityService() {
		return entityService;
	}
}
