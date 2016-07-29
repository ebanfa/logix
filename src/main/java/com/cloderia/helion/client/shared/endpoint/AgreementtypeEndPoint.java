/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Agreementtype;
import com.cloderia.helion.client.shared.ops.AgreementtypeOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/agreementtype")
public interface AgreementtypeEndPoint extends BaseEntityEndPoint<Agreementtype, AgreementtypeOperation> {


}
