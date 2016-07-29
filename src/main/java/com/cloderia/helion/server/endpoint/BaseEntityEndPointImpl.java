/**
 * 
 */
package com.cloderia.helion.server.endpoint;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.cloderia.helion.client.shared.endpoint.BaseEntityEndPoint;
import com.cloderia.helion.client.shared.model.BaseEntity;
import com.cloderia.helion.client.shared.ops.BaseOperation;
import com.cloderia.helion.client.shared.service.BaseEntityService;

/**
 * @author adrian
 *
 */
public abstract class BaseEntityEndPointImpl<T extends BaseEntity, O extends BaseOperation<T>> {
	
	@Inject
	private BaseEntityService<T, O> entityService;

	public List<T> findAllImpl() {
		return getEntityService().findAll();
	}
	
	/**
	 * @param id
	 * @return
	 */
	public T findByIdImpl(Long id) {
		return getEntityService().findById(id);
	}

	public abstract BaseEntityService<T, O> getEntityService() ;

	/**
	 * @param entity
	 * @return
	 */
	public T createEntityImpl(final T entity) {
		return getEntityService().createEntity(entity);
	}
	
	/**
	 * @param entity
	 * @return
	 */
	public T createOperationImpl(final O entity) {
		return getEntityService().createOperation(entity);
	}

	/**
	 * @param entity
	 * @return
	 */
	public T updateEntityImpl(final T entity) {
		return getEntityService().updateEntity(entity);
	}
	
	/**
	 * @param entity
	 * @return
	 */
	public T updateOperationImpl(final O entity) {
		return getEntityService().updateOperation(entity);
	}

	/**
	 * @param id
	 * @return
	 */
	public Long deleteEntityImpl(Long id) {
		return getEntityService().deleteEntity(id);
	}

	/**
	 * @param entity
	 * @return
	 */
	public Long deleteOperationImpl(final O entity) {
		return getEntityService().deleteOperation(entity);
	}
}
