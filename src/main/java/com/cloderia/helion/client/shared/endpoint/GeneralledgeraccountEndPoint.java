/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Generalledgeraccount;
import com.cloderia.helion.client.shared.ops.GeneralledgeraccountOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/generalledgeraccount")
public interface GeneralledgeraccountEndPoint extends BaseEntityEndPoint<Generalledgeraccount, GeneralledgeraccountOperation> {


}
