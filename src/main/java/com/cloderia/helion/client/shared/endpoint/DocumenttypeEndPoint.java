/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Documenttype;
import com.cloderia.helion.client.shared.ops.DocumenttypeOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/documenttype")
public interface DocumenttypeEndPoint extends BaseEntityEndPoint<Documenttype, DocumenttypeOperation> {


}
