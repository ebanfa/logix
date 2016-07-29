/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Productfeaturetype;
import com.cloderia.helion.client.shared.ops.ProductfeaturetypeOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/productfeaturetype")
public interface ProductfeaturetypeEndPoint extends BaseEntityEndPoint<Productfeaturetype, ProductfeaturetypeOperation> {


}
