/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Budgettype;
import com.cloderia.helion.client.shared.ops.BudgettypeOperation;
import com.cloderia.helion.client.shared.endpoint.BudgettypeEndPoint;
import com.cloderia.helion.client.shared.service.BudgettypeService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class BudgettypeEndPointImpl extends
		BaseEntityEndPointImpl<Budgettype, BudgettypeOperation> implements BudgettypeEndPoint {

	@Inject
	BudgettypeService entityService;
	
	public List<Budgettype> findAll(){
		return findAllImpl();
	}
	  
	public Budgettype findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Budgettype entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(BudgettypeEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(BudgettypeOperation entityOperation){
		Budgettype entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(BudgettypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Budgettype entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(BudgettypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(BudgettypeOperation entityOperation) {
		Budgettype entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(BudgettypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(BudgettypeOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(BudgettypeEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Budgettype, BudgettypeOperation> getEntityService() {
		return entityService;
	}
}
