/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Paymentapplication;
import com.cloderia.helion.client.shared.ops.PaymentapplicationOperation;
import com.cloderia.helion.client.shared.endpoint.PaymentapplicationEndPoint;
import com.cloderia.helion.client.shared.service.PaymentapplicationService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class PaymentapplicationEndPointImpl extends
		BaseEntityEndPointImpl<Paymentapplication, PaymentapplicationOperation> implements PaymentapplicationEndPoint {

	@Inject
	PaymentapplicationService entityService;
	
	public List<Paymentapplication> findAll(){
		return findAllImpl();
	}
	  
	public Paymentapplication findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Paymentapplication entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(PaymentapplicationEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(PaymentapplicationOperation entityOperation){
		Paymentapplication entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(PaymentapplicationEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Paymentapplication entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(PaymentapplicationEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(PaymentapplicationOperation entityOperation) {
		Paymentapplication entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(PaymentapplicationEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(PaymentapplicationOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(PaymentapplicationEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Paymentapplication, PaymentapplicationOperation> getEntityService() {
		return entityService;
	}
}
