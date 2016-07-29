/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Contactmechanismtype;
import com.cloderia.helion.client.shared.ops.ContactmechanismtypeOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/contactmechanismtype")
public interface ContactmechanismtypeEndPoint extends BaseEntityEndPoint<Contactmechanismtype, ContactmechanismtypeOperation> {


}
