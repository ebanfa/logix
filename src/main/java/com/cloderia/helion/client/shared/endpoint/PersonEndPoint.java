/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Person;
import com.cloderia.helion.client.shared.ops.PersonOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/person")
public interface PersonEndPoint extends BaseEntityEndPoint<Person, PersonOperation> {


}
