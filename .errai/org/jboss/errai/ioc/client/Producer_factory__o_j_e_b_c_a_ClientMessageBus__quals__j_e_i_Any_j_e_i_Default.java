package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.jboss.errai.bus.client.api.ClientMessageBus;
import org.jboss.errai.bus.client.api.messaging.MessageBus;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.support.bus.client.MessageBusProvider;

public class Producer_factory__o_j_e_b_c_a_ClientMessageBus__quals__j_e_i_Any_j_e_i_Default extends Factory<ClientMessageBus> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ClientMessageBus.class, "Producer_factory__o_j_e_b_c_a_ClientMessageBus__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Producer_factory__o_j_e_b_c_a_ClientMessageBus__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ClientMessageBus.class);
    handle.addAssignableType(MessageBus.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public ClientMessageBus createInstance(final ContextManager contextManager) {
    MessageBusProvider producerInstance = contextManager.getInstance("Type_factory__o_j_e_i_s_b_c_MessageBusProvider__quals__j_e_i_Any_j_e_i_Default");
    producerInstance = Factory.maybeUnwrapProxy(producerInstance);
    final ClientMessageBus instance = producerInstance.get();
    thisInstance.setReference(instance, "producerInstance", producerInstance);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ClientMessageBus) instance, contextManager);
  }

  public void destroyInstanceHelper(final ClientMessageBus instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final ClientMessageBus instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }
}