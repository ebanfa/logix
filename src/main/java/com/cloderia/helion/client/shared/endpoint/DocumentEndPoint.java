/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Document;
import com.cloderia.helion.client.shared.ops.DocumentOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/document")
public interface DocumentEndPoint extends BaseEntityEndPoint<Document, DocumentOperation> {


}
