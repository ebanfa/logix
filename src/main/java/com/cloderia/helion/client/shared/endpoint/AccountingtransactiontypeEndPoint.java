/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Accountingtransactiontype;
import com.cloderia.helion.client.shared.ops.AccountingtransactiontypeOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/accountingtransactiontype")
public interface AccountingtransactiontypeEndPoint extends BaseEntityEndPoint<Accountingtransactiontype, AccountingtransactiontypeOperation> {


}
