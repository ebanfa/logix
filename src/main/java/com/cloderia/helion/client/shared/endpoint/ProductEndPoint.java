/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Product;
import com.cloderia.helion.client.shared.ops.ProductOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/product")
public interface ProductEndPoint extends BaseEntityEndPoint<Product, ProductOperation> {


}
