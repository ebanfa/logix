/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

/**
 * @author adrian
 *
 */
public class BaseOperation<T> {
	
	private  T entity;

	/**
	 * @return the entity
	 */
	public T getEntity() {
		return entity;
	}

	/**
	 * @param entity the entity to set
	 */
	public void setEntity(T entity) {
		this.entity = entity;
	}

}
