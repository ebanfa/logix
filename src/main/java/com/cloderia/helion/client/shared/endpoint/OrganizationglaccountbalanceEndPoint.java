/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Organizationglaccountbalance;
import com.cloderia.helion.client.shared.ops.OrganizationglaccountbalanceOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/organizationglaccountbalance")
public interface OrganizationglaccountbalanceEndPoint extends BaseEntityEndPoint<Organizationglaccountbalance, OrganizationglaccountbalanceOperation> {


}
