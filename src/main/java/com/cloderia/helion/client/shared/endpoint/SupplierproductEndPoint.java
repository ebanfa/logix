/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Supplierproduct;
import com.cloderia.helion.client.shared.ops.SupplierproductOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/supplierproduct")
public interface SupplierproductEndPoint extends BaseEntityEndPoint<Supplierproduct, SupplierproductOperation> {


}
