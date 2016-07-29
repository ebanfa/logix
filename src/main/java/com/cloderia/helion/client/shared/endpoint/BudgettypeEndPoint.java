/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Budgettype;
import com.cloderia.helion.client.shared.ops.BudgettypeOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/budgettype")
public interface BudgettypeEndPoint extends BaseEntityEndPoint<Budgettype, BudgettypeOperation> {


}
