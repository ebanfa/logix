/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Organizationgeneralledgeraccount;
import com.cloderia.helion.client.shared.ops.OrganizationgeneralledgeraccountOperation;
import com.cloderia.helion.client.shared.endpoint.OrganizationgeneralledgeraccountEndPoint;
import com.cloderia.helion.client.shared.service.OrganizationgeneralledgeraccountService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class OrganizationgeneralledgeraccountEndPointImpl extends
		BaseEntityEndPointImpl<Organizationgeneralledgeraccount, OrganizationgeneralledgeraccountOperation> implements OrganizationgeneralledgeraccountEndPoint {

	@Inject
	OrganizationgeneralledgeraccountService entityService;
	
	public List<Organizationgeneralledgeraccount> findAll(){
		return findAllImpl();
	}
	  
	public Organizationgeneralledgeraccount findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Organizationgeneralledgeraccount entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(OrganizationgeneralledgeraccountEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(OrganizationgeneralledgeraccountOperation entityOperation){
		Organizationgeneralledgeraccount entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(OrganizationgeneralledgeraccountEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Organizationgeneralledgeraccount entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(OrganizationgeneralledgeraccountEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(OrganizationgeneralledgeraccountOperation entityOperation) {
		Organizationgeneralledgeraccount entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(OrganizationgeneralledgeraccountEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(OrganizationgeneralledgeraccountOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(OrganizationgeneralledgeraccountEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Organizationgeneralledgeraccount, OrganizationgeneralledgeraccountOperation> getEntityService() {
		return entityService;
	}
}
