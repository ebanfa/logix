/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Party;
import com.cloderia.helion.client.shared.ops.PartyOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/party")
public interface PartyEndPoint extends BaseEntityEndPoint<Party, PartyOperation> {


}
