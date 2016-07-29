/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Invoiceroletype;
import com.cloderia.helion.client.shared.ops.InvoiceroletypeOperation;
import com.cloderia.helion.client.shared.endpoint.InvoiceroletypeEndPoint;
import com.cloderia.helion.client.shared.service.InvoiceroletypeService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class InvoiceroletypeEndPointImpl extends
		BaseEntityEndPointImpl<Invoiceroletype, InvoiceroletypeOperation> implements InvoiceroletypeEndPoint {

	@Inject
	InvoiceroletypeService entityService;
	
	public List<Invoiceroletype> findAll(){
		return findAllImpl();
	}
	  
	public Invoiceroletype findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Invoiceroletype entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(InvoiceroletypeEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(InvoiceroletypeOperation entityOperation){
		Invoiceroletype entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(InvoiceroletypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Invoiceroletype entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(InvoiceroletypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(InvoiceroletypeOperation entityOperation) {
		Invoiceroletype entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(InvoiceroletypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(InvoiceroletypeOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(InvoiceroletypeEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Invoiceroletype, InvoiceroletypeOperation> getEntityService() {
		return entityService;
	}
}
