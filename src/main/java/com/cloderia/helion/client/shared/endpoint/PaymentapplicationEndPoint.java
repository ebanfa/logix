/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Paymentapplication;
import com.cloderia.helion.client.shared.ops.PaymentapplicationOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/paymentapplication")
public interface PaymentapplicationEndPoint extends BaseEntityEndPoint<Paymentapplication, PaymentapplicationOperation> {


}
