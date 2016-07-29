/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Budgetitem;
import com.cloderia.helion.client.shared.ops.BudgetitemOperation;
import com.cloderia.helion.client.shared.endpoint.BudgetitemEndPoint;
import com.cloderia.helion.client.shared.service.BudgetitemService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class BudgetitemEndPointImpl extends
		BaseEntityEndPointImpl<Budgetitem, BudgetitemOperation> implements BudgetitemEndPoint {

	@Inject
	BudgetitemService entityService;
	
	public List<Budgetitem> findAll(){
		return findAllImpl();
	}
	  
	public Budgetitem findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Budgetitem entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(BudgetitemEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(BudgetitemOperation entityOperation){
		Budgetitem entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(BudgetitemEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Budgetitem entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(BudgetitemEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(BudgetitemOperation entityOperation) {
		Budgetitem entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(BudgetitemEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(BudgetitemOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(BudgetitemEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Budgetitem, BudgetitemOperation> getEntityService() {
		return entityService;
	}
}
