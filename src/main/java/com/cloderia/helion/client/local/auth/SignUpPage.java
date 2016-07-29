/**
 * 
 */
package com.cloderia.helion.client.local.auth;

import java.util.Set;

import javax.inject.Inject;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.jboss.errai.common.client.api.Caller;
import org.jboss.errai.enterprise.client.jaxrs.api.ResponseCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.TransitionTo;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.local.ui.BasePage;
import com.cloderia.helion.client.local.ui.Dashboard;
import com.cloderia.helion.client.shared.endpoint.SystemuserEndPoint;
import com.cloderia.helion.client.shared.ops.LoginOperation;
import com.cloderia.helion.client.shared.ops.SignUpOperation;
import com.cloderia.helion.client.shared.util.StringUtils;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.TextBox;

/**
 * @author adrian
 *
 */
@Page(path = "/signup")
@Templated(value = "signup-page.html#l-register")
public class SignUpPage extends BasePage {

	@Inject
	private Validator validator;
	@Inject
	TransitionTo<LoginPage> loginPage;
	@Inject
	TransitionTo<PasswordPage> passwordPage;
	
	@Inject
	@DataField
	private TextBox emailAddress;
	@Inject
	@DataField
	private TextBox password;
	@Inject
	@DataField
	private TextBox passwordConfirm;

	@DataField
	protected AnchorElement signUpLink = DOM.createAnchor().cast();
	@DataField
	protected AnchorElement loginPageLink = DOM.createAnchor().cast();
	@DataField
	protected AnchorElement passwordPageLink = DOM.createAnchor().cast();
	@Inject
	protected Caller<SystemuserEndPoint> userService;
	
	/**
	 * @param e
	 */
	@EventHandler("loginPageLink")
	public void onClickSignUpBtn(ClickEvent e) {
		loginPage.go();
	}

	/**
	 * @param e
	 */
	@EventHandler("passwordPageLink")
	public void onClickPasswordBtn(ClickEvent e) {
		passwordPage.go();
	}

	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.BasePage#doSetup()
	 */
	@Override
	protected void doSetup() {
		addLoginPageTheme();
		//DOM.getElementById("l-register").addClassName("toggled");
	}
	/**
	 * @param e
	 */
	@EventHandler("signUpLink")
	public void submit(ClickEvent e) {
		SignUpOperation signUpPojo = new SignUpOperation(
				StringUtils.validStringOrNull(emailAddress.getValue()),
				StringUtils.validStringOrNull(password.getValue()),
				StringUtils.validStringOrNull(passwordConfirm.getValue()));
		
		Set<ConstraintViolation<SignUpOperation>> violations = validator.validate(signUpPojo);
		
		if (violations.size() > 0) {
			alert(ERROR_TITLE, INVALID_LOGIN, ALERT_WARNING);
		} else {
			alertBlock(PROCESSING);
			userService.call(new ResponseCallback() {
				@Override
				public void callback(Response response) {
					if (response.getStatusCode() == Response.SC_OK) {
						alertBlock(PROCESSING_SUCCESS);
						loginPage.go();
					} else if (response.getStatusCode() == Response.SC_NOT_ACCEPTABLE)
						alert(ERROR_TITLE, USERNAME_EXIST, ALERT_WARNING);
					else if(response.getStatusCode() == Response.SC_INTERNAL_SERVER_ERROR) 
						alert(ERROR_TITLE, PLATFORM_ERROR, ALERT_WARNING);
				}
			}).signUp(signUpPojo);
		}
	}
	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.ui.BasePage#doTearDown()
	 */
	@Override
	protected void doTearDown() {
		removeLoginPageTheme();
	}

	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.ui.BasePage#doPageShown()
	 */
	@Override
	protected void doPageShown() {
		
	}

	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.ui.BasePage#doPageHidden()
	 */
	@Override
	protected void doPageHidden() {
		
	}

}
