/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Billingaccount;
import com.cloderia.helion.client.shared.ops.BillingaccountOperation;
import com.cloderia.helion.client.shared.endpoint.BillingaccountEndPoint;
import com.cloderia.helion.client.shared.service.BillingaccountService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class BillingaccountEndPointImpl extends
		BaseEntityEndPointImpl<Billingaccount, BillingaccountOperation> implements BillingaccountEndPoint {

	@Inject
	BillingaccountService entityService;
	
	public List<Billingaccount> findAll(){
		return findAllImpl();
	}
	  
	public Billingaccount findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Billingaccount entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(BillingaccountEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(BillingaccountOperation entityOperation){
		Billingaccount entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(BillingaccountEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Billingaccount entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(BillingaccountEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(BillingaccountOperation entityOperation) {
		Billingaccount entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(BillingaccountEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(BillingaccountOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(BillingaccountEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Billingaccount, BillingaccountOperation> getEntityService() {
		return entityService;
	}
}
