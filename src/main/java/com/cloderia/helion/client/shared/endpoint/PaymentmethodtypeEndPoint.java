/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Paymentmethodtype;
import com.cloderia.helion.client.shared.ops.PaymentmethodtypeOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/paymentmethodtype")
public interface PaymentmethodtypeEndPoint extends BaseEntityEndPoint<Paymentmethodtype, PaymentmethodtypeOperation> {


}
