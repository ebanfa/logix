/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Financialaccounttransactiontype;
import com.cloderia.helion.client.shared.ops.FinancialaccounttransactiontypeOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/financialaccounttransactiontype")
public interface FinancialaccounttransactiontypeEndPoint extends BaseEntityEndPoint<Financialaccounttransactiontype, FinancialaccounttransactiontypeOperation> {


}
