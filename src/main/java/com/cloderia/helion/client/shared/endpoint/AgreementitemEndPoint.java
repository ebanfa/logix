/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Agreementitem;
import com.cloderia.helion.client.shared.ops.AgreementitemOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/agreementitem")
public interface AgreementitemEndPoint extends BaseEntityEndPoint<Agreementitem, AgreementitemOperation> {


}
