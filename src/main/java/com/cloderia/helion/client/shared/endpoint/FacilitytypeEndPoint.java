/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Facilitytype;
import com.cloderia.helion.client.shared.ops.FacilitytypeOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/facilitytype")
public interface FacilitytypeEndPoint extends BaseEntityEndPoint<Facilitytype, FacilitytypeOperation> {


}
