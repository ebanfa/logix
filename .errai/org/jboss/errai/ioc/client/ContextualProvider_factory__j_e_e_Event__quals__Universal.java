package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import javax.enterprise.event.Event;
import org.jboss.errai.ioc.client.api.ContextualTypeProvider;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;

public class ContextualProvider_factory__j_e_e_Event__quals__Universal extends Factory<Event> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(Event.class, "ContextualProvider_factory__j_e_e_Event__quals__Universal", Dependent.class, false, null, false);
  public ContextualProvider_factory__j_e_e_Event__quals__Universal() {
    handle.addAssignableType(Event.class);
  }

  public void init(final Context context) {

  }

  public Event createContextualInstance(final ContextManager contextManager, final Class[] typeArgs, final Annotation[] qualifiers) {
    final ContextualTypeProvider<Event> provider = (ContextualTypeProvider<Event>) contextManager.getInstance("Type_factory__o_j_e_e_c_c_EventProvider__quals__j_e_i_Any_j_e_i_Default");
    final Event instance = provider.provide(typeArgs, qualifiers);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((Event) instance, contextManager);
  }

  public void destroyInstanceHelper(final Event instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final Event instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }
}