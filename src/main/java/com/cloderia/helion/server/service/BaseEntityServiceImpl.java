/**
 * 
 */
package com.cloderia.helion.server.service;

import static com.cloderia.helion.client.shared.Operation.OperationType.CREATE;
import static com.cloderia.helion.client.shared.Operation.OperationType.UPDATE;
import static com.cloderia.helion.client.shared.Operation.OperationType.DELETE;

import java.util.Date;
import java.util.List;

import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.cloderia.helion.client.shared.model.BaseEntity;
import com.cloderia.helion.client.shared.model.Party;
import com.cloderia.helion.client.shared.ops.BaseOperation;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author adrian
 *
 */
public abstract class BaseEntityServiceImpl<T extends BaseEntity, O extends BaseOperation<T>> {

	public static final int VERSIONING_ONE = 1;
	public static final String DEFAULT_USER = "SYSTEM";
	public static final String ENTITY_STATUS_ACTIVE = "A";
	public static final String DEFAULT_UNIVERSE = "SYSTEM_UNIVERSE";
	
	@PersistenceContext(unitName = "helion-default")
	private EntityManager em;
	private Class<T> entityClass;

	@Inject
	UniverseService universeService;

	@Inject
	@com.cloderia.helion.client.shared.Operation(CREATE)
	private Event<O> created;
	
	@Inject
	@com.cloderia.helion.client.shared.Operation(UPDATE)
	private Event<O> edited;

	@Inject
	@com.cloderia.helion.client.shared.Operation(DELETE)
	private Event<O> deleted;
	
	/**
	 * 
	 */
	public BaseEntityServiceImpl(Class<T> entityClass) {
		this.entityClass = entityClass;
	}

	/**
	 * @return
	 */
	public T findById(Long id) {
		T entity = em.find(getEntityClass(), id);
		return entity;
	}
	
	/**
	 * @return
	 */
	public List<T> findAll() {
		return em.createNamedQuery(getAllEntitesQuery(), getEntityClass()).getResultList();
	}
	
	public T findByCode(String code) {
		List<T> entityList = em.createNamedQuery(
				getFindByCodeQuery(), getEntityClass()).setParameter("entityCode", code).getResultList();
		if(entityList.isEmpty())
			return null;
		return entityList.get(0);
	}

	/**
	 * @param entity
	 * @return
	 */
	public T createEntity(T entity) {
		em.persist(entity);
		return entity;
	}
	
	/**
	 * @param entity
	 * @return
	 */
	public T createOperation(O entityOperation) {
		T entity = createEntity(entityOperation.getEntity());
		entityOperation.setEntity(entity);
	    created.fire(entityOperation);
		return entity;
	}
	
	/**
	 * @param entity
	 * @return
	 */
	public T updateEntity(T entity) {
		em.merge(entity);
		return entity;
	}
	
	/**
	 * @param entity
	 * @return
	 */
	public T updateOperation(O entityOperation) {
		T entity = updateEntity(entityOperation.getEntity());
		entityOperation.setEntity(entity);
		edited.fire(entityOperation);
		return entity;
	}
	
	/**
	 * @param id
	 * @return
	 */
	public Long deleteEntity(Long id) {
		em.remove(em.find(getEntityClass(), id));
		return id;
	}
	
	/**
	 * @param entity
	 * @return
	 */
	public Long deleteOperation(O entityOperation) {
		T entity = updateEntity(entityOperation.getEntity());
		entityOperation.setEntity(entity);
	    deleted.fire(entityOperation);
		return deleteEntity(entity.getId());
	}

	/**
	 * @return the entityClass
	 */
	public Class<T> getEntityClass() {
		return entityClass;
	}

	/**
	 * @param entityClass the entityClass to set
	 */
	public void setEntityClass(Class<T> entityClass) {
		this.entityClass = entityClass;
	}

	public abstract String getAllEntitesQuery();
	
	public abstract String getFindByCodeQuery();
	/**
	 * @param systemuser
	 */
	protected T initDefaultProperties(T entity) {
		entity.setRecSt(ENTITY_STATUS_ACTIVE);
		entity.setRowTs(new Date());
		entity.setEffectiveDt(new Date());
		entity.setCreatedDt(new Date());
		entity.setVersionNo(VERSIONING_ONE);
		entity.setLastModifiedDt(new Date());
		entity.setCreatedByUsr(DEFAULT_USER);
		entity.setRecSt(ENTITY_STATUS_ACTIVE);
		entity.setLastModifiedUsr(DEFAULT_USER);
		entity.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		return entity;
	}

	/**
	 * @param code
	 * @param name
	 * @param description
	 * @param entity
	 */
	protected T setTextProperties(T entity, String code, String name) {
		entity.setName(name);
		entity.setEntityCode(code);
		return entity;
	}

	/**
	 * @param code
	 * @param name
	 * @param description
	 * @param entity
	 */
	protected T setTextProperties(T entity, String code, String name, String description) {
		entity.setName(name);
		entity.setEntityCode(code);
		return entity;
	}

}
