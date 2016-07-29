package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import javax.inject.Provider;
import org.jboss.errai.ioc.client.api.ContextualTypeProvider;
import org.jboss.errai.ioc.client.api.Disposer;
import org.jboss.errai.ioc.client.api.ManagedInstance;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;

public class ContextualProvider_factory__o_j_e_i_c_a_ManagedInstance__quals__Universal extends Factory<ManagedInstance> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ManagedInstance.class, "ContextualProvider_factory__o_j_e_i_c_a_ManagedInstance__quals__Universal", Dependent.class, false, null, false);
  public ContextualProvider_factory__o_j_e_i_c_a_ManagedInstance__quals__Universal() {
    handle.addAssignableType(ManagedInstance.class);
    handle.addAssignableType(Provider.class);
    handle.addAssignableType(Iterable.class);
  }

  public void init(final Context context) {

  }

  public ManagedInstance createContextualInstance(final ContextManager contextManager, final Class[] typeArgs, final Annotation[] qualifiers) {
    final ContextualTypeProvider<ManagedInstance> provider = (ContextualTypeProvider<ManagedInstance>) contextManager.getInstance("Type_factory__o_j_e_i_c_a_b_ManagedInstanceProvider__quals__j_e_i_Any_j_e_i_Default");
    final ManagedInstance instance = provider.provide(typeArgs, qualifiers);
    setReference(instance, "disposer", provider);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ManagedInstance) instance, contextManager);
  }

  public void destroyInstanceHelper(final ManagedInstance instance, final ContextManager contextManager) {
    ((Disposer) getReferenceAs(instance, "disposer", Disposer.class)).dispose(instance);
  }

  public void invokePostConstructs(final ManagedInstance instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }
}