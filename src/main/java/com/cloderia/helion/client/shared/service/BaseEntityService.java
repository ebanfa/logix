/**
 * 
 */
package com.cloderia.helion.client.shared.service;

import java.util.List;

import com.cloderia.helion.client.shared.model.BaseEntity;
import com.cloderia.helion.client.shared.ops.BaseOperation;

/**
 * @author adrian
 *
 */
public interface BaseEntityService<T extends BaseEntity, O extends BaseOperation> {

	/**
	 * @return A list of all entities in this service.
	 */
	public List<T> findAll();
	
	
	/**
	 * @return
	 */
	public T findById(Long id);

	/**
	 * @return
	 */
	public T findByCode(String code);

	/**
	 * @param entity
	 * @return
	 */
	public T createEntity(T entity);
	
	/**
	 * @param entity
	 * @return
	 */
	public T createOperation(O entityOperation);

	/**
	 * @param entity
	 * @return
	 */
	public T updateEntity(T entity);

	/**
	 * @param entity
	 * @return
	 */
	public T updateOperation(O entityOperation);

	/**
	 * @param id
	 * @return
	 */
	public Long deleteEntity(Long id);
	
	/**
	 * @param entity
	 * @return
	 */
	public Long deleteOperation(O entityOperation);

}
