/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Fixedassettype;
import com.cloderia.helion.client.shared.ops.FixedassettypeOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/fixedassettype")
public interface FixedassettypeEndPoint extends BaseEntityEndPoint<Fixedassettype, FixedassettypeOperation> {


}
