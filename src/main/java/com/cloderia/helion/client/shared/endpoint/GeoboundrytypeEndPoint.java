/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Geoboundrytype;
import com.cloderia.helion.client.shared.ops.GeoboundrytypeOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/geoboundrytype")
public interface GeoboundrytypeEndPoint extends BaseEntityEndPoint<Geoboundrytype, GeoboundrytypeOperation> {


}
