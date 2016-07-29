/**
 * 
 */
package com.cloderia.helion.client.local.auth;

import javax.inject.Inject;

import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.TransitionTo;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.local.ui.BasePage;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.DOM;

/**
 * @author adrian
 *
 */
@Page(path = "/password")
@Templated(value = "password-page.html#l-forget-password")
public class PasswordPage extends BasePage {
	
	@Inject
	TransitionTo<LoginPage> loginPage;
	@Inject
	TransitionTo<SignUpPage> signUpPage;

	@DataField
	protected AnchorElement loginPageLink = DOM.createAnchor().cast();
	@DataField
	protected AnchorElement signUpPageLink = DOM.createAnchor().cast();
	
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
	@EventHandler("signUpPageLink")
	public void onClickPasswordBtn(ClickEvent e) {
		signUpPage.go();
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.BasePage#doSetup()
	 */
	@Override
	protected void doSetup() {
		addLoginPageTheme();
		
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
