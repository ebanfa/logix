/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Preferencetype;
import com.cloderia.helion.client.shared.ops.PreferencetypeOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/preferencetype")
public interface PreferencetypeEndPoint extends BaseEntityEndPoint<Preferencetype, PreferencetypeOperation> {


}
