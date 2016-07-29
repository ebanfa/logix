/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Payment;
import com.cloderia.helion.client.shared.ops.PaymentOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/payment")
public interface PaymentEndPoint extends BaseEntityEndPoint<Payment, PaymentOperation> {


}
