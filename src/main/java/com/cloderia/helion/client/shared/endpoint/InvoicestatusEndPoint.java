/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Invoicestatus;
import com.cloderia.helion.client.shared.ops.InvoicestatusOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/invoicestatus")
public interface InvoicestatusEndPoint extends BaseEntityEndPoint<Invoicestatus, InvoicestatusOperation> {


}
