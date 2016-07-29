/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Fixedasset;
import com.cloderia.helion.client.shared.ops.FixedassetOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/fixedasset")
public interface FixedassetEndPoint extends BaseEntityEndPoint<Fixedasset, FixedassetOperation> {


}
