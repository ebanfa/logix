/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Financialaccount;
import com.cloderia.helion.client.shared.ops.FinancialaccountOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/financialaccount")
public interface FinancialaccountEndPoint extends BaseEntityEndPoint<Financialaccount, FinancialaccountOperation> {


}
