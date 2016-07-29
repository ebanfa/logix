
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

import com.cloderia.helion.client.shared.model.Termtype;
import com.cloderia.helion.client.shared.ops.TermtypeOperation;
import com.cloderia.helion.client.shared.service.TermtypeService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class TermtypeServiceImpl extends BaseEntityServiceImpl<Termtype, TermtypeOperation> implements
		TermtypeService {


	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public TermtypeServiceImpl() {
		super(Termtype.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Termtype.ALL_TERMTYPE_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Termtype.FIND_TERMTYPE_BY_CODE_QUERY;
	}

	@Override
	public Termtype createOperation(TermtypeOperation termtypeOperation) {
		Termtype termtype = termtypeOperation.getTermtype();
		termtype.setRecSt("");
		termtype.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		termtype.setRowTs(new Date());
		termtype.setCreatedDt(new Date());
		termtype.setVersionNo(VERSIONING_ONE);
		termtype.setLastModifiedDt(new Date());
		termtype.setCreatedByUsr(DEFAULT_USER);
		termtype.setRecSt(ENTITY_STATUS_ACTIVE);
		termtype.setLastModifiedUsr(DEFAULT_USER);
		termtype = super.createOperation(termtypeOperation);
		return termtype;
	}
	
	@Override
	public Termtype updateOperation(TermtypeOperation termtypeOperation) {
		Termtype termtype = termtypeOperation.getTermtype();
		termtype.setLastModifiedDt(new Date());
		termtype.setRecSt(ENTITY_STATUS_ACTIVE);
		termtype.setLastModifiedUsr(DEFAULT_USER);
		termtype = super.updateOperation(termtypeOperation);
		return termtype;
	}
}