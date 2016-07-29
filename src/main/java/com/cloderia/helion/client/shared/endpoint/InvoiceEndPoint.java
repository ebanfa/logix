/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Invoice;
import com.cloderia.helion.client.shared.ops.InvoiceOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/invoice")
public interface InvoiceEndPoint extends BaseEntityEndPoint<Invoice, InvoiceOperation> {


}
