/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Budgetstatus;
import com.cloderia.helion.client.shared.ops.BudgetstatusOperation;
import com.cloderia.helion.client.shared.endpoint.BudgetstatusEndPoint;
import com.cloderia.helion.client.shared.service.BudgetstatusService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class BudgetstatusEndPointImpl extends
		BaseEntityEndPointImpl<Budgetstatus, BudgetstatusOperation> implements BudgetstatusEndPoint {

	@Inject
	BudgetstatusService entityService;
	
	public List<Budgetstatus> findAll(){
		return findAllImpl();
	}
	  
	public Budgetstatus findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Budgetstatus entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(BudgetstatusEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(BudgetstatusOperation entityOperation){
		Budgetstatus entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(BudgetstatusEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Budgetstatus entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(BudgetstatusEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(BudgetstatusOperation entityOperation) {
		Budgetstatus entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(BudgetstatusEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(BudgetstatusOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(BudgetstatusEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Budgetstatus, BudgetstatusOperation> getEntityService() {
		return entityService;
	}
}
