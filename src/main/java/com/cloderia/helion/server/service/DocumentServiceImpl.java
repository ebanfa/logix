
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

import com.cloderia.helion.client.shared.model.Document;
import com.cloderia.helion.client.shared.ops.DocumentOperation;
import com.cloderia.helion.client.shared.service.DocumenttypeService;
import com.cloderia.helion.client.shared.service.DocumentService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class DocumentServiceImpl extends BaseEntityServiceImpl<Document, DocumentOperation> implements
		DocumentService {

	@Inject
	DocumenttypeService documenttypeService;

	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public DocumentServiceImpl() {
		super(Document.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Document.ALL_DOCUMENT_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Document.FIND_DOCUMENT_BY_CODE_QUERY;
	}

	@Override
	public Document createOperation(DocumentOperation documentOperation) {
		Document document = documentOperation.getDocument();
		document.setDocTy(documenttypeService.findById(documentOperation.getDocTyId()));
		document.setRecSt("");
		document.setUniverse(universeService.findByCode(DEFAULT_UNIVERSE));
		document.setRowTs(new Date());
		document.setCreatedDt(new Date());
		document.setVersionNo(VERSIONING_ONE);
		document.setLastModifiedDt(new Date());
		document.setCreatedByUsr(DEFAULT_USER);
		document.setRecSt(ENTITY_STATUS_ACTIVE);
		document.setLastModifiedUsr(DEFAULT_USER);
		document = super.createOperation(documentOperation);
		return document;
	}
	
	@Override
	public Document updateOperation(DocumentOperation documentOperation) {
		Document document = documentOperation.getDocument();
		document.setUniverse(universeService.findById(documentOperation.getUniverseId()));
		document.setDocTy(documenttypeService.findById(documentOperation.getDocTyId()));
		document.setLastModifiedDt(new Date());
		document.setRecSt(ENTITY_STATUS_ACTIVE);
		document.setLastModifiedUsr(DEFAULT_USER);
		document = super.updateOperation(documentOperation);
		return document;
	}
}