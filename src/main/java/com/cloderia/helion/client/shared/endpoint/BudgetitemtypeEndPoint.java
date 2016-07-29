/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Budgetitemtype;
import com.cloderia.helion.client.shared.ops.BudgetitemtypeOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/budgetitemtype")
public interface BudgetitemtypeEndPoint extends BaseEntityEndPoint<Budgetitemtype, BudgetitemtypeOperation> {


}
