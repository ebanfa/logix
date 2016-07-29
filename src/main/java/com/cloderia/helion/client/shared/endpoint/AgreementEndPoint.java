/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Agreement;
import com.cloderia.helion.client.shared.ops.AgreementOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/agreement")
public interface AgreementEndPoint extends BaseEntityEndPoint<Agreement, AgreementOperation> {


}
