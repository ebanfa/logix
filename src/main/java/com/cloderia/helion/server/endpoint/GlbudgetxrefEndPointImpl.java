/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Glbudgetxref;
import com.cloderia.helion.client.shared.ops.GlbudgetxrefOperation;
import com.cloderia.helion.client.shared.endpoint.GlbudgetxrefEndPoint;
import com.cloderia.helion.client.shared.service.GlbudgetxrefService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class GlbudgetxrefEndPointImpl extends
		BaseEntityEndPointImpl<Glbudgetxref, GlbudgetxrefOperation> implements GlbudgetxrefEndPoint {

	@Inject
	GlbudgetxrefService entityService;
	
	public List<Glbudgetxref> findAll(){
		return findAllImpl();
	}
	  
	public Glbudgetxref findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Glbudgetxref entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(GlbudgetxrefEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(GlbudgetxrefOperation entityOperation){
		Glbudgetxref entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(GlbudgetxrefEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Glbudgetxref entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(GlbudgetxrefEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(GlbudgetxrefOperation entityOperation) {
		Glbudgetxref entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(GlbudgetxrefEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(GlbudgetxrefOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(GlbudgetxrefEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Glbudgetxref, GlbudgetxrefOperation> getEntityService() {
		return entityService;
	}
}
