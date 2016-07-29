package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.lifecycle.api.Destruction;
import org.jboss.errai.ioc.client.lifecycle.api.LifecycleEvent;
import org.jboss.errai.ioc.client.lifecycle.impl.DestructionImpl;
import org.jboss.errai.ioc.client.lifecycle.impl.LifecycleEventImpl;

public class Type_factory__o_j_e_i_c_l_i_DestructionImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<DestructionImpl> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(DestructionImpl.class, "Type_factory__o_j_e_i_c_l_i_DestructionImpl__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Type_factory__o_j_e_i_c_l_i_DestructionImpl__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(DestructionImpl.class);
    handle.addAssignableType(LifecycleEventImpl.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(LifecycleEvent.class);
    handle.addAssignableType(Destruction.class);
    handle.addAssignableType(LifecycleEvent.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public DestructionImpl createInstance(final ContextManager contextManager) {
    final DestructionImpl instance = new DestructionImpl();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((DestructionImpl) instance, contextManager);
  }

  public void destroyInstanceHelper(final DestructionImpl instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final DestructionImpl instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }
}