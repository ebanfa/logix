package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.jboss.errai.enterprise.client.cdi.JsTypeEventObserver;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;

public class Type_factory__o_j_e_e_c_c_JsTypeEventObserver__quals__j_e_i_Any_j_e_i_Default extends Factory<JsTypeEventObserver> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(JsTypeEventObserver.class, "Type_factory__o_j_e_e_c_c_JsTypeEventObserver__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Type_factory__o_j_e_e_c_c_JsTypeEventObserver__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(JsTypeEventObserver.class);
    handle.addAssignableType(Object.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public JsTypeEventObserver createInstance(final ContextManager contextManager) {
    final JsTypeEventObserver instance = new JsTypeEventObserver();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((JsTypeEventObserver) instance, contextManager);
  }

  public void destroyInstanceHelper(final JsTypeEventObserver instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final JsTypeEventObserver instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }
}