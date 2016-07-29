/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Agreementitem;
import com.cloderia.helion.client.shared.ops.AgreementitemOperation;
import com.cloderia.helion.client.shared.endpoint.AgreementitemEndPoint;
import com.cloderia.helion.client.shared.service.AgreementitemService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class AgreementitemEndPointImpl extends
		BaseEntityEndPointImpl<Agreementitem, AgreementitemOperation> implements AgreementitemEndPoint {

	@Inject
	AgreementitemService entityService;
	
	public List<Agreementitem> findAll(){
		return findAllImpl();
	}
	  
	public Agreementitem findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Agreementitem entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(AgreementitemEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(AgreementitemOperation entityOperation){
		Agreementitem entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(AgreementitemEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Agreementitem entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(AgreementitemEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(AgreementitemOperation entityOperation) {
		Agreementitem entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(AgreementitemEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(AgreementitemOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(AgreementitemEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Agreementitem, AgreementitemOperation> getEntityService() {
		return entityService;
	}
}
