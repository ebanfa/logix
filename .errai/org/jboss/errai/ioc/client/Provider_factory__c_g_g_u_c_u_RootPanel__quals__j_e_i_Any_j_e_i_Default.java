package org.jboss.errai.ioc.client;

import com.google.gwt.event.logical.shared.HasAttachHandlers;
import com.google.gwt.event.shared.HasHandlers;
import com.google.gwt.user.client.EventListener;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.ComplexPanel;
import com.google.gwt.user.client.ui.HasVisibility;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.HasWidgets.ForIsWidget;
import com.google.gwt.user.client.ui.IndexedPanel;
import com.google.gwt.user.client.ui.InsertPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.RootPanel;
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

public class Provider_factory__c_g_g_u_c_u_RootPanel__quals__j_e_i_Any_j_e_i_Default extends Factory<RootPanel> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(RootPanel.class, "Provider_factory__c_g_g_u_c_u_RootPanel__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Provider_factory__c_g_g_u_c_u_RootPanel__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(RootPanel.class);
    handle.addAssignableType(AbsolutePanel.class);
    handle.addAssignableType(ComplexPanel.class);
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
    handle.addAssignableType(com.google.gwt.user.client.ui.IndexedPanel.ForIsWidget.class);
    handle.addAssignableType(IndexedPanel.class);
    handle.addAssignableType(com.google.gwt.user.client.ui.InsertPanel.ForIsWidget.class);
    handle.addAssignableType(InsertPanel.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public RootPanel createInstance(final ContextManager contextManager) {
    final Provider<RootPanel> provider = (Provider<RootPanel>) contextManager.getInstance("Type_factory__o_j_e_i_c_a_b_RootPanelProvider__quals__j_e_i_Any_j_e_i_Default");
    final RootPanel instance = provider.get();
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((RootPanel) instance, contextManager);
  }

  public void destroyInstanceHelper(final RootPanel instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final RootPanel instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }
}