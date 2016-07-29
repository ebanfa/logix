/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Partyroletype;
import com.cloderia.helion.client.shared.ops.PartyroletypeOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/partyroletype")
public interface PartyroletypeEndPoint extends BaseEntityEndPoint<Partyroletype, PartyroletypeOperation> {


}
