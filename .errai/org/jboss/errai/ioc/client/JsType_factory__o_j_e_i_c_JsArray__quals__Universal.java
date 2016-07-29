package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;

public class JsType_factory__o_j_e_i_c_JsArray__quals__Universal extends Factory<JsArray> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(JsArray.class, "JsType_factory__o_j_e_i_c_JsArray__quals__Universal", Dependent.class, false, null, false);
  public JsType_factory__o_j_e_i_c_JsArray__quals__Universal() {
    handle.addAssignableType(JsArray.class);
    handle.addAssignableType(Object.class);
  }

  public void init(final Context context) {

  }

  public JsArray createInstance(final ContextManager contextManager) {
    return (JsArray) WindowInjectionContextStorage.createOrGet().getBean("org.jboss.errai.ioc.client.JsArray");
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((JsArray) instance, contextManager);
  }

  public void destroyInstanceHelper(final JsArray instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final JsArray instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }
}