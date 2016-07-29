package org.jboss.errai.ioc.client;

import javax.inject.Singleton;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.lifecycle.api.LifecycleListenerRegistrar;
import org.jboss.errai.ioc.client.lifecycle.impl.LifecycleListenerRegistrarImpl;

public class Type_factory__o_j_e_i_c_l_i_LifecycleListenerRegistrarImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<LifecycleListenerRegistrarImpl> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(LifecycleListenerRegistrarImpl.class, "Type_factory__o_j_e_i_c_l_i_LifecycleListenerRegistrarImpl__quals__j_e_i_Any_j_e_i_Default", Singleton.class, false, null, true);
  public Type_factory__o_j_e_i_c_l_i_LifecycleListenerRegistrarImpl__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(LifecycleListenerRegistrarImpl.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(LifecycleListenerRegistrar.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public LifecycleListenerRegistrarImpl createInstance(final ContextManager contextManager) {
    final LifecycleListenerRegistrarImpl instance = new LifecycleListenerRegistrarImpl();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((LifecycleListenerRegistrarImpl) instance, contextManager);
  }

  public void destroyInstanceHelper(final LifecycleListenerRegistrarImpl instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final LifecycleListenerRegistrarImpl instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }
}