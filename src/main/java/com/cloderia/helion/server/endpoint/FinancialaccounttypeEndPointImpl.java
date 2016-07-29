/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Financialaccounttype;
import com.cloderia.helion.client.shared.ops.FinancialaccounttypeOperation;
import com.cloderia.helion.client.shared.endpoint.FinancialaccounttypeEndPoint;
import com.cloderia.helion.client.shared.service.FinancialaccounttypeService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class FinancialaccounttypeEndPointImpl extends
		BaseEntityEndPointImpl<Financialaccounttype, FinancialaccounttypeOperation> implements FinancialaccounttypeEndPoint {

	@Inject
	FinancialaccounttypeService entityService;
	
	public List<Financialaccounttype> findAll(){
		return findAllImpl();
	}
	  
	public Financialaccounttype findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Financialaccounttype entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(FinancialaccounttypeEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(FinancialaccounttypeOperation entityOperation){
		Financialaccounttype entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(FinancialaccounttypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Financialaccounttype entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(FinancialaccounttypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(FinancialaccounttypeOperation entityOperation) {
		Financialaccounttype entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(FinancialaccounttypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(FinancialaccounttypeOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(FinancialaccounttypeEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Financialaccounttype, FinancialaccounttypeOperation> getEntityService() {
		return entityService;
	}
}
