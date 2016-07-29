/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Generalledgeraccounttype;
import com.cloderia.helion.client.shared.ops.GeneralledgeraccounttypeOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/generalledgeraccounttype")
public interface GeneralledgeraccounttypeEndPoint extends BaseEntityEndPoint<Generalledgeraccounttype, GeneralledgeraccounttypeOperation> {


}
