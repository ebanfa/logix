/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Organization;
import com.cloderia.helion.client.shared.ops.OrganizationOperation;
import com.cloderia.helion.client.shared.endpoint.OrganizationEndPoint;
import com.cloderia.helion.client.shared.service.OrganizationService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class OrganizationEndPointImpl extends
		BaseEntityEndPointImpl<Organization, OrganizationOperation> implements OrganizationEndPoint {

	@Inject
	OrganizationService entityService;
	
	public List<Organization> findAll(){
		return findAllImpl();
	}
	  
	public Organization findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Organization entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(OrganizationEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(OrganizationOperation entityOperation){
		Organization entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(OrganizationEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Organization entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(OrganizationEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(OrganizationOperation entityOperation) {
		Organization entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(OrganizationEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(OrganizationOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(OrganizationEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Organization, OrganizationOperation> getEntityService() {
		return entityService;
	}
}
