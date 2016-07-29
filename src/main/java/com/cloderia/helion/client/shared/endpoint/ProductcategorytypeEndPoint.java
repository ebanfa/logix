/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Productcategorytype;
import com.cloderia.helion.client.shared.ops.ProductcategorytypeOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/productcategorytype")
public interface ProductcategorytypeEndPoint extends BaseEntityEndPoint<Productcategorytype, ProductcategorytypeOperation> {


}
