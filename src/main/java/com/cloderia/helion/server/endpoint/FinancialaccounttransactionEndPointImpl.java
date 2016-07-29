/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Financialaccounttransaction;
import com.cloderia.helion.client.shared.ops.FinancialaccounttransactionOperation;
import com.cloderia.helion.client.shared.endpoint.FinancialaccounttransactionEndPoint;
import com.cloderia.helion.client.shared.service.FinancialaccounttransactionService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class FinancialaccounttransactionEndPointImpl extends
		BaseEntityEndPointImpl<Financialaccounttransaction, FinancialaccounttransactionOperation> implements FinancialaccounttransactionEndPoint {

	@Inject
	FinancialaccounttransactionService entityService;
	
	public List<Financialaccounttransaction> findAll(){
		return findAllImpl();
	}
	  
	public Financialaccounttransaction findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Financialaccounttransaction entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(FinancialaccounttransactionEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(FinancialaccounttransactionOperation entityOperation){
		Financialaccounttransaction entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(FinancialaccounttransactionEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Financialaccounttransaction entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(FinancialaccounttransactionEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(FinancialaccounttransactionOperation entityOperation) {
		Financialaccounttransaction entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(FinancialaccounttransactionEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(FinancialaccounttransactionOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(FinancialaccounttransactionEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Financialaccounttransaction, FinancialaccounttransactionOperation> getEntityService() {
		return entityService;
	}
}
