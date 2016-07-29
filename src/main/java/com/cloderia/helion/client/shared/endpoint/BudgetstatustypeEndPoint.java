/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Budgetstatustype;
import com.cloderia.helion.client.shared.ops.BudgetstatustypeOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/budgetstatustype")
public interface BudgetstatustypeEndPoint extends BaseEntityEndPoint<Budgetstatustype, BudgetstatustypeOperation> {


}
