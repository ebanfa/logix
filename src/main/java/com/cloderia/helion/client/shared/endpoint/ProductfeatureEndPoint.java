/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Productfeature;
import com.cloderia.helion.client.shared.ops.ProductfeatureOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/productfeature")
public interface ProductfeatureEndPoint extends BaseEntityEndPoint<Productfeature, ProductfeatureOperation> {


}
