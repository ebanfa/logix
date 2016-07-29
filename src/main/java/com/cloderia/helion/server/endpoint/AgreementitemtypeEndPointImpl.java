/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Agreementitemtype;
import com.cloderia.helion.client.shared.ops.AgreementitemtypeOperation;
import com.cloderia.helion.client.shared.endpoint.AgreementitemtypeEndPoint;
import com.cloderia.helion.client.shared.service.AgreementitemtypeService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class AgreementitemtypeEndPointImpl extends
		BaseEntityEndPointImpl<Agreementitemtype, AgreementitemtypeOperation> implements AgreementitemtypeEndPoint {

	@Inject
	AgreementitemtypeService entityService;
	
	public List<Agreementitemtype> findAll(){
		return findAllImpl();
	}
	  
	public Agreementitemtype findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Agreementitemtype entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(AgreementitemtypeEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(AgreementitemtypeOperation entityOperation){
		Agreementitemtype entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(AgreementitemtypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Agreementitemtype entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(AgreementitemtypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(AgreementitemtypeOperation entityOperation) {
		Agreementitemtype entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(AgreementitemtypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(AgreementitemtypeOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(AgreementitemtypeEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Agreementitemtype, AgreementitemtypeOperation> getEntityService() {
		return entityService;
	}
}
