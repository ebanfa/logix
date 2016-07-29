/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Partytype;
import com.cloderia.helion.client.shared.ops.PartytypeOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/partytype")
public interface PartytypeEndPoint extends BaseEntityEndPoint<Partytype, PartytypeOperation> {


}
