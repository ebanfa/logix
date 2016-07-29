
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

import com.cloderia.helion.client.shared.model.Generalledgeraccounttype;
import com.cloderia.helion.client.shared.ops.GeneralledgeraccounttypeOperation;
import com.cloderia.helion.client.shared.service.GeneralledgeraccounttypeService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class GeneralledgeraccounttypeServiceImpl extends BaseEntityServiceImpl<Generalledgeraccounttype, GeneralledgeraccounttypeOperation> implements
		GeneralledgeraccounttypeService {


	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public GeneralledgeraccounttypeServiceImpl() {
		super(Generalledgeraccounttype.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Generalledgeraccounttype.ALL_GENERALLEDGERACCOUNTTYPE_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Generalledgeraccounttype.FIND_GENERALLEDGERACCOUNTTYPE_BY_CODE_QUERY;
	}

	@Override
	public Generalledgeraccounttype createOperation(GeneralledgeraccounttypeOperation generalledgeraccounttypeOperation) {
		Generalledgeraccounttype generalledgeraccounttype = generalledgeraccounttypeOperation.getGeneralledgeraccounttype();
		generalledgeraccounttype.setRecSt("");
		generalledgeraccounttype.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		generalledgeraccounttype.setRowTs(new Date());
		generalledgeraccounttype.setCreatedDt(new Date());
		generalledgeraccounttype.setVersionNo(VERSIONING_ONE);
		generalledgeraccounttype.setLastModifiedDt(new Date());
		generalledgeraccounttype.setCreatedByUsr(DEFAULT_USER);
		generalledgeraccounttype.setRecSt(ENTITY_STATUS_ACTIVE);
		generalledgeraccounttype.setLastModifiedUsr(DEFAULT_USER);
		generalledgeraccounttype = super.createOperation(generalledgeraccounttypeOperation);
		return generalledgeraccounttype;
	}
	
	@Override
	public Generalledgeraccounttype updateOperation(GeneralledgeraccounttypeOperation generalledgeraccounttypeOperation) {
		Generalledgeraccounttype generalledgeraccounttype = generalledgeraccounttypeOperation.getGeneralledgeraccounttype();
		generalledgeraccounttype.setLastModifiedDt(new Date());
		generalledgeraccounttype.setRecSt(ENTITY_STATUS_ACTIVE);
		generalledgeraccounttype.setLastModifiedUsr(DEFAULT_USER);
		generalledgeraccounttype = super.updateOperation(generalledgeraccounttypeOperation);
		return generalledgeraccounttype;
	}
}