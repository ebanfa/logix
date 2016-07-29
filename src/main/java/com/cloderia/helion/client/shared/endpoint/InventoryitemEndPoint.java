/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Inventoryitem;
import com.cloderia.helion.client.shared.ops.InventoryitemOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/inventoryitem")
public interface InventoryitemEndPoint extends BaseEntityEndPoint<Inventoryitem, InventoryitemOperation> {


}
