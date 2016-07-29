/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Accountingtransactiondetail;
import com.cloderia.helion.client.shared.ops.AccountingtransactiondetailOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/accountingtransactiondetail")
public interface AccountingtransactiondetailEndPoint extends BaseEntityEndPoint<Accountingtransactiondetail, AccountingtransactiondetailOperation> {


}
