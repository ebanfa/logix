/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Termtype;
import com.cloderia.helion.client.shared.ops.TermtypeOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/termtype")
public interface TermtypeEndPoint extends BaseEntityEndPoint<Termtype, TermtypeOperation> {


}
