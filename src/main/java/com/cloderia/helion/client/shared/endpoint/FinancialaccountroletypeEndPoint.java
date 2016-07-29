/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Financialaccountroletype;
import com.cloderia.helion.client.shared.ops.FinancialaccountroletypeOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/financialaccountroletype")
public interface FinancialaccountroletypeEndPoint extends BaseEntityEndPoint<Financialaccountroletype, FinancialaccountroletypeOperation> {


}
