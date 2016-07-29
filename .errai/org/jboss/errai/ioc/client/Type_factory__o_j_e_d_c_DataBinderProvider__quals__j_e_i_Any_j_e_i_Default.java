package org.jboss.errai.ioc.client;

import javax.inject.Singleton;
import org.jboss.errai.databinding.client.DataBinderProvider;
import org.jboss.errai.ioc.client.api.ContextualTypeProvider;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;

public class Type_factory__o_j_e_d_c_DataBinderProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<DataBinderProvider> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(DataBinderProvider.class, "Type_factory__o_j_e_d_c_DataBinderProvider__quals__j_e_i_Any_j_e_i_Default", Singleton.class, false, null, true);
  public Type_factory__o_j_e_d_c_DataBinderProvider__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(DataBinderProvider.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(ContextualTypeProvider.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public DataBinderProvider createInstance(final ContextManager contextManager) {
    final DataBinderProvider instance = new DataBinderProvider();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((DataBinderProvider) instance, contextManager);
  }

  public void destroyInstanceHelper(final DataBinderProvider instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final DataBinderProvider instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }
}