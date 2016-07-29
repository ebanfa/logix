/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.model.Supplierproduct;
import com.cloderia.helion.client.shared.ops.SupplierproductOperation;
import com.cloderia.helion.client.shared.endpoint.SupplierproductEndPoint;
import com.cloderia.helion.client.shared.service.SupplierproductService;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
public class SupplierproductEndPointImpl extends
		BaseEntityEndPointImpl<Supplierproduct, SupplierproductOperation> implements SupplierproductEndPoint {

	@Inject
	SupplierproductService entityService;
	
	public List<Supplierproduct> findAll(){
		return findAllImpl();
	}
	  
	public Supplierproduct findById(Long id){
		return findByIdImpl(id);
	}

	public Response createEntity(Supplierproduct entity) {
		entity = createEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(SupplierproductEndPoint.class)
				.path(String.valueOf(entity.getId())).build()).build();
	}
	  
	public Response createOperation(SupplierproductOperation entityOperation){
		Supplierproduct entity = createOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(SupplierproductEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}

	public Response updateEntity(Supplierproduct entity) {
		entity = updateEntityImpl(entity);
		return Response.created(UriBuilder.fromResource(SupplierproductEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	
	public Response updateOperation(SupplierproductOperation entityOperation) {
		Supplierproduct entity = updateOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(SupplierproductEndPoint.class)
			.path(String.valueOf(entity.getId())).build()).build();
	}
	 
	public Response deleteEntity(Long id){
		deleteEntityImpl(id);
		return Response.noContent().build();
	}
	
	public Response deleteOperation(SupplierproductOperation entityOperation){
		Long id = deleteOperationImpl(entityOperation);
		return Response.created(UriBuilder.fromResource(SupplierproductEndPoint.class)
			.path(String.valueOf(id)).build()).build();
	}
	
	@Override
	public BaseEntityService<Supplierproduct, SupplierproductOperation> getEntityService() {
		return entityService;
	}
}
