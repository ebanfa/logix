/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Financialaccountrole;
import com.cloderia.helion.client.shared.ops.FinancialaccountroleOperation;
import com.cloderia.helion.client.shared.endpoint.FinancialaccountroleEndPoint;
import com.cloderia.helion.client.shared.service.FinancialaccountroleService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class FinancialaccountroleEndPointImpl extends
		BaseEntityEndPointImpl<Financialaccountrole, FinancialaccountroleOperation> implements FinancialaccountroleEndPoint {

	@Inject
	FinancialaccountroleService entityService;
	
	public List<Financialaccountrole> findAll(){
		return findAllImpl();
	}
	  
	public Financialaccountrole findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Financialaccountrole entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(FinancialaccountroleEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(FinancialaccountroleOperation entityOperation){
		Financialaccountrole entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(FinancialaccountroleEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Financialaccountrole entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(FinancialaccountroleEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(FinancialaccountroleOperation entityOperation) {
		Financialaccountrole entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(FinancialaccountroleEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(FinancialaccountroleOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(FinancialaccountroleEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Financialaccountrole, FinancialaccountroleOperation> getEntityService() {
		return entityService;
	}
}
