/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.ops.UniverseOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/universe")
public interface UniverseEndPoint extends BaseEntityEndPoint<Universe, UniverseOperation> {


}
