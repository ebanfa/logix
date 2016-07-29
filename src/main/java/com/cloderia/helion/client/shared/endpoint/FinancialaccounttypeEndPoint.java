/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Financialaccounttype;
import com.cloderia.helion.client.shared.ops.FinancialaccounttypeOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/financialaccounttype")
public interface FinancialaccounttypeEndPoint extends BaseEntityEndPoint<Financialaccounttype, FinancialaccounttypeOperation> {


}
