/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Paymentmethodtype;
import com.cloderia.helion.client.shared.ops.PaymentmethodtypeOperation;
import com.cloderia.helion.client.shared.endpoint.PaymentmethodtypeEndPoint;
import com.cloderia.helion.client.shared.service.PaymentmethodtypeService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class PaymentmethodtypeEndPointImpl extends
		BaseEntityEndPointImpl<Paymentmethodtype, PaymentmethodtypeOperation> implements PaymentmethodtypeEndPoint {

	@Inject
	PaymentmethodtypeService entityService;
	
	public List<Paymentmethodtype> findAll(){
		return findAllImpl();
	}
	  
	public Paymentmethodtype findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Paymentmethodtype entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(PaymentmethodtypeEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(PaymentmethodtypeOperation entityOperation){
		Paymentmethodtype entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(PaymentmethodtypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Paymentmethodtype entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(PaymentmethodtypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(PaymentmethodtypeOperation entityOperation) {
		Paymentmethodtype entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(PaymentmethodtypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(PaymentmethodtypeOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(PaymentmethodtypeEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Paymentmethodtype, PaymentmethodtypeOperation> getEntityService() {
		return entityService;
	}
}
