/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Budget;
import com.cloderia.helion.client.shared.ops.BudgetOperation;
import com.cloderia.helion.client.shared.endpoint.BudgetEndPoint;
import com.cloderia.helion.client.shared.service.BudgetService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class BudgetEndPointImpl extends
		BaseEntityEndPointImpl<Budget, BudgetOperation> implements BudgetEndPoint {

	@Inject
	BudgetService entityService;
	
	public List<Budget> findAll(){
		return findAllImpl();
	}
	  
	public Budget findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Budget entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(BudgetEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(BudgetOperation entityOperation){
		Budget entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(BudgetEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Budget entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(BudgetEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(BudgetOperation entityOperation) {
		Budget entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(BudgetEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(BudgetOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(BudgetEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Budget, BudgetOperation> getEntityService() {
		return entityService;
	}
}
