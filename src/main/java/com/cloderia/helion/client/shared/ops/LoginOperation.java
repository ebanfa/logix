/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import javax.validation.constraints.NotNull;

import org.jboss.errai.common.client.api.annotations.Portable;

/**
 * @author adrian
 *
 */
@Portable
public class LoginOperation {
	
	@NotNull
	private String userName;
	
	@NotNull
	private String password;
	
	/**
	 * 
	 */
	public LoginOperation() {
		super();
	}

	/**
	 * @param userName
	 * @param password
	 */
	public LoginOperation(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}
