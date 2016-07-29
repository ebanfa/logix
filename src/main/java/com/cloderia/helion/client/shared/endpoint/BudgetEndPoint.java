/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Budget;
import com.cloderia.helion.client.shared.ops.BudgetOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/budget")
public interface BudgetEndPoint extends BaseEntityEndPoint<Budget, BudgetOperation> {


}
