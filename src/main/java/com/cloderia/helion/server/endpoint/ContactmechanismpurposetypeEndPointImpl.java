/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Contactmechanismpurposetype;
import com.cloderia.helion.client.shared.ops.ContactmechanismpurposetypeOperation;
import com.cloderia.helion.client.shared.endpoint.ContactmechanismpurposetypeEndPoint;
import com.cloderia.helion.client.shared.service.ContactmechanismpurposetypeService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class ContactmechanismpurposetypeEndPointImpl extends
		BaseEntityEndPointImpl<Contactmechanismpurposetype, ContactmechanismpurposetypeOperation> implements ContactmechanismpurposetypeEndPoint {

	@Inject
	ContactmechanismpurposetypeService entityService;
	
	public List<Contactmechanismpurposetype> findAll(){
		return findAllImpl();
	}
	  
	public Contactmechanismpurposetype findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Contactmechanismpurposetype entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(ContactmechanismpurposetypeEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(ContactmechanismpurposetypeOperation entityOperation){
		Contactmechanismpurposetype entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(ContactmechanismpurposetypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Contactmechanismpurposetype entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(ContactmechanismpurposetypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(ContactmechanismpurposetypeOperation entityOperation) {
		Contactmechanismpurposetype entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(ContactmechanismpurposetypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(ContactmechanismpurposetypeOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(ContactmechanismpurposetypeEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Contactmechanismpurposetype, ContactmechanismpurposetypeOperation> getEntityService() {
		return entityService;
	}
}
