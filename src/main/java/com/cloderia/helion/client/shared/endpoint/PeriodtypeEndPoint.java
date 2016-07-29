/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Periodtype;
import com.cloderia.helion.client.shared.ops.PeriodtypeOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/periodtype")
public interface PeriodtypeEndPoint extends BaseEntityEndPoint<Periodtype, PeriodtypeOperation> {


}
