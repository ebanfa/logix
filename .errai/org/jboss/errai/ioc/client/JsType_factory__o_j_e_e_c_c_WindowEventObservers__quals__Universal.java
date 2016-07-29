package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.jboss.errai.enterprise.client.cdi.WindowEventObservers;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;

public class JsType_factory__o_j_e_e_c_c_WindowEventObservers__quals__Universal extends Factory<WindowEventObservers> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(WindowEventObservers.class, "JsType_factory__o_j_e_e_c_c_WindowEventObservers__quals__Universal", Dependent.class, false, null, false);
  public JsType_factory__o_j_e_e_c_c_WindowEventObservers__quals__Universal() {
    handle.addAssignableType(WindowEventObservers.class);
    handle.addAssignableType(Object.class);
  }

  public void init(final Context context) {

  }

  public WindowEventObservers createInstance(final ContextManager contextManager) {
    return (WindowEventObservers) WindowInjectionContextStorage.createOrGet().getBean("org.jboss.errai.enterprise.client.cdi.WindowEventObservers");
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((WindowEventObservers) instance, contextManager);
  }

  public void destroyInstanceHelper(final WindowEventObservers instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final WindowEventObservers instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }
}