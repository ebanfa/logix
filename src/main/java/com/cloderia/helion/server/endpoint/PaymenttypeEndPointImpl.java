/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Paymenttype;
import com.cloderia.helion.client.shared.ops.PaymenttypeOperation;
import com.cloderia.helion.client.shared.endpoint.PaymenttypeEndPoint;
import com.cloderia.helion.client.shared.service.PaymenttypeService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class PaymenttypeEndPointImpl extends
		BaseEntityEndPointImpl<Paymenttype, PaymenttypeOperation> implements PaymenttypeEndPoint {

	@Inject
	PaymenttypeService entityService;
	
	public List<Paymenttype> findAll(){
		return findAllImpl();
	}
	  
	public Paymenttype findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Paymenttype entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(PaymenttypeEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(PaymenttypeOperation entityOperation){
		Paymenttype entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(PaymenttypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Paymenttype entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(PaymenttypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(PaymenttypeOperation entityOperation) {
		Paymenttype entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(PaymenttypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(PaymenttypeOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(PaymenttypeEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Paymenttype, PaymenttypeOperation> getEntityService() {
		return entityService;
	}
}
