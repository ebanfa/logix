package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.auth.LoginPage;
import com.cloderia.helion.client.local.ui.Dashboard;
import com.cloderia.helion.client.local.ui.SideBar;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
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
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ui.nav.client.local.TransitionAnchor;
import org.jboss.errai.ui.shared.Template;
import org.jboss.errai.ui.shared.TemplateUtil;
import org.jboss.errai.ui.shared.api.style.StyleBindingsRegistry;

public class Type_factory__c_c_h_c_l_u_SideBar__quals__j_e_i_Any_j_e_i_Default extends Factory<SideBar> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(SideBar.class, "Type_factory__c_c_h_c_l_u_SideBar__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_u_SideBarTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/ui/dashboard-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_u_SideBar__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(SideBar.class);
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

  public SideBar createInstance(final ContextManager contextManager) {
    final SideBar instance = new SideBar();
    setIncompleteInstance(instance);
    final TransitionAnchor SideBar_sbSignOutLink = (TransitionAnchor) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionAnchor__quals__Universal", new Class[] { LoginPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, SideBar_sbSignOutLink);
    SideBar_TransitionAnchor_sbSignOutLink(instance, SideBar_sbSignOutLink);
    final TransitionAnchor SideBar_sbDashLink = (TransitionAnchor) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionAnchor__quals__Universal", new Class[] { Dashboard.class }, new Annotation[] { });
    registerDependentScopedReference(instance, SideBar_sbDashLink);
    SideBar_TransitionAnchor_sbDashLink(instance, SideBar_sbDashLink);
    c_c_h_c_l_u_SideBarTemplateResource templateForSideBar = GWT.create(c_c_h_c_l_u_SideBarTemplateResource.class);
    Element parentElementForTemplateOfSideBar = TemplateUtil.getRootTemplateParentElement(templateForSideBar.getContents().getText(), "com/cloderia/helion/client/local/ui/dashboard-page.html", "sidebar");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/ui/dashboard-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSideBar));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSideBar));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.ui.SideBar", "com/cloderia/helion/client/local/ui/dashboard-page.html", new Supplier<Widget>() {
      public Widget get() {
        return SideBar_TransitionAnchor_sbDashLink(instance).asWidget();
      }
    }, dataFieldElements, "sbDashLink");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.ui.SideBar", "com/cloderia/helion/client/local/ui/dashboard-page.html", new Supplier<Widget>() {
      public Widget get() {
        return SideBar_TransitionAnchor_sbSignOutLink(instance).asWidget();
      }
    }, dataFieldElements, "sbSignOutLink");
    templateFieldsMap.put("sbDashLink", SideBar_TransitionAnchor_sbDashLink(instance).asWidget());
    templateFieldsMap.put("sbSignOutLink", SideBar_TransitionAnchor_sbSignOutLink(instance).asWidget());
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSideBar), templateFieldsMap.values());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((SideBar) instance, contextManager);
  }

  public void destroyInstanceHelper(final SideBar instance, final ContextManager contextManager) {
    TemplateUtil.cleanupWidget(instance);
  }

  public void invokePostConstructs(final SideBar instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TransitionAnchor SideBar_TransitionAnchor_sbSignOutLink(SideBar instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.SideBar::sbSignOutLink;
  }-*/;

  native static void SideBar_TransitionAnchor_sbSignOutLink(SideBar instance, TransitionAnchor<LoginPage> value) /*-{
    instance.@com.cloderia.helion.client.local.ui.SideBar::sbSignOutLink = value;
  }-*/;

  native static TransitionAnchor SideBar_TransitionAnchor_sbDashLink(SideBar instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.SideBar::sbDashLink;
  }-*/;

  native static void SideBar_TransitionAnchor_sbDashLink(SideBar instance, TransitionAnchor<Dashboard> value) /*-{
    instance.@com.cloderia.helion.client.local.ui.SideBar::sbDashLink = value;
  }-*/;
}