/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Depreciationmethod;
import com.cloderia.helion.client.shared.ops.DepreciationmethodOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/depreciationmethod")
public interface DepreciationmethodEndPoint extends BaseEntityEndPoint<Depreciationmethod, DepreciationmethodOperation> {


}
