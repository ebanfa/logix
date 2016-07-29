/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Producttype;
import com.cloderia.helion.client.shared.ops.ProducttypeOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/producttype")
public interface ProducttypeEndPoint extends BaseEntityEndPoint<Producttype, ProducttypeOperation> {


}
