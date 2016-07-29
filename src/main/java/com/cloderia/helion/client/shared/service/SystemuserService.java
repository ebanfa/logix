/**
 * 
 */
package com.cloderia.helion.client.shared.service;

import com.cloderia.helion.client.shared.ApplicationException;
import com.cloderia.helion.client.shared.model.Systemuser;
import com.cloderia.helion.client.shared.ops.LoginOperation;
import com.cloderia.helion.client.shared.ops.SignUpOperation;
import com.cloderia.helion.client.shared.ops.SystemuserOperation;

/**
 * @author Edward Banfa
 *
 */
public interface SystemuserService extends BaseEntityService<Systemuser, SystemuserOperation> {

	
	/**
	 * @param loginPojo
	 * @return
	 */
	public Systemuser login(LoginOperation loginPojo)throws ApplicationException;
	
	
	
	/**
	 * @param signUpPojo
	 * @return
	 */
	public Systemuser signUp(SignUpOperation signUpPojo) throws ApplicationException;

}
