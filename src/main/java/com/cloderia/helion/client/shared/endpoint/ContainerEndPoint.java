/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Container;
import com.cloderia.helion.client.shared.ops.ContainerOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/container")
public interface ContainerEndPoint extends BaseEntityEndPoint<Container, ContainerOperation> {


}
