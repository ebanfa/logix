/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Partyrelationship;
import com.cloderia.helion.client.shared.ops.PartyrelationshipOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/partyrelationship")
public interface PartyrelationshipEndPoint extends BaseEntityEndPoint<Partyrelationship, PartyrelationshipOperation> {


}
