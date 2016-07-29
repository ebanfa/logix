package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Instance;
import javax.inject.Provider;
import org.jboss.errai.ioc.client.api.ContextualTypeProvider;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;

public class ContextualProvider_factory__j_e_i_Instance__quals__Universal extends Factory<Instance> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(Instance.class, "ContextualProvider_factory__j_e_i_Instance__quals__Universal", Dependent.class, false, null, false);
  public ContextualProvider_factory__j_e_i_Instance__quals__Universal() {
    handle.addAssignableType(Instance.class);
    handle.addAssignableType(Iterable.class);
    handle.addAssignableType(Provider.class);
  }

  public void init(final Context context) {

  }

  public Instance createContextualInstance(final ContextManager contextManager, final Class[] typeArgs, final Annotation[] qualifiers) {
    final ContextualTypeProvider<Instance> provider = (ContextualTypeProvider<Instance>) contextManager.getInstance("Type_factory__o_j_e_e_c_c_InstanceProvider__quals__j_e_i_Any_j_e_i_Default");
    final Instance instance = provider.provide(typeArgs, qualifiers);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((Instance) instance, contextManager);
  }

  public void destroyInstanceHelper(final Instance instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final Instance instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }
}