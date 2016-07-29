package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExtensionProvided_factory__o_s_Logger__quals__Universal extends Factory<Logger> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(Logger.class, "ExtensionProvided_factory__o_s_Logger__quals__Universal", Dependent.class, false, null, true);
  public ExtensionProvided_factory__o_s_Logger__quals__Universal() {
    handle.addAssignableType(Logger.class);
  }

  public void init(final Context context) {

  }

  public Logger createInstance(final ContextManager contextManager) {
    return LoggerFactory.getLogger("org.jboss.errai.ui.nav.client.local.Navigation");
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((Logger) instance, contextManager);
  }

  public void destroyInstanceHelper(final Logger instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final Logger instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }
}