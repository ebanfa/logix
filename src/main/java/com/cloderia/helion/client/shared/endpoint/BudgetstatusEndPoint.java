/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Budgetstatus;
import com.cloderia.helion.client.shared.ops.BudgetstatusOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/budgetstatus")
public interface BudgetstatusEndPoint extends BaseEntityEndPoint<Budgetstatus, BudgetstatusOperation> {


}
