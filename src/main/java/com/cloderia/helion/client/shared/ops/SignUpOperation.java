/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import javax.validation.constraints.NotNull;

import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Systemuser;

/**
 * @author adrian
 *
 */
@Portable
public class SignUpOperation {

	@NotNull
	private String emailAddress;
	@NotNull
	private String password;
	@NotNull
	private String passwordConfirm;
	
	/**
	 * 
	 */
	public SignUpOperation() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param emailAddress
	 * @param password
	 * @param passwordConfirm
	 */
	public SignUpOperation(String emailAddress, String password, String passwordConfirm) {
		super();
		this.emailAddress = emailAddress;
		this.password = password;
		this.passwordConfirm = passwordConfirm;
	}
	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}
	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
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
	/**
	 * @return the passwordConfirm
	 */
	public String getPasswordConfirm() {
		return passwordConfirm;
	}
	/**
	 * @param passwordConfirm the passwordConfirm to set
	 */
	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}
	

}
