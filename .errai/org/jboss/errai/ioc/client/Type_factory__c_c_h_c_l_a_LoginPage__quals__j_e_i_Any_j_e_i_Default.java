package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.auth.LoginPage;
import com.cloderia.helion.client.local.auth.PasswordPage;
import com.cloderia.helion.client.local.auth.SignUpPage;
import com.cloderia.helion.client.local.ui.BasePage;
import com.cloderia.helion.client.local.ui.Dashboard;
import com.cloderia.helion.client.shared.endpoint.SystemuserEndPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.HasAttachHandlers;
import com.google.gwt.event.shared.HasHandlers;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ClientBundle.Source;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.user.client.EventListener;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasVisibility;
import com.google.gwt.user.client.ui.IsRenderable;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.UIObject;
import com.google.gwt.user.client.ui.Widget;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.enterprise.context.Dependent;
import javax.validation.Validator;
import org.jboss.errai.common.client.api.Caller;
import org.jboss.errai.common.client.function.Supplier;
import org.jboss.errai.common.client.ui.ElementWrapperWidget;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ui.nav.client.local.TransitionTo;
import org.jboss.errai.ui.shared.Template;
import org.jboss.errai.ui.shared.TemplateUtil;
import org.jboss.errai.ui.shared.api.style.StyleBindingsRegistry;

