/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Partyrelationshipstatus;
import com.cloderia.helion.client.shared.ops.PartyrelationshipstatusOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/partyrelationshipstatus")
public interface PartyrelationshipstatusEndPoint extends BaseEntityEndPoint<Partyrelationshipstatus, PartyrelationshipstatusOperation> {


}
