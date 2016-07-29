/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Productcategory;
import com.cloderia.helion.client.shared.ops.ProductcategoryOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/productcategory")
public interface ProductcategoryEndPoint extends BaseEntityEndPoint<Productcategory, ProductcategoryOperation> {


}
