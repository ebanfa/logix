/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Agreementroletype;
import com.cloderia.helion.client.shared.ops.AgreementroletypeOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/agreementroletype")
public interface AgreementroletypeEndPoint extends BaseEntityEndPoint<Agreementroletype, AgreementroletypeOperation> {


}
