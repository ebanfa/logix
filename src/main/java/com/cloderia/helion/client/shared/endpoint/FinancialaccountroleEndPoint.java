/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Financialaccountrole;
import com.cloderia.helion.client.shared.ops.FinancialaccountroleOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/financialaccountrole")
public interface FinancialaccountroleEndPoint extends BaseEntityEndPoint<Financialaccountrole, FinancialaccountroleOperation> {


}
