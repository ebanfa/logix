/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Paymenttype;
import com.cloderia.helion.client.shared.ops.PaymenttypeOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/paymenttype")
public interface PaymenttypeEndPoint extends BaseEntityEndPoint<Paymenttype, PaymenttypeOperation> {


}
