/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Glbudgetxref;
import com.cloderia.helion.client.shared.ops.GlbudgetxrefOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/glbudgetxref")
public interface GlbudgetxrefEndPoint extends BaseEntityEndPoint<Glbudgetxref, GlbudgetxrefOperation> {


}
