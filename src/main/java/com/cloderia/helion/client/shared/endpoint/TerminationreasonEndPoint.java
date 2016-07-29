/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Terminationreason;
import com.cloderia.helion.client.shared.ops.TerminationreasonOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/terminationreason")
public interface TerminationreasonEndPoint extends BaseEntityEndPoint<Terminationreason, TerminationreasonOperation> {


}