public class Type_factory__c_c_h_c_l_a_LoginPage__quals__j_e_i_Any_j_e_i_Default extends Factory<LoginPage> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(LoginPage.class, "Type_factory__c_c_h_c_l_a_LoginPage__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_a_LoginPageTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/auth/login-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_a_LoginPage__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(LoginPage.class);
    handle.addAssignableType(BasePage.class);
    handle.addAssignableType(Composite.class);
    handle.addAssignableType(Widget.class);
    handle.addAssignableType(UIObject.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(HasVisibility.class);
    handle.addAssignableType(EventListener.class);
    handle.addAssignableType(HasAttachHandlers.class);
    handle.addAssignableType(HasHandlers.class);
    handle.addAssignableType(IsWidget.class);
    handle.addAssignableType(IsRenderable.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public LoginPage createInstance(final ContextManager contextManager) {
    final LoginPage instance = new LoginPage();
    setIncompleteInstance(instance);
    final TransitionTo LoginPage_signUpPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { SignUpPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, LoginPage_signUpPage);
    LoginPage_TransitionTo_signUpPage(instance, LoginPage_signUpPage);
    final TextBox LoginPage_userName = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, LoginPage_userName);
    LoginPage_TextBox_userName(instance, LoginPage_userName);
    final TransitionTo LoginPage_passwordPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { PasswordPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, LoginPage_passwordPage);
    LoginPage_TransitionTo_passwordPage(instance, LoginPage_passwordPage);
    final Caller LoginPage_userService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { SystemuserEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, LoginPage_userService);
    LoginPage_Caller_userService(instance, LoginPage_userService);
    final TextBox LoginPage_password = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, LoginPage_password);
    LoginPage_TextBox_password(instance, LoginPage_password);
    final TransitionTo LoginPage_dashboardPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { Dashboard.class }, new Annotation[] { });
    registerDependentScopedReference(instance, LoginPage_dashboardPage);
    LoginPage_TransitionTo_dashboardPage(instance, LoginPage_dashboardPage);
    final Validator LoginPage_validator = (Validator) contextManager.getInstance("Provider_factory__j_v_Validator__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, LoginPage_validator);
    LoginPage_Validator_validator(instance, LoginPage_validator);
    c_c_h_c_l_a_LoginPageTemplateResource templateForLoginPage = GWT.create(c_c_h_c_l_a_LoginPageTemplateResource.class);
    Element parentElementForTemplateOfLoginPage = TemplateUtil.getRootTemplateParentElement(templateForLoginPage.getContents().getText(), "com/cloderia/helion/client/local/auth/login-page.html", "l-login");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/auth/login-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfLoginPage));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfLoginPage));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.auth.LoginPage", "com/cloderia/helion/client/local/auth/login-page.html", new Supplier<Widget>() {
      public Widget get() {
        return LoginPage_TextBox_userName(instance).asWidget();
      }
    }, dataFieldElements, "userName");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.auth.LoginPage", "com/cloderia/helion/client/local/auth/login-page.html", new Supplier<Widget>() {
      public Widget get() {
        return LoginPage_TextBox_password(instance).asWidget();
      }
    }, dataFieldElements, "password");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.auth.LoginPage", "com/cloderia/helion/client/local/auth/login-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(LoginPage_AnchorElement_loginPageLink(instance));
      }
    }, dataFieldElements, "loginPageLink");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.auth.LoginPage", "com/cloderia/helion/client/local/auth/login-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(LoginPage_AnchorElement_signUpPageLink(instance));
      }
    }, dataFieldElements, "signUpPageLink");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.auth.LoginPage", "com/cloderia/helion/client/local/auth/login-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(LoginPage_AnchorElement_passwordPageLink(instance));
      }
    }, dataFieldElements, "passwordPageLink");
    templateFieldsMap.put("userName", LoginPage_TextBox_userName(instance).asWidget());
    templateFieldsMap.put("password", LoginPage_TextBox_password(instance).asWidget());
    templateFieldsMap.put("loginPageLink", ElementWrapperWidget.getWidget(LoginPage_AnchorElement_loginPageLink(instance)));
    templateFieldsMap.put("signUpPageLink", ElementWrapperWidget.getWidget(LoginPage_AnchorElement_signUpPageLink(instance)));
    templateFieldsMap.put("passwordPageLink", ElementWrapperWidget.getWidget(LoginPage_AnchorElement_passwordPageLink(instance)));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfLoginPage), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("signUpPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onClickSignUpBtn(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("passwordPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onClickPasswordBtn(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("loginPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((LoginPage) instance, contextManager);
  }

  public void destroyInstanceHelper(final LoginPage instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(LoginPage_AnchorElement_loginPageLink(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(LoginPage_AnchorElement_signUpPageLink(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(LoginPage_AnchorElement_passwordPageLink(instance)));
    TemplateUtil.cleanupWidget(instance);
  }

  public void invokePostConstructs(final LoginPage instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static AnchorElement LoginPage_AnchorElement_loginPageLink(LoginPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.auth.LoginPage::loginPageLink;
  }-*/;

  native static void LoginPage_AnchorElement_loginPageLink(LoginPage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.auth.LoginPage::loginPageLink = value;
  }-*/;

  native static Validator LoginPage_Validator_validator(LoginPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.auth.LoginPage::validator;
  }-*/;

  native static void LoginPage_Validator_validator(LoginPage instance, Validator value) /*-{
    instance.@com.cloderia.helion.client.local.auth.LoginPage::validator = value;
  }-*/;

  native static TextBox LoginPage_TextBox_userName(LoginPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.auth.LoginPage::userName;
  }-*/;

  native static void LoginPage_TextBox_userName(LoginPage instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.auth.LoginPage::userName = value;
  }-*/;

  native static AnchorElement LoginPage_AnchorElement_signUpPageLink(LoginPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.auth.LoginPage::signUpPageLink;
  }-*/;

  native static void LoginPage_AnchorElement_signUpPageLink(LoginPage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.auth.LoginPage::signUpPageLink = value;
  }-*/;

  native static TextBox LoginPage_TextBox_password(LoginPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.auth.LoginPage::password;
  }-*/;

  native static void LoginPage_TextBox_password(LoginPage instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.auth.LoginPage::password = value;
  }-*/;

  native static AnchorElement LoginPage_AnchorElement_passwordPageLink(LoginPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.auth.LoginPage::passwordPageLink;
  }-*/;

  native static void LoginPage_AnchorElement_passwordPageLink(LoginPage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.auth.LoginPage::passwordPageLink = value;
  }-*/;

  native static TransitionTo LoginPage_TransitionTo_signUpPage(LoginPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.auth.LoginPage::signUpPage;
  }-*/;

  native static void LoginPage_TransitionTo_signUpPage(LoginPage instance, TransitionTo<SignUpPage> value) /*-{
    instance.@com.cloderia.helion.client.local.auth.LoginPage::signUpPage = value;
  }-*/;

  native static Caller LoginPage_Caller_userService(LoginPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.auth.LoginPage::userService;
  }-*/;

  native static void LoginPage_Caller_userService(LoginPage instance, Caller<SystemuserEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.auth.LoginPage::userService = value;
  }-*/;

  native static TransitionTo LoginPage_TransitionTo_dashboardPage(LoginPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.auth.LoginPage::dashboardPage;
  }-*/;

  native static void LoginPage_TransitionTo_dashboardPage(LoginPage instance, TransitionTo<Dashboard> value) /*-{
    instance.@com.cloderia.helion.client.local.auth.LoginPage::dashboardPage = value;
  }-*/;

  native static TransitionTo LoginPage_TransitionTo_passwordPage(LoginPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.auth.LoginPage::passwordPage;
  }-*/;

  native static void LoginPage_TransitionTo_passwordPage(LoginPage instance, TransitionTo<PasswordPage> value) /*-{
    instance.@com.cloderia.helion.client.local.auth.LoginPage::passwordPage = value;
  }-*/;
}