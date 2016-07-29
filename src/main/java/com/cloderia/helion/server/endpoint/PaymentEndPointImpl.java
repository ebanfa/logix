/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Payment;
import com.cloderia.helion.client.shared.ops.PaymentOperation;
import com.cloderia.helion.client.shared.endpoint.PaymentEndPoint;
import com.cloderia.helion.client.shared.service.PaymentService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class PaymentEndPointImpl extends
		BaseEntityEndPointImpl<Payment, PaymentOperation> implements PaymentEndPoint {

	@Inject
	PaymentService entityService;
	
	public List<Payment> findAll(){
		return findAllImpl();
	}
	  
	public Payment findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Payment entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(PaymentEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(PaymentOperation entityOperation){
		Payment entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(PaymentEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Payment entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(PaymentEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(PaymentOperation entityOperation) {
		Payment entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(PaymentEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(PaymentOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(PaymentEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Payment, PaymentOperation> getEntityService() {
		return entityService;
	}
}
