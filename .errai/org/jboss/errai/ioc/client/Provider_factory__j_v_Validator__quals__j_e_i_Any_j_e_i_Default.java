package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import javax.inject.Provider;
import javax.validation.Validator;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;

public class Provider_factory__j_v_Validator__quals__j_e_i_Any_j_e_i_Default extends Factory<Validator> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(Validator.class, "Provider_factory__j_v_Validator__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Provider_factory__j_v_Validator__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(Validator.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public Validator createInstance(final ContextManager contextManager) {
    final Provider<Validator> provider = (Provider<Validator>) contextManager.getInstance("Type_factory__o_j_e_v_c_ValidatorProvider__quals__j_e_i_Any_j_e_i_Default");
    final Validator instance = provider.get();
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((Validator) instance, contextManager);
  }

  public void destroyInstanceHelper(final Validator instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final Validator instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }
}