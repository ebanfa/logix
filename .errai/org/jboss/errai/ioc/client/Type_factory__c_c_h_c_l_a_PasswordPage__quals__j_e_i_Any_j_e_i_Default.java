package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.auth.LoginPage;
import com.cloderia.helion.client.local.auth.PasswordPage;
import com.cloderia.helion.client.local.auth.SignUpPage;
import com.cloderia.helion.client.local.ui.BasePage;
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
import com.google.gwt.user.client.ui.UIObject;
import com.google.gwt.user.client.ui.Widget;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.enterprise.context.Dependent;
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

public class Type_factory__c_c_h_c_l_a_PasswordPage__quals__j_e_i_Any_j_e_i_Default extends Factory<PasswordPage> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(PasswordPage.class, "Type_factory__c_c_h_c_l_a_PasswordPage__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_a_PasswordPageTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/auth/password-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_a_PasswordPage__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(PasswordPage.class);
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

  public PasswordPage createInstance(final ContextManager contextManager) {
    final PasswordPage instance = new PasswordPage();
    setIncompleteInstance(instance);
    final TransitionTo PasswordPage_signUpPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { SignUpPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PasswordPage_signUpPage);
    PasswordPage_TransitionTo_signUpPage(instance, PasswordPage_signUpPage);
    final TransitionTo PasswordPage_loginPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { LoginPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PasswordPage_loginPage);
    PasswordPage_TransitionTo_loginPage(instance, PasswordPage_loginPage);
    c_c_h_c_l_a_PasswordPageTemplateResource templateForPasswordPage = GWT.create(c_c_h_c_l_a_PasswordPageTemplateResource.class);
    Element parentElementForTemplateOfPasswordPage = TemplateUtil.getRootTemplateParentElement(templateForPasswordPage.getContents().getText(), "com/cloderia/helion/client/local/auth/password-page.html", "l-forget-password");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/auth/password-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPasswordPage));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPasswordPage));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.auth.PasswordPage", "com/cloderia/helion/client/local/auth/password-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PasswordPage_AnchorElement_loginPageLink(instance));
      }
    }, dataFieldElements, "loginPageLink");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.auth.PasswordPage", "com/cloderia/helion/client/local/auth/password-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PasswordPage_AnchorElement_signUpPageLink(instance));
      }
    }, dataFieldElements, "signUpPageLink");
    templateFieldsMap.put("loginPageLink", ElementWrapperWidget.getWidget(PasswordPage_AnchorElement_loginPageLink(instance)));
    templateFieldsMap.put("signUpPageLink", ElementWrapperWidget.getWidget(PasswordPage_AnchorElement_signUpPageLink(instance)));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPasswordPage), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("loginPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onClickSignUpBtn(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("signUpPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onClickPasswordBtn(event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((PasswordPage) instance, contextManager);
  }

  public void destroyInstanceHelper(final PasswordPage instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(PasswordPage_AnchorElement_loginPageLink(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(PasswordPage_AnchorElement_signUpPageLink(instance)));
    TemplateUtil.cleanupWidget(instance);
  }

  public void invokePostConstructs(final PasswordPage instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static AnchorElement PasswordPage_AnchorElement_signUpPageLink(PasswordPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.auth.PasswordPage::signUpPageLink;
  }-*/;

  native static void PasswordPage_AnchorElement_signUpPageLink(PasswordPage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.auth.PasswordPage::signUpPageLink = value;
  }-*/;

  native static TransitionTo PasswordPage_TransitionTo_signUpPage(PasswordPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.auth.PasswordPage::signUpPage;
  }-*/;

  native static void PasswordPage_TransitionTo_signUpPage(PasswordPage instance, TransitionTo<SignUpPage> value) /*-{
    instance.@com.cloderia.helion.client.local.auth.PasswordPage::signUpPage = value;
  }-*/;

  native static TransitionTo PasswordPage_TransitionTo_loginPage(PasswordPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.auth.PasswordPage::loginPage;
  }-*/;

  native static void PasswordPage_TransitionTo_loginPage(PasswordPage instance, TransitionTo<LoginPage> value) /*-{
    instance.@com.cloderia.helion.client.local.auth.PasswordPage::loginPage = value;
  }-*/;

  native static AnchorElement PasswordPage_AnchorElement_loginPageLink(PasswordPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.auth.PasswordPage::loginPageLink;
  }-*/;

  native static void PasswordPage_AnchorElement_loginPageLink(PasswordPage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.auth.PasswordPage::loginPageLink = value;
  }-*/;
}