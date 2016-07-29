package org.jboss.errai.ioc.client;

import com.google.gwt.event.logical.shared.HasAttachHandlers;
import com.google.gwt.event.shared.HasHandlers;
import com.google.gwt.user.client.EventListener;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.HasOneWidget;
import com.google.gwt.user.client.ui.HasVisibility;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.HasWidgets.ForIsWidget;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.UIObject;
import com.google.gwt.user.client.ui.Widget;
import javax.enterprise.context.Dependent;
import javax.inject.Provider;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ui.nav.client.local.NavigationPanel;

public class Provider_factory__o_j_e_u_n_c_l_NavigationPanel__quals__j_e_i_Any_j_e_i_Default extends Factory<NavigationPanel> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(NavigationPanel.class, "Provider_factory__o_j_e_u_n_c_l_NavigationPanel__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Provider_factory__o_j_e_u_n_c_l_NavigationPanel__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(NavigationPanel.class);
    handle.addAssignableType(SimplePanel.class);
    handle.addAssignableType(Panel.class);
    handle.addAssignableType(Widget.class);
    handle.addAssignableType(UIObject.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(HasVisibility.class);
    handle.addAssignableType(EventListener.class);
    handle.addAssignableType(HasAttachHandlers.class);
    handle.addAssignableType(HasHandlers.class);
    handle.addAssignableType(IsWidget.class);
    handle.addAssignableType(ForIsWidget.class);
    handle.addAssignableType(HasWidgets.class);
    handle.addAssignableType(Iterable.class);
    handle.addAssignableType(HasOneWidget.class);
    handle.addAssignableType(AcceptsOneWidget.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public NavigationPanel createInstance(final ContextManager contextManager) {
    final Provider<NavigationPanel> provider = (Provider<NavigationPanel>) contextManager.getInstance("Type_factory__o_j_e_u_n_c_l_NavigationPanelProvider__quals__j_e_i_Any_j_e_i_Default");
    final NavigationPanel instance = provider.get();
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((NavigationPanel) instance, contextManager);
  }

  public void destroyInstanceHelper(final NavigationPanel instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final NavigationPanel instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }
}