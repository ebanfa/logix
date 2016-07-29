/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Document;

/**
 * @author adrian
 *
 */
@Portable
public class DocumentOperation  extends BaseOperation<Document> {

	private Document document;
	private Long universeId;
	private Long docTyId;

	/**
	 * 
	 */
	public DocumentOperation() {
	}
	
	/**
	 * @param document
	 */
	public DocumentOperation(Document document) {
		super();
		this.document = document;
		this.setEntity(document);
		if(document.getUniverse() != null)this.setUniverseId(document.getUniverse().getId());
		if(document.getDocTy() != null)this.setDocTyId(document.getDocTy().getId());
	}
	
	/**
	 * @return the UniverseId
	 */
	public Long getUniverseId() {
		return universeId;
	}

	/**
	 * @param universeId
	 *            the universeId to set
	 */
	public void setUniverseId(Long universeId) {
		this.universeId = universeId;
	}
	            
	/**
	 * @return the DocTyId
	 */
	public Long getDocTyId() {
		return docTyId;
	}

	/**
	 * @param docTyId
	 *            the docTyId to set
	 */
	public void setDocTyId(Long docTyId) {
		this.docTyId = docTyId;
	}
	            

	/**
	 * @return the document
	 */
	public Document getDocument() {
		return document;
	}

	/**
	 * @param document
	 *            the document to set
	 */
	public void setDocument(Document document) {
		this.document = document;
	}

}
