/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Organization;
import com.cloderia.helion.client.shared.ops.OrganizationOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/organization")
public interface OrganizationEndPoint extends BaseEntityEndPoint<Organization, OrganizationOperation> {


}
