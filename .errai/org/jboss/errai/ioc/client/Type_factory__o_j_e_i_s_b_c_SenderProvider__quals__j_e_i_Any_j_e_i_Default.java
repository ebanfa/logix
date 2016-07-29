package org.jboss.errai.ioc.client;

import javax.inject.Singleton;
import org.jboss.errai.ioc.client.api.ContextualTypeProvider;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.support.bus.client.SenderProvider;

public class Type_factory__o_j_e_i_s_b_c_SenderProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<SenderProvider> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(SenderProvider.class, "Type_factory__o_j_e_i_s_b_c_SenderProvider__quals__j_e_i_Any_j_e_i_Default", Singleton.class, false, null, true);
  public Type_factory__o_j_e_i_s_b_c_SenderProvider__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(SenderProvider.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(ContextualTypeProvider.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public SenderProvider createInstance(final ContextManager contextManager) {
    final SenderProvider instance = new SenderProvider();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((SenderProvider) instance, contextManager);
  }

  public void destroyInstanceHelper(final SenderProvider instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final SenderProvider instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }
}