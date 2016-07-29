
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

import com.cloderia.helion.client.shared.model.Fixedassettype;
import com.cloderia.helion.client.shared.ops.FixedassettypeOperation;
import com.cloderia.helion.client.shared.service.FixedassettypeService;
import com.cloderia.helion.client.shared.service.FixedassettypeService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class FixedassettypeServiceImpl extends BaseEntityServiceImpl<Fixedassettype, FixedassettypeOperation> implements
		FixedassettypeService {

	@Inject
	FixedassettypeService fixedassettypeService;

	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public FixedassettypeServiceImpl() {
		super(Fixedassettype.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Fixedassettype.ALL_FIXEDASSETTYPE_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Fixedassettype.FIND_FIXEDASSETTYPE_BY_CODE_QUERY;
	}

	@Override
	public Fixedassettype createOperation(FixedassettypeOperation fixedassettypeOperation) {
		Fixedassettype fixedassettype = fixedassettypeOperation.getFixedassettype();
		fixedassettype.setParentTy(fixedassettypeService.findById(fixedassettypeOperation.getParentTyId()));
		fixedassettype.setRecSt("");
		fixedassettype.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		fixedassettype.setRowTs(new Date());
		fixedassettype.setCreatedDt(new Date());
		fixedassettype.setVersionNo(VERSIONING_ONE);
		fixedassettype.setLastModifiedDt(new Date());
		fixedassettype.setCreatedByUsr(DEFAULT_USER);
		fixedassettype.setRecSt(ENTITY_STATUS_ACTIVE);
		fixedassettype.setLastModifiedUsr(DEFAULT_USER);
		fixedassettype = super.createOperation(fixedassettypeOperation);
		return fixedassettype;
	}
	
	@Override
	public Fixedassettype updateOperation(FixedassettypeOperation fixedassettypeOperation) {
		Fixedassettype fixedassettype = fixedassettypeOperation.getFixedassettype();
		fixedassettype.setParentTy(fixedassettypeService.findById(fixedassettypeOperation.getParentTyId()));
		fixedassettype.setLastModifiedDt(new Date());
		fixedassettype.setRecSt(ENTITY_STATUS_ACTIVE);
		fixedassettype.setLastModifiedUsr(DEFAULT_USER);
		fixedassettype = super.updateOperation(fixedassettypeOperation);
		return fixedassettype;
	}
}