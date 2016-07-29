/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Agreementitemtype;
import com.cloderia.helion.client.shared.ops.AgreementitemtypeOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/agreementitemtype")
public interface AgreementitemtypeEndPoint extends BaseEntityEndPoint<Agreementitemtype, AgreementitemtypeOperation> {


}
