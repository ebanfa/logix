/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Accountingtransaction;
import com.cloderia.helion.client.shared.ops.AccountingtransactionOperation;
import com.cloderia.helion.client.shared.endpoint.AccountingtransactionEndPoint;
import com.cloderia.helion.client.shared.service.AccountingtransactionService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class AccountingtransactionEndPointImpl extends
		BaseEntityEndPointImpl<Accountingtransaction, AccountingtransactionOperation> implements AccountingtransactionEndPoint {

	@Inject
	AccountingtransactionService entityService;
	
	public List<Accountingtransaction> findAll(){
		return findAllImpl();
	}
	  
	public Accountingtransaction findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Accountingtransaction entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(AccountingtransactionEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(AccountingtransactionOperation entityOperation){
		Accountingtransaction entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(AccountingtransactionEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Accountingtransaction entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(AccountingtransactionEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(AccountingtransactionOperation entityOperation) {
		Accountingtransaction entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(AccountingtransactionEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(AccountingtransactionOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(AccountingtransactionEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Accountingtransaction, AccountingtransactionOperation> getEntityService() {
		return entityService;
	}
}
