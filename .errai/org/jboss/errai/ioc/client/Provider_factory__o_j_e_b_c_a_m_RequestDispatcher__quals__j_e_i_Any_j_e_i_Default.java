package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import javax.inject.Provider;
import org.jboss.errai.bus.client.api.messaging.RequestDispatcher;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;

public class Provider_factory__o_j_e_b_c_a_m_RequestDispatcher__quals__j_e_i_Any_j_e_i_Default extends Factory<RequestDispatcher> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(RequestDispatcher.class, "Provider_factory__o_j_e_b_c_a_m_RequestDispatcher__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Provider_factory__o_j_e_b_c_a_m_RequestDispatcher__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(RequestDispatcher.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public RequestDispatcher createInstance(final ContextManager contextManager) {
    final Provider<RequestDispatcher> provider = (Provider<RequestDispatcher>) contextManager.getInstance("Type_factory__o_j_e_i_s_b_c_RequestDispatcherProvider__quals__j_e_i_Any_j_e_i_Default");
    final RequestDispatcher instance = provider.get();
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((RequestDispatcher) instance, contextManager);
  }

  public void destroyInstanceHelper(final RequestDispatcher instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final RequestDispatcher instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }
}