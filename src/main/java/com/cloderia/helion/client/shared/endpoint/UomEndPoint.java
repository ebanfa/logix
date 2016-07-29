/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Uom;
import com.cloderia.helion.client.shared.ops.UomOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/uom")
public interface UomEndPoint extends BaseEntityEndPoint<Uom, UomOperation> {


}
