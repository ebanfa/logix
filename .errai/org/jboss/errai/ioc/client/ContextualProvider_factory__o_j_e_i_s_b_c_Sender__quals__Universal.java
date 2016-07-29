package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.api.ContextualTypeProvider;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.support.bus.client.Sender;

public class ContextualProvider_factory__o_j_e_i_s_b_c_Sender__quals__Universal extends Factory<Sender> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(Sender.class, "ContextualProvider_factory__o_j_e_i_s_b_c_Sender__quals__Universal", Dependent.class, false, null, false);
  public ContextualProvider_factory__o_j_e_i_s_b_c_Sender__quals__Universal() {
    handle.addAssignableType(Sender.class);
  }

  public void init(final Context context) {

  }

  public Sender createContextualInstance(final ContextManager contextManager, final Class[] typeArgs, final Annotation[] qualifiers) {
    final ContextualTypeProvider<Sender> provider = (ContextualTypeProvider<Sender>) contextManager.getInstance("Type_factory__o_j_e_i_s_b_c_SenderProvider__quals__j_e_i_Any_j_e_i_Default");
    final Sender instance = provider.provide(typeArgs, qualifiers);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((Sender) instance, contextManager);
  }

  public void destroyInstanceHelper(final Sender instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final Sender instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }
}