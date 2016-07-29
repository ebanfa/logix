/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Invoiceterm;
import com.cloderia.helion.client.shared.ops.InvoicetermOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/invoiceterm")
public interface InvoicetermEndPoint extends BaseEntityEndPoint<Invoiceterm, InvoicetermOperation> {


}
