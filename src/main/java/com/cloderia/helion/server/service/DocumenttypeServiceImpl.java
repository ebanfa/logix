
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

import com.cloderia.helion.client.shared.model.Documenttype;
import com.cloderia.helion.client.shared.ops.DocumenttypeOperation;
import com.cloderia.helion.client.shared.service.DocumenttypeService;
import com.cloderia.helion.client.shared.service.DocumenttypeService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class DocumenttypeServiceImpl extends BaseEntityServiceImpl<Documenttype, DocumenttypeOperation> implements
		DocumenttypeService {

	@Inject
	DocumenttypeService documenttypeService;

	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public DocumenttypeServiceImpl() {
		super(Documenttype.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Documenttype.ALL_DOCUMENTTYPE_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Documenttype.FIND_DOCUMENTTYPE_BY_CODE_QUERY;
	}

	@Override
	public Documenttype createOperation(DocumenttypeOperation documenttypeOperation) {
		Documenttype documenttype = documenttypeOperation.getDocumenttype();
		documenttype.setParentTy(documenttypeService.findById(documenttypeOperation.getParentTyId()));
		documenttype.setRecSt("");
		documenttype.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		documenttype.setRowTs(new Date());
		documenttype.setCreatedDt(new Date());
		documenttype.setVersionNo(VERSIONING_ONE);
		documenttype.setLastModifiedDt(new Date());
		documenttype.setCreatedByUsr(DEFAULT_USER);
		documenttype.setRecSt(ENTITY_STATUS_ACTIVE);
		documenttype.setLastModifiedUsr(DEFAULT_USER);
		documenttype = super.createOperation(documenttypeOperation);
		return documenttype;
	}
	
	@Override
	public Documenttype updateOperation(DocumenttypeOperation documenttypeOperation) {
		Documenttype documenttype = documenttypeOperation.getDocumenttype();
		documenttype.setUniverse(universeService.findById(documenttypeOperation.getUniverseId()));
		documenttype.setParentTy(documenttypeService.findById(documenttypeOperation.getParentTyId()));
		documenttype.setLastModifiedDt(new Date());
		documenttype.setRecSt(ENTITY_STATUS_ACTIVE);
		documenttype.setLastModifiedUsr(DEFAULT_USER);
		documenttype = super.updateOperation(documenttypeOperation);
		return documenttype;
	}
}