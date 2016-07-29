package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.api.ContextualTypeProvider;
import org.jboss.errai.ioc.client.api.Disposer;
import org.jboss.errai.ioc.client.api.builtin.ManagedInstanceProvider;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;

public class Type_factory__o_j_e_i_c_a_b_ManagedInstanceProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<ManagedInstanceProvider> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ManagedInstanceProvider.class, "Type_factory__o_j_e_i_c_a_b_ManagedInstanceProvider__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Type_factory__o_j_e_i_c_a_b_ManagedInstanceProvider__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ManagedInstanceProvider.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(ContextualTypeProvider.class);
    handle.addAssignableType(Disposer.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public ManagedInstanceProvider createInstance(final ContextManager contextManager) {
    final ManagedInstanceProvider instance = new ManagedInstanceProvider();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ManagedInstanceProvider) instance, contextManager);
  }

  public void destroyInstanceHelper(final ManagedInstanceProvider instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final ManagedInstanceProvider instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }
}