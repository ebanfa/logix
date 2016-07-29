/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Invoiceitemtype;
import com.cloderia.helion.client.shared.ops.InvoiceitemtypeOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/invoiceitemtype")
public interface InvoiceitemtypeEndPoint extends BaseEntityEndPoint<Invoiceitemtype, InvoiceitemtypeOperation> {


}
