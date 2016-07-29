/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Generalledgeraccounttype;
import com.cloderia.helion.client.shared.ops.GeneralledgeraccounttypeOperation;
import com.cloderia.helion.client.shared.endpoint.GeneralledgeraccounttypeEndPoint;
import com.cloderia.helion.client.shared.service.GeneralledgeraccounttypeService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class GeneralledgeraccounttypeEndPointImpl extends
		BaseEntityEndPointImpl<Generalledgeraccounttype, GeneralledgeraccounttypeOperation> implements GeneralledgeraccounttypeEndPoint {

	@Inject
	GeneralledgeraccounttypeService entityService;
	
	public List<Generalledgeraccounttype> findAll(){
		return findAllImpl();
	}
	  
	public Generalledgeraccounttype findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Generalledgeraccounttype entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(GeneralledgeraccounttypeEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(GeneralledgeraccounttypeOperation entityOperation){
		Generalledgeraccounttype entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(GeneralledgeraccounttypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Generalledgeraccounttype entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(GeneralledgeraccounttypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(GeneralledgeraccounttypeOperation entityOperation) {
		Generalledgeraccounttype entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(GeneralledgeraccounttypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(GeneralledgeraccounttypeOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(GeneralledgeraccounttypeEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Generalledgeraccounttype, GeneralledgeraccounttypeOperation> getEntityService() {
		return entityService;
	}
}
