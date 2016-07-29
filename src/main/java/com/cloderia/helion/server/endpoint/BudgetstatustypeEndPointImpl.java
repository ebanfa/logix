/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Budgetstatustype;
import com.cloderia.helion.client.shared.ops.BudgetstatustypeOperation;
import com.cloderia.helion.client.shared.endpoint.BudgetstatustypeEndPoint;
import com.cloderia.helion.client.shared.service.BudgetstatustypeService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class BudgetstatustypeEndPointImpl extends
		BaseEntityEndPointImpl<Budgetstatustype, BudgetstatustypeOperation> implements BudgetstatustypeEndPoint {

	@Inject
	BudgetstatustypeService entityService;
	
	public List<Budgetstatustype> findAll(){
		return findAllImpl();
	}
	  
	public Budgetstatustype findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Budgetstatustype entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(BudgetstatustypeEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(BudgetstatustypeOperation entityOperation){
		Budgetstatustype entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(BudgetstatustypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Budgetstatustype entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(BudgetstatustypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(BudgetstatustypeOperation entityOperation) {
		Budgetstatustype entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(BudgetstatustypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(BudgetstatustypeOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(BudgetstatustypeEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Budgetstatustype, BudgetstatustypeOperation> getEntityService() {
		return entityService;
	}
}
