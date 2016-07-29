package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import org.jboss.errai.common.client.api.Caller;
import org.jboss.errai.ioc.client.api.ContextualTypeProvider;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;

public class ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal extends Factory<Caller> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(Caller.class, "ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", Dependent.class, false, null, false);
  public ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal() {
    handle.addAssignableType(Caller.class);
  }

  public void init(final Context context) {

  }

  public Caller createContextualInstance(final ContextManager contextManager, final Class[] typeArgs, final Annotation[] qualifiers) {
    final ContextualTypeProvider<Caller> provider = (ContextualTypeProvider<Caller>) contextManager.getInstance("Type_factory__o_j_e_i_c_a_b_CallerProvider__quals__j_e_i_Any_j_e_i_Default");
    final Caller instance = provider.provide(typeArgs, qualifiers);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((Caller) instance, contextManager);
  }

  public void destroyInstanceHelper(final Caller instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final Caller instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }
}