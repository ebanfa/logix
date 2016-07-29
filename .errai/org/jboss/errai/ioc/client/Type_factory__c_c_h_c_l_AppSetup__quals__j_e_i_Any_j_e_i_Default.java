package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.AppSetup;
import org.jboss.errai.ioc.client.api.EntryPoint;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ui.nav.client.local.NavigationPanel;

public class Type_factory__c_c_h_c_l_AppSetup__quals__j_e_i_Any_j_e_i_Default extends Factory<AppSetup> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(AppSetup.class, "Type_factory__c_c_h_c_l_AppSetup__quals__j_e_i_Any_j_e_i_Default", EntryPoint.class, true, null, true);
  public Type_factory__c_c_h_c_l_AppSetup__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(AppSetup.class);
    handle.addAssignableType(Object.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public AppSetup createInstance(final ContextManager contextManager) {
    final AppSetup instance = new AppSetup();
    setIncompleteInstance(instance);
    final NavigationPanel AppSetup_navPanel = (NavigationPanel) contextManager.getInstance("Provider_factory__o_j_e_u_n_c_l_NavigationPanel__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, AppSetup_navPanel);
    AppSetup_NavigationPanel_navPanel(instance, AppSetup_navPanel);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((AppSetup) instance, contextManager);
  }

  public void destroyInstanceHelper(final AppSetup instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final AppSetup instance) {
    instance.init();
  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static NavigationPanel AppSetup_NavigationPanel_navPanel(AppSetup instance) /*-{
    return instance.@com.cloderia.helion.client.local.AppSetup::navPanel;
  }-*/;

  native static void AppSetup_NavigationPanel_navPanel(AppSetup instance, NavigationPanel value) /*-{
    instance.@com.cloderia.helion.client.local.AppSetup::navPanel = value;
  }-*/;
}