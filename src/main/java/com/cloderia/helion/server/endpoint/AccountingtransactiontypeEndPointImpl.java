/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Accountingtransactiontype;
import com.cloderia.helion.client.shared.ops.AccountingtransactiontypeOperation;
import com.cloderia.helion.client.shared.endpoint.AccountingtransactiontypeEndPoint;
import com.cloderia.helion.client.shared.service.AccountingtransactiontypeService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class AccountingtransactiontypeEndPointImpl extends
		BaseEntityEndPointImpl<Accountingtransactiontype, AccountingtransactiontypeOperation> implements AccountingtransactiontypeEndPoint {

	@Inject
	AccountingtransactiontypeService entityService;
	
	public List<Accountingtransactiontype> findAll(){
		return findAllImpl();
	}
	  
	public Accountingtransactiontype findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Accountingtransactiontype entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(AccountingtransactiontypeEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(AccountingtransactiontypeOperation entityOperation){
		Accountingtransactiontype entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(AccountingtransactiontypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Accountingtransactiontype entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(AccountingtransactiontypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(AccountingtransactiontypeOperation entityOperation) {
		Accountingtransactiontype entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(AccountingtransactiontypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(AccountingtransactiontypeOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(AccountingtransactiontypeEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Accountingtransactiontype, AccountingtransactiontypeOperation> getEntityService() {
		return entityService;
	}
}
