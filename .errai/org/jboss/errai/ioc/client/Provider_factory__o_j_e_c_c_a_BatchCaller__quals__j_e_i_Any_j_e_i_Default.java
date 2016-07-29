package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import javax.inject.Provider;
import org.jboss.errai.common.client.api.BatchCaller;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;

public class Provider_factory__o_j_e_c_c_a_BatchCaller__quals__j_e_i_Any_j_e_i_Default extends Factory<BatchCaller> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(BatchCaller.class, "Provider_factory__o_j_e_c_c_a_BatchCaller__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Provider_factory__o_j_e_c_c_a_BatchCaller__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(BatchCaller.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public BatchCaller createInstance(final ContextManager contextManager) {
    final Provider<BatchCaller> provider = (Provider<BatchCaller>) contextManager.getInstance("Type_factory__o_j_e_i_s_b_c_BatchCallerProvider__quals__j_e_i_Any_j_e_i_Default");
    final BatchCaller instance = provider.get();
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((BatchCaller) instance, contextManager);
  }

  public void destroyInstanceHelper(final BatchCaller instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final BatchCaller instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }
}