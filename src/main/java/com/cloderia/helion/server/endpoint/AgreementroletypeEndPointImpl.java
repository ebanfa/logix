/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Agreementroletype;
import com.cloderia.helion.client.shared.ops.AgreementroletypeOperation;
import com.cloderia.helion.client.shared.endpoint.AgreementroletypeEndPoint;
import com.cloderia.helion.client.shared.service.AgreementroletypeService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class AgreementroletypeEndPointImpl extends
		BaseEntityEndPointImpl<Agreementroletype, AgreementroletypeOperation> implements AgreementroletypeEndPoint {

	@Inject
	AgreementroletypeService entityService;
	
	public List<Agreementroletype> findAll(){
		return findAllImpl();
	}
	  
	public Agreementroletype findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Agreementroletype entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(AgreementroletypeEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(AgreementroletypeOperation entityOperation){
		Agreementroletype entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(AgreementroletypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Agreementroletype entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(AgreementroletypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(AgreementroletypeOperation entityOperation) {
		Agreementroletype entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(AgreementroletypeEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(AgreementroletypeOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(AgreementroletypeEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Agreementroletype, AgreementroletypeOperation> getEntityService() {
		return entityService;
	}
}
