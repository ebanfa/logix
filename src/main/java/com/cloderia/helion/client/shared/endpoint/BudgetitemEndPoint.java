/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Budgetitem;
import com.cloderia.helion.client.shared.ops.BudgetitemOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/budgetitem")
public interface BudgetitemEndPoint extends BaseEntityEndPoint<Budgetitem, BudgetitemOperation> {


}
