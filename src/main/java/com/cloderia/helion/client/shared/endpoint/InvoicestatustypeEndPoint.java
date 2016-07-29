/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Invoicestatustype;
import com.cloderia.helion.client.shared.ops.InvoicestatustypeOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/invoicestatustype")
public interface InvoicestatustypeEndPoint extends BaseEntityEndPoint<Invoicestatustype, InvoicestatustypeOperation> {


}
