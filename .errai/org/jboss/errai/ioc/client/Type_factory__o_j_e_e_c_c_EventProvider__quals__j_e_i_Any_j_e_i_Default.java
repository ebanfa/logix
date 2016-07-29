package org.jboss.errai.ioc.client;

import javax.inject.Singleton;
import org.jboss.errai.enterprise.client.cdi.EventProvider;
import org.jboss.errai.ioc.client.api.ContextualTypeProvider;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;

public class Type_factory__o_j_e_e_c_c_EventProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<EventProvider> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(EventProvider.class, "Type_factory__o_j_e_e_c_c_EventProvider__quals__j_e_i_Any_j_e_i_Default", Singleton.class, false, null, true);
  public Type_factory__o_j_e_e_c_c_EventProvider__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(EventProvider.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(ContextualTypeProvider.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public EventProvider createInstance(final ContextManager contextManager) {
    final EventProvider instance = new EventProvider();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((EventProvider) instance, contextManager);
  }

  public void destroyInstanceHelper(final EventProvider instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final EventProvider instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }
}