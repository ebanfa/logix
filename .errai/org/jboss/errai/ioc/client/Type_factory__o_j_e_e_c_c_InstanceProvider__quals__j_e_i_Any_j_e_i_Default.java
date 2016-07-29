package org.jboss.errai.ioc.client;

import javax.inject.Singleton;
import org.jboss.errai.enterprise.client.cdi.InstanceProvider;
import org.jboss.errai.ioc.client.api.ContextualTypeProvider;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;

public class Type_factory__o_j_e_e_c_c_InstanceProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<InstanceProvider> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(InstanceProvider.class, "Type_factory__o_j_e_e_c_c_InstanceProvider__quals__j_e_i_Any_j_e_i_Default", Singleton.class, false, null, true);
  public Type_factory__o_j_e_e_c_c_InstanceProvider__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(InstanceProvider.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(ContextualTypeProvider.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public InstanceProvider createInstance(final ContextManager contextManager) {
    final InstanceProvider instance = new InstanceProvider();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((InstanceProvider) instance, contextManager);
  }

  public void destroyInstanceHelper(final InstanceProvider instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final InstanceProvider instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }
}