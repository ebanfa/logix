/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Generalledgeraccount;
import com.cloderia.helion.client.shared.ops.GeneralledgeraccountOperation;
import com.cloderia.helion.client.shared.endpoint.GeneralledgeraccountEndPoint;
import com.cloderia.helion.client.shared.service.GeneralledgeraccountService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class GeneralledgeraccountEndPointImpl extends
		BaseEntityEndPointImpl<Generalledgeraccount, GeneralledgeraccountOperation> implements GeneralledgeraccountEndPoint {

	@Inject
	GeneralledgeraccountService entityService;
	
	public List<Generalledgeraccount> findAll(){
		return findAllImpl();
	}
	  
	public Generalledgeraccount findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Generalledgeraccount entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(GeneralledgeraccountEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(GeneralledgeraccountOperation entityOperation){
		Generalledgeraccount entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(GeneralledgeraccountEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Generalledgeraccount entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(GeneralledgeraccountEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(GeneralledgeraccountOperation entityOperation) {
		Generalledgeraccount entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(GeneralledgeraccountEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(GeneralledgeraccountOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(GeneralledgeraccountEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Generalledgeraccount, GeneralledgeraccountOperation> getEntityService() {
		return entityService;
	}
}
