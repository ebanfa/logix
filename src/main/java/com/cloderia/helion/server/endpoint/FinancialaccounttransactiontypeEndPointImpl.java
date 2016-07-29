/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Financialaccounttransactiontype;
import com.cloderia.helion.client.shared.ops.FinancialaccounttransactiontypeOperation;
import com.cloderia.helion.client.shared.endpoint.FinancialaccounttransactiontypeEndPoint;
import com.cloderia.helion.client.shared.service.FinancialaccounttransactiontypeService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class FinancialaccounttransactiontypeEndPointImpl extends
		BaseEntityEndPointImpl<Financialaccounttransactiontype, FinancialaccounttransactiontypeOperation> implements FinancialaccounttransactiontypeEndPoint {

	@Inject
	FinancialaccounttransactiontypeService entityService;
	
	public List<Financialaccounttransactiontype> findAll(){
		return findAllImpl();
	}
	  
	public Financialaccounttransactiontype findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Financialaccounttransactiontype entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(FinancialaccounttransactiontypeEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(FinancialaccounttransactiontypeOperation entityOperation){
		Financialaccounttransactiontype entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(FinancialaccounttransactiontypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Financialaccounttransactiontype entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(FinancialaccounttransactiontypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(FinancialaccounttransactiontypeOperation entityOperation) {
		Financialaccounttransactiontype entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(FinancialaccounttransactiontypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(FinancialaccounttransactiontypeOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(FinancialaccounttransactiontypeEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Financialaccounttransactiontype, FinancialaccounttransactiontypeOperation> getEntityService() {
		return entityService;
	}
}
