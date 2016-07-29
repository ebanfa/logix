/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Accountingperiod;
import com.cloderia.helion.client.shared.ops.AccountingperiodOperation;
import com.cloderia.helion.client.shared.endpoint.AccountingperiodEndPoint;
import com.cloderia.helion.client.shared.service.AccountingperiodService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class AccountingperiodEndPointImpl extends
		BaseEntityEndPointImpl<Accountingperiod, AccountingperiodOperation> implements AccountingperiodEndPoint {

	@Inject
	AccountingperiodService entityService;
	
	public List<Accountingperiod> findAll(){
		return findAllImpl();
	}
	  
	public Accountingperiod findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Accountingperiod entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(AccountingperiodEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(AccountingperiodOperation entityOperation){
		Accountingperiod entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(AccountingperiodEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Accountingperiod entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(AccountingperiodEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(AccountingperiodOperation entityOperation) {
		Accountingperiod entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(AccountingperiodEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(AccountingperiodOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(AccountingperiodEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Accountingperiod, AccountingperiodOperation> getEntityService() {
		return entityService;
	}
}
