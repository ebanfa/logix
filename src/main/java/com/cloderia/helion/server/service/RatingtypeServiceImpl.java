
/**
 * 
 */
package com.cloderia.helion.server.service;

import static com.cloderia.helion.client.shared.Operation.OperationType.CREATE;
import static com.cloderia.helion.client.shared.Operation.OperationType.UPDATE;

import java.util.Date;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.enterprise.event.Event;
import javax.inject.Inject;

import com.cloderia.helion.client.shared.model.Ratingtype;
import com.cloderia.helion.client.shared.ops.RatingtypeOperation;
import com.cloderia.helion.client.shared.service.RatingtypeService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class RatingtypeServiceImpl extends BaseEntityServiceImpl<Ratingtype, RatingtypeOperation> implements
		RatingtypeService {


	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public RatingtypeServiceImpl() {
		super(Ratingtype.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Ratingtype.ALL_RATINGTYPE_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Ratingtype.FIND_RATINGTYPE_BY_CODE_QUERY;
	}

	@Override
	public Ratingtype createOperation(RatingtypeOperation ratingtypeOperation) {
		Ratingtype ratingtype = ratingtypeOperation.getRatingtype();
		ratingtype.setRecSt("");
		ratingtype.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		ratingtype.setRowTs(new Date());
		ratingtype.setCreatedDt(new Date());
		ratingtype.setVersionNo(VERSIONING_ONE);
		ratingtype.setLastModifiedDt(new Date());
		ratingtype.setCreatedByUsr(DEFAULT_USER);
		ratingtype.setRecSt(ENTITY_STATUS_ACTIVE);
		ratingtype.setLastModifiedUsr(DEFAULT_USER);
		ratingtype = super.createOperation(ratingtypeOperation);
		return ratingtype;
	}
	
	@Override
	public Ratingtype updateOperation(RatingtypeOperation ratingtypeOperation) {
		Ratingtype ratingtype = ratingtypeOperation.getRatingtype();
		ratingtype.setLastModifiedDt(new Date());
		ratingtype.setRecSt(ENTITY_STATUS_ACTIVE);
		ratingtype.setLastModifiedUsr(DEFAULT_USER);
		ratingtype = super.updateOperation(ratingtypeOperation);
		return ratingtype;
	}
}