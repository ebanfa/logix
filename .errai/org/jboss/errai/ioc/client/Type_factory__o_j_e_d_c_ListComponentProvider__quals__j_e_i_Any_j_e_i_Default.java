package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.jboss.errai.databinding.client.ListComponentProvider;
import org.jboss.errai.ioc.client.api.ContextualTypeProvider;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;

public class Type_factory__o_j_e_d_c_ListComponentProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<ListComponentProvider> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ListComponentProvider.class, "Type_factory__o_j_e_d_c_ListComponentProvider__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Type_factory__o_j_e_d_c_ListComponentProvider__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ListComponentProvider.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(ContextualTypeProvider.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public ListComponentProvider createInstance(final ContextManager contextManager) {
    final ListComponentProvider instance = new ListComponentProvider();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ListComponentProvider) instance, contextManager);
  }

  public void destroyInstanceHelper(final ListComponentProvider instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final ListComponentProvider instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }
}