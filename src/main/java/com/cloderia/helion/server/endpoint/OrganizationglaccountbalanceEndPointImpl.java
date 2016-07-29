/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Organizationglaccountbalance;
import com.cloderia.helion.client.shared.ops.OrganizationglaccountbalanceOperation;
import com.cloderia.helion.client.shared.endpoint.OrganizationglaccountbalanceEndPoint;
import com.cloderia.helion.client.shared.service.OrganizationglaccountbalanceService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class OrganizationglaccountbalanceEndPointImpl extends
		BaseEntityEndPointImpl<Organizationglaccountbalance, OrganizationglaccountbalanceOperation> implements OrganizationglaccountbalanceEndPoint {

	@Inject
	OrganizationglaccountbalanceService entityService;
	
	public List<Organizationglaccountbalance> findAll(){
		return findAllImpl();
	}
	  
	public Organizationglaccountbalance findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Organizationglaccountbalance entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(OrganizationglaccountbalanceEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(OrganizationglaccountbalanceOperation entityOperation){
		Organizationglaccountbalance entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(OrganizationglaccountbalanceEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Organizationglaccountbalance entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(OrganizationglaccountbalanceEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(OrganizationglaccountbalanceOperation entityOperation) {
		Organizationglaccountbalance entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(OrganizationglaccountbalanceEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(OrganizationglaccountbalanceOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(OrganizationglaccountbalanceEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Organizationglaccountbalance, OrganizationglaccountbalanceOperation> getEntityService() {
		return entityService;
	}
}
