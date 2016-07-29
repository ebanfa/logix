/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Partycategory;
import com.cloderia.helion.client.shared.ops.PartycategoryOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/partycategory")
public interface PartycategoryEndPoint extends BaseEntityEndPoint<Partycategory, PartycategoryOperation> {


}
