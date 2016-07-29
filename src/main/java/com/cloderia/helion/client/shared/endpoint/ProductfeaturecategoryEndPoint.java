/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Productfeaturecategory;
import com.cloderia.helion.client.shared.ops.ProductfeaturecategoryOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/productfeaturecategory")
public interface ProductfeaturecategoryEndPoint extends BaseEntityEndPoint<Productfeaturecategory, ProductfeaturecategoryOperation> {


}
