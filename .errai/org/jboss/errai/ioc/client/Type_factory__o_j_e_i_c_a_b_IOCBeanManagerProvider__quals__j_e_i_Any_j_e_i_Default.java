package org.jboss.errai.ioc.client;

import javax.inject.Singleton;
import org.jboss.errai.ioc.client.api.builtin.IOCBeanManagerProvider;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;

public class Type_factory__o_j_e_i_c_a_b_IOCBeanManagerProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<IOCBeanManagerProvider> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(IOCBeanManagerProvider.class, "Type_factory__o_j_e_i_c_a_b_IOCBeanManagerProvider__quals__j_e_i_Any_j_e_i_Default", Singleton.class, false, null, true);
  public Type_factory__o_j_e_i_c_a_b_IOCBeanManagerProvider__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(IOCBeanManagerProvider.class);
    handle.addAssignableType(Object.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public IOCBeanManagerProvider createInstance(final ContextManager contextManager) {
    final IOCBeanManagerProvider instance = new IOCBeanManagerProvider();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((IOCBeanManagerProvider) instance, contextManager);
  }

  public void destroyInstanceHelper(final IOCBeanManagerProvider instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final IOCBeanManagerProvider instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }
}