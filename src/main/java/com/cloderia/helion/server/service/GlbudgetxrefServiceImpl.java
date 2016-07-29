
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

import com.cloderia.helion.client.shared.model.Glbudgetxref;
import com.cloderia.helion.client.shared.ops.GlbudgetxrefOperation;
import com.cloderia.helion.client.shared.service.BudgetitemtypeService;
import com.cloderia.helion.client.shared.service.GeneralledgeraccountService;
import com.cloderia.helion.client.shared.service.GlbudgetxrefService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class GlbudgetxrefServiceImpl extends BaseEntityServiceImpl<Glbudgetxref, GlbudgetxrefOperation> implements
		GlbudgetxrefService {

	@Inject
	BudgetitemtypeService budgetitemtypeService;
	@Inject
	GeneralledgeraccountService generalledgeraccountService;

	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public GlbudgetxrefServiceImpl() {
		super(Glbudgetxref.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Glbudgetxref.ALL_GLBUDGETXREF_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Glbudgetxref.FIND_GLBUDGETXREF_BY_CODE_QUERY;
	}

	@Override
	public Glbudgetxref createOperation(GlbudgetxrefOperation glbudgetxrefOperation) {
		Glbudgetxref glbudgetxref = glbudgetxrefOperation.getGlbudgetxref();
		glbudgetxref.setBudgetItemTy(budgetitemtypeService.findById(glbudgetxrefOperation.getBudgetItemTyId()));
		glbudgetxref.setGlAccount(generalledgeraccountService.findById(glbudgetxrefOperation.getGlAccountId()));
		glbudgetxref.setRecSt("");
		glbudgetxref.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		glbudgetxref.setRowTs(new Date());
		glbudgetxref.setCreatedDt(new Date());
		glbudgetxref.setVersionNo(VERSIONING_ONE);
		glbudgetxref.setLastModifiedDt(new Date());
		glbudgetxref.setCreatedByUsr(DEFAULT_USER);
		glbudgetxref.setRecSt(ENTITY_STATUS_ACTIVE);
		glbudgetxref.setLastModifiedUsr(DEFAULT_USER);
		glbudgetxref = super.createOperation(glbudgetxrefOperation);
		return glbudgetxref;
	}
	
	@Override
	public Glbudgetxref updateOperation(GlbudgetxrefOperation glbudgetxrefOperation) {
		Glbudgetxref glbudgetxref = glbudgetxrefOperation.getGlbudgetxref();
		glbudgetxref.setBudgetItemTy(budgetitemtypeService.findById(glbudgetxrefOperation.getBudgetItemTyId()));
		glbudgetxref.setGlAccount(generalledgeraccountService.findById(glbudgetxrefOperation.getGlAccountId()));
		glbudgetxref.setLastModifiedDt(new Date());
		glbudgetxref.setRecSt(ENTITY_STATUS_ACTIVE);
		glbudgetxref.setLastModifiedUsr(DEFAULT_USER);
		glbudgetxref = super.updateOperation(glbudgetxrefOperation);
		return glbudgetxref;
	}
}