/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Contactmechanism;
import com.cloderia.helion.client.shared.ops.ContactmechanismOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/contactmechanism")
public interface ContactmechanismEndPoint extends BaseEntityEndPoint<Contactmechanism, ContactmechanismOperation> {


}
