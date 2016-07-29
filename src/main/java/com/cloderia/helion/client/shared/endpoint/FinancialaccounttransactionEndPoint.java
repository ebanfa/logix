/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Financialaccounttransaction;
import com.cloderia.helion.client.shared.ops.FinancialaccounttransactionOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/financialaccounttransaction")
public interface FinancialaccounttransactionEndPoint extends BaseEntityEndPoint<Financialaccounttransaction, FinancialaccounttransactionOperation> {


}
