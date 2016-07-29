/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Financialaccount;
import com.cloderia.helion.client.shared.ops.FinancialaccountOperation;
import com.cloderia.helion.client.shared.endpoint.FinancialaccountEndPoint;
import com.cloderia.helion.client.shared.service.FinancialaccountService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class FinancialaccountEndPointImpl extends
		BaseEntityEndPointImpl<Financialaccount, FinancialaccountOperation> implements FinancialaccountEndPoint {

	@Inject
	FinancialaccountService entityService;
	
	public List<Financialaccount> findAll(){
		return findAllImpl();
	}
	  
	public Financialaccount findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Financialaccount entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(FinancialaccountEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(FinancialaccountOperation entityOperation){
		Financialaccount entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(FinancialaccountEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Financialaccount entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(FinancialaccountEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(FinancialaccountOperation entityOperation) {
		Financialaccount entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(FinancialaccountEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(FinancialaccountOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(FinancialaccountEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Financialaccount, FinancialaccountOperation> getEntityService() {
		return entityService;
	}
}
