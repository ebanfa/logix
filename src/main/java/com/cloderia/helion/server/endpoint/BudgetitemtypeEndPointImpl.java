/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Budgetitemtype;
import com.cloderia.helion.client.shared.ops.BudgetitemtypeOperation;
import com.cloderia.helion.client.shared.endpoint.BudgetitemtypeEndPoint;
import com.cloderia.helion.client.shared.service.BudgetitemtypeService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class BudgetitemtypeEndPointImpl extends
		BaseEntityEndPointImpl<Budgetitemtype, BudgetitemtypeOperation> implements BudgetitemtypeEndPoint {

	@Inject
	BudgetitemtypeService entityService;
	
	public List<Budgetitemtype> findAll(){
		return findAllImpl();
	}
	  
	public Budgetitemtype findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Budgetitemtype entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(BudgetitemtypeEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(BudgetitemtypeOperation entityOperation){
		Budgetitemtype entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(BudgetitemtypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Budgetitemtype entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(BudgetitemtypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(BudgetitemtypeOperation entityOperation) {
		Budgetitemtype entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(BudgetitemtypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(BudgetitemtypeOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(BudgetitemtypeEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Budgetitemtype, BudgetitemtypeOperation> getEntityService() {
		return entityService;
	}
}
