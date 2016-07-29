/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Ratingtype;
import com.cloderia.helion.client.shared.ops.RatingtypeOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/ratingtype")
public interface RatingtypeEndPoint extends BaseEntityEndPoint<Ratingtype, RatingtypeOperation> {


}
