/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Facility;
import com.cloderia.helion.client.shared.ops.FacilityOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/facility")
public interface FacilityEndPoint extends BaseEntityEndPoint<Facility, FacilityOperation> {


}
