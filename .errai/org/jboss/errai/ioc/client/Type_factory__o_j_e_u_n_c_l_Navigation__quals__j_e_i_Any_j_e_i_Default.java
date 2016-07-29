package org.jboss.errai.ioc.client;

import org.jboss.errai.ioc.client.api.EntryPoint;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.lifecycle.api.StateChange;
import org.jboss.errai.ioc.client.lifecycle.impl.StateChangeImpl;
import org.jboss.errai.ui.nav.client.local.HistoryTokenFactory;
import org.jboss.errai.ui.nav.client.local.Navigation;
import org.jboss.errai.ui.nav.client.local.spi.NavigationGraph;
import org.slf4j.Logger;

public class Type_factory__o_j_e_u_n_c_l_Navigation__quals__j_e_i_Any_j_e_i_Default extends Factory<Navigation> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(Navigation.class, "Type_factory__o_j_e_u_n_c_l_Navigation__quals__j_e_i_Any_j_e_i_Default", EntryPoint.class, true, null, true);
  public Type_factory__o_j_e_u_n_c_l_Navigation__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(Navigation.class);
    handle.addAssignableType(Object.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public Navigation createInstance(final ContextManager contextManager) {
    final Navigation instance = new Navigation();
    setIncompleteInstance(instance);
    final NavigationGraph Navigation_navGraph = (NavigationGraph) contextManager.getInstance("Producer_factory__o_j_e_u_n_c_l_s_NavigationGraph__quals__j_e_i_Any_j_e_i_Default");
    Navigation_NavigationGraph_navGraph(instance, Navigation_navGraph);
    final StateChangeImpl Navigation_stateChangeEvent = (StateChangeImpl) contextManager.getInstance("Type_factory__o_j_e_i_c_l_i_StateChangeImpl__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, Navigation_stateChangeEvent);
    Navigation_StateChange_stateChangeEvent(instance, Navigation_stateChangeEvent);
    final HistoryTokenFactory Navigation_historyTokenFactory = (HistoryTokenFactory) contextManager.getInstance("Type_factory__o_j_e_u_n_c_l_HistoryTokenFactory__quals__j_e_i_Any_j_e_i_Default");
    Navigation_HistoryTokenFactory_historyTokenFactory(instance, Navigation_historyTokenFactory);
    final Logger Navigation_logger = (Logger) contextManager.getInstance("ExtensionProvided_factory__o_s_Logger__quals__Universal");
    registerDependentScopedReference(instance, Navigation_logger);
    Navigation_Logger_logger(instance, Navigation_logger);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((Navigation) instance, contextManager);
  }

  public void destroyInstanceHelper(final Navigation instance, final ContextManager contextManager) {
    instance.cleanUp();
  }

  public void invokePostConstructs(final Navigation instance) {
    Navigation_init(instance);
  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static HistoryTokenFactory Navigation_HistoryTokenFactory_historyTokenFactory(Navigation instance) /*-{
    return instance.@org.jboss.errai.ui.nav.client.local.Navigation::historyTokenFactory;
  }-*/;

  native static void Navigation_HistoryTokenFactory_historyTokenFactory(Navigation instance, HistoryTokenFactory value) /*-{
    instance.@org.jboss.errai.ui.nav.client.local.Navigation::historyTokenFactory = value;
  }-*/;

  native static StateChange Navigation_StateChange_stateChangeEvent(Navigation instance) /*-{
    return instance.@org.jboss.errai.ui.nav.client.local.Navigation::stateChangeEvent;
  }-*/;

  native static void Navigation_StateChange_stateChangeEvent(Navigation instance, StateChange value) /*-{
    instance.@org.jboss.errai.ui.nav.client.local.Navigation::stateChangeEvent = value;
  }-*/;

  native static Logger Navigation_Logger_logger(Navigation instance) /*-{
    return instance.@org.jboss.errai.ui.nav.client.local.Navigation::logger;
  }-*/;

  native static void Navigation_Logger_logger(Navigation instance, Logger value) /*-{
    instance.@org.jboss.errai.ui.nav.client.local.Navigation::logger = value;
  }-*/;

  native static NavigationGraph Navigation_NavigationGraph_navGraph(Navigation instance) /*-{
    return instance.@org.jboss.errai.ui.nav.client.local.Navigation::navGraph;
  }-*/;

  native static void Navigation_NavigationGraph_navGraph(Navigation instance, NavigationGraph value) /*-{
    instance.@org.jboss.errai.ui.nav.client.local.Navigation::navGraph = value;
  }-*/;

  public native static void Navigation_init(Navigation instance) /*-{
    instance.@org.jboss.errai.ui.nav.client.local.Navigation::init()();
  }-*/;
}