/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Agreementrole;
import com.cloderia.helion.client.shared.ops.AgreementroleOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/agreementrole")
public interface AgreementroleEndPoint extends BaseEntityEndPoint<Agreementrole, AgreementroleOperation> {


}
