/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Lot;
import com.cloderia.helion.client.shared.ops.LotOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/lot")
public interface LotEndPoint extends BaseEntityEndPoint<Lot, LotOperation> {


}
