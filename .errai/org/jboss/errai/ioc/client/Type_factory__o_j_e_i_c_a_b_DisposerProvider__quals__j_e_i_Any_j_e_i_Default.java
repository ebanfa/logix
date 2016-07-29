package org.jboss.errai.ioc.client;

import javax.inject.Singleton;
import org.jboss.errai.ioc.client.api.ContextualTypeProvider;
import org.jboss.errai.ioc.client.api.builtin.DisposerProvider;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.SyncBeanManager;

public class Type_factory__o_j_e_i_c_a_b_DisposerProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<DisposerProvider> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(DisposerProvider.class, "Type_factory__o_j_e_i_c_a_b_DisposerProvider__quals__j_e_i_Any_j_e_i_Default", Singleton.class, false, null, true);
  public Type_factory__o_j_e_i_c_a_b_DisposerProvider__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(DisposerProvider.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(ContextualTypeProvider.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public DisposerProvider createInstance(final ContextManager contextManager) {
    final DisposerProvider instance = new DisposerProvider();
    setIncompleteInstance(instance);
    final SyncBeanManager DisposerProvider_beanManager = (SyncBeanManager) contextManager.getInstance("Producer_factory__o_j_e_i_c_c_SyncBeanManager__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, DisposerProvider_beanManager);
    DisposerProvider_SyncBeanManager_beanManager(instance, DisposerProvider_beanManager);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((DisposerProvider) instance, contextManager);
  }

  public void destroyInstanceHelper(final DisposerProvider instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final DisposerProvider instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static SyncBeanManager DisposerProvider_SyncBeanManager_beanManager(DisposerProvider instance) /*-{
    return instance.@org.jboss.errai.ioc.client.api.builtin.DisposerProvider::beanManager;
  }-*/;

  native static void DisposerProvider_SyncBeanManager_beanManager(DisposerProvider instance, SyncBeanManager value) /*-{
    instance.@org.jboss.errai.ioc.client.api.builtin.DisposerProvider::beanManager = value;
  }-*/;
}