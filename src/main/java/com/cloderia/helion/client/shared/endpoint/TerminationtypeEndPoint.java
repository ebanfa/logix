/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Terminationtype;
import com.cloderia.helion.client.shared.ops.TerminationtypeOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/terminationtype")
public interface TerminationtypeEndPoint extends BaseEntityEndPoint<Terminationtype, TerminationtypeOperation> {


}
