/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Partyrole;
import com.cloderia.helion.client.shared.ops.PartyroleOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/partyrole")
public interface PartyroleEndPoint extends BaseEntityEndPoint<Partyrole, PartyroleOperation> {


}
