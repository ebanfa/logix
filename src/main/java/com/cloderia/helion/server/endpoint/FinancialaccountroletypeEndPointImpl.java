/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Financialaccountroletype;
import com.cloderia.helion.client.shared.ops.FinancialaccountroletypeOperation;
import com.cloderia.helion.client.shared.endpoint.FinancialaccountroletypeEndPoint;
import com.cloderia.helion.client.shared.service.FinancialaccountroletypeService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class FinancialaccountroletypeEndPointImpl extends
		BaseEntityEndPointImpl<Financialaccountroletype, FinancialaccountroletypeOperation> implements FinancialaccountroletypeEndPoint {

	@Inject
	FinancialaccountroletypeService entityService;
	
	public List<Financialaccountroletype> findAll(){
		return findAllImpl();
	}
	  
	public Financialaccountroletype findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Financialaccountroletype entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(FinancialaccountroletypeEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(FinancialaccountroletypeOperation entityOperation){
		Financialaccountroletype entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(FinancialaccountroletypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Financialaccountroletype entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(FinancialaccountroletypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(FinancialaccountroletypeOperation entityOperation) {
		Financialaccountroletype entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(FinancialaccountroletypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(FinancialaccountroletypeOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(FinancialaccountroletypeEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Financialaccountroletype, FinancialaccountroletypeOperation> getEntityService() {
		return entityService;
	}
}
