/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Contactmechanism;
import com.cloderia.helion.client.shared.ops.ContactmechanismOperation;
import com.cloderia.helion.client.shared.endpoint.ContactmechanismEndPoint;
import com.cloderia.helion.client.shared.service.ContactmechanismService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class ContactmechanismEndPointImpl extends
		BaseEntityEndPointImpl<Contactmechanism, ContactmechanismOperation> implements ContactmechanismEndPoint {

	@Inject
	ContactmechanismService entityService;
	
	public List<Contactmechanism> findAll(){
		return findAllImpl();
	}
	  
	public Contactmechanism findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Contactmechanism entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(ContactmechanismEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(ContactmechanismOperation entityOperation){
		Contactmechanism entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(ContactmechanismEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Contactmechanism entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(ContactmechanismEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(ContactmechanismOperation entityOperation) {
		Contactmechanism entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(ContactmechanismEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(ContactmechanismOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(ContactmechanismEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Contactmechanism, ContactmechanismOperation> getEntityService() {
		return entityService;
	}
}
