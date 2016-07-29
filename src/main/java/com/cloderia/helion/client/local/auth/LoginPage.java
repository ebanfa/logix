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
import org.jboss.errai.ui.nav.client.local.DefaultPage;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.TransitionTo;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.local.ui.BasePage;
import com.cloderia.helion.client.local.ui.Dashboard;
import com.cloderia.helion.client.shared.endpoint.SystemuserEndPoint;
import com.cloderia.helion.client.shared.ops.LoginOperation;
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
@Page(role = DefaultPage.class, path = "/login")
@Templated(value = "login-page.html#l-login")
public class LoginPage extends BasePage {

	@Inject
	private Validator validator;
	
	@Inject
	TransitionTo<SignUpPage> signUpPage;
	@Inject
	TransitionTo<PasswordPage> passwordPage;
	@Inject
	TransitionTo<Dashboard> dashboardPage;

	@Inject
	@DataField
	private TextBox userName;
	@Inject
	@DataField
	private TextBox password;

	@DataField
	protected AnchorElement loginPageLink = DOM.createAnchor().cast();
	@DataField
	protected AnchorElement signUpPageLink = DOM.createAnchor().cast();
	@DataField
	protected AnchorElement passwordPageLink = DOM.createAnchor().cast();
	@Inject
	protected Caller<SystemuserEndPoint> userService;
	
	/**
	 * @param e
	 */
	@EventHandler("signUpPageLink")
	public void onClickSignUpBtn(ClickEvent e) {
		signUpPage.go();
	}

	/**
	 * @param e
	 */
	@EventHandler("passwordPageLink")
	public void onClickPasswordBtn(ClickEvent e) {
		passwordPage.go();
	}
	
	/**
	 * @param e
	 */
	@EventHandler("loginPageLink")
	public void submit(ClickEvent e) {
		LoginOperation loginPojo = new LoginOperation(StringUtils.validStringOrNull(userName.getValue()),
				StringUtils.validStringOrNull(password.getValue()));

		Set<ConstraintViolation<LoginOperation>> violations = validator.validate(loginPojo);
		if (violations.size() > 0) {
			alert(ERROR_TITLE, INVALID_LOGIN, ALERT_WARNING);
		} else {
			userService.call(new ResponseCallback() {
				@Override
				public void callback(Response response) {
					if (response.getStatusCode() == Response.SC_OK) {
						dashboardPage.go();
					}
					else if (response.getStatusCode() == Response.SC_NOT_ACCEPTABLE)
						alert(ERROR_TITLE, INVALID_LOGIN, ALERT_WARNING);
					else if(response.getStatusCode() == Response.SC_INTERNAL_SERVER_ERROR) 
						alert(ERROR_TITLE, PLATFORM_ERROR, ALERT_WARNING);
					}
			}).login(loginPojo);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePage#doSetup()
	 */
	@Override
	protected void doSetup() {
		addLoginPageTheme();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.ui.BasePage#doTearDown()
	 */
	@Override
	protected void doTearDown() {
		removeLoginPageTheme();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.ui.BasePage#doPageShown()
	 */
	@Override
	protected void doPageShown() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.ui.BasePage#doPageHidden()
	 */
	@Override
	protected void doPageHidden() {

	}

}
