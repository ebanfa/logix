/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Invoiceroletype;
import com.cloderia.helion.client.shared.ops.InvoiceroletypeOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/invoiceroletype")
public interface InvoiceroletypeEndPoint extends BaseEntityEndPoint<Invoiceroletype, InvoiceroletypeOperation> {


}
