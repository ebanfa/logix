/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Geoboundry;
import com.cloderia.helion.client.shared.ops.GeoboundryOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/geoboundry")
public interface GeoboundryEndPoint extends BaseEntityEndPoint<Geoboundry, GeoboundryOperation> {


}
