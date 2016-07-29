/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.ApplicationException;
import com.cloderia.helion.client.shared.ops.LoginOperation;
import com.cloderia.helion.client.shared.ops.SignUpOperation;
import com.cloderia.helion.client.shared.model.Systemuser;
import com.cloderia.helion.client.shared.ops.SystemuserOperation;
import com.cloderia.helion.client.shared.endpoint.SystemuserEndPoint;
import com.cloderia.helion.client.shared.service.SystemuserService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class SystemuserEndPointImpl extends
		BaseEntityEndPointImpl<Systemuser, SystemuserOperation> implements SystemuserEndPoint {

	@Inject
	SystemuserService entityService;
	
	public List<Systemuser> findAll(){
		return findAllImpl();
	}
	  
	public Systemuser findById(Long id){
		return findByIdImpl(id);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.shared.endpoint.SystemuserEndPoint#login(com.cloderia.helion.client.shared.ops.LoginOperation)
	 */
	public Response login(LoginOperation loginPojo){
		try {
			Systemuser entity = entityService.login(loginPojo);
			return Response.status(Response.Status.OK).entity(entity.getId()).build();
		} catch (ApplicationException e) {
			e.printStackTrace();
			return Response.status(Response.Status.NOT_ACCEPTABLE)
					.entity("Invalid user name or password " + loginPojo.getUserName()).build();
		} catch (RuntimeException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
					.entity("Server error: " + e.getMessage()).build();
		}
	}

	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.shared.endpoint.SystemuserEndPoint#signUp(com.cloderia.helion.client.shared.ops.SignUpOperation)
	 */
	@Override
	public Response signUp(SignUpOperation signUpPojo) {
		try {
			Systemuser entity = entityService.signUp(signUpPojo);
			return Response.status(Response.Status.OK).entity(entity.getId()).build();
		} catch (ApplicationException e) {
			e.printStackTrace();
			return Response.status(Response.Status.NOT_ACCEPTABLE)
					.entity(e.getMessage()).build();
		} catch (RuntimeException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
					.entity("Server error: " + e.getMessage()).build();
		}
	}
	
	public Response createEntity(Systemuser entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(SystemuserEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(SystemuserOperation entityOperation){
		Systemuser entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(SystemuserEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Systemuser entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(SystemuserEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(SystemuserOperation entityOperation) {
		Systemuser entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(SystemuserEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(SystemuserOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(SystemuserEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Systemuser, SystemuserOperation> getEntityService() {
		return entityService;
	}
	
}
