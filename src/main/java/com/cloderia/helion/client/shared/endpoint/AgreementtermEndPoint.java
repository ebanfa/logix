/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Agreementterm;
import com.cloderia.helion.client.shared.ops.AgreementtermOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/agreementterm")
public interface AgreementtermEndPoint extends BaseEntityEndPoint<Agreementterm, AgreementtermOperation> {


}
