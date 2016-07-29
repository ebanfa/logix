/**
 * 
 */
package com.cloderia.helion.client.local.ui;

import org.jboss.errai.ui.nav.client.local.PageHidden;
import org.jboss.errai.ui.nav.client.local.PageHiding;
import org.jboss.errai.ui.nav.client.local.PageShowing;
import org.jboss.errai.ui.nav.client.local.PageShown;

import com.google.gwt.dom.client.Document;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * @author adrian
 *
 */
public abstract class BasePage extends Composite {

	public static final String ERROR_TITLE = "Error";
	public static final String ALERT_WARNING = "warning";
	public static final String PROCESSING = "Please wait ...";
	public static final String PROCESSING_SUCCESS = "Successful";
	public static final String VERIFY_PROCESSING = "Verifying, please wait...";
	public static final String INVALID_LOGIN = "Invalid username or password provided";
	public static final String USERNAME_EXIST = "The username already exists.";
	public static final String PLATFORM_ERROR = "An error occured while processing the request.";

	@PageShowing
	protected void setup() {
		doSetup();
	}

	@PageShown
	protected void pageShown() {
		doPageShown();
	}

	@PageHiding
	public void tearDown() {
		doTearDown();
	}

	@PageHidden
	public void pageHidden() {
		doPageHidden();
	}

	protected abstract void doSetup();

	protected abstract void doTearDown();

	protected abstract void doPageShown();

	protected abstract void doPageHidden();

	/**
	 * 
	 */
	protected void addLoginPageTheme() {
		RootPanel.getBodyElement().addClassName("login-content");
		Document.get().getDocumentElement().addClassName("login-content");
		RootPanel.get("rootPanel").getElement().addClassName("login-content");
		RootPanel.get("rootPanel").getElement().getFirstChildElement().addClassName("login-content");
		RootPanel.get("rootPanel").getElement().getFirstChildElement().addClassName("login-block-parent");
	}

	/**
	 * 
	 */
	protected void removeLoginPageTheme() {
		RootPanel.getBodyElement().removeClassName("login-content");
		Document.get().getDocumentElement().removeClassName("login-content");
		RootPanel.get("rootPanel").getElement().removeClassName("login-content");
		RootPanel.get("rootPanel").getElement().getFirstChildElement().removeClassName("login-content");
		RootPanel.get("rootPanel").getElement().getFirstChildElement().removeClassName("login-block-parent");
	}

	public native void alert(String title, String message, String level) /*-{
		$wnd.swal(title, message, level);
	}-*/;
	
	public native void hide(String elementClass) /*-{
		$wnd.$(elementClass).hide();
	}-*/;
	
	public native void alertBlock(String text) /*-{
		$wnd.swal(text);
	}-*/;
}
