/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Inventoryitemstatus;
import com.cloderia.helion.client.shared.ops.InventoryitemstatusOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/inventoryitemstatus")
public interface InventoryitemstatusEndPoint extends BaseEntityEndPoint<Inventoryitemstatus, InventoryitemstatusOperation> {


}
