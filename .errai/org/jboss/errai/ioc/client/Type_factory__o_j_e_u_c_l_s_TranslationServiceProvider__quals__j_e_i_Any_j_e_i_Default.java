package org.jboss.errai.ioc.client;

import javax.inject.Provider;
import javax.inject.Singleton;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ui.client.local.spi.TranslationServiceProvider;

public class Type_factory__o_j_e_u_c_l_s_TranslationServiceProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<TranslationServiceProvider> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(TranslationServiceProvider.class, "Type_factory__o_j_e_u_c_l_s_TranslationServiceProvider__quals__j_e_i_Any_j_e_i_Default", Singleton.class, false, null, true);
  public Type_factory__o_j_e_u_c_l_s_TranslationServiceProvider__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(TranslationServiceProvider.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(Provider.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public TranslationServiceProvider createInstance(final ContextManager contextManager) {
    final TranslationServiceProvider instance = new TranslationServiceProvider();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((TranslationServiceProvider) instance, contextManager);
  }

  public void destroyInstanceHelper(final TranslationServiceProvider instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final TranslationServiceProvider instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }
}