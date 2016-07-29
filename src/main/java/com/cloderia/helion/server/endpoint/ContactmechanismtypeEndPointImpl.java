/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Contactmechanismtype;
import com.cloderia.helion.client.shared.ops.ContactmechanismtypeOperation;
import com.cloderia.helion.client.shared.endpoint.ContactmechanismtypeEndPoint;
import com.cloderia.helion.client.shared.service.ContactmechanismtypeService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class ContactmechanismtypeEndPointImpl extends
		BaseEntityEndPointImpl<Contactmechanismtype, ContactmechanismtypeOperation> implements ContactmechanismtypeEndPoint {

	@Inject
	ContactmechanismtypeService entityService;
	
	public List<Contactmechanismtype> findAll(){
		return findAllImpl();
	}
	  
	public Contactmechanismtype findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Contactmechanismtype entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(ContactmechanismtypeEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(ContactmechanismtypeOperation entityOperation){
		Contactmechanismtype entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(ContactmechanismtypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Contactmechanismtype entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(ContactmechanismtypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(ContactmechanismtypeOperation entityOperation) {
		Contactmechanismtype entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(ContactmechanismtypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(ContactmechanismtypeOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(ContactmechanismtypeEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Contactmechanismtype, ContactmechanismtypeOperation> getEntityService() {
		return entityService;
	}
}
