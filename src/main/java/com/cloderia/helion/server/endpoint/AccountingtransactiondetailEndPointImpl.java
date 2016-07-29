/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Accountingtransactiondetail;
import com.cloderia.helion.client.shared.ops.AccountingtransactiondetailOperation;
import com.cloderia.helion.client.shared.endpoint.AccountingtransactiondetailEndPoint;
import com.cloderia.helion.client.shared.service.AccountingtransactiondetailService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class AccountingtransactiondetailEndPointImpl extends
		BaseEntityEndPointImpl<Accountingtransactiondetail, AccountingtransactiondetailOperation> implements AccountingtransactiondetailEndPoint {

	@Inject
	AccountingtransactiondetailService entityService;
	
	public List<Accountingtransactiondetail> findAll(){
		return findAllImpl();
	}
	  
	public Accountingtransactiondetail findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Accountingtransactiondetail entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(AccountingtransactiondetailEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(AccountingtransactiondetailOperation entityOperation){
		Accountingtransactiondetail entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(AccountingtransactiondetailEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Accountingtransactiondetail entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(AccountingtransactiondetailEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(AccountingtransactiondetailOperation entityOperation) {
		Accountingtransactiondetail entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(AccountingtransactiondetailEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(AccountingtransactiondetailOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(AccountingtransactiondetailEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Accountingtransactiondetail, AccountingtransactiondetailOperation> getEntityService() {
		return entityService;
	}
}
