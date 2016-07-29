/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Containertype;
import com.cloderia.helion.client.shared.ops.ContainertypeOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/containertype")
public interface ContainertypeEndPoint extends BaseEntityEndPoint<Containertype, ContainertypeOperation> {


}
