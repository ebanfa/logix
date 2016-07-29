package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.auth.LoginPage;
import com.cloderia.helion.client.local.auth.PasswordPage;
import com.cloderia.helion.client.local.auth.SignUpPage;
import com.cloderia.helion.client.local.ui.BasePage;
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

public class Type_factory__c_c_h_c_l_a_SignUpPage__quals__j_e_i_Any_j_e_i_Default extends Factory<SignUpPage> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(SignUpPage.class, "Type_factory__c_c_h_c_l_a_SignUpPage__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_a_SignUpPageTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/auth/signup-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_a_SignUpPage__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(SignUpPage.class);
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

  public SignUpPage createInstance(final ContextManager contextManager) {
    final SignUpPage instance = new SignUpPage();
    setIncompleteInstance(instance);
    final TransitionTo SignUpPage_passwordPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { PasswordPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, SignUpPage_passwordPage);
    SignUpPage_TransitionTo_passwordPage(instance, SignUpPage_passwordPage);
    final Caller SignUpPage_userService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { SystemuserEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, SignUpPage_userService);
    SignUpPage_Caller_userService(instance, SignUpPage_userService);
    final Validator SignUpPage_validator = (Validator) contextManager.getInstance("Provider_factory__j_v_Validator__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, SignUpPage_validator);
    SignUpPage_Validator_validator(instance, SignUpPage_validator);
    final TextBox SignUpPage_passwordConfirm = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, SignUpPage_passwordConfirm);
    SignUpPage_TextBox_passwordConfirm(instance, SignUpPage_passwordConfirm);
    final TextBox SignUpPage_password = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, SignUpPage_password);
    SignUpPage_TextBox_password(instance, SignUpPage_password);
    final TransitionTo SignUpPage_loginPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { LoginPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, SignUpPage_loginPage);
    SignUpPage_TransitionTo_loginPage(instance, SignUpPage_loginPage);
    final TextBox SignUpPage_emailAddress = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, SignUpPage_emailAddress);
    SignUpPage_TextBox_emailAddress(instance, SignUpPage_emailAddress);
    c_c_h_c_l_a_SignUpPageTemplateResource templateForSignUpPage = GWT.create(c_c_h_c_l_a_SignUpPageTemplateResource.class);
    Element parentElementForTemplateOfSignUpPage = TemplateUtil.getRootTemplateParentElement(templateForSignUpPage.getContents().getText(), "com/cloderia/helion/client/local/auth/signup-page.html", "l-register");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/auth/signup-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSignUpPage));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSignUpPage));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.auth.SignUpPage", "com/cloderia/helion/client/local/auth/signup-page.html", new Supplier<Widget>() {
      public Widget get() {
        return SignUpPage_TextBox_emailAddress(instance).asWidget();
      }
    }, dataFieldElements, "emailAddress");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.auth.SignUpPage", "com/cloderia/helion/client/local/auth/signup-page.html", new Supplier<Widget>() {
      public Widget get() {
        return SignUpPage_TextBox_password(instance).asWidget();
      }
    }, dataFieldElements, "password");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.auth.SignUpPage", "com/cloderia/helion/client/local/auth/signup-page.html", new Supplier<Widget>() {
      public Widget get() {
        return SignUpPage_TextBox_passwordConfirm(instance).asWidget();
      }
    }, dataFieldElements, "passwordConfirm");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.auth.SignUpPage", "com/cloderia/helion/client/local/auth/signup-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(SignUpPage_AnchorElement_signUpLink(instance));
      }
    }, dataFieldElements, "signUpLink");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.auth.SignUpPage", "com/cloderia/helion/client/local/auth/signup-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(SignUpPage_AnchorElement_loginPageLink(instance));
      }
    }, dataFieldElements, "loginPageLink");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.auth.SignUpPage", "com/cloderia/helion/client/local/auth/signup-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(SignUpPage_AnchorElement_passwordPageLink(instance));
      }
    }, dataFieldElements, "passwordPageLink");
    templateFieldsMap.put("emailAddress", SignUpPage_TextBox_emailAddress(instance).asWidget());
    templateFieldsMap.put("password", SignUpPage_TextBox_password(instance).asWidget());
    templateFieldsMap.put("passwordConfirm", SignUpPage_TextBox_passwordConfirm(instance).asWidget());
    templateFieldsMap.put("signUpLink", ElementWrapperWidget.getWidget(SignUpPage_AnchorElement_signUpLink(instance)));
    templateFieldsMap.put("loginPageLink", ElementWrapperWidget.getWidget(SignUpPage_AnchorElement_loginPageLink(instance)));
    templateFieldsMap.put("passwordPageLink", ElementWrapperWidget.getWidget(SignUpPage_AnchorElement_passwordPageLink(instance)));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSignUpPage), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("loginPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onClickSignUpBtn(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("passwordPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onClickPasswordBtn(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("signUpLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((SignUpPage) instance, contextManager);
  }

  public void destroyInstanceHelper(final SignUpPage instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(SignUpPage_AnchorElement_signUpLink(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(SignUpPage_AnchorElement_loginPageLink(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(SignUpPage_AnchorElement_passwordPageLink(instance)));
    TemplateUtil.cleanupWidget(instance);
  }

  public void invokePostConstructs(final SignUpPage instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static AnchorElement SignUpPage_AnchorElement_loginPageLink(SignUpPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.auth.SignUpPage::loginPageLink;
  }-*/;

  native static void SignUpPage_AnchorElement_loginPageLink(SignUpPage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.auth.SignUpPage::loginPageLink = value;
  }-*/;

  native static TransitionTo SignUpPage_TransitionTo_loginPage(SignUpPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.auth.SignUpPage::loginPage;
  }-*/;

  native static void SignUpPage_TransitionTo_loginPage(SignUpPage instance, TransitionTo<LoginPage> value) /*-{
    instance.@com.cloderia.helion.client.local.auth.SignUpPage::loginPage = value;
  }-*/;

  native static AnchorElement SignUpPage_AnchorElement_passwordPageLink(SignUpPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.auth.SignUpPage::passwordPageLink;
  }-*/;

  native static void SignUpPage_AnchorElement_passwordPageLink(SignUpPage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.auth.SignUpPage::passwordPageLink = value;
  }-*/;

  native static AnchorElement SignUpPage_AnchorElement_signUpLink(SignUpPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.auth.SignUpPage::signUpLink;
  }-*/;

  native static void SignUpPage_AnchorElement_signUpLink(SignUpPage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.auth.SignUpPage::signUpLink = value;
  }-*/;

  native static TextBox SignUpPage_TextBox_passwordConfirm(SignUpPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.auth.SignUpPage::passwordConfirm;
  }-*/;

  native static void SignUpPage_TextBox_passwordConfirm(SignUpPage instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.auth.SignUpPage::passwordConfirm = value;
  }-*/;

  native static TransitionTo SignUpPage_TransitionTo_passwordPage(SignUpPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.auth.SignUpPage::passwordPage;
  }-*/;

  native static void SignUpPage_TransitionTo_passwordPage(SignUpPage instance, TransitionTo<PasswordPage> value) /*-{
    instance.@com.cloderia.helion.client.local.auth.SignUpPage::passwordPage = value;
  }-*/;

  native static TextBox SignUpPage_TextBox_emailAddress(SignUpPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.auth.SignUpPage::emailAddress;
  }-*/;

  native static void SignUpPage_TextBox_emailAddress(SignUpPage instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.auth.SignUpPage::emailAddress = value;
  }-*/;

  native static TextBox SignUpPage_TextBox_password(SignUpPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.auth.SignUpPage::password;
  }-*/;

  native static void SignUpPage_TextBox_password(SignUpPage instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.auth.SignUpPage::password = value;
  }-*/;

  native static Validator SignUpPage_Validator_validator(SignUpPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.auth.SignUpPage::validator;
  }-*/;

  native static void SignUpPage_Validator_validator(SignUpPage instance, Validator value) /*-{
    instance.@com.cloderia.helion.client.local.auth.SignUpPage::validator = value;
  }-*/;

  native static Caller SignUpPage_Caller_userService(SignUpPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.auth.SignUpPage::userService;
  }-*/;

  native static void SignUpPage_Caller_userService(SignUpPage instance, Caller<SystemuserEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.auth.SignUpPage::userService = value;
  }-*/;
}