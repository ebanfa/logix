/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.cloderia.helion.client.shared.ops.LoginOperation;
import com.cloderia.helion.client.shared.ops.SignUpOperation;
import com.cloderia.helion.client.shared.model.Systemuser;
import com.cloderia.helion.client.shared.ops.SystemuserOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/systemuser")
public interface SystemuserEndPoint extends BaseEntityEndPoint<Systemuser, SystemuserOperation> {
	
	/**
	 * 
	 */
	@POST
	@Path("/signin")
	@Consumes("application/json")
	@Produces("application/json")
	public Response login(LoginOperation loginPojo);
	
	/**
	 * 
	 */
	@POST
	@Path("/signup")
	@Consumes("application/json")
	@Produces("application/json")
	public Response signUp(SignUpOperation signUpPojo);

}
