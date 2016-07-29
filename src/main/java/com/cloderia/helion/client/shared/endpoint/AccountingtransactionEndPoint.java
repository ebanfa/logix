/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Accountingtransaction;
import com.cloderia.helion.client.shared.ops.AccountingtransactionOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/accountingtransaction")
public interface AccountingtransactionEndPoint extends BaseEntityEndPoint<Accountingtransaction, AccountingtransactionOperation> {


}
