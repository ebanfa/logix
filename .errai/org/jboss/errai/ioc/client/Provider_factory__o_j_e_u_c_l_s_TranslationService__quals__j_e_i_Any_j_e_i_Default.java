package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import javax.inject.Provider;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ui.client.local.spi.TranslationService;

public class Provider_factory__o_j_e_u_c_l_s_TranslationService__quals__j_e_i_Any_j_e_i_Default extends Factory<TranslationService> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(TranslationService.class, "Provider_factory__o_j_e_u_c_l_s_TranslationService__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Provider_factory__o_j_e_u_c_l_s_TranslationService__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(TranslationService.class);
    handle.addAssignableType(Object.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public TranslationService createInstance(final ContextManager contextManager) {
    final Provider<TranslationService> provider = (Provider<TranslationService>) contextManager.getInstance("Type_factory__o_j_e_u_c_l_s_TranslationServiceProvider__quals__j_e_i_Any_j_e_i_Default");
    final TranslationService instance = provider.get();
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((TranslationService) instance, contextManager);
  }

  public void destroyInstanceHelper(final TranslationService instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final TranslationService instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }
}