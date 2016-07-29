package org.jboss.errai.ioc.client;

import javax.inject.Singleton;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ui.client.widget.LocaleSelector;

public class Type_factory__o_j_e_u_c_w_LocaleSelector__quals__j_e_i_Any_j_e_i_Default extends Factory<LocaleSelector> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(LocaleSelector.class, "Type_factory__o_j_e_u_c_w_LocaleSelector__quals__j_e_i_Any_j_e_i_Default", Singleton.class, false, null, true);
  public Type_factory__o_j_e_u_c_w_LocaleSelector__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(LocaleSelector.class);
    handle.addAssignableType(Object.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public LocaleSelector createInstance(final ContextManager contextManager) {
    final LocaleSelector instance = new LocaleSelector();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((LocaleSelector) instance, contextManager);
  }

  public void destroyInstanceHelper(final LocaleSelector instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final LocaleSelector instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }
}