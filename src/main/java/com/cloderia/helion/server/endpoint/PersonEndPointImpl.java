/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Person;
import com.cloderia.helion.client.shared.ops.PersonOperation;
import com.cloderia.helion.client.shared.endpoint.PersonEndPoint;
import com.cloderia.helion.client.shared.service.PersonService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class PersonEndPointImpl extends
		BaseEntityEndPointImpl<Person, PersonOperation> implements PersonEndPoint {

	@Inject
	PersonService entityService;
	
	public List<Person> findAll(){
		return findAllImpl();
	}
	  
	public Person findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Person entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(PersonEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(PersonOperation entityOperation){
		Person entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(PersonEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Person entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(PersonEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(PersonOperation entityOperation) {
		Person entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(PersonEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(PersonOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(PersonEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Person, PersonOperation> getEntityService() {
		return entityService;
	}
}
