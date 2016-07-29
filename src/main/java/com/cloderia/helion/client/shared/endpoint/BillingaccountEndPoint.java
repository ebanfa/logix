/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Billingaccount;
import com.cloderia.helion.client.shared.ops.BillingaccountOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/billingaccount")
public interface BillingaccountEndPoint extends BaseEntityEndPoint<Billingaccount, BillingaccountOperation> {


}
