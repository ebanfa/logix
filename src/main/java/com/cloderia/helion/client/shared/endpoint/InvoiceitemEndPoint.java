/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Invoiceitem;
import com.cloderia.helion.client.shared.ops.InvoiceitemOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/invoiceitem")
public interface InvoiceitemEndPoint extends BaseEntityEndPoint<Invoiceitem, InvoiceitemOperation> {


}
