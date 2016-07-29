/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Standardtimeperiod;
import com.cloderia.helion.client.shared.ops.StandardtimeperiodOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/standardtimeperiod")
public interface StandardtimeperiodEndPoint extends BaseEntityEndPoint<Standardtimeperiod, StandardtimeperiodOperation> {


}
