/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Partyrelationshiptype;
import com.cloderia.helion.client.shared.ops.PartyrelationshiptypeOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/partyrelationshiptype")
public interface PartyrelationshiptypeEndPoint extends BaseEntityEndPoint<Partyrelationshiptype, PartyrelationshiptypeOperation> {


}
