package org.jboss.errai.ioc.client;

import javax.inject.Provider;
import javax.inject.Singleton;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.validation.client.ValidatorProvider;

public class Type_factory__o_j_e_v_c_ValidatorProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<ValidatorProvider> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ValidatorProvider.class, "Type_factory__o_j_e_v_c_ValidatorProvider__quals__j_e_i_Any_j_e_i_Default", Singleton.class, false, null, true);
  public Type_factory__o_j_e_v_c_ValidatorProvider__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ValidatorProvider.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(Provider.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public ValidatorProvider createInstance(final ContextManager contextManager) {
    final ValidatorProvider instance = new ValidatorProvider();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ValidatorProvider) instance, contextManager);
  }

  public void destroyInstanceHelper(final ValidatorProvider instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final ValidatorProvider instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }
}