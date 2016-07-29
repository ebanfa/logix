package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.api.builtin.IOCBeanManagerProvider;
import org.jboss.errai.ioc.client.container.ClientBeanManager;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.SyncBeanManager;

public class Producer_factory__o_j_e_i_c_c_SyncBeanManager__quals__j_e_i_Any_j_e_i_Default extends Factory<SyncBeanManager> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(SyncBeanManager.class, "Producer_factory__o_j_e_i_c_c_SyncBeanManager__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Producer_factory__o_j_e_i_c_c_SyncBeanManager__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(SyncBeanManager.class);
    handle.addAssignableType(ClientBeanManager.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public SyncBeanManager createInstance(final ContextManager contextManager) {
    IOCBeanManagerProvider producerInstance = contextManager.getInstance("Type_factory__o_j_e_i_c_a_b_IOCBeanManagerProvider__quals__j_e_i_Any_j_e_i_Default");
    producerInstance = Factory.maybeUnwrapProxy(producerInstance);
    final SyncBeanManager instance = producerInstance.get();
    thisInstance.setReference(instance, "producerInstance", producerInstance);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((SyncBeanManager) instance, contextManager);
  }

  public void destroyInstanceHelper(final SyncBeanManager instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final SyncBeanManager instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }
}