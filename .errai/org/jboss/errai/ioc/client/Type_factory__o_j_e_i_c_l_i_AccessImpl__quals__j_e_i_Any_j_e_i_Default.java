package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.lifecycle.api.Access;
import org.jboss.errai.ioc.client.lifecycle.api.LifecycleEvent;
import org.jboss.errai.ioc.client.lifecycle.impl.AccessImpl;
import org.jboss.errai.ioc.client.lifecycle.impl.LifecycleEventImpl;

public class Type_factory__o_j_e_i_c_l_i_AccessImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<AccessImpl> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(AccessImpl.class, "Type_factory__o_j_e_i_c_l_i_AccessImpl__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Type_factory__o_j_e_i_c_l_i_AccessImpl__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(AccessImpl.class);
    handle.addAssignableType(LifecycleEventImpl.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(LifecycleEvent.class);
    handle.addAssignableType(Access.class);
    handle.addAssignableType(LifecycleEvent.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public AccessImpl createInstance(final ContextManager contextManager) {
    final AccessImpl instance = new AccessImpl();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((AccessImpl) instance, contextManager);
  }

  public void destroyInstanceHelper(final AccessImpl instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final AccessImpl instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }
}