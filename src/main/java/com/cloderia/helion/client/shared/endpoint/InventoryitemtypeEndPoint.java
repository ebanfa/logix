/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Inventoryitemtype;
import com.cloderia.helion.client.shared.ops.InventoryitemtypeOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/inventoryitemtype")
public interface InventoryitemtypeEndPoint extends BaseEntityEndPoint<Inventoryitemtype, InventoryitemtypeOperation> {


}
